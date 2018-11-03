package ba.unsa.etf.rpr.tutorijal03;

abstract class TelefonskiBroj implements Comparable<TelefonskiBroj> {

    public abstract String ispisi();

    /*
    @Override
    public abstract int hashCode();
    */

    @Override
    public int compareTo(TelefonskiBroj other) {
        return ispisi().compareTo(other.ispisi());
    }

    boolean equals(TelefonskiBroj other) {
        if (other.getClass() != this.getClass())
            return false;
        else
            return ispisi().equals(other.ispisi());
    }
}


//nesto comparable pa <x> jer je genericka, otp
// import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.* otp, ima u testovima
// primitivni tipovi vec imaju cloneable ?