package Library;

import java.util.Objects;

public class Section {
    private String sectionCode; //A,B,C etc.

    public Section(){

    }
    public Section(String sectionCode){
        this.sectionCode = sectionCode;
    }
    public void setSectionCode(String sectionCode){
        this.sectionCode = sectionCode;
    }

    public String getSectionCode(){
        return sectionCode;
    }

    @Override
    public String toString() {
        return "Section : " + sectionCode + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Section section = (Section) obj;
        return sectionCode.equals(section.sectionCode);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSectionCode());
        return result;
    }
}

