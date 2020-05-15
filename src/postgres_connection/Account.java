package postgres_connection;

public class Account {
 private int id;
 private String login;
 private String pass;
 public Account(int id, String login, String pass){
	 this.id = id;
	 this.login = login;
	 this.pass = pass;
 }
 public String getLogin() {
	 return login;
 }
 public String getPass() {
	 return pass;
 }
 public String toString() {
	 return id+" "+login+" "+pass;
 }
}
