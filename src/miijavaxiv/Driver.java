package miijavaxiv;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sigit Yudhianto
 */
public class Driver {
    public static void main(String[] args) {
        
        Karyawan karyawan = new Karyawan();
       
        karyawan.setIdkaryawan("kbaru");
        karyawan.setAlamat("jl BB gang EE1");
        System.out.println(karyawan.getIdkaryawan());
        System.out.println(karyawan.getAlamat());
        
        int p =(int) (40 + Math.random() * 60);
        
        int hari =21;
        hari = karyawan.MengajukanCuti();
        System.out.println(hari);
        
        //pass by reference
        Karyawan k1 = new Karyawan();
        k1.setNamakaryawan("BB");
        Karyawan k2 = k1;
        k2.setNamakaryawan("EE");
        System.out.println(k1.getNamakaryawan());
        
        k1.jumlah=21;
        Karyawan k3 = new Karyawan();
        System.out.println("umur"+k3.jumlah);
        
        Karyawan.jumlah=90;
        System.out.println(k3.jumlah);
        
    }
}
