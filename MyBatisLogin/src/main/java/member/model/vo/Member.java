package member.model.vo;

public class Member {
	
	private String id;
	private String pwd;
	private String nickName;
	
	public Member() {
		super();
	}
	
	public Member(String id, String pwd, String nickName) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.nickName = nickName;
	}
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", nickName=" + nickName + "]";
	}
	
	

}
