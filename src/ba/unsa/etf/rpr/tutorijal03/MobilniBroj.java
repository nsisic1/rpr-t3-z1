package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj) {
        if (mobilnaMreza < 60 || mobilnaMreza > 67)
            throw new IllegalArgumentException("Broj mobilne mreze nije validan");

        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }
    // public int hashCode() { return 2; };
}
