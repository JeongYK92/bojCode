import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.print(str.charAt(0));
        for(int i = 1; i < str.length(); i++) {
            if(i % 10 == 0)
                System.out.println();
            System.out.print(str.charAt(i));
        }
    }
}
