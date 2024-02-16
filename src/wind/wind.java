package wind;

public class wind {
		// 풍량 조절
		private int wind = 0;
		
		public void setWind(int wind) {
			this.wind = wind;
		}
		
		public int getWind() {
			return wind;
		}
	
		// 현재 풍량
		public void nowWind() {
			System.out.println("현재 풍량은 " + wind + "입니다.");
		}
		
		// 풍량 세기 증가
		public int upWind() {
			wind ++;
			return wind;
		}
		
		// 풍량 세기 감소
		public int downWind() {
			wind --;
			return wind;
		}
}
