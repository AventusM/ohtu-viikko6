package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {

    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;
    String viimeisinArvo;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        this.sovellus.nollaa();
        String nollattuTulos = Integer.toString(this.sovellus.tulos());
        this.viimeisinArvo = this.tuloskentta.getText();
        this.tuloskentta.setText(nollattuTulos);

    }

    @Override
    public void peru() {
        this.tuloskentta.setText(this.viimeisinArvo);
        this.viimeisinArvo = "";
    }

}
