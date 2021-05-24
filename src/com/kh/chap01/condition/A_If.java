package com.kh.chap01.condition;
/*프로그램은 기본적으로 순차적으로 진행 되지만
 * 실행 부분을 선택적으로 실행 해야 할 때, 또는 반복적으로 실행 해야 할 때
 * "제어문"을 이용한다.
 * 
 * <조건문>
 * 조건식을 통해 참인지 거짓인지를 판단해서 해당 조건이 만족하는 경우 그에 해당하는 실행문을 실행
 * ->조건식의 결과는 참/거짓의 논리값이여야함
 * ->비교 연산자(대소 비교, 동등비교), 논리연산자(&&,||)
 * 
 * 조건문은 크게 if문/ 스위치문으로 나뉘며 if문은 크게 세가지로 나뉨
 * 1.단독 if문
 * 2.if else문
 * 3.if else if else문
 */

import java.util.Scanner;

public class A_If {
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if(num>0) {
			System.out.println("양수다");
		}

		if(num< 0) {
			System.out.println("음수다");
		}

		if(num ==0) {
			System.out.println("0이다");
		}
	}

	public void method2() {
		//짝홀 판별
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

	public void method3() {
		//성별 입력 받아 남/여 구분
		Scanner sc = new Scanner(System.in);

		System.out.print("성별 (M / F) : ");
		char gender = sc.nextLine().charAt(0);

		String student = "";
		//지역 변수는 반드시 초기화 되어야만 함
		//초기화 하지않고 사용하면 컴파일 오류

		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		}

		if(gender == 'F' || gender == 'f'){
			student = "여학생";
		}
		if(gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("잘못 입력 하셨습니다.");
			//이후에 "이다." 가 출력되는데 잘 못 입력 받은 경우에는 해당 코드를 수행하고 싶지 않으므로
			//호출된 메소드를 종료할때 사용하는 리턴 구문을 작성함
			return;
		}
		System.out.println(student + "이다.");
	}

	public void method4() {
		//나이를 입력 받아 어린이, 청소년, 성인 판별

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = "";
		
		if(age <= 13) {
			result = "어린이";
		}
		
		if(age > 13 && age <= 19) {
			result = "청소년";
		}
		
		if(age >= 20) {
			result = "성인";
		}
		
		System.out.println(result + "입니다.");
	}
	
	public void method5() {
		//입력 된 이름이 본인이 맞는지 확인

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		if(name == "문준호") {
			System.out.println("본인입니다.");
		}
		
		if(name != "문준호") {
			System.out.println("본인이 아닙니다.");
			
			/*기본자료형은 비교시에 ==, != 를 사용하여 동등 비교를 할 수 있지만
			 * String은 기본 자료형이 아닌 참조 자료형이므로
			 * String 클래스에서 제공하는 equals()메소드를 사용해서 비교해야 함
			 */
		}
	}






















}
