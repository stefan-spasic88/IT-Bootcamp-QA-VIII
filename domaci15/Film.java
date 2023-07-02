package domaci15;

import primer4.Krug;

/*
2. Napraviti klasu film koja ima atribute ime, režiser i godina objave.
U main metodu napraviti dva različita filma i proveriti koji film je noviji.
 */
public class Film {

    String ime;

    String reziser;

    int godina;


    public Film(){

    }

    public Film(String ime, String reziser, int godina){
        this.ime = ime;
        this.reziser = reziser;
        this.godina = godina;
    }
}
