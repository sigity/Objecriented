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
public class Owner extends Penyelia{

    public Owner() {
        System.out.println("cont normal");
    }
    
    public Owner (String id,String nama){
        System.out.println("cont buatan");
    }
    
    public static void main(String[] args) {
       Karyawan own1 = new Owner("o1","simatupang");
    }
    
}
