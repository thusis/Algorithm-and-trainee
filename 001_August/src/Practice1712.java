import java.util.Scanner;

public class Practice1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((c<=b)||a==0) {
			System.out.println(-1);
		} else {
			int X = (int) Math.ceil(a/(c-b)) + 1;
			System.out.println(X);
		}
	}
}
