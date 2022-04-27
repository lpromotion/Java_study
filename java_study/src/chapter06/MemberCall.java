package chapter06;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	static int cv2 = new MemberCall().iv; // ��ü�� �����ؾ� ��밡��
	
	static void staticMethod1() {
		System.out.println(cv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // ��ü�� ������ �Ŀ��� �ν��Ͻ������� ��������
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // �ν��Ͻ��޼��忡���� �ν��Ͻ������� �ٷ� ��밡��
	}
	
	static void staticMethod2() {
		staticMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // �ν��Ͻ��� ������ �Ŀ��� ȣ���� �� ����
	}
	
	void instanceMethod2() { // �ν��Ͻ� �޼��忡���� �ν��Ͻ� �޼���� Ŭ���� �޼���
		staticMethod1(); 	 // ��� �ν��Ͻ� �������� �ٷ� ȣ���� �����ϴ�
		instanceMethod1();
	}
}
