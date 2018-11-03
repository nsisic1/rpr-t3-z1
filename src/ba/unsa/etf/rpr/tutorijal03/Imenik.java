package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

class Imenik {

    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();

    void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }

    String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }

    String dajIme(TelefonskiBroj broj) {
        for (HashMap.Entry<String, TelefonskiBroj> e : imenik.entrySet()) {
            if (e.getValue().equals(broj)) {
                return e.getKey();
            }
        }
        return null;
    }

    String naSlovo(char s) {
        String lista = "";
        int i = 1;
        for (HashMap.Entry<String, TelefonskiBroj> e : imenik.entrySet()) {
            if (e.getKey().charAt(0) == s) {
                lista = lista.concat(String.valueOf(i) + ". " + e.getKey() + " - " + e.getValue().ispisi() + "\n");
                i++;
            }
        }
        return lista;
    }

    Set<String> izGrada(Grad g) {
        Set<String> retVal = new TreeSet<>(); // TODO <String>?
        for (HashMap.Entry<String, TelefonskiBroj> pair : imenik.entrySet()) {
            if ((pair.getValue() instanceof FiksniBroj) && ((FiksniBroj)pair.getValue()).getGrad().equals(g)) {
                retVal.add(pair.getKey());
            }
        }
        return retVal;
    }

    Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> retVal = new TreeSet<>();
        for (TelefonskiBroj broj : imenik.values()) {
            if ((broj instanceof FiksniBroj) && ( (FiksniBroj)broj).getGrad().equals(g )) {
                retVal.add(broj);
            }
        }
        return retVal;
    }

}
