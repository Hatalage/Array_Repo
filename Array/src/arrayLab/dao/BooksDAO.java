package arrayLab.dao;
import arrayLab.model.Books;

public class BooksDAO {
	private static Books[] booksArray = new Books[3];
	static int bookCount = 0;

	public boolean addBook(Books book) {

		if (bookCount < booksArray.length) {
			booksArray[bookCount] = book;
			bookCount++;
		} else {
			return false;
		}

		return true;

	}

	// find the bookid and modify the book name.
	public boolean modifyBookName(int bookId, String bookName) {

		for (int i = 0; i < bookCount; i++) {
			if (booksArray[i].getBookId() == bookId) {
				booksArray[i].setBookName(bookName);
				return true;
			}

		}

		return false;
	}

	// find the bookid and modify the book price.
	public boolean modifyBookPrice(int bookId, double bookPrice) {
		for (int i = 0; i < bookCount; i++) {
			if (booksArray[i].getBookId() == bookId) {
				booksArray[i].setBookPrice(bookPrice);
				return true;
			}
		}

		return false;
	}
	
	public Books[] getAllBooks() {
	
		return booksArray;
	}
	
	

	
}