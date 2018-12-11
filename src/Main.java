import bryly.*;

public class Main {

    public static void main(String[] args) {
        DrzewoLisciaste dab = new DrzewoLisciaste(false, 250, "duzy", 1);
        DrzewoIglaste sosna = new DrzewoIglaste(true, 200, "mały", 1000,10);
        DrzewoOwocowe jablonka = new DrzewoOwocowe(false, 120,"cyk",2,"Jablko");

        System.out.println("\nBryly\n");

        Prostokat prostokat = new Prostokat(5f,10f);
        System.out.println("pole: " + prostokat.pokazPole());

        Prostopadloscian prostopadloscianZProstokatku = new Prostopadloscian(prostokat, 10f);
        System.out.println(prostopadloscianZProstokatku.pokazPoleCalkowite());

        Trojkat trojkat = new Trojkat(5f,10f);
        System.out.println(trojkat.pokazPole());

        Graniastoslup graniastoslupNaBazieTrojkata = new Graniastoslup(trojkat, 10);
        System.out.println(graniastoslupNaBazieTrojkata.PokazPoleCalkowite());
        System.out.println(graniastoslupNaBazieTrojkata.PokazV());

        Ostroslop ostroslopNaBazieTrojkata = new Ostroslop(trojkat, 10);
        System.out.println(ostroslopNaBazieTrojkata.pokazPoleCalkowite());
        System.out.println(ostroslopNaBazieTrojkata.pokazV());

    }
}
