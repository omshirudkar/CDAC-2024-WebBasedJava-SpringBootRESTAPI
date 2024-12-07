package book_library.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_library.entity.Book;
import book_library.repositary.BookRepositary;

@Service //marks thise class as a service and it is managed by spring
public class BookService {
	
	@Autowired
	private BookRepositary bookRepositaryReference;

	public Collection<Book> getAllBooks(){
		Collection<Book> allBooks = bookRepositaryReference.findAll();
		return allBooks;
	}
	//a method to return one book against its ID
	
	public Book getOneBook(int bookID) {
	
			Book foundBook = null;
			Optional<Book> opt = bookRepositaryReference.findById(bookID);
			if(opt.isPresent())//If found
				foundBook = opt.get();//GET the book
			return foundBook;
	
	}
	
	
	public void createNewBook(Book newBook) {
		bookRepositaryReference.save(newBook);
		
	}
	
}
