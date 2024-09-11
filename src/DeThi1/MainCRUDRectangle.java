package DeThi1;

import java.io.IOException;

public class MainCRUDRectangle {
    public static void main(String[] args) throws IOException {
        CRUD crud = new CRUD();

        Rectangle rectangle1 = new Rectangle("Rectangle1", "Red", 120, 100);
        Rectangle rectangle2 = new Rectangle("Rectangle2", "Blue", 100, 80);
        Rectangle rectangle3 = new Rectangle("Rectangle3", "Black", 80, 60);

        crud.addRectangleToFile(rectangle1, "ex1.dat");
        crud.addRectangleToFile(rectangle2, "ex2.dat");
        crud.addRectangleToFile(rectangle3, "ex3.dat");

        System.out.println("Thông tin hình chữ nhật : \n" + crud.getRectangle("ex1.dat"));
        System.out.println("Thông tin hình chữ nhật : \n" + crud.getRectangle("ex2.dat"));
        System.out.println("Thông tin hình chữ nhật : \n" + crud.getRectangle("ex3.dat"));

        crud.addRectangle(rectangle1);
        crud.addRectangle(rectangle2);

        Rectangle[] rectangleList = {rectangle1, rectangle2};
        crud.addRectangleListToFile("exList1.dat", rectangleList);

        Rectangle[] showRectangleList = crud.getRectangleList("exList1.dat");
        for (Rectangle rectangle : showRectangleList) {
            System.out.println("Mảng hình chữ nhật : \n" + rectangle);
        }
    }
}
