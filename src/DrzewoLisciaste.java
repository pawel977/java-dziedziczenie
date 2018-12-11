public class DrzewoLisciaste extends Drzewo {
    protected int ksztaltLiscia;

    DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }
    DrzewoLisciaste(){
        System.out.println(
                toString()
        );
    }

    @Override
    public String toString(){
        return super.toString() + "KsztaltLiscia: " + ksztaltLiscia + "\n";
    }
}
