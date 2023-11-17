package br.com.teste;

import java.util.Scanner;

public class BloggoShortcuts {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] in = new int[1002];
			int x;
			int y;
			double sum;
			int n;
			while (true) {
				n = scanner.nextInt();
				if (n == 0)
					return;
				sum = 0.0;
				for (int i = 0; i < n; i++) {
					x = scanner.nextInt();
					y = scanner.nextInt();
					in[i] = x * 100 + y;
					sum += (double) in[i];
				}
				sum /= (double) n;
				double sumM = 0.0;
				double summ = 0.0;
				for (int i = 0; i < n; i++) {
					if (sum < (double) in[i])
						sumM += (int) (in[i] - sum) / 100.0;
					else
						summ += (int) (sum - in[i]) / 100.0;
				}
				System.out.printf("$%.2f\n", Math.max(sumM, summ));
			}
		}
	}
}
