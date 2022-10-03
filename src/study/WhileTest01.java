package study;

import java.util.Scanner;
public class WhileTest01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n,result=1;
		System.out.print("N을 입력하시오 : ");
		n = sc.nextInt();

		int i=n;
		while (i>=1){
			result = result *i;
			System.out.print(i);
			if (i!=1){
				System.out.print("*");
			}
			i=i-1;
		}
		System.out.println("=" + result);
	}
}
