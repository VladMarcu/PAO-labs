package Library;

import java.util.Objects;

public class Other extends Reader{
    private boolean subscription;

    public Other(){

    }
    public Other(String name, int age, String cnp, boolean student, boolean subscription ){
        super(name, age, cnp, student);
        this.subscription = subscription;
    }

    public void setSubscription(Boolean subscription){
        this.subscription = subscription;
    }

    public Boolean getSubscription(){
        return subscription;
    }

    @Override
    public String toString() {
        return "Other person : " + super.toString() +
                "; Has subscription ? = " + subscription + " .";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Other other = (Other) obj;
        return subscription == other.subscription;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(subscription);
        return result;
    }
}
