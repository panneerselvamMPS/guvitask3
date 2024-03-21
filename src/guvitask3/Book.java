package guvitask3;
public class Book{
	private int bookId;
	private String title;
	private String author;
	private boolean isavailable;
	
	public Book() {
		
	}
	public Book(int bookId, String title, String author, boolean isavailabe) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isavailable = isavailable;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	public boolean isavailable() {
		return isavailable;
	}
	public void setavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}
public String toString() {
	return "Book{" + "bookId=" + bookId+", title=" + title+", author=" + author +", isavailable=" + isavailable +"}";
}

}
