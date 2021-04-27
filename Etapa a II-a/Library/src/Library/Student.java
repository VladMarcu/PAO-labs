package Library;

import java.util.Objects;

public class Student extends Reader{
    private boolean freeBooks;

    public Student(){

    }
    public Student(String name, int age, String cnp, boolean student, boolean freeBooks ){
        super(name, age, cnp, student);
        this.freeBooks = freeBooks;
    }

    public void setFreeBooks(Boolean freeBooks){
        this.freeBooks = freeBooks;
    }

    public Boolean getFreeBooks(){
        return freeBooks;
    }

    @Override
    public String toString() {
        return "Student : " + super.toString() +
                "; Has free books? = " + freeBooks + " .";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return freeBooks == student.freeBooks;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(freeBooks);
        return result;
    }
}

