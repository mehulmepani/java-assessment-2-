public class main {
    public static void main(String[] args) {

        doublechar("hi");

        System.out.println(" ");

        endsly("oddly");
        getSandwich("breadjambread");
        evenlySpaced(4,6,2);


    }

    public static String doublechar(String intput) {

        String[] word = intput.split("");
        for (String out : word) {
            out = out + out;
            System.out.print(out);
            String a = out;
        }

        return "";
    }




    public static boolean endsly(String input) {


        if (input.contains("ly")) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println( "false");

        }
        return false;
    }

    public static String getSandwich(String input) {
        String[] sand = input.split("bread");
        for (String sandwich : sand) {
            System.out.println(sandwich);
        }
        return "";
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if (b-a == c-b){
            System.out.println("true");
            return true;
        }
        else if (c-a == b-c) {
            System.out.println("true");
            return true;
        }
        else if (b-a == c-b) {
            System.out.println("true");
            return true;
        }
        else if (a-c == b-a) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
        return false;
        }
    }
}
