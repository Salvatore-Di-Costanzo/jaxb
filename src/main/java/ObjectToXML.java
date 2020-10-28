import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ObjectToXML {
    public void marshal() throws JAXBException, IOException {
        BookLists bookList = new BookLists();

        bookList.setBooksList(new Book(1L,"Le Cronache di Narmia","Bhooo",new Date()));
        bookList.setBooksList(new Book(2L,"Le Cronache di Narmia","Bhooo",new Date()));

        JAXBContext context = JAXBContext.newInstance(BookLists.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(bookList, new File("./book.xml"));
    }

    public BookLists unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        return (BookLists) context.createUnmarshaller()
                .unmarshal(new FileReader("./book.xml"));
    }
}
