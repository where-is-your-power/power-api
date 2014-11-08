/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.assignment;

import java.util.Random;

/**
 *
 * @author raymond
 */
public class Assignments {

    public static Assignment[] all = new Assignment[]{
        Assignment.create("Zet de lampen in de woonkamer uit", 174, -1, "imm_e_3", "N:Ben je in de woonkamer?", "Y:Staan je lampen aan?").withDescription("Wat we niet verbruiken hoeft ook niet groen te zijn"),
        Assignment.create("Zet de lampen in de woonkamer aan", 160, 1, "imm_e_3", "N:Staan de lampen in je woonkamer aan?").withDescription("Dit klinkt raar, maar we hebben te veel energie op het moment"),
        Assignment.create("Zet de lampen in de slaapkamer uit", 163, -1, "imm_e_2", "N:Ben je in de slaapkamer?", "Y:Staan je lampen aan?").withDescription("Wat we niet verbruiken hoeft ook niet groen te zijn"),
        Assignment.create("Zet de lampen in de slaapkamer aan", 177, 1, "imm_e_2", "N:Staat de lamp in de slaapkamer aan?").withDescription("Dit klinkt raar, maar we hebben te veel energie op het moment"),
        Assignment.create("Zet de lampen in de berging uit", 168, -1, "imm_e_4", "Y:Heb je een berging?", "N:Ben je in de berging?", "Y:Staan de lamp aan?").withDescription("Wat we niet verbruiken hoeft ook niet groen te zijn"),
        Assignment.create("Zet de lampen in de berging aan", 160, 1, "imm_e_4", "N:Staan de lampen in je berging aan?").withDescription("Dit klinkt raar, maar we hebben te veel energie op het moment"),
        Assignment.create("Zet de lampen in de keuken uit", 160, -1, "imm_e_3", "N:Ben je in de keuken?", "Y:Staan de lamp aan?").withDescription("Wat we niet verbruiken hoeft ook niet groen te zijn"),
        Assignment.create("Zet de lampen in de keuken aan", 179, 1, "imm_e_3", "N:Staat de lamp in je keuken aan?").withDescription("Dit klinkt raar, maar we hebben te veel energie op het moment"),
        Assignment.create("Zet de lampen in de badkamer uit", 170, -1, "imm_e_2", "N:Ben je in de badkamer?", "Y:Staat de lamp aan?").withDescription("Wat we niet verbruiken hoeft ook niet groen te zijn"),
        Assignment.create("Zet de lampen in de badkamer aan", 190, 1, "imm_e_2", "N:Staat de lamp in je badkamer aan?").withDescription("Dit klinkt raar, maar we hebben te veel energie op het moment"),
        Assignment.create("Zet de lampen in de hal uit", 168, -1, "imm_e_4", "Y:Staat de lamp in de hal aan?").withDescription("Wat we niet verbruiken hoeft ook niet groen te zijn"),
        Assignment.create("Zet de lampen in de hal aan", 164, 1, "imm_e_4", "N:Staat de lamp in je hal aan?").withDescription("Dit klinkt raar, maar we hebben te veel energie op het moment"),
        Assignment.create("Zet de lampen in de toilet uit", 172, -1, "imm_e_4", "N:Is het toilet bezet?", "Y:Staat de lamp aan?").withDescription("Wat we niet verbruiken hoeft ook niet groen te zijn"),
        Assignment.create("Zet de lampen in de toilet aan", 185, 1, "imm_e_4", "N:Staat de lamp in je toilet aan?"),
        Assignment.create("Zet de tv voor 15 min uit", 178, -1, "imm_e_3", "Y:Ben je tv aan het kijken?").withDescription("Lekker uitwaaien, jonguh!"),
        Assignment.create("Ga tv kijken", 162, 1, "imm_e_3", "N:Ben je tv aan het kijken"),
        Assignment.create("Laad je laptop op", 185, -1, "imm_e_3", "Y:Staat je laptop aan?", "Y:Kan ie wat prik gebruiken?").withDescription("Door gespreid energie te gebruiken, belasten we het net gelijkmatiger"),
        Assignment.create("Stop met opladen", 184, 1, "imm_e_3", "Y:Is je laptop aan het opladen?", "Y:Kun je ook zonder?").withDescription("Door gespreid energie te gebruiken, belasten we het net gelijkmatiger"),
        Assignment.create("Zet de wasmachine aan", 162, 1, "imm_e_1", "Y:Moet je je was nog doen?"),
        Assignment.create("Zet de wasdroger nu aan", 167, 1, "imm_e_1", "Y:Heb je een wasdroger?", "Y:Heb je natte was?").withDescription("We hebben een energie overschot"),
        Assignment.create("Zet de vaatwasser aan", 163, 1, "imm_e_3", "Y:Stinkt je vaatwasser?").withDescription("Vage kennissen zeggen daar niks over maar komen nooit meer. Had je hem nu maar uitgelaten"),
        Assignment.create("Pak je vaatwasser uit, luilak!", 163, 1, "imm_e_3", "Y:Staat je vaatwasser vol met schone vaat?"),
        Assignment.create("Drink een kopje thee", 184, 1, "imm_e_3", "Y:Heb je zin aan thee?"),
        Assignment.create("Doe een trui aan en zet de verwarming lager", 173, -1, "", "N:Heb je het koud?", "N:Heb je een trui aan?"),
        Assignment.create("Zet 'm nog kouder!!", 174, -1, "imm_e_5", "Y:Heb je een airco?", "Y:Heb je het toch nog warm?" ).withDescription("Dit klinkt raar, maar we hebben te veel energie op het moment"),
        Assignment.create("Zet er flessen water in", 180, -1, "imm_e_3", "N:Is je koelkast vol?"),
        Assignment.create("Maak ijsblokjes voor een zwoele dag", 189, -1, "imm_e_4", "Y:Is er nog ruimte in je vriezer?"),
        Assignment.create("Laad je telefoon nu op", 185, 1, "imm_e_3", "N:Is je telefoon volledig opgeladen?"),
        Assignment.create("Ga buiten uitwaaien", 179, 1, "imm_e_2", "Y:Verveel je je?"),
        Assignment.create("Was dan lekker zelf af :)", 162, 1, "", "Y:Heb je een vaatwasser?", "Y:Mis je lekker zelf afwassen?"),
        Assignment.create("Druk op tot het pijn doet!", 184, 1, "", "Y:Voel je je een luie donder?"),
        Assignment.create("Druk op tot het pijn doet!", 184, 1, "", "N:Voel je je een luie donder?", "N:Weet je het zeker?"),
        Assignment.create("Doe de was eens op zondag", 184, 1, "").withDescription("Je doet altijd de was op woensdag, doe het eens in het weekend")
    }; 

    public final static Random generator = new Random();

    public static Assignment random() {
        int idx = generator.nextInt(all.length);
        return all[idx];
    }

}
