package Classes;

import javax.swing.JOptionPane;

public class Author {
	String name; 
	String books[];
	Author(String name){
		this.name = name;
	}
	void setWritings(String name) {
		this.name = name;
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insert the number of books written: "));
		String writings =JOptionPane.showInputDialog("Insert the titles of the books by: " + this.name); 
		for(int i = 0; i < n; i++) {
			books[i] = writings;
		}
//		String writingsDisplay = JOptionPane.showMessageDialog(null, "The titles you entered:" + books.writings);
//		this.books = books;
		
//		String[] books=new String[2];
		System.out.println(this.name + "'s works: " );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Author a = new Author("AME");
		 a.setWritings("AME");
	}

}
