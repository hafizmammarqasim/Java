public class Main{
  public static void main(String args[]){
      Author author1 = new Author("Ahmad Hassan", 21);
      Book English = new Book("English", author1);
      English.displayBook();
      
      Book Urdu = new Book(English);
      Urdu.setTitle("Urdu");
      Urdu.getAuthor().setName("Ali");
      
      Urdu.displayBook();
      English.displayBook();
  }
}
