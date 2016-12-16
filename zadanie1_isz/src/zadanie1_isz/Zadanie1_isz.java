/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1_isz;

/**
 *
 * @author Róbert
 */
public class Zadanie1_isz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        uloha1 a=new uloha1();
        kon kon=new kon();
        kozicka koz=new kozicka();
        macka mac=new macka();
        ovecka ovec= new ovecka();
        pes pes=new pes();
        
        kon.vydavaZvuk();
        koz.vydavaZvuk();
        mac.vydavaZvuk();
        ovec.vydavaZvuk();
        pes.vydavaZvuk();
    }
    
}
