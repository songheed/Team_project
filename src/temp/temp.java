package temp;

public class temp {
	//온도조절
	private int temp = 20; // 기본 온도 = 20도
	
	
	public int getTemp() {
		return temp;
	}


	public void setTemp(int temp) {
		this.temp = temp;
	}


	//현재 온도
	public void nowtemp() {
		System.out.println("현재 온도는 " + temp + " 입니다.");
	}
	
	//온도 올리기
	public void uptemp() {
		temp++;
	}
	
	//온도 내리기
	public void downtemp() {
		temp--;
	}

}
