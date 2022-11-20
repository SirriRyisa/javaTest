import java.rmi.server.UID;

public abstract class BaseUser{
  private UID id;
  private String firstName;
  private String lastName;
  private String middleName;
  private String email;
  private String password;
  private int noOfLoginAttemp;
  private boolean isBlocked;
  private Date dateCreated;
  private Date LastLoginDate;

  
  
  public BaseUser(UID id, String firstName, String lastName, String middleName, String email, String password) {
    this.id = new UID();
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.email = email;
    this.password = password;
  }
  public UID getId() {
    return id;
  }
  
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  public int getNoOfLoginAttemp() {
    return noOfLoginAttemp;
  }
  public void setNoOfLoginAttemp(int noOfLoginAttemp) {
    this.noOfLoginAttemp = noOfLoginAttemp;
  }
  public boolean isBlocked() {
    return isBlocked;
  }
  public void setBlocked(boolean isBlocked) {
    this.isBlocked = isBlocked;
  }
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }
  public Date getLastLoginDate() {
    return LastLoginDate;
  }
  public void setLastLoginDate(Date lastLoginDate) {
    LastLoginDate = lastLoginDate;
  }

  public String getPassword() {
    return password;
  }

  @Override
public String toString() {
  return "{email:" +this.email +"}";
}

abstract void logIn(String email, String password);
abstract void register();
}

