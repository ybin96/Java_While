package study;

import java.util.Scanner;
public class DoWhileTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("줄수를 입력하세요 : ");
		n = sc.nextInt();

		int i=1;
		do{
			int j=1;
			do{
				System.out.print("*");
				j++;
			}
			while (j<=i);
			i++;
			System.out.println();
		}
		while (i<=n);
	}
}
