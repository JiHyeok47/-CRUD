package singup;

public class user {
	String name;
	String id;
	String pw;
	
	
	public user(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
		
	}
	
	public String toString( ) {
		return "----------- \n ȸ�� �̸�:" + name  + "\n ���̵� :" + id + "\n ��й�ȣ" + pw + "\n ------------";
	}
}
