package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhlie {
	
	/*do while문
	 * 
	 * do{
	 * 		실행할 코드;
	 *		[증감식 or 분기문 ]
	 * }while(조건식);
	 */
	public void method1() {
		int num = 0;
		do {
			System.out.println(num);
		}while(num!=0);
		//while 문과 do while 문의 차이점은
		//조건이 맞지 않아도 반드시 한번은 수행 먼저 하고 조건 검사를 한다는 점
	}
	
	public void method2() {
		//1부터 10까지 출력
		
		int i = 1;
		do {
			System.out.println(i + " ");
			i++;			
		}while(i<=10);
	}
	
	public void method3() {
		//1부터 랜덤수(17~24)까지의 합 구하기
		
		int ran = (int)(Math.random()*8)+17;
		int  i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		}while(i <= ran);
		System.out.println("1부터 " + ran +"까지의 합계 : " + sum);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		do {
			System.out.println(str.charAt(i));
			i++;
		}while(i < str.length());
		//빈 문자열을 입력 받은 경우 runtime error 발생
		// => do while 문은 한번 실행 후 조건을 확인하므로
	}
}
