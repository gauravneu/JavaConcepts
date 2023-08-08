import com.testbook.mockito.Book;
import com.testbook.mockito.BookRepository;
import com.testbook.mockito.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.net.CookieHandler;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;


public class FakeTest {
    @Test
    public void testFake(){
        FakeBookRepository fakeBookRepository = new FakeBookRepository();
        BookService bookService = new BookService(fakeBookRepository);
        bookService.addBook(new Book("a","a",250, LocalDate.now()));
        bookService.addBook(new Book("b","b",350, LocalDate.now()));

        assertEquals(2,bookService.findAllBooks());

    }

    @Test
    public void mockWithMockito(){
        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
         Book book1 = new Book("a","a",250, LocalDate.now());
         Book book2 = new Book("b","b",350, LocalDate.now());

        Collection<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        when(bookRepository.findAll()).thenReturn(books);

        assertEquals(2, bookService.findNumberOfBooks());

    }
}
