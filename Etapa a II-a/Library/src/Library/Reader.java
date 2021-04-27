package Library;

import java.util.Objects;

public class Reader {
    private String name;
    private int age;
    private String cnp;
    private boolean student;

    public Reader(){

    }

    public Reader(String name, int age, String cnp, boolean student){
        this.name = name;
        this.age = age;
        this.cnp = cnp;
        this.student = student;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCnp(String cnp){
        this.cnp = cnp;
    }

    public String getCnp(){
        return cnp;
    }

    public void setStudent(Boolean student){
        this.student = student;
    }

    public Boolean getStudent(){
        return student;
    }

    private String showIsStudent(){
        String s = " This reader is a student !";
        String str = " This reader is not a student !";
        if(this.student == Boolean.TRUE)
            return s;
        if(this.student == Boolean.FALSE)
            return str;
        return  "";
    }

    @Override
    public String toString() {
        return "Reader : " + "name = "+ name +
                "; age = " + age +
                "; CNP = " + cnp +
                "; Is student? = " + student + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Reader reader = (Reader) obj;
        return age == reader.age && student == reader.student && cnp == reader.cnp && name.equals(reader.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, cnp, student);
        return result;
    }
}
