/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sigit Yudhianto
 */
public class ScopeVariable {
    int z;
    static int y; //menunjukan variable atau method itu digunakan level class  . value y pada objeck manapun selalus sama
    
    public void methodA(int z){
        this.z=29;
        y = 14;
        methodC();//bisa karena levelnya class
    }
    public static void methodC(){ //static method hanya boleh memanggil static atribut / method static lain
        y=20;
    }
     static void methodD(){
         methodC();
     }
    
    public void methodB(){
        int z = 20;
        this.z = z;
    }
}
