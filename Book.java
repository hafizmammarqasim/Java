public class Book{
  private String title;
  private Author author;
  
  Book(String title, Author author){
    this.title = title;
    this.author = author;
  }
  Book(Book book){
    this.title = book.getTitle();
    this.author = new Author(book.getAuthor().getName(), book.getAuthor().getAge());
  }
  
  public void setTitle(String title){
    this.title = title;
  }
  public void setAuthor(Author author){
    this.author = author;
  }
  public String getTitle(){
    return title;
  }
  public Author getAuthor(){
    return author;
  }
  
  public void displayBook(){
    System.out.println("Book Title: "+title);
    getAuthor().displayAuthor();
  }
}
