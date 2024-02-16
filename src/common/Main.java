package common;

import java.util.Scanner;

import c_package.a_제습조절;

public class Main {
public static void main(String[] args) {
	a_제습조절 t = new a_제습조절();
	
	while(true) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("에어컨 기능을 선택하시오");
		System.out.println("1. 풍량 조절 \n2. 온도 조절\n3. 제습 조절");
		System.out.println(">>>>");
		num = input.nextInt();
		
		switch(num) {
		case 1:System.out.println("에어컨 풍량조절");break;
		
		
		case 2:System.out.println("에어컨 온도조절");break;
		
		
		case 3:System.out.println("에어컨 제습조절");
		
		while(true) {
		t.set();
		
		if(t.get() == 1) {
			t.getUp();
		}else if(t.get() == 2) {
			t.getDown();
		}else if(t.get() == 3) {
			t.getSystem();
		}else if(t.get() == 4) {
			break;
		}
		}
		}
	}
}
}
