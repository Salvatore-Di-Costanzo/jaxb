import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name="lists")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookLists {
    List<Book> booksList = new ArrayList<Book>();

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(Book book) {

        this.booksList.add(book);
    }


}
