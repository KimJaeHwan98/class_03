package constructuor;

import java.util.Scanner;

public class LoginService03 {
	LoginDTO03 dto = new LoginDTO03();
	   String userId,userPwd;
	   Scanner input =new Scanner(System.in);
	   public void display() {

	      LoginDTO03 dto = new LoginDTO03();
	      //   System.out.println();

	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.탈퇴");
		System.out.println(">>>>> : ");
		int num = input.nextInt();
		switch(num) {
		case 1 :
			LoginCheck(); 
			
			break;
		case 2 :
			register();
		
			break;
		case 3 :
			memberExit();
			break;
			default :
	}
		}


		
	

}
	   public void inputData(String msg1, String msg2) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("로그인 기능");
			
			System.out.println("인증할 id입력");
			userId = input.next();
			System.out.println("인증할 pwd입력");
			userPwd = input.next();
		}
		public void memberExit() {
			System.out.println("탈퇴 기능");
			dto.setId(null); dto.setPwd(null);
		}
		public void LoginCheck() {
			inputData("로그인 아이디 입력","로그인 패스워드 입력");
			if(userId.equals(dto.getId())) {
				if(userPwd.equals(userPwd)) {
					System.out.println("인증통과");
				}else {
					System.out.println("비밀번호 틀림");
				}
			}else {
				if(dto.getId()==null) System.out.println("회원가입 먼저 하세요");
				else System.out.println("아이디가 일치하지 않습니다.");
			}
		}
		public void register() {
			inputData("회원가입 아이디 입력","회원가입 패스워드 입력");
			dto.setId(userId); dto.setPwd(userPwd);
			System.out.println("====회원가입 성공====");
		}
}
