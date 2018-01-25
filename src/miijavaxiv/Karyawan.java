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
public class Karyawan {
    private String idkaryawan;
    protected  String namakaryawan;
    public String alamat;
    static int jumlah; //dipanggil oleh class

    /**
     * @return the idkaryawan
     */
    
    
    protected  Karyawan() {
        System.out.println("tester");
    }

    public Karyawan(String idkaryawan, String namakaryawan, String alamat) {
        this.idkaryawan = idkaryawan;
        this.namakaryawan = namakaryawan;
        this.alamat = alamat;
    }
    
      

    public String getIdkaryawan() {
        return idkaryawan;
    }

    /**
     * @param idkaryawan the idkaryawan to set
     */
    public void setIdkaryawan(String idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    /**
     * @return the namakaryawan
     */
    public String getNamakaryawan() {
        return namakaryawan;
    }

    /**
     * @param namakaryawan the namakaryawan to set
     */
    public void setNamakaryawan(String namakaryawan) {
        this.namakaryawan = namakaryawan;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    int MengajukanCuti(){
        int hari = 18;
        
        return hari;
    }
    void MengajukanCuti(Karyawan k){
        k.setIdkaryawan("k67");
    }
}
