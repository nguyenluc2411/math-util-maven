/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.lucnd.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.lucnd.mathutil.core.MathUtil.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    
    public static Object[][] initData() {
        return new Integer[][] {
                                    {0, 1},
                                    {3, 6},
                                    {5, 120},
                                    {6, 720}
                               };
    }
    // DDT Data Driven Testing -- Tham so hoa data
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialDDTReturnWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }
    
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException() {
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtil.getFactorial(-5);
//            }
//        };
        
        assertThrows(IllegalArgumentException.class,
                () -> getFactorial(-5));
    }
}
