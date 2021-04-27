package Library.readwrite;

import Library.Reader;
import Library.ReaderService;
import Library.exceptions.WritingExceptions;
import java.io.*;
import java.util.ArrayList;

public class WritingService {
    //functie pentru a afisa datele unui client
    public static void writeReader(Reader[] readerList, boolean append) throws WritingExceptions {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("src/Library/data/ReaderOUT.txt",append))) {
            for (Reader reader : readerList) {
                String text = reader.toString() + '\n';
                buffer.write(text);
            }
        } catch (IOException e) {
            throw new WritingExceptions("Something went wrong ! ", e);
        }
    }
}
