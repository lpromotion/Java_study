package chapter07;

class Cardd {
	final int NUMBER; // ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND; // �����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	static int width  = 100;	
	static int height = 250;

	Cardd(String kind, int num) {	
		KIND = kind;
		NUMBER = num;
	}

	Cardd() {
		this("HEART", 1);
	}

	public String toString() {
		return KIND +" "+ NUMBER;
	}
}

class FinalCardTest {
	public static void main(String[] args) {
		Cardd c = new Cardd("HEART", 10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}
