package etc;

import java.util.*; //폴트는 특정폴더의 기능을 가져올때 사용한다.
import constructuor.*; //해당 패키지의 모든 파일을 가져다 사용하겠다라는 의미

//import com.care.abc.Date;

//같은 값이여도 패키지가 다르면 다른 기능을 작동한다.
//그래서 패키지를 가져와서 사용하려면 경로를 확인하고 가져와야한다.
//클래스 명은 같아도 저장하는 위치가 다르면 기능은 다르다 잘 확인하고 사용하자
public class MainClass {
public static void main(String[] args) {
	/*Date d = new Date();
	d.aaa();
	d.bbb();
	d.ccc();
	*/
	Ex01 ex;
	Ex02 ex1;
	Ex03 ex2;
	LoginDTO03 lo =new LoginDTO03();
	lo.setId("Aaa");
	
	java.util.Scanner sc; //이런식으로 표시되어 있어도 당황하지말고 사용한다. 
	ArrayList arr;	
	HashSet hs;
	HashMap map;
	
	
	//이렇게 사용해줘야 같은 데이터여도 가독성이 좋다.
	java.util.Date date; 
	com.care.test.Date d = new Date();
	com.care.abc.Date dd = new com.care.abc.Date();
	
}
}




















