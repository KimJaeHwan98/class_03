package etc;

import java.text.SimpleDateFormat;
import java.util.Date;

//시간을 얻어오는 기능
//long 으로 저장
public class TineClass01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		
		SimpleDateFormat si = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 55초");
		String s = si.format(time);
		System.out.println(s); // 우리가 형식을 지정해서 볼 수 있게 해준다.
		
		System.out.println("---------------");
		
		Date  date = new Date();
		System.out.println(date);
		System.out.println(si.format(date));
		
	}//SimpleDateFormat을 사용하면 우리가 원하는 형식으로 시간을 가져올수있다.
}
