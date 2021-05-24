package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	//브레이크 
	public void method1() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("문자열 입력 : ");
			String str =sc.nextLine();

			if(str.equals("exit")) {
				break;
			}
		}
	}
	
	public void method2() {
		//1부터 사용자가 입력한 숫자까지 합계 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력  : ");
		int num = sc.nextInt();
		int sum = 0;
		//for문 무한루프
		for(int i =1; ; i++) {
			sum += i;
			if(i == num)
				break;
		}
		System.out.println("합계 : " + sum);
	}
	
	public void method3() {
		//사용자에게 반복적으로 정수 두개와 연산기로(문자)를 입력받고
		//그에 해당하는 결과 출력
		//또한 제시 된 연산 기호가 아닌 다른 기호 입력 시 "잘못입력하였습니다" 출력 후 반복 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();
			
			System.out.print("연산기호 입력 (+/-) : ");
			String op = sc.next();
			
			int result = 0;
			
			if(op.equals("+")) {
				result  = num1 + num2;
			}else if(op.equals("-")){
				result = num1-num2;
			}else {
				System.out.println("연산기호를 잘못입력하셨습니다.");
				break;
			}
			System.out.println("result : " + result);
			}
	}
}
