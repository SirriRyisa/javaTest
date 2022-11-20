import java.io.*;

// Defined a class 
class SeriaDemo implements java.io.Serializable{
  public int a;
  public String b;

// Made use of constructor

  public SeriaDemo(int a, String b) {
    this.a = a;
    this.b = b;
  }

}

class Test{
  public static void main(String[] args) {
    SeriaDemo object = new SeriaDemo(2, "Sirri Serial Trial");
    String filename = "myfile.ser";

    // serielization
    try {

      // Saving object in file 
      FileOutputStream file = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);

      // Method for serielization of object

      out.writeObject(object);
      
      out.close();
      file.close();

      System.out.println("Serielized java");
    }

    catch
  }
}