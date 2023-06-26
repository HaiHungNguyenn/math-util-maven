/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.hunghai.ath.util.maven.core.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hunghai.math.util.maven.core.MathUtility.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class MathUtilityAdvancedTest {
    //hàm trả về mảng 2 chiều gồm nhiều dogf, 2 cột
    //0 -> 1 ...
    //mảng 2 chiều, cột 0 là n, cột 1 là expected
    //n   expected
    public static Object[][] initTestData(){
        //int a[]  = {5,6,8,10};
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {5, 1200}
                              };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgumentReturnWell(int n, long expected){
//                                                            cột 0   cột 1
            assertEquals(expected, getFactorial(n));
    }
    
    /*BẮT NGOẠI LỆ THÌ SAO, TỨC LÀ HÀM CỦA TA GETF() TRẢ VỀ
    NGOẠI LỆ KHI ĐƯA N CÀ CHỚN -1, -2, N> 20
    JUNIT ĐƯA RA HÀ MỚI,  AssertThrows()
    hàm này lại xài LAMBDA EXpression, thứ 5 cấm vắng
    Vì ông sẽ giảng căn bản về lambda*/
    
}