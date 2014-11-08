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
        Assignment.create("1", "Uitzetten van de lampen", 850),
        Assignment.create("2", "Aanzetten van de lampen", 764),
        Assignment.create("3", "Uitzetten van de tv/decoder/home cinema", 643),
        Assignment.create("4", "Aanzetten van de tv/decoder/home cinema", 843),
        Assignment.create("5", "Uitzetten van de pc/laptop", 731),
        Assignment.create("6", "Aanzetten van de pc/laptop", 637),
        Assignment.create("7", "Aanzetten van de wasmachine", 660),
        Assignment.create("8", "Aanzetten van de wasdroger/wascentrifuge", 662),
        Assignment.create("9", "Aanzetten van de vaatwasser", 866),
        Assignment.create("10", "Aanzetten van de waterkoker/koffiezetapparaat", 617),
        Assignment.create("11", "Lager zetten van de thermostaat/verwarming", 865),
        Assignment.create("12", "Hoger zetten van de thermostaat/verwarming", 752),
        Assignment.create("13", "Lager zetten van de airco/ventilatie", 750),
        Assignment.create("14", "Hoger zetten van de airco/ventilatie", 676),
        Assignment.create("15", "Lager zetten van de koelkast", 687),
        Assignment.create("16", "Hoger zetten van de koelkast", 869),
        Assignment.create("17", "Lager zetten van de vriezer", 615),
        Assignment.create("18", "Hoger zetten van de vriezer", 863),
        Assignment.create("19", "Opladen van de telefoon/tablet", 875)};
    
    public final static Random generator = new Random();
    
    
    public static Assignment random() {
        int idx = generator.nextInt(all.length);
        return all[idx];
    }
    
}
