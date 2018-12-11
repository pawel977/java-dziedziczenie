package bryly;

public
class Prostopadloscian extends Prostokat {
    private float wysokosc;

    public Prostopadloscian(float bokA, float bokB, float wysokosc) {
        super(bokA, bokB);
        this.wysokosc = wysokosc;
    }

    public Prostopadloscian(Prostokat prostokat, float wysokosc) {
        setBokA(prostokat.getBokA());
        setBokB(prostokat.getBokB());
        this.wysokosc = wysokosc;
    }

    //make
    public Prostokat stworzBocznyProstokatZPodstawyBokA() {
        return new Prostokat(getBokA(), wysokosc);
    }

    public Prostokat stworzBocznyProstokatZPodstawyBokB() {
        return new Prostokat(getBokB(), wysokosc);
    }
    //Math
    public float liczV(){
        return getPolePodstawy() * wysokosc;
    }
    public float liczPoleCalkowite() {
        return liczPoleCalkowiteBoczne() + liczPoleCalkowitePodstaw();
    }
    public float liczPoleCalkowitePodstaw() {
        return getPolePodstawy() * 2;
    }

    public float liczPoleCalkowiteBoczne() {
        return liczPoleCalkowiteProstokatowBocznychOPodstawieBokA() + liczPoleCalkowiteProstokatowBocznychOPodstawieBokB();
    }

    public float liczPoleCalkowiteProstokatowBocznychOPodstawieBokA() {
        return stworzBocznyProstokatZPodstawyBokA().liczPole() * 2;
    }
    public float liczPoleCalkowiteProstokatowBocznychOPodstawieBokB() {
        return stworzBocznyProstokatZPodstawyBokB().liczPole() * 2;
    }
    //geters & setters
    public float getPolePodstawy() {
        return liczPole();
    }
    //show
    @Override
    public String toString() {
        return super.toString() ;
    }

    public String pokazPoleCalkowite() {
        return toString()  + "\nPole Calkowite: " + liczPoleCalkowite();
    }
    public String pokazV() {
        return toString() + "\nV: " + liczV();
    }
}