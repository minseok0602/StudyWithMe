package LogReg;

public class Registration {
	private String id;
	private String password;
	private String name;
	private String depart;
	private boolean isAdmin;
	public Registration(String id, String name,String password, String depart, boolean isAdmin) {
		this.id = id;
		this.name= name;
		this.password = password;
		this.depart = depart;
		this.isAdmin =isAdmin;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getDepart() {
		return depart;
	}
	public boolean getIsAdmin() {
		return isAdmin;
	}
}
