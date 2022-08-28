import MyString.MyString;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString("Hello, ");
        str.println();
        str.append("World!");
        str.println();
        MyString substr = str.substr(7, 12);
        substr.println();
        System.out.println(substr.length());
        str.prepend("Test string: ");
        str.println();
    }
}