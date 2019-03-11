import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        String model = "%s, %s";
        String str = String.format(model,x,y);
        System.out.println(str);*/
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();

    }
}
