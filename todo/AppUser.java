import java.rmi.server.UID;

public class AppUser extends BaseUser{
  public AppUser(UID id, String firstName, String lastName, String middleName, String email, String password) {
    super(id, firstName, lastName, middleName, email, password);
  }

  @Override
  void logIn(String email, String password) {
    if(this.isBlocked()){
      System.out.println("Acc disabled");
      return;
    }
    if(this.getNoOfLoginAttemp()>=3){
      System.out.println("You have successfully logIn");
      this.setBlocked(true);
      return;
    }
    if(this.getEmail().equals(email.trim()) && this.getPassword().equals(password)){

    this.setNoOfLoginAttemp( 0);
    System.out.println("Logged in");
  }
    else {
      this.setNoOfLoginAttemp(this.getNoOfLoginAttemp()+1);
      System.out.println("LogIn error");
    }
  }

  @Override
  void register() {
    
  }

  

}

 