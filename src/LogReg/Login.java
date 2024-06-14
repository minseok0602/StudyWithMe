package LogReg;

public class Login {
private String id;
private String password;
private boolean isAd;
public Login(String id, String password) {
	this.id = id;
	this.password = password;
}
public String getId() {
	return id;
}
public String getPassword() {
	return password;
}
public boolean getIsAd() {
	return isAd;
}
}
