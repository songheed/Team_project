package common;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	while(true) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("에어컨 기능을 선택하시오");
		System.out.println("1. 풍량 조절 \n 2. 온도 조절\n 3. 제습 조절");
		System.out.println(">>>>");
		num = input.nextInt();
		
		switch(num) {
		case 1:System.out.println("에어컨 풍량조절");break;
		
		
		case 2:System.out.println("에어컨 온도조절");break;
		
		
		case 3:System.out.println("에어컨 제습조절");break;
		
		}
	}
}
}
