package Library;

import java.util.Objects;

public class Novelist extends Author {
    private String otherNovels;

    public Novelist(){

    }

    public Novelist(String name, String otherNovels){
        super(name);
        this.otherNovels = otherNovels;
    }

    public void setOtherNovels(String otherNovels){
        this.otherNovels = otherNovels;
    }

    public String getOtherNovels(){
        return otherNovels;
    }

    @Override
    public String toString() {
        return "Novelist : " +super.toString()+"; Other novels they wrote : "  + otherNovels + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Novelist novelist = (Novelist) obj;
        return otherNovels.equals(novelist.otherNovels);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(otherNovels);
        return result;
    }
}
