public class DrzewoOwocowe extends DrzewoLisciaste {
    String nazwaOwoca;

    DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
        System.out.println(
                toString()
        );
    }

    DrzewoOwocowe(){
        System.out.println(
                toString()
        );
    }

    @Override
        public String toString() {
            return super.toString() + "nazwa Owoca: " + nazwaOwoca;
    }
}
