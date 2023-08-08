import com.testbook.mockito.Book;
import com.testbook.mockito.BookRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

public class FakeBookRepository implements BookRepository {

    HashMap<String,Book> bookMap = new HashMap<>();
    @Override
    public void save(Book book) {
        bookMap.put(book.getBookId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookMap.values();
    }
}
