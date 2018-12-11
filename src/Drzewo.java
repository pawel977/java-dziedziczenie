public class Drzewo {
    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;

        System.out.println(
                toString()
        );
    }

    Drzewo(){
        System.out.println(
                toString()
        );
    }

    @Override
        public String toString(){
        return super.toString() +"\nDrzewo jest wiecznie zielone: " +  wiecznieZielone + "\nJego wysokosc to: "+ wysokosc + "\nprzekroj drzewa: " + przekrojDrzewa + "\n";
    }
}
