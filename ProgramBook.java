
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


class Book implements Comparable<Book>{
	private int id;
	private String name;
	private String author;
	private String publisher;
	private float price;
	public Book() {

	}
	public Book(int id, String name, String author, String publisher, float price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public int compareTo(Book other) {
		return this.id - other.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj != null ) {
			Book other = (Book) obj;
			if( this.id == other.id)
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return String.format("%-5d%-50s%-30s%-30s%-10.2f", this.id, this.name, this.author, this.publisher, this.price);
	}
}

class CompareById implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getId() - b2.getId();
	}
}

class CompareByName implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getName().compareTo(b2.getName());
	}
}

class CompareByAuthor implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getAuthor().compareTo(b2.getAuthor());
	}
}

class CompareByPublisher implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getPublisher().compareTo(b2.getPublisher());
	}
}

class CompareByPrice implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return (int) (b1.getPrice() - b2.getPrice());
	}
}
public class ProgramBook {
	private static ArrayList<Book> bookList = new ArrayList<Book>();
	
	private static Scanner sc = new Scanner(System.in);
	
	private static Book[] getBooks() {
		Book[] arr = new Book[ 10 ];
		arr[ 0 ] = new Book(1083, "The Alchemist", "Paulo Coelho", "HarperCollins", 901.14f);
		arr[ 1 ] = new Book(461, "The Da Vinci Code", "Dan Brown", "Doubleday", 1065.13f);
		arr[ 2 ] = new Book(932, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 819.14f);
		arr[ 3 ] = new Book(1159, "The Hunger Games", "Suzanne Collins", "Scholastic Press", 737.15f);
		arr[ 4 ] = new Book(691, "The Girl with the Dragon Tattoo", "Stieg Larsson", "Norstedts Förlag", 1229.13f);
		arr[ 5 ] = new Book(115, "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1639.11f);
		arr[ 6 ] = new Book(574, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 983.14f);
		arr[ 7 ] = new Book(230, "The Fault in Our Stars", "John Green", "Dutton Books", 1147.13f);
		arr[ 8 ] = new Book(864, "Gone Girl", "Gillian Flynn", "Crown Publishing Group", 901.14f);
		arr[ 9 ] = new Book(383, "Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", 655.15f);
		return arr;
	}
	private static void addRecord(Book[] arr) {
		if( arr != null ) {
			for (Book book : arr) {
				bookList.add(book);
			}
		}
	}

	private static Book findRecord(int bookId) {
		Book key = new Book();
		key.setId(bookId);	
		
		if( bookList.contains(key)) {
			int index = bookList.indexOf(key);
			Book book = bookList.get(index);
			return book;
		}
		return null;
	}

	
	private static boolean removeRecord(int bookId) {
		Book key = new Book();
		key.setId(bookId);	
		
		if( bookList.contains(key)) {
			bookList.remove(key);
			return true;
		}
		return false;
	}
	
	private static void printRecord(Comparator<Book> comparator) {
		
		bookList.sort(comparator);
		
		for (Book book : bookList) {
			System.out.println( book.toString());
		}
	}	
	private static void printRecord(Book book) {
		if( book != null )
			System.out.println( book.toString() );
		else
			System.out.println("Invalid book id");
	}
	private static void printRecord(boolean removedStatus) {
		if( removedStatus == true )
			System.out.println("Record is removed");
		else
			System.out.println("Invalid book id");
	}
	private static int mainMenuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Record");
		System.out.println("2.Find Record");
		System.out.println("3.Remove Record");
		System.out.println("4.Print Record[ Sorted ]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	private static int subMenuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Compare By Id");
		System.out.println("2.Compare By Name");
		System.out.println("3.Compare By Author");
		System.out.println("4.Compare By Publisher");
		System.out.println("5.Compare By Price");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = ProgramBook.mainMenuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Book[] books = ProgramBook.getBooks();
				ProgramBook.addRecord( books );
				break;
			case 2:
				System.out.print("Enter book id	:	");
				Book book =  ProgramBook.findRecord( sc.nextInt() );
				ProgramBook.printRecord( book );
				break;
			case 3:
				System.out.print("Enter book id	:	");
				boolean removedStatus = ProgramBook.removeRecord( sc.nextInt() );
				ProgramBook.printRecord(removedStatus);
				break;
			case 4:
				while( ( choice = ProgramBook.subMenuList( ) ) != 0 ) {
					Comparator<Book> comparator = null;
					switch( choice ) {
					case 1:
						comparator = new CompareById();
						break;
					case 2:
						comparator = new CompareByName();
						break;
					case 3:
						comparator = new CompareByAuthor();
						break;
					case 4:
						comparator = new CompareByPublisher();
						break;
					case 5:
						comparator = new CompareByPrice();
						break;
					
					}
					ProgramBook.printRecord(  comparator );
				}
				
				break;
			}
		}
	}
}


