import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //3단계 - 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result =0;
        for(int i=1; i<=n; i++) {
            result +=i;
        }
        System.out.println(result);
    }
}