package constructuor;

public class TestClass05 {
private String name , addr; //저장하기 위한 용도
public TestClass05() {
	System.out.println("기본 생성자");
}

public void display() {//  출력 / 연산 하겠다
	System.out.println("1.저장합니다.");
	name = "홍길동";
	setAddr("산꼴짜기");
	System.out.println("출력합니다");
	System.out.println(getNmae());
	System.out.println(addr);
}

public String getNmae() {
	return name;
}
public void setNmae(String nmae) {
	this.name = nmae;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
}