/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunghai.math.util.maven.core;

/**
 *
 * @author admin
 */
public class MathUtility {
    public static final double PI = 3.1415;
    
    //hàm này tính n! =
    // thiết kế hàm này như sau
    //    0! = 1! = 1
    //    ko có âm giai thừa. Nếu đưa -1, -5, -10: ném ngoại lệ
    // vì giai thừa tăng rất nhanh, 20 giai thừa là vừa đủ cho long
    //    long: 18 con số 0
    //    21 giai thừa kiểu long chứa ko đc
    //    hàm chỉ cho phép n = 0..20
    //    đưa n > 20; ném ra exception
    public static long getF(int n){
        if(n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        
        if(n==0 || n==1) return 1;
        
        long product = 1;
        for(int i = n; i >= 2; i--)
            product *= i;
        return product;
    }
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
//        if(n == 0 || n == 1) return 1;
//        if(n > 1) return n * getFactorial(n-1);
//        return 0;
//    }

    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        if(n == 0 || n == 1) return 1;

        return n * getFactorial(n-1);
    }



}
