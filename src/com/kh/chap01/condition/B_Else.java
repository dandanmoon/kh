package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	public void method1() {
		//양수, 음수, 0 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if(num > 0) {
			System.out.println("양수다");
		}else if(num < 0) {
			System.out.println("음수다");
		}else{
			System.out.println("0이다");
		}
	}

	public void method2() {
		//짝홀 판별
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if(num%2==0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);

		String student = "";

		if(gender == 'M'|| gender =='m') {
			student = "남학생";
		}else if(gender == 'F' || gender == 'f') {
			student = "여학생";
		}else {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		System.out.println(student + " 이다");
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();

		String result = "";

		if(age <= 13) {
			result = "어린이";
		}else if(age>13 && age <= 19){
			result = "청소년";
		}else {
			result = "성인";
		}
		System.out.println(result);
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();

		//String(참조형0 값 비교 시에는 ==, != 사용불가
		//String 클래스에서 제공하는 equals() 메서드 사용

		if(name.equals("문준호")) {
			System.out.println("본인이다.");
		}else {
			System.out.println("본인이 아니다.");
		}
	}
	public void method6() {
		//사용자에게 점수를 입력 받아
		//점수별로 등급을 나눠 점수와 등급을 출력하는 메소드

		//90점이상 A
		//80~89 B
		//70~79 C
		//60~69 D
		//59이하 F

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = sc.nextInt();

		String grade = "";

		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("당신의 점수는 "+ score+ "이고, " + grade + "등급 입니다.");
	}
	public void method7() {
		//위의 문제에 각 등급별 중간 점수 이상의 경우에는
		//등급에 " +"라는 문자를 추가하여 출력
		//예) 95점이상은 A+

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();

		String grade = "";
		
		if(score > 100 || score < 0) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				grade+="+";
			}
		}else if(score >= 80) {
			grade = "B";
			if(score >= 85) {
				grade+="+";
			}
		}else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
				grade+="+";
			}
		}else if(score >= 60) {
			grade = "D";
			if(score >= 65) {
				grade+="+";
			}
		}else {
			grade = "F";
		}
		System.out.println("당신의 점수는 "+ score+ "이고, " + grade + "등급 입니다.");
	}

























}
