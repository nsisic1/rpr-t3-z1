package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    enum Grad {
        // Federacija BiH
        TRAVNIK("030"), ORASJE("031"), ZENICA("032"), SARAJEVO("033"), LIVNO("034"), TUZLA("035"), MOSTAR("036"), BIHAC("037"),
        GORAZDE("038"), SIROKI("039"),
        // Brcko Distrikt
        BRCKO("049"),
        // Republika Sprska
        MRKONJIC("050"), BANJA("051"), PRIJEDOR("052"), DOBOJ("053"), SAMAC("054"), BIJELJINA("055"), ZVORNIK("056"),
        PALE("057"), FOCA("058"), TREBINJE("059");


        final String pozivni; // pozivni broj za datu regiju

        private Grad(String pozivni) {
            this.pozivni = pozivni;
        }

        public String getPozivni() {
            return pozivni;
        }
    }

    private Grad grad;
    private String broj;

    FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    Grad getGrad() {
        return grad;
    }

    public String ispisi() {
        return grad.getPozivni() + "/" + broj;
    }
    // public int hashCode() { return 2; };
}


// setxkbmap.bs