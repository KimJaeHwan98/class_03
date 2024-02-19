package etc;

import java.util.Date;

public class SleepClass01 {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		System.out.println(i+" : "+new Date());
		
		try {
			Thread.sleep( 2000 ); //2초 기다리게하기 천단위가 1초
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	System.out.println("시작");
	long start = System.currentTimeMillis();
	try {
		Thread.sleep(3000);
	}catch(Exception e) {}
	long end = System.currentTimeMillis();
	System.out.println("종료");
	System.out.println("사용시간 :" + (end - start) / 1000);
	
	
}
}
