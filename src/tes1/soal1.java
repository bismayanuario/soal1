/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        Scanner masukan = new Scanner(System.in);
        int jawaban;
        int jawabany;
        int sisabagi;
        int sisabagiy;
        
        System.out.print("Nilai X = ");
        x = masukan.nextInt();
        jawaban = x/3;
        sisabagi = x%3;
        System.out.print("Nilai Y = ");
        y = masukan.nextInt();
        jawabany = y/5;
        sisabagiy = y%5;
        
        if ((sisabagi==0) && (sisabagiy!=0)){
            System.out.println("Hello");
        } else if ((sisabagiy==0) && (sisabagi!=0)) {
            System.out.println("World");
        } else if ((sisabagi==0) && (sisabagiy==0)){
            System.out.println("Hello World");
        } else{

        }
        
    }
    
}
