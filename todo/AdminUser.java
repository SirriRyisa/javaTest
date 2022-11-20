import java.rmi.server.UID;

public class AdminUser extends BaseUser{

  public AdminUser(UID id, String firstName, String lastName, String middleName, String email, String password) {
    super(id, firstName, lastName, middleName, email, password);
 
  }

  @Override
  public void logIn(){

  }

  @Override
  public void register(){

  }
}