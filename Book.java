public class Book {

	private Author[] authors;
	private Language[] languages;
	private Rating[] ratings;
	private Genre[]  bookGenres;
	private Title[] bookTitle;
	private boolean audioVersion;
	private Date[] publishedDate;
	private Pages[] numberOfPages;
	private Publisher[] publishers;


	public Author[] getAuthors() {
        return authors;
    }
    public void setAuthors(Author[] authors) {        
            this.authors = authors;     
          
    }	
}