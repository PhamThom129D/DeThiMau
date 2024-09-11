package DeThi1;

import java.io.*;

public class CRUD {
    private Rectangle[] objRectangles;
    private static int numberOfRectangle;

    public CRUD() {
        objRectangles = new Rectangle[100];
        numberOfRectangle = 0;
    }

    public boolean addRectangle(Rectangle objRectangle) {
        if (numberOfRectangle >= objRectangles.length) {
            return false;
        }
        objRectangles[numberOfRectangle++] = objRectangle;
        return true;
    }

    public boolean addRectangleToFile(Rectangle objRectangle, String fileName) throws FileNotFoundException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(objRectangle);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }


    public Rectangle getRectangle(String fileName) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Rectangle) ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addRectangleListToFile(String fileName, Rectangle[] listRectangle) throws FileNotFoundException {
        try (ObjectOutputStream list_fos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            list_fos.writeObject(listRectangle);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Rectangle[] getRectangleList(String fileName) throws FileNotFoundException {
        try(ObjectInputStream list_ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Rectangle[]) list_ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
