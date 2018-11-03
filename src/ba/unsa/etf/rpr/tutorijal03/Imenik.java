package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {

    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();

    void dodaj(String ime, TelefonskiBroj broj) {
        // TODO provjera validnosti (samo imena?), i provjera da li vec ima kljuc
        imenik.put(ime, broj);
    }

    String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }

    String dajIme(TelefonskiBroj broj) {
        for (HashMap.Entry<String, TelefonskiBroj> e : imenik.entrySet()) {
            if (e.getValue().ispisi().equals( broj.ispisi() )) {
                return e.getKey();
            }
        }
        return null;
    }

    String naSlovo(char s) {
        String lista = "";
        int i = 0;
        for (HashMap.Entry<String, TelefonskiBroj> e : imenik.entrySet()) {
            if (e.getKey().charAt(0) == s) {
                lista = lista.concat(i + ". " + e.getKey() + " - " + e.getValue().ispisi() + "\n");
            }
        }
        return lista;
    }

}
