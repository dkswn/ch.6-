
public class Main {
	public static void main(String[] args) {
		Tv t; // Tv인스턴스 참조를 위해 참조변수 t를 선언 
		t = new Tv(); // Tv 인스턴스 생성한다
		t.channel = 7; //Tv 인스턴스의 channel 값을 7로한다
		t.channelDown(); //Tv인스턴스의 channelDown을 호출한다
		System.out.println("현재 채널은" + t.channel + "입니다");
	}

}

// 클래스 변수 공통적 
// 인스턴스 변수 개별적 
// 지역 변수 괄호안에서만 실행 

