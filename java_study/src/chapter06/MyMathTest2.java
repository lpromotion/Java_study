package chapter06;

class MyMath2{
	long a, b;
	
	// �ν��Ͻ� �޼���
	// �ν��Ͻ� ���� a, b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����
	long add() { return a+b; } // a, b�� �ν��Ͻ� ����
	long substract() { return a-b;}
	long multiply() { return a*b; }
	long divide() { return a/b; }
	
	// Ŭ�����޼���
	// �ν��Ͻ� ������ ������� �Ű����������� �۾��� �����ϴ�
	static long add(long a, long b) { return a+b; }
	static long substract(long a, long b) { return a-b;}
	static long multiply(long a, long b) { return a*b; }
	static long divide(long a, long b) { return a/b; }
}

class MyMathTest2 {
	public static void main(String[] args) {
		// Ŭ�����޼��� ȣ��. �ν��Ͻ� �������� ȣ�Ⱑ��
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		// �ν��Ͻ� �޼���� ��ü���� �Ŀ��� ȣ���� ������
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
