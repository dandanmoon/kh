package com.kh.chap01.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println();

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		if(num == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if(num == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if(num == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if(num == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if(num == 9) {
			System.out.println("프로그램이 종료 됩니다.");
		}else {
			System.out.println("잘 못 누르셨습니다.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if(num%2 == 0 && num> 0) {
			System.out.println("짝수다");
		}else if(num%2 != 0 && num> 0) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
		}
	}
	public void practice3(){

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum/3.0;

		String result = " "; 

		if(avg >= 60 && kor >= 40 && eng >= 40 && math >= 40){ 
			result = "축하합니다, 합격입니다!"; 
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println(result);
		}else{ 
			result = "불합격입니다";
			System.out.println(result);
		}
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1 ~ 12 사이의 정수 입력 :");
		int month = sc.nextInt();

		String result = "";

		if(month ==  1 || month ==  2 || month == 12) {
			result ="겨울";
		}else if(month >= 3 &&month <= 5) {
			result ="봄";
		}else if(month >= 6 &&month <= 8){
			result ="여름";
		}else if(month >= 9 &&month <= 11){
			result ="가을";
		}else {
			result ="월은 잘못된 입력값입니다.";
		}

		switch(result) {
		case "겨울": 
			System.out.println(month+ "월은 " + result +"입니다");
			break;
		case "봄" : 
			System.out.println(month+ "월은 " + result +"입니다");
			break;
		case "여름" : 
			System.out.println(month+ "월은 " + result +"입니다");
			break;
		case "가을" : 
			System.out.println(month+ "월은 " + result +"입니다");
			break;
		default :
			System.out.println(month + result);
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();

		if(id.equals("answnsgh426")) {
			if(pw.equals("asd147")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}else {
			System.out.println("아이디가 틀렸습니다");
		}

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("권한(관리자/회원/비회원)을 입력하세요 : ");
		String level = sc.nextLine();

		switch(level) {
		case "관리자" : 
			System.out.println("회원관리, 게시글 관리");
		case "회원" :
			System.out.println("게시글 작성, 댓글 작성");
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default :
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("체중(Kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double BMI = weight/(height*height);
		System.out.println("BMI 지수 : " + BMI);

		if(BMI <18.5) {
			System.out.println("저체중");
		}else if(BMI<23) {
			System.out.println("정상체중");
		}else if(BMI < 25) {
			System.out.println("과체중");
		}else if(BMI < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		System.out.print("연산자를 입력(+, -, *, / ,%) : ");
		char ch = sc.next().charAt(0);

		int result = 0;

		switch(ch) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default :
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}

		System.out.printf("%d%c%d = %d",num1,ch,num2,result);
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int num1 = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int num2 = sc.nextInt();

		System.out.print("과제 점수 : ");
		int num3 = sc.nextInt();

		System.out.print("출석 회수 : ");
		int num4 = sc.nextInt();

		System.out.println("=======결과=======");

		double me = num1 * 0.2; 
		double fe = num2 * 0.3;  
		double hw = num3 * 0.3; 
		int ad = num4;
		double ts = me + fe + hw + ad;


		if(ts >= 70 && ad >= 14) { 
			System.out.println("중간 고사 점수(20) : "+ me 
					+	"\n기말 고사 점수(30) : " + fe 
					+ "\n과제 점수 (30) : " + hw 
					+ "\n출석 점수 (20) : " + ad 
					+ "\n총점 : " + ts 
					+ "\nPASS"); 
		}else if(ts >= 70 && ad < 14){ 

			System.out.println("FAIL [출석 횟수 부족] (" + ad + "/20)"); 

		}else if(ts < 70 && ad >= 14) {

			System.out.println("FAIL [점수 미달] (총점 " + ts + ")"); 

		}else{

			System.out.println("FAIL [출석 횟수 부족] (" + ad + "/20)"); 
			System.out.println("FAIL [점수 미달] (총점 " + ts + ")");

		} 
	}

	public void practice10() {

		System.out.println("실행 할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2.짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6.권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass / Fail");

		Scanner sc = new Scanner(System.in);

		ConditionPractice cp = new ConditionPractice();

		System.out.print("선택 : ");
		int num = sc.nextInt();

		switch(num) {
		case 1 :
			cp.practice1();
			break;
		case 2 :
			cp.practice2();
			break;
		case 3 :
			cp.practice3();
			break;
		case 4 :
			cp.practice4();
			break;
		case 5 :
			cp.practice5();
			break;
		case 6 :
			cp.practice6();
			break;
		case 7 :
			cp.practice7();
			break;
		case 8 :
			cp.practice8();
			break;
		case 9 :
			cp.practice9();
			break;
		}
	}










}
