import java.util.Scanner;

public class Practice1712 {
	public static void main(String[] args) {
		// 고정 비용a, 가변 비용b, 판매가c
		// 손익분기점이 최초로 발생하는 시점
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
		int X = (int) Math.ceil(a/(c-b));
		
		System.out.println(X);
		
	}
}
