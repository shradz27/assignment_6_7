public class MyApplication {
  
  private String greet = "Welcome to my new application";
  private String version = "v1.0.0";
  private String author = "shradha luintel";

  public String greetUser() {
  	return greet;
  }

  public String getVersion() {
  	return version;
  }

  public String getAuthorName() {
  	return author;
  }

  public static void main(String[] args) {
    MyApplication app = new MyApplication();
    System.out.println(app.greetUser());
    System.out.println(app.getVersion());
    System.out.println(app.getAuthorName());
  }
}