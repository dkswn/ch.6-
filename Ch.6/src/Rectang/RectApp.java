package Rectang;
import java.util.*;
public class RectApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		rect.weight = sc.nextInt();
		rect.height = sc.nextInt();
		
		System.out.print("사각형의 면적은" + rect.getArea());
		sc.close();

	}

}
