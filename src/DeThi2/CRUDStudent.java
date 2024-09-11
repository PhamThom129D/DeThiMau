package DeThi2;

import java.io.*;

public class CRUDStudent {
    public Student[] student;
    public static int numberOfStudent;

    public CRUDStudent() {
        student = new Student[100];
        numberOfStudent = 0;
    }

    public boolean addStudent(Student student) {
        if (numberOfStudent < 100) {
            this.student[numberOfStudent] = student;
            numberOfStudent++;
            return true;
        }
        return false;
    }

    public boolean addStudentToFile(Student student, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(student);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public Student getStudentFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addStudentListToFile(Student[] studentList, String fileName) {
        try (ObjectOutputStream oosList = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oosList.writeObject(studentList);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Student[] getStudentListFromFile(String fileName) {
        try (ObjectInputStream oisList = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Student[]) oisList.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
