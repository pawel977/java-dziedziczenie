package bryly;


public class Graniastoslup extends Trojkat {
    private float wysokoscBryly;

    public Graniastoslup(float podstawaTrojkata, float wysokoscTrojkata, float wysokoscBryly) {
        super(podstawaTrojkata, wysokoscTrojkata);
        this.wysokoscBryly = wysokoscBryly;
    }

    public Graniastoslup(Trojkat trojkat, float wysokoscBryly) {
        setPodstawaTrojkata(trojkat.getPodstawaTrojkata());
        setWysokoscTrojkata(trojkat.getWysokoscTrojkata());
        this.wysokoscBryly = wysokoscBryly;
    }
    //make
    public Prostokat stworzscianeBoczna(){
        return new Prostokat(getPodstawaTrojkata(),wysokoscBryly);
    }

    //math
    public float liczPoleCalkowite(){
    return liczPoleCalkowitePodstaw() + liczPoleBoczneCzlkowite();
    }

    public float liczPoleCalkowitePodstaw() {
        return liczPolePodstawy() *2;
    }

    public float liczPolePodstawy() {
        return liczPole();
    }
    public float liczPoleBoczneCzlkowite() {
        return stworzscianeBoczna().liczPole() * 3;
    }
    public float liczV() {
        return liczPolePodstawy() * wysokoscBryly;
    }

    //show
    public String PokazPoleCalkowite() {
        return toString() + "\nPole Calkowite: " + liczPoleCalkowite();
    }
    public String PokazV(){
        return toString() + "\nV: " + liczV();
    }

}