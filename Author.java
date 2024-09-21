public class Author{
  private String name;
  private int age;
  
  Author(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  
  public void displayAuthor(){
    System.out.println("Author Name: "+name);
    System.out.println("Author Age: "+age);
    System.out.println("----------------------");
    }
}
