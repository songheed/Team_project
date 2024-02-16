package common;

import java.util.Scanner;

import temp.temp;
import wind.wind;


public class Main {
public static void main(String[] args) {
	wind w = new wind();
	temp tm = new temp();
	while(true) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("에어컨 기능을 선택하시오");
		System.out.println("1. 풍량 조절 \n 2. 온도 조절\n 3. 제습 조절");
		System.out.println(">>>>");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("에어컨 풍량조절");
//			break;
		
		System.out.println("풍량 기능을 선택하세요.");
		System.out.println(" 1.현재 풍량\n 2.풍량 증가\n 3.퓽량 감소");
		System.out.println(">>>>>");
		num = input.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("현재 풍량은 " + w.getWind() + "입니다.");
			break;
		case 2 :
			System.out.println( "현재 풍량: " + w.upWind() );
			break;
		case 3 : 
			System.out.println( "현재 풍량: " + w.downWind() );
			break;
		}
		break;
		
		case 2:System.out.println("에어컨 온도조절");
		
		System.out.println("온도 기능을 선택하세요");
		System.out.println("1. 현재 온도 \n2. 온도 올리기\n3. 온도 내리기\n");
		System.out.println(">>> ");
		num = input.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("현재 온도는 " + tm.getTemp() + "도 입니다");
			break;
		case 2:
			tm.uptemp();
			
			break;
		case 3:
			tm.downtemp();
		default :
			System.out.println("잘못 입력된 숫자");
		}
		
		
		
		break;
		
		
		case 3:System.out.println("에어컨 제습조절");break;
		
		}
	}
}
}
