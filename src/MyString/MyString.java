package MyString;

public class MyString {
    private char[] str;
    private int length;
    private int offset;

    public MyString(String temp) {
        char[] string = temp.toCharArray();
        this.str = new char[string.length];
        this.length = string.length;
        this.offset = 0;

        System.arraycopy(string, 0, this.str, 0, this.length);
    }

    public void setStr(String temp) {
        char[] string = temp.toCharArray();
        this.length = string.length;
        this.offset = 0;
        this.str = new char[this.length];

        System.arraycopy(string, 0, this.str, 0, this.length);
    }

    public void println() {
        for (int i = this.offset; i < this.offset + this.length; i++)
            System.out.print(this.str[i]);

        System.out.println();
    }

    public void print() {
        for (int i = this.offset; i < this.offset + this.length; i++)
            System.out.print(this.str[i]);
    }

    public int length() {
        return this.length;
    }

    public MyString substr(int beginIndex, int finalIndex) {
        if (beginIndex >= finalIndex)
            throw new IllegalArgumentException("Begin index is bigger than final index: " + beginIndex + " " + finalIndex);

        if (finalIndex >= this.length)
            throw new IllegalArgumentException("Out of bounds: " + finalIndex);

        MyString sub = new MyString(String.valueOf(this.str));
        sub.length = finalIndex - beginIndex + 1;
        sub.offset = beginIndex;

        return sub;
    }
    public void append(String tempStr) {
        char[] string = tempStr.toCharArray();
        char[] newStr = new char[this.length + string.length];

        System.arraycopy(this.str, 0, newStr, 0, this.length);
        System.arraycopy(string, 0, newStr, this.length, string.length);

        this.setStr(String.valueOf(newStr));
    }
    public void prepend(String tempStr) {
        char[] string = tempStr.toCharArray();
        char[] newStr = new char[this.length + string.length];

        System.arraycopy(string, 0, newStr, 0, string.length);
        System.arraycopy(this.str, 0, newStr, string.length, this.length);

        this.setStr(String.valueOf(newStr));
    }
    public char charAt(int index) {
        return this.str[index];
    }
}