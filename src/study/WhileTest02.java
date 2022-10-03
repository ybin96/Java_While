package study;

import java.util.Scanner;
public class WhileTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b;
		System.out.print("별을 몇줄 출력할까요? ");
		a = sc.nextInt();
		System.out.print("별을 몇칸 출력할까요? ");
		b = sc.nextInt();
		
		int i=1;
		while (i<=a){
			int j=1;
			while (j<=b){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;	
		}
	}
}
