package ccc.copy;

public class ColorPointEX {

	public static void main(String[] args) {
		Point p = new Point(); // Point 객체 생성 
		p.set(1, 2); // ,Point 의 set 호출;
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); // ColorPoint 객체 생성
		cp.set(3 , 4); // Point의 set() 호출
		cp.setColor("red"); // ColorPoint 클래스의 setColor() 호출
		cp.showColorPoint(); // 컬러의 좌표 출력
 		
	}
	

}
