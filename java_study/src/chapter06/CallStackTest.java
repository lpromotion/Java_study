package chapter06;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); // static �޼���� ��ü �������� ȣ�Ⱑ��
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
