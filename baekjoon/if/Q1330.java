
import java.util.Scanner;
public class Q1330{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        String str = ((a > b) ? ">" : ((a < b) ? "<" : "=="));
        System.out.println(str);
    }
}