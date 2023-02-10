package cir;

public class Circle {
	int radius;
	String name;
	
	public double getArea() { // 멤버메소드
		return 3.14 * radius*radius;
	}

	public static void main(String[] args) {
		Circle pizza; // 객체에 대한 레퍼런스 변수 pizza 선언
		pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자 반지름을 10으로 설정
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name +"의 면적은"+ area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은" + area);

	}

}
