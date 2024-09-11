package DeThi3.Bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
//    Gồm 10 ký tự, có thể bao gồm các số từ 0-9 và ký tự ‘X’ (đại diện cho số 10).
//Có thể chứa dấu gạch ngang hoặc khoảng trắng.
//    Gồm 13 ký tự, bắt đầu bằng 978 hoặc 979.
//Có thể chứa dấu gạch ngang hoặc khoảng trắng.
    private static final String ISBN_10_REGEX = "^(?:ISBN(?:-10)?:?\\s*)?(?=[0-9X]{10}$|(?=(?:[0-9]+[-\\s]){3})[-\\s0-9X]{13}$)[0-9]{1,5}[-\\s]?[0-9]+[-\\s]?[0-9]+[-\\s]?[0-9X]$";
    private static final String ISBN_13_REGEX = "^(?:ISBN(?:-13)?:?\\s*)?(?=[0-9]{13}$|(?=(?:[0-9]+[-\\s]){4})[-\\s0-9]{17}$)97[89][-\\s]?[0-9]{1,5}[-\\s]?[0-9]+[-\\s]?[0-9]+[-\\s]?[0-9]$";

    public static boolean isISBN(String isbn) {
        Pattern isbn10Pattern = Pattern.compile(ISBN_10_REGEX);
        Pattern isbn13Pattern = Pattern.compile(ISBN_13_REGEX);

        Matcher isbn10Matcher = isbn10Pattern.matcher(isbn);
        Matcher isbn13Matcher = isbn13Pattern.matcher(isbn);

        return isbn10Matcher.matches() || isbn13Matcher.matches();
    }
// chỉ chứa các chữ cái, dấu cách và dấu gạch ngang (-), không chứa số hoặc ký tự đặc biệt khác
    private static final String REGEX_NAME = "^[a-zA-Z\\s-]+$";
    public static boolean isName(String name) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
