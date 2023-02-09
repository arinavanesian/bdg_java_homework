package Classes;

public class Book {
		String title;
		String author;
		Book(String title,String author){
			this.title = title;
			this.author = author;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("ChrisT", "Mr. T");
		Author author = new Author("Kayle");
		author.setWritings("Kayle");
	}

}
