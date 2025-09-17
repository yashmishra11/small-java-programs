public class reverseastring {
    public static void main(String[] args) {
        String str = "yash mishra";
        String reversedStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reversedStr = ch + reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);
    }
}
