package study;

class WhileAndDoWhile 
{
	public static void main(String[] args) 
	{
		int i=100;
		while (i<=3){  
			System.out.println("hello");
			i++;
		}

		System.out.println("----------------------------");

		int j=100;
		do{
			System.out.println("hello");
			j++;
		}
		while (j<=3);
	}
}
//처음부터 조건을 만족하지 않는 초기값일때에 while문은 한번도 동작하지 않는다
//처음부터 조건을 만족하지 않는 값이라도 do while문은 적어도 한번은 do문을 실행한다.