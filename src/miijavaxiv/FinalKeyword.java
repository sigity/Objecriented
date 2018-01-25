/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

/**
 *
 * @author Sigit Yudhianto
 */
public  class FinalKeyword { //class final yg tidak bisa di extend
//    final int  x=10;
    final int x;
    public FinalKeyword(){
        x=20;
    }
    FinalKeyword(int x){
        this.x =x;
    }
    
    final void methodFinal(){  //final method adalaha method yg tidakbisa di override
        
    }
}
