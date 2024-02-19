package constructuor;

class TestClass03 { //알트 쉬프트 s 하면 셋터와겟터클린 후 만들어준다.
	private String name , addr;
	private int age;
	
	public TestClass03(String name, String addr , int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
		System.out.println("생성자를 통한 초기화");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t = null ; // = new TestClass03(); // 객체화로 사용이 가능한다
		//System.out.println( t );
		//t.setAddr("aaa");
		String name = "홍길동";
		String addr = "산골짜기";
		int age = 20;
		//생성자라는 코드를 생성해두면 사용이 편리하다 셋터보다 훨씬 코드가 줄어든다.
		t = new TestClass03(name , addr , age); // 생성자에 초기화해주면 쓰레기값이 덜 나온다.
	//	t.setName(name); t.setAddr(addr); t.setAge(age); //셋으로 저장 겟으로 불러온다 
		System.out.println("이름 : " + t.getName());
		System.out.println("조소 : " + t.getAddr());
		System.out.println("나이 : " + t.getAge());
		
	}
}
