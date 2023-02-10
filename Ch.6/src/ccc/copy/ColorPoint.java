package ccc.copy;

class ColorPoint extends Point {  // point 를 상속받은  ColorPoint 선언
	private String color; // 점의 색

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() { // 컬러점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
		

	}
}