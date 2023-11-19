import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //6단계 - 7
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for(int i=0; i<n; i++){//입력 횟수
            String str = sc.next();
            boolean[] arr = new boolean[26];
            for(int j=0; j<str.length(); j++){
                if(arr[str.charAt(j)-'a'] == false){
                    arr[str.charAt(j)-'a'] = true;
                } else if (j>0 && str.charAt(j)!=str.charAt(j-1)) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}