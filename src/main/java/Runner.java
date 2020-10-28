import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws JAXBException, IOException {

        ObjectToXML objectToXML = new ObjectToXML();

        objectToXML.marshal();

        BookLists books = objectToXML.unmarshall();
        System.out.println(books.toString());
    }
}
