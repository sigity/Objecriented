/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Sigit Yudhianto
 */
public class LevelDriver {
    static void methodZ(int y,Level1 l){
        
    }
    static void methodX(InterfaceX x){
        
    }
    
    public static void main(String[] args) {
//        Level1 level1 = new Level1();
        Level1 level1 = new Level2() {
            @Override
            void method2() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            void method1(int y) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
//        System.out.println(level1.getClass());
//        System.out.println(level1 instanceof Level1);//untuk melakukan chek apakah tipe datanya dari class tersebut;
//        System.out.println(level1 instanceof Level2);
        
//        InterfaceX ix = new Level3();
//        System.out.println(ix);

        Dictionary<Integer,String> cobaDic = new Hashtable();
        cobaDic.put(1,"asem");
        cobaDic.put(2,"manis");
        cobaDic.put(3,"pahit");
        System.out.println(cobaDic);
        
        List<String> cobalist = new ArrayList<>();
        cobalist.add("T");
        cobalist.add("u");
        cobalist.add("v");
        
        cobalist.forEach(x -> System.out.println(x));  //foreach dapat digunakan saat java versi 8
        System.out.println(cobalist);
         
        Map<String,String> cobamap = new Hashtable();
        cobamap.put("indonesia","jakarta");
        cobamap.put("malysia", "selangor");
        cobamap.put("swedia", "milan");
        
        System.out.println(cobamap.get("malaysia"));
        
        cobamap.forEach((k,v)-> //lambang atau looping lambda. bisa berdasarkan abjad tergantung dari method  yg di pakay
        System.out.println(k+" adalah negara dengan ibukota " + v));
        
        methodZ(2, level1);
        methodX(new InterfaceX() {//clas anonim ,
            @Override
            public void methodA() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int methodB(int y) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        methodZ(10, new Level1() {
            @Override
            void method1(int y) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
}
