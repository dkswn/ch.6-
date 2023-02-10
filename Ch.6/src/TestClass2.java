public class TestClass2 {
	int iv; // 인스턴스 메소드 
	static int cv ; //클래스변수 
	
	void instanceMothod() {
		System.out.println(iv); // 인스턴스 메소드
		System.out.println(cv); //클래스 메소드
		
		}
	static void staticMethod() { //스테틱 메소드
		//System.out.println(iv); //인스턴스 메소드 호출불가
		System.out.println(cv); //스테틱메소드 호출가능
		
		//생성자
		// 인스턴스가 생성될때 호출되는 인스턴스 초기화 메서드
		//인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용
		//몇가지 조건을 제외하고 메서드와 같다 
		// 모든 클래스에는 하나 이상의 생성자가 있어야한다
		//생성자의 이름은 클레스 이름과 같이야 한다
		//생성자는 리턴값이 없다 

	

	}
}
