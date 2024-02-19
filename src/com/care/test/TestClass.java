package com.care.test;
//퍼블릭 클레스는 1개만 존재한다.
//아무 키워드도 없으면 디폴트다 라고 표현한다
//
class Test001 {// 앞쪽에 퍼블리이 없으면디폴트값들은 같은 패키지에서만 적용가능하다
	//다른 패키지에서 사용 불가능하다.
	void test001() {
		System.out.println("Test001 test001 메소드");
	}
}
public class TestClass {
	public void test() {
		System.out.println("test 메소드");
	}
	void test2() {
		System.out.println("test2 메소드");
	}
}
