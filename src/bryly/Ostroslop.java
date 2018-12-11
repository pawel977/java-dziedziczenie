package bryly;

public class Ostroslop extends Trojkat {
    private float wysokoscBryly;

    public Ostroslop(float podstawaTrojkata, float wysokoscTrojkata, float wysokoscBryly) {
        super(podstawaTrojkata, wysokoscTrojkata);
        this.wysokoscBryly = wysokoscBryly;
    }

    public Ostroslop(Trojkat trojkat, float wysokoscBryly) {
        setPodstawaTrojkata(trojkat.getPodstawaTrojkata());
        setWysokoscTrojkata(trojkat.getWysokoscTrojkata());
        this.wysokoscBryly = wysokoscBryly;
    }
    //create
    public Trojkat stworzScianaBoczna(){
        return new Trojkat(getPodstawaTrojkata(),liczHScianyBocznej());
    }
    //math
    public float liczPoleCalkowite(){
        return liczPolePodstawy() + liczCalkowitePoleBoczne();
    }

    public float liczV() {
        return (liczPolePodstawy() * wysokoscBryly)/3;
    }

    public float liczHScianyBocznej() {
        float a,b,c;
        a = getWysokoscTrojkata()/3;
        b = wysokoscBryly;
        c = (float)(Math.pow(a,2) + Math.pow(b,2));
        return (float)Math.sqrt(c);
    }

    public float liczCalkowitePoleBoczne() {
        return stworzScianaBoczna().liczPole() * 3;
    }

    public float liczPolePodstawy() {
        return liczPole();
    }


    //show
    public String toString() {
        return super.toString();
    }

    public String pokazPoleCalkowite() {
        return toString() + "\nPole Calkowite: " + liczPoleCalkowite();
    }
    public String pokazV() {
        return toString() + "\nV: " + liczV();
    }


}
