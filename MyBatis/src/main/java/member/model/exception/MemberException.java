package member.model.exception;
//예외 만들기 : 기본생성자와 매개변수 있는 생성자만 만들어주기
public class MemberException extends Exception {
	public MemberException() {}
	public MemberException(String message) {
		super(message);
	}
}
