package Library;

import java.util.Objects;

public class Author {
    private String name;

    public Author(){

    }
    public Author(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Author : " + name + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Author author = (Author) obj;
        return name.equals(author.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        return result;
    }
}


