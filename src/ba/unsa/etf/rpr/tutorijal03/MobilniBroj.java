package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj) {
        boolean excep = false;
        String excepMsg = "";
        if (mobilnaMreza < 60 || mobilnaMreza > 67) {
            excep = true;
            excepMsg += "Broj mobline mreze nije validan";
        }
        if (true) { // !broj.jeLiMobilniBroj() - regex?
            if (excep) // Nije valjao broj mreze
                excepMsg += "i ostatak broja nije validan";
            else {
                excepMsg += "ostatak broja nije validan";
            }
            excep = true;
        }

        if (excep)
            throw new IllegalArgumentException(excepMsg);
        else {
            this.mobilnaMreza = mobilnaMreza;
            this.broj = broj;
        }
    }

    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }
    // public int hashCode() { return 2; };
}
