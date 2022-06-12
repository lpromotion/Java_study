//package chapter07;
//
//public class CastingTest2 {
//	public static void main(String[] args) {
//		Car car = new Car();
//		Car car2 = null;
//		FireEngine fe = null;
//		
//		car.drive();
//		fe = (FireEnging)car;
//		fe.drive();
//		car2 = fe;
//		car2.drive();
//	}
//}

// 서로 상속관계에 있는 타입간의 형변환은 자유롭게 수행될 수 있으나, 
// 참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용되지 않는다.
// 그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인하는 것이 중요하다.