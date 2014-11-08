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
        Assignment.create("1", "Zet de lampen in de woonkamer uit", 174, -1, "imm_e_3"),
        Assignment.create("2", "Zet de lampen in de woonkamer aan", 160, 1, "imm_e_3"),
        Assignment.create("3", "Zet de lampen in de slaapkamer uit", 163, -1, "imm_e_2"),
        Assignment.create("4", "Zet de lampen in de slaapkamer aan", 177, 1, "imm_e_2"),
        Assignment.create("5", "Zet de lampen in de berging uit", 168, -1, "imm_e_4"),
        Assignment.create("6", "Zet de lampen in de berging aan", 160, 1, "imm_e_4"),
        Assignment.create("7", "Zet de lampen in de keuken uit", 160, -1, "imm_e_3"),
        Assignment.create("8", "Zet de lampen in de keuken aan", 179, 1, "imm_e_3"),
        Assignment.create("9", "Zet de lampen in de badkamer uit", 170, -1, "imm_e_2"),
        Assignment.create("10", "Zet de lampen in de badkamer aan", 190, 1, "imm_e_2"),
        Assignment.create("11", "Zet de lampen in de hal uit", 168, -1, "imm_e_4"),
        Assignment.create("12", "Zet de lampen in de hal aan", 164, 1, "imm_e_4"),
        Assignment.create("13", "Zet de lampen in de toilet uit", 172, -1, "imm_e_4"),
        Assignment.create("14", "Zet de lampen in de toilet aan", 185, 1, "imm_e_4"),
        Assignment.create("15", "Zet de tv/ de decoder/ de home cinema in de woonkamer uit", 178, -1, "imm_e_3"),
        Assignment.create("16", "Zet de tv/ de decoder/ de home cinema in de woonkamer aan", 162, 1, "imm_e_3"),
        Assignment.create("17", "Zet de tv/ de decoder in de slaapkamer uit", 190, -1, "imm_e_2"),
        Assignment.create("18", "Zet de tv/ de decoder in de slaapkamer aan", 177, 1, "imm_e_2"),
        Assignment.create("19", "Zet de pc/ de laptop in de woonkamer uit", 185, -1, "imm_e_3"),
        Assignment.create("20", "Zet de pc/ de laptop in de woonkamer aan", 184, 1, "imm_e_3"),
        Assignment.create("21", "Zet de pc/ de laptop in de slaapkamer uit", 166, -1, "imm_e_2"),
        Assignment.create("22", "Zet de pc/ de laptop in de slaapkamer aan", 161, 1, "imm_e_2"),
        Assignment.create("23", "Zet de wasmachine in de berging aan", 162, 1, "imm_e_1"),
        Assignment.create("24", "Zet de wasdroger/ de wascentrifuge in de berging aan", 167, 1, "imm_e_1"),
        Assignment.create("25", "Zet de vaatwasser in de keuken aan", 163, 1, "imm_e_3"),
        Assignment.create("26", "Zet de waterkoker/ het koffiezetapparaat in de keuken aan", 184, 1, "imm_e_3"),
        Assignment.create("27", "Zet de airco/ de ventilatie lager", 173, -1, "imm_e_5"),
        Assignment.create("28", "Zet de airco/ de ventilatie hoger", 174, 1, "imm_e_5"),
        Assignment.create("29", "Zet de koelkast in de keuken lager", 180, -1, "imm_e_3"),
        Assignment.create("30", "Zet de koelkast in de keuken hoger", 173, 1, "imm_e_3"),
        Assignment.create("31", "Zet de vrieskist in de berging lager", 189, -1, "imm_e_4"),
        Assignment.create("32", "Zet de vrieskist in de berging hoger", 171, 1, "imm_e_4"),
        Assignment.create("33", "Laad de telefoon/ de tablet in de woonkamer op", 185, 1, "imm_e_3"),
        Assignment.create("34", "Laad van de telefoon/ de tablet in de slaapkamer op", 179, 1, "imm_e_2"),
        Assignment.create("35", "Was af in de keuken", 162, 1, ""),
        Assignment.create("36", "Neem een douche/ bad in de badkamer", 184, 1, ""),
        Assignment.create("37", "Koook in de keuken", 168, 1, ""),
        Assignment.create("38", "Zet de thermostaat/ de verwarming lager", 165, 1, ""),
        Assignment.create("39", "Zet de thermostaat/ de verwarming hoger", 181, 1, "")};

    public final static Random generator = new Random();

    public static Assignment random() {
        int idx = generator.nextInt(all.length);
        return all[idx];
    }

}
