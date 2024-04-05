public class HelloWorld {
    public static void main(String[] args) {
        String result = methode(8);
        System.out.println(result);
    }
    public static String methode(int getal) {
        String tekst = "";
        for (int i = 0; i < getal; i++) {
            tekst += "hello.\n";
        }
        return tekst;
    }
}
