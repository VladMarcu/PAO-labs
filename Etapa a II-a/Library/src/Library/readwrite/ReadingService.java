package Library.readwrite;

import Library.Book;
import Library.Reader;
import Library.ReaderService;
import Library.Section;
import Library.exceptions.WritingExceptions;
import java.io.*;
import java.util.ArrayList;
public class ReadingService {
    //luam cititor din fisier
    public static Reader[] readReader(Reader[] readerList) throws WritingExceptions {
        try (BufferedReader buffer = new BufferedReader(new FileReader("src/Library/data/ReaderIN.txt"))) {
            String line = buffer.readLine();
            ArrayList<Reader> readers = new ArrayList<>();
            while (line != null) {
                String[] lines = line.split(", ");
                Reader reader = new Reader();
                reader.setName(lines[0]);
                reader.setAge(Integer.parseInt(lines[1]));
                reader.setCnp(lines[2]);
                reader.setStudent(Boolean.valueOf(lines[3]));

                //dupa ce ii setez atributele, il adaug in lista
                readers.add(reader);

                // go to next line
                line = buffer.readLine();
            }
            for (Reader reader : readers) {
                readerList = ReaderService.addReader(readerList, reader);
            }
            return readerList;
        } catch (IOException e) {
            throw new WritingExceptions("Something went wrong ! ", e);
        }
    }

}
