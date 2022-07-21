public class ReversString {
    public static String reverseStr(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        String str = "I am Neeraj ";
        System.out.println(reverseStr(str));

    }
}
