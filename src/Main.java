import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int j = sc.nextInt();
        System.out.println(i+j);
    }
}