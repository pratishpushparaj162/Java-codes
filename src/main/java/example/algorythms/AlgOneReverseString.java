package example.algorythms;

public class AlgOneReverseString {
    public static void main(String[] args) {
        String origin = "abc";
        String target = "";
        StringBuilder builder = new StringBuilder();
        for (int i = origin.length() - 1; i >= 0 ; i--) {
            builder.append(origin.charAt(i));
        }
        target = builder.toString();
        System.out.println(target);
    }
}
