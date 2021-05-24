package com.kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}else{
			System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오");
			practice2();
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else{
			System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오");
			practice4();
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력 하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for(int i =1; i <= num; i++) {
			sum += i;
			System.out.print(i+" + ");
		}System.out.print(" = "+ sum);
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		if(num1 < 1 ||  num2 < 1 ) {
			System.out.println("1이상의 숫자만을 입력 해 주세요");
			return;
		}

		int min = 0;   
		int max = 0;  

		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}

		for(int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}		
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		if(num1 < 1 ||  num2 < 1 ) {
			System.out.println("1이상의 숫자만을 입력 해 주세요");
			practice7();
		}

		int min = 0;   
		int max = 0;  

		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}

		for(int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}		
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = sc.nextInt();

		if(num>=2 && num<= 9) {
			System.out.println("==== " + num + "단 ====");
			for(int i = 1; i < 10 ; i++) {
				System.out.printf("%d * %d = %d\n", num,i,(num*i));
			}
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = sc.nextInt();

		if(num>=2 && num<= 9) {

			for(int j = num; j <= 9; j++) {
				System.out.println("===== " + j + "단 =====");
				for(int i = 1; i <+ 9 ; i++) {

					System.out.printf("%d * %d = %d\n", j,i,(j*i));
				}
			}
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = sc.nextInt();

		if(num< 2 || num > 9) {

			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			practice10();

		}else{

			for(int j = num; j <= 9; j++) {
				System.out.println("===== " + j + "단 =====");
				for(int i = 1; i <+ 9 ; i++) {

					System.out.printf("%d * %d = %d\n", j,i,(j*i));
				}
			}
		}

	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for(int i = 1; i <= num1+num2*9; i+=num2) {
			System.out.print(i+" ");
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();

		for(int i = 1; i<=num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();

		for(int i = num; i>=1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public void practice14() {

		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.print("연산기호 입력 (+,-,*,/,%) : ");
			String op = sc.next();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();

			int result = 0;

			if(op.equals("+")) {
				
				result  = num1 + num2;
				System.out.println(num1 +"+" +num2+ " = " + result);
				
			}else if(op.equals("-")){
				
				result = num1-num2;
				System.out.println(num1 +"-" +num2+ " = " + result);
				
			}else if(op.equals("*")){
				
				result = num1*num2;
				System.out.println(num1 +"*" +num2+ " = " + result);
				
			}else if(op.equals("/")){
				
				if(num2 == 0) {
					System.out.println("0으로 나눌수 없습니다. 다시 입력해 주세요.");
								
				}else {
					
					result = num1/num2;
					System.out.println(num1 +"/" +num2+ " = " + result);
					
				}
			}else if(op.equals("%")){
				
				result = num1%num2;
				System.out.println(num1 +"%" +num2+ " = " + result);
				
			}else if(op.equals("exit")){
				
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}else {
				
				System.out.println("없는 연산자 입니다. 다시입력해주세요.");
				
			}
		}
	}

}
