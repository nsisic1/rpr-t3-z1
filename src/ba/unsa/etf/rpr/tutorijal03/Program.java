package ba.unsa.etf.rpr.tutorijal03;

public class Program {

    public static void main(String[] args) {
        System.out.println("Dobrodosli u ETF Telefonski imenik.\n");
        printMeni();
    }

    private static void printMeni() {
        System.out.println("Unesite cifru da pokrenete akciju:\n" +
            "1 : Dodaj novi broj\n" +
            "2 : Prikazi broj korisnika\n" +
            "3 : Nadji korisnika koji sa unesenim brojem\n" +
            "4 : Prikazi sve brojeve u telefonskom imeniku za osobe čije ime počinje na uneseno slovo\n" +
            "5 : Prikazi imena osoba koji zive u unesenom gradu:\n" +
            "6 : Prikazi imena i brojeve osoba\n" +
            "7 : Prikazi moguce akcije\n" +
            "8 : Izlaz"
            );
    }
}
