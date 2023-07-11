public class Library{

	private Librarian[] librarians;
	private Book[] books;
	private Furniture[] furnitures;
	private Room[] rooms;
	private openHour[] openHours;	
	


	public Book[] getBooks(){
		return books;
	}
	public void setBooks(Book[] books){
		this.books = books;
	}
	public Librarian[] getLibrarians(){
		return librarians;
	}
	public void setLibrarians(Librarian[] librarians){
		this.librarians = librarians;
	}
}
