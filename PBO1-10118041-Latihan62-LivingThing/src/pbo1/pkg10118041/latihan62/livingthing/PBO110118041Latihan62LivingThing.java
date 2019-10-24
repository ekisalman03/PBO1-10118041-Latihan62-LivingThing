/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118041.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA  : Eki salman sya'bani
 * KELAS : IF 
 * NIM   : 10118041
 * Deskripsi Program : Program ini untuk membuat tampilan override abstract.
 */
public class PBO110118041Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Human human = new Human();
        human.setNama("Eki salman sya'bani");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
    }
    
}
