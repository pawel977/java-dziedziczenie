public class DrzewoIglaste extends Drzewo {
    private int iloscIgiel;
    private double dlugoscSzyszki;

    DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;

        System.out.println(
                toString()
        );
    }

    DrzewoIglaste(){
        System.out.println(
                toString()
        );
    }

    @Override
    public String toString() {
        return super.toString() + "IloscIgiel: " + iloscIgiel + "\ndlugoscSzyszki: " + dlugoscSzyszki +"\n";
    }
}
