package chapter06;

class TvTest4 {
	public static void main(String args[]) {
		Tv[] tvArr = new Tv[3]; // ���̰� 3�� Tv��ü �迭

		// Tv��ü�� �����ؼ� Tv��ü �迭�� �� ��ҿ� ����
		for(int i=0; i < tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; // tvArr[i]�� channel�� i+10�� ����
		}

		for(int i=0; i < tvArr.length;i++) {
			tvArr[i].channelUp();  // tvArr[i]�� �޼��带 ȣ��. ä���� 1����
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}
}