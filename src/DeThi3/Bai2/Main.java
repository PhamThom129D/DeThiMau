package DeThi3.Bai2;
import static DeThi3.Bai2.Regex.isISBN;
import static DeThi3.Bai2.Regex.isName;

public class Main {
    public static void main(String[] args) {
        String[] testIBSN = {"12-09-2001", "978-0-596-52068-7", "0-596-52068-9",
                "978 0 596 52068 7",
                "0596520689",
                "9780596520687"};
        for (String isbn : testIBSN) {
            System.out.println("Isbn: " + isbn + " : " + isISBN(isbn));
        }

        String[] testName = {"Thom", "Kha-nh", "Mi nh", "Mi@h" , "5hoa"};
        for (String name : testName) {
            System.out.println("Name: " + name + " : " + isName(name));
        }
    }

    }
