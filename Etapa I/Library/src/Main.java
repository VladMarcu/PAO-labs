import Library.*;

import java.util.Scanner;

public class Main {

    public static void readerService(Reader[] readerList) {
        ReaderService.showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Choose :");
        int op = scanner.nextInt();
        if (op == 1) {
            ReaderService.showReaderList(readerList);
        } else if (op == 2) {
            ReaderService.showStudentList(readerList);
        } else if (op == 3) {
            ReaderService.showOtherList(readerList);
        } else if (op == 4) {
            readerList = ReaderService.addAReader(readerList);
            ReaderService.showReaderList(readerList);
        } else if (op == 5) {
            readerList = ReaderService.editReaderAge(readerList);
            ReaderService.showReaderList(readerList);
        } else {
            System.out.println("Option not valid!");
            readerService(readerList);
        }
        System.out.println();
    }

    public static int option() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Reader service");
        //System.out.println("2.Book service");
        System.out.println("3.Exit");
        System.out.println("Choose the service you want to use : ");
        int o = scanner.nextInt();
        return o;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("David Foster Wallace");

        Section section1 = new Section("A");
        Section section2 = new Section("C");

        Book book1 = new Book("Fantastic Beasts and Where to Find Them", 78, 128,section2,author1 );
        Book book2 = new Book("Infinite Jest", 28, 189,section1,author2 );

        Reader reader1 = new Reader("Andrei Vlad",20,"5001122394971", true);
        Reader reader2 = new Reader("Marina Andreescu",30,"2910301015472", false);

        Student student1 = new Student("Andrei Vlad",20, "5001122394971", true, true);

        Other other1 = new Other("Marina Andreescu",30,"2910301015472", false, true);

        Novelist novelist1 = new Novelist("J.K. Rowling", "Harry Potter");

        Satirist satirist1 = new Satirist("David Foster Wallace", "1962-2008");

        Reader[] readerList=new Reader[]{reader1,reader2};
        Student[] studentList = new Student[]{student1};
        int o = option();
        if(o==1){
            readerService(readerList);
        }//else if(o==2 ){
            //bookService(bookList);
        else if(o==3) return;
        else{
            System.out.println("Change your option !");
        }
    }
}
