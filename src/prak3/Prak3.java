/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak3;



/**
 *
 * @author ASUS
 */
public class Prak3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        int a = 5;
        //perulangan
        for (int i = 0; i < a; i++) {
            for (int u = 0; u < a; u++) {
                // percabangan
                if (i == 0 || i == a - 1 || u == a - 1-i) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
