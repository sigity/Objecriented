/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sigit Yudhianto
 */
public class HandingException {
    static void bacaFile(String namaFile) throws FileNotFoundException, IOException{
        FileReader namafile = new FileReader(namaFile);
//            System.out.println((char)namafile.read());
//            System.out.println((char)namafile.read());
//            System.out.println((char)namafile.read());
//            System.out.println((char)namafile.read());
//            System.out.println((char)namafile.read());
//            System.out.println((char)namafile.read());
//            
            int i;
            while ((i=namafile.read()) > 0){
                System.out.print((char)i);
            }
    }
    public static void main(String[] args) {
        try {
//            bacaFile(args [0]);
            int c = -1;
            assert c > 0;// assert sebagai setpoint , 
            if (c==0) 
                throw new CostumException("c tidak boleh ");
                int y = 10/c;
            

        }catch (CostumException ex) {
//            Logger.getLogger(HandingException.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println(ex.getMessage());
        }
        catch (AssertionError ae){
            System.out.println(ae.getMessage());
        }
//            System.out.println(ex.getMessage());
        
    }
}
