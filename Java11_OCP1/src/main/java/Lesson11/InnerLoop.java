/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author james
 */
public class InnerLoop {
    public static void main(String[] args) {
        int height = 4, width = 10;
        
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++){
            System.out.print("@");
        }
            System.out.println();
        }
    }
}
