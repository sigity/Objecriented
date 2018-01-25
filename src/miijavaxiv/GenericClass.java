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
public class GenericClass<T> {//generic hanya sebagai pengentahuan bahwa akan digunakan suatu saat
    public void add (T t){ //typesafe untuk 
        
    }
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass<>();
        gc.add("test");
        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.add(10);
    }
}
