package ohtu;

import javax.swing.JTextField;

public class Miinus implements Komento {

    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;
    int viimeisinArvo;

    public Miinus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        this.viimeisinArvo = Integer.parseInt(this.syotekentta.getText());
        this.sovellus.miinus(viimeisinArvo);
        String tulos = Integer.toString(this.sovellus.tulos());
        this.tuloskentta.setText(tulos);
        this.syotekentta.setText("");
    }

    @Override
    public void peru() {
        this.sovellus.plus(viimeisinArvo);
        String tulos = Integer.toString(this.sovellus.tulos());
        this.tuloskentta.setText(tulos);
    }
}
