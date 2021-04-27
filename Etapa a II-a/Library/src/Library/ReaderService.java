package Library;

import com.sun.jdi.event.ClassUnloadEvent;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ReaderService {
    public static void showMenu() {
        System.out.println("Menu for readers : ");
        System.out.println("1.Show all readers");
        System.out.println("2.Show student readers");
        System.out.println("3.Show other readers ");
        System.out.println("4.Add a Reader");
        System.out.println("5.Edit reader age");
    }

    public static void showReaderList(Reader[] readerList) {
        System.out.println("List of all readers :");
        for (Reader reader : readerList) {
            System.out.println(reader.toString());
        }
    }

    public static void showStudentList(Reader[] readerList) {
        System.out.println("List of student readers : ");
        for (Reader reader : readerList) {
            if (reader.getClass().equals(Student.class)) {
                System.out.println(reader.toString());
            }
        }
    }

    public static void showOtherList(Reader[] readerList) {
        System.out.println("List of other readers : ");
        for (Reader reader : readerList) {
            if (reader.getClass().equals(Other.class)) {
                System.out.println(reader.toString());
            }
        }
    }

    public static Reader[] addReader(Reader[] readerList, Reader reader) {
        Reader[] newReaderList = new Reader[readerList.length + 1];
        for (int i = 0; i < readerList.length; i++)
            newReaderList[i] = readerList[i];
        newReaderList[readerList.length] = reader;
        return newReaderList;
    }

    public static Reader[] addAReader(Reader[] readerList) {
        System.out.println("Add reader :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name :");
        String name = scanner.nextLine();
        System.out.println("Age :");
        int age = scanner.nextInt();
        System.out.println("CNP : ");
        String cnp = scanner.next();
        System.out.println("Student?(true/false) :");
        boolean student = scanner.nextBoolean();

        Reader reader = new Reader(name, age, cnp, student);
        System.out.println(reader.toString());

        Reader[] newReaderList = addReader(readerList, reader);
        return newReaderList;
    }

    public static Reader[] editReaderAge(Reader[] readerList) {
        System.out.println("Type the CNP of the person in order to change their age : ");
        Scanner scanner = new Scanner(System.in);
        String cnp = scanner.nextLine();
        for (Reader reader : readerList) {
            if (reader.getCnp().equals(cnp)) {
                System.out.println("Introduceti noua varsta :");
                int age = scanner.nextInt();
                reader.setAge(age);
                break;
            }
        }
        return readerList;
    }
}
