package DeThi2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student("A001","Khanh","12/09/2005",7.8);
        Person person1 = new Person("A002","Minh","20/10/2005");
        System.out.println(student1.toString());
        System.out.println(person1.toString());

        Student student2 = new Student("A003","Khanh","12/09/2005",7.8);
        Student student3 = new Student("A004","Thom","12/09/2001",8.9);

        CRUDStudent crud = new CRUDStudent();

        crud.addStudent(student1);
        crud.addStudent(student2);
        crud.addStudent(student3);

        crud.addStudentToFile(student1,"dtm1.dat");
        crud.addStudentToFile(student2,"dtm2.dat");
        crud.addStudentToFile(student3,"dtm3.dat");

        System.out.println("Thông tin SV : "+ crud.getStudentFromFile("dtm1.dat"));
        System.out.println("Thông tin SV : "+ crud.getStudentFromFile("dtm2.dat"));
        System.out.println("Thông tin SV : "+ crud.getStudentFromFile("dtm3.dat"));

        Student[] students = {student1,student2};
        crud.addStudentListToFile(students,"list.dat");

        Student[] showStudentList = crud.getStudentListFromFile("list.dat");
        for (Student student : showStudentList) {
            System.out.println("Thông tin List Student : " + student.toString());
        }

    }
}
