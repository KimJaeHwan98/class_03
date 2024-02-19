package constructuor;

import java.util.Scanner;

public class quizTest01 {
	Scanner input = new Scanner(System.in);
	quizDTO p = new quizDTO();
	private quizDTO t;
	public void display() {
		while(true) {
		System.out.println("1.로그인");
		
		System.out.println("2.회원가입");
		
		System.out.println("3.탈퇴");
	
		int ret = loginData();
		if (ret ==4) break;
		}
		}
		
		
	
	public int loginData() {
		int select = input.nextInt();
		switch(select) {
			case 1 : login(); return 0;
			case 2 :ppp(); return 0 ;
			case 3 : ttt(); return 0 ;
			case 4 : return 4;	
			default : return 0;
		}
		
	
		
	}
	public void login() {
	
		System.out.println("아이디입력");
		String id = input.next();
		System.out.println("비밀번호입력");
		String pwd = input.next();
		
		String massage = null;
		if(id.equals(p.getId())) {
			if(pwd.equals(p.getPwd())) {
			
				massage = "인증에 성공하였습니다.";	
			}else {
				massage = "인증에 실패하였습니다";
			}
		}else {
			massage = "아이디가 틀렸습니다.";
		}
		System.out.println(massage);
		
	}
	public void ppp() {
		System.out.println("생성 아이디입력");
		String id = input.next();
		System.out.println("생성 비밀번호입력");
		String pwd = input.next();
		String meg = null;
		if(!(id.equals(p.getId()))) {
			if(!(pwd.equals(p.getPwd()))) {
				meg = "회원가입 성공!";
				p.setId(id);
				p.setPwd(pwd);
				
			}
		}
		else{
			meg="아이디가 있습니다.";
		}
		
		System.out.println(meg);
	}
	public void ttt() {
		System.out.println("아이디 입력");
		String id = input.next();
		System.out.println("비밀번호 입력");
		String pwd = input.next();
		if(id.equals(p.getId())) {
			if(pwd.equals(p.getPwd())) {
				System.out.println("회원 탈퇴에 성공하셨습니다.");
				p.setId(null);
				p.setPwd(null);
			}else {
				System.out.println("비밀번호가 틀렸습니다. 인증을 다시 하세요");
			}
			
		}else {
			System.out.println("사용자 존재하지 않습니다.회원가입 후 진행해주세요");
	}
	}
	
	

}
