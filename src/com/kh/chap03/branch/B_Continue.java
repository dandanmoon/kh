package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	//continue : 반복문 안에서만 사용가능하며
	//					continue를 만나게 되면 아래의 내용을 실행하지 말고
	// 					나와 가장 가까운 반복문의 처음으로(for->증감식, whlie -> 조건식) 돌아가라는 의미

	public void method1() {
		//1부터 10까지 홀수 출력
		for(int i = 1; i<=10; i++) {
			if(i%2==0) 
				continue; //짝수의 경우 아래 출력문 실행하지 않고 반복문의 처음(증감식) 으로 돌아감
			System.out.print(i + " ");
		}
	}

	public void method2() {
		//1부터 100까지 정수들의 합 출력
		//단, 4의 배수는 합에서 제외

		int sum = 0;
		for(int i = 1; i <= 100; i++ ) {
			if(i%4==0)
				continue;
			sum+=i;
		}
		System.out.println(sum);
	}

	public void method3() {
		//구구단 출력중
		//4의 배수 제외하고 출력
		for(int dan = 2; dan<=9; dan++) {

			if(dan%4==0)
				continue;
			System.out.println("=====" + dan+"=====");

			for(int su = 1; su <= 9; su++) {
				System.out.println(dan+" X " + su + " = " + dan*su);
			}
		}
	}

	public void method4() {
		//구구단 출력중
		//곱해지는 수가 짝수인 경우를 제외하고 출력

		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("=====" + dan+"=====");
			for(int su = 1; su <= 9; su++) {
				if(su%2==0)
					continue;
				System.out.println(dan+" X " + su + " = " + dan*su);
			}
		}
	}
	public void practice14() {
		//사용자에게 반복적으로 정수 두개와 연산기로(문자)를 입력받고
		//그에 해당하는 결과 출력
		//또한 제시 된 연산 기호가 아닌 다른 기호 입력 시 "잘못입력하였습니다" 출력 후 반복 종료

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();

			System.out.print("연산기호 입력 (+,-,*,/,%) : ");
			String op = sc.next();

			int result = 0;

			if(op.equals("+")) {
				
				result  = num1 + num2;
				
			}else if(op.equals("-")){
				
				result = num1-num2;
				
			}else if(op.equals("*")){
				
				result = num1*num2;
				
			}else if(op.equals("/")){
				
				if(num2 == 0) {
					System.out.println("0으로 나눌수 없습니다. 다시 입력해 주세요.");
					break;
								
				}else {
					
					result = num1/num2;
					
				}
				
			}else if(op.equals("%")){
				
				result = num1%num2;
				
			}else if(op.equals("exit")){
				
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("없는 연산자 입니다. 다시입력해주세요.");
				break;
			}
			System.out.println("result : " + result);
		}
	}

}
