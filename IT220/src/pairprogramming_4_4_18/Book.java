/*FileIO Pair Program
 * Pair Programming 4/9/2018
 * Shawn Potter, Rizwan Ali
 */

package pairprogramming_4_4_18;

public class Book {
	private String title;
	private String author;
	private int releaseYear;
	private boolean hardCover;
	
	public Book() {
		this.title="";
		this.author="";
		this.releaseYear=0;
		this.hardCover=false;
	}
	
	public Book(String title, String author, int releaseYear, boolean hardCover) {
		this.title=title;
		this.author=author;
		this.releaseYear=releaseYear;
		this.hardCover=hardCover;
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

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public boolean isHardCover() {
		return hardCover;
	}

	public void setHardCover(boolean hardCover) {
		this.hardCover = hardCover;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", releaseYear=" 
				+ releaseYear + ", hardCover="
				+ hardCover + "]";
	}
}
