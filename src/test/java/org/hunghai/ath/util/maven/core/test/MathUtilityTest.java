/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.hunghai.ath.util.maven.core.test;

import org.hunghai.math.util.maven.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class MathUtilityTest {
    @Test
    public void checkFactorialGivenRightArgumentReturnWell(){
        assertEquals(1,MathUtility.getFactorial(0));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
    }
    
    
}
/*
    KIẾN THỨC MỚI: DDT
                   DDT: DATA Driven Testing
                   Kĩ Thuật viết code kiểm thử của UnitTest
                   mà tách phần data ra khỏi câu lệnh assertE()

    Viết các test case hướng về việc tách data test ra riêng biệt 

    KO NHẦM LẪN VỚI TDD: Test Driven Development
    Kĩ thuật viết code làm app thì phải viết luôn code cho các
    test case để đảm bảo hàm/method/class chạy ngon

    TDD: trong quá trình viết code test, tách data test, tách data test ra riêng 1 chỗ
    cho dễ đọc bảo trì

    DDT là nằm trong TDD

*/

