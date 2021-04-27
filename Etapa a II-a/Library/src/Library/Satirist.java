package Library;

import java.util.Objects;

public class Satirist extends Author{
    private String period; // medieval, early modern and 18th-century satirists, contemporan satirists etc.

    public Satirist(){

    }

    public Satirist(String name, String period){
        super(name);
        this.period = period;
    }

    public void setPeriod(String period){
        this.period = period;
    }

    public String getPeriod(){
        return period;
    }

    @Override
    public String toString() {
        return "Satirist : " +super.toString()+"; The period they lived in : "  + period + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Satirist satirist = (Satirist) obj;
        return period.equals(satirist.period);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(period);
        return result;
    }
}
