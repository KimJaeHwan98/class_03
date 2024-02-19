package constructuor;

import java.util.ArrayList;

//오버로딩
//같은 이름을 사용가능 하지만 값은 달라야 한다.
class TestClass04 { 
public TestClass04(int num) { // 디폴트 생성자가 없어진다 사용하려면 무조건 디폴트 생성자를 만들어줘야한다
	System.out.println("매개변수 받는 생성자");
}
public TestClass04() {
	System.out.println("기본 생성자 실행");
}// 아무값이 없는 생성자를 하나 만들어줘야한다.  / 따로 만들어줘야한다.
 public void test() {
	 System.out.println("");
 }
 public void test(int num) {
	 System.out.println(num + "test 호출");
 }
}

public class Ex04 {
	public static void main(String[] args) {
	TestClass04 t = new TestClass04();
	t.test(100); t.test(100);
	TestClass04 t2 = new TestClass04(10000);
	
	
	ArrayList arr = new ArrayList<>();
	String s =new String();
	String s1 =new String("값 전달");
	//생성자는 다 클래스로 가져올 수 있다.
	//컨트롤 플러스 매소드 누르면 과정을 확인 가능.
	
	}
}




































