package constructuor;

public class quizDTO {
	private String id,pwd;
	public quizDTO (String id , String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public quizDTO() { }
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
