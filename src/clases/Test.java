/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import javax.swing.JTable;

/**
 *
 * @author rmorales1
 */
public class Test {
    public static void main(String[] args) {
        int m[][]=new int[4][3];
        m[0][0]=1;
        m[0][1]=2;
        m[0][2]=3;
        m[1][0]=4;
        m[1][1]=5;
        m[1][2]=6;
        m[2][0]=7;
        m[2][1]=8;
        m[2][2]=9;
        m[3][0]=10;
        m[3][1]=11;
        m[3][2]=12;
        
        
        System.out.println(Helper.recorridoHaciaDerecha(m, 0, 0, 3));
        
        
    }
}
