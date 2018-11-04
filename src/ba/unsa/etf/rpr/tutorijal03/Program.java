package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {

    private static Imenik imenik = new Imenik();

    private static Scanner ulaz = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dobrodosli u ETF Telefonski imenik.\n");
        int izbor;
        while (true) {
            printMeni();
            izbor = ulaz.nextInt();
            ulaz.nextLine();
            switch (izbor) {
                case 1 :
                    akcija1();
                    break;
                case 2 :
                    akcija2();
                    break;
                case 3 :
                    //
                    break;
                case 4 :
                    akcija4();
                    break;
                case 5 :
                    akcija5();
                    break;
                case 6 :
                    akcija6();
                    break;
                case 7 :
                    printMeni();
                    break;
                case 8 :
                    return;
            }

        }
    }


    private static void printMeni() {
        System.out.println("Unesite cifru da pokrenete akciju:\n" +
                "1 : Dodaj novi broj\n" +
                "2 : Prikazi broj korisnika\n" +
                "3 : Nadji korisnika koji sa unesenim brojem\n" +
                "4 : Prikazi sve brojeve u telefonskom imeniku za osobe čije ime počinje na uneseno slovo\n" +
                "5 : Prikazi imena osoba koje zive u unesenom gradu:\n" +
                "6 : Prikazi imena i brojeve osoba koje zive u unesenom gradu:\n" +
                "7 : Prikazi moguce akcije\n" +
                "8 : Izlaz"
        );
    }

    //
    private static void akcija1() {
        int izborVrsteBroja;
        System.out.println("Koji zelite dodati?\n" +
                "1 - Fiksni broj\n" +
                "2 - Mobilni broj\n" +
                "3 - Medjunarodni broj\n");
        izborVrsteBroja = ulaz.nextInt();
        ulaz.nextLine();

        String nazivOsobe;
        System.out.println("Unesite ime i prezime osobe: ");
        nazivOsobe = ulaz.nextLine();
        String broj;
        TelefonskiBroj noviBroj;

        switch (izborVrsteBroja) {
            // Fiksni broj
            case 1:
                String grad;
                System.out.println("Unesite grad: ");
                grad = ulaz.nextLine();
                System.out.println("Unesite telefonski broj: ");
                broj = ulaz.nextLine();
                noviBroj = new FiksniBroj(FiksniBroj.Grad.valueOf(grad.toUpperCase()), broj);
                imenik.dodaj(nazivOsobe, noviBroj);
                break;
            // Mobilni broj
            case 2:
                int mreza;
                System.out.println("Unesite mobilnu mrezu: ");
                mreza = ulaz.nextInt();
                ulaz.nextLine();
                System.out.println("Unesite broj: ");
                broj = ulaz.nextLine();
                noviBroj = new MobilniBroj(mreza, broj);
                imenik.dodaj(nazivOsobe, noviBroj);
                break;
            // Medjunarodni broj
            case 3:
                String pozivniDrzave;
                System.out.println("Unesite pozivni drzave: ");
                pozivniDrzave = ulaz.nextLine();
                System.out.println("Unesite broj: ");
                broj = ulaz.nextLine();
                noviBroj = new MedunarodniBroj(pozivniDrzave, broj);
                imenik.dodaj(nazivOsobe, noviBroj);
                break;
        }
    }

    private static void akcija2() {
        String nazivOsobe;
        System.out.println("Unesite naziv osobe: ");
        nazivOsobe = ulaz.nextLine();
        String broj;
        try {
            broj = imenik.dajBroj(nazivOsobe);
            System.out.println(nazivOsobe + " - " + broj);
        } catch (NullPointerException e) {
            System.out.println("Osoba ne postoji");
        }
    }

    /*private static void akcija3() {
        int izborVrsteBroja;
        System.out.println("Koji zelite dodati?" +
                "1 - Fiksni broj" +
                "2 - Mobilni broj" +
                "3 - Medjunarodni broj");
        izborVrsteBroja = ulaz.nextInt();
        String nazivOsobe;
        System.out.println("Unesite naziv osobe: ");
        nazivOsobe = ulaz.nextLine();
        String broj;
        try {
            broj = imenik.dajBroj(nazivOsobe);
            System.out.println(nazivOsobe + " - " + broj);
        } catch (NullPointerException e) {
            System.out.println("Osoba ne postoji");
        }
    }*/

    private static void akcija4() {
        char slovo;
        System.out.println("Unesite pocetno slovo: ");
        slovo = ulaz.next().charAt(0);
        ulaz.nextLine();
        try {
            System.out.println(imenik.naSlovo(slovo));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void akcija5() {
        String grad;
        System.out.println("Unesite ime grada: ");
        grad = ulaz.nextLine();
        try {
            System.out.println(imenik.izGrada(FiksniBroj.Grad.valueOf(grad.toUpperCase())));
        } catch (IllegalArgumentException e) {
            System.out.println("Uneseni grad ne postoji.");
        }
    }

    private static void akcija6() {
        String grad;
        System.out.println("Unesite ime grada: ");
        grad = ulaz.nextLine();
        try {
            System.out.println(imenik.izGradaBrojevi(FiksniBroj.Grad.valueOf(grad.toUpperCase())));
        } catch (IllegalArgumentException e) {
            System.out.println("Uneseni grad ne postoji.");
        }
    }
}
