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
public class Penyelia extends Karyawan{

    public Penyelia() {
        System.out.println("ctor penyelian");
    }
    
    public Penyelia(String id, String nama, String alamat){
//        super(id,nama,alamat);
        System.out.println("setor coy ke penyelia");
    }
    
    
    public void methodC(){//sebuah method tanpa mengembalikan value
         
    }
    
    public int methodA(){//sebuah method mengembalikan value
         
        return 0;
    }

    @Override
    public String getAlamat() {
//        return super.getAlamat(); //To change body of generated methods, choose Tools | Templates.
        return "Jakarta";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nama :");
        builder.append(namakaryawan);
        builder.append(", Alamatnya ");
        builder.append(alamat);
        builder.append(", Alamat ke2nya  ");
        builder.append(getAlamat());
        
        return builder.toString();
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    public static void main(String[] args) {
        Penyelia penyelia1 =new Penyelia();
        penyelia1.setAlamat("bandung");
        penyelia1.setNamakaryawan("Bambang");
        
        
        System.out.println(penyelia1.getAlamat());
        System.out.println(penyelia1);
        
        System.out.println(penyelia1.hashCode());
        
        Penyelia penyelia2 = new Penyelia();
        penyelia2.setAlamat("Jogjakarta");
        
        System.out.println(penyelia2.hashCode());
        
        penyelia1 = penyelia2;
        
        System.out.println(penyelia2.hashCode() );
        
        Karyawan penyelia3 = new Karyawan("k3", "simatupang","Bengkulu");
        System.out.println(penyelia3.getAlamat());
        
        Karyawan karyawan60 = new Penyelia("k1","asem","asem");
       
       
    }
    
}
