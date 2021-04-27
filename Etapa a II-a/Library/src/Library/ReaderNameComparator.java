package Library;

import java.util.Comparator;

public class ReaderNameComparator implements Comparator<Reader> {
    @Override
    public int compare(Reader o1, Reader o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
