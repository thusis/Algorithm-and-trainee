import java.util.Scanner;

public class PracticeSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = 0;
		int N = sc.nextInt();

		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (i >= 0 && i < arr.length - 1) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j] && arr[i]>M) {
						M = arr[i];
					}
				}
			} else {
				if (arr[i] > M) {
					M = arr[i];
				}
			}
		}
		double fakeScore[] = new double[N];
		double sum = 0;
		for (int i = 0; i < fakeScore.length; i++) {
			fakeScore[i] = (double) (arr[i]) / M * 100.0;
			sum += fakeScore[i];
		}
		System.out.println(sum / N);
	}

}
