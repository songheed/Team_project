package c_package;

import java.util.Scanner;

public class a_제습조절 {
	Scanner input = new Scanner(System.in);
	private int num, Up, Down, system ,End ,sum=0; 


	//입력
	public void set() {
		System.out.println("1. 습도 올림\n2. 습도 내림\n3. 자동시스탬\n4. 종료");
		System.out.println(">>>>");
		this.num = input.nextInt();
	}

	public void setUp() {
		
	}

	public void setDown() {
		
	}
	
	public void setSystem() {
		
	}
	
	//출력
	public int get() {
		return num;
	}
	public int getUp() {
		System.out.println("습도를 +1 올립니다.");
		sum++;
		System.out.println("온도는 : " + sum);

		return Up;
	}
	
	public int getDown() {
		System.out.println("습도를 -1 내립니다.");
		sum--;
		System.out.println("온도는 : " + sum);
		return Down;
	}
	
	public int getSystem() {
		System.out.println("자동 시스템으로 실행합니다.");
		return system;
	}
}











