package ba.unsa.etf.rpr.tutorijal03;

abstract class TelefonskiBroj {

    public abstract String ispisi();

    @Override
    public abstract int hashCode();
}


//nesto comparable pa <x> jer je genericka, otp
// import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.* otp, ima u testovima
// primitivni tipovi vec imaju cloneable ?