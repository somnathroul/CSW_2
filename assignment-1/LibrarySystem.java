package Assignment2;
abstract class LibraryResource{
private String title,author;
public LibraryResource(String title , String author) {
this.title = title;
this.author = author;
}
public String getTitle() {
return title;
}
public void setTitle(String title) {
this.title = title;
}
public String getAuthor() {
return author;
}
public void setAuthor(String author) {
this.author = author;
}
abstract void displayDetails();
}

class Book extends LibraryResource{
private int pageCount;

public Book(String title, String author,int pageCount) {
super(title, author);
this.pageCount = pageCount;
}

public int getPageCount() {
return pageCount;
}

public void setPageCount(int pageCount) {
this.pageCount = pageCount;
}

@Override
void displayDetails() {
System.out.println("Title of the book "+this.getTitle()+", author of the book : "+this.getAuthor()+", page count of the book is : "+this.pageCount);
}

}

class Magazine extends LibraryResource{
private String issueDate;

public Magazine(String title, String author,String issueDate) {
super(title, author);
this.issueDate = issueDate;
}

public String getIssueDate() {
return issueDate;
}

public void setIssueDate(String issueDate) {
this.issueDate = issueDate;
}

@Override
void displayDetails() {
System.out.println("Title of the magazine "+this.getTitle()+", author of the magazine : "+this.getAuthor()+", issue date of the book is : "+this.issueDate);
}
}

class DVD extends LibraryResource{
private String duration;

public DVD(String title, String author,String duration) {
super(title, author);
this.duration = duration;
}

public String getDuration() {
return duration;
}

public void setDuration(String duration) {
this.duration = duration;
}

@Override
void displayDetails() {
System.out.println("Title of the DVD "+this.getTitle()+", author of the DVD : "+this.getAuthor()+", duration of DVD is : "+this.duration);
}

}
public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(" Khandagirir", "Suvam ", 769);
		book.displayDetails();
		Magazine magazine = new Magazine("Nigth Experience in Delhi", "Suva Das", "1-12-1999");
		magazine.displayDetails();
		DVD dvd = new DVD("Experice", "Rati", "1469");
		dvd.displayDetails();
	}

}
