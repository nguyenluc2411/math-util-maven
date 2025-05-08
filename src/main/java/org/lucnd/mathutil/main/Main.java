/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.lucnd.mathutil.main;

import org.lucnd.mathutil.core.MathUtil;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hi all, "
                + "this app is built by using Maven");
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + MathUtil.getFactorial(i) );
        }
    }
}
