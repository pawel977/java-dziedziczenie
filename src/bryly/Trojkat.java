package bryly;

public class Trojkat {
    private float podstawaTrojkata, wysokoscTrojkata;

    public Trojkat(float podstawaTrojkata, float wysokoscTrojkata){
        this.podstawaTrojkata = podstawaTrojkata;
        this.wysokoscTrojkata = wysokoscTrojkata;
    }
    public Trojkat(){}

    //math
    public float liczPole(){
        return  (podstawaTrojkata * wysokoscTrojkata)/2;
    }

    //setters & getters


    public float getPodstawaTrojkata() {
        return podstawaTrojkata;
    }

    public void setPodstawaTrojkata(float podstawaTrojkata) {
        this.podstawaTrojkata = podstawaTrojkata;
    }

    public float getWysokoscTrojkata() {
        return wysokoscTrojkata;
    }

    public void setWysokoscTrojkata(float wysokoscTrojkata) {
        this.wysokoscTrojkata = wysokoscTrojkata;
    }

//show
    @Override
    public String toString(){
        return super.toString();
    }
    public String pokazPole(){
        return toString() + "\nPole: " + liczPole();
    }
}