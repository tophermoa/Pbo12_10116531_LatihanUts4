/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuts4;

/**
 *
 * @author USER
 */
public class LatihanUts4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ModEmploye ME=new ModEmploye();
     ModDesigner MD=new ModDesigner();
     ModProgramer MP=new ModProgramer();
     ModSystemAnalys MS=new ModSystemAnalys();
        MD.BonusDesigner(50000);
        MP.BonusProgramer(60000);
        MS.BonusSystemAnaliyst(90000);

    }
    
}
