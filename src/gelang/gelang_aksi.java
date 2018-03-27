/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gelang;

/**
 *
 * @author user
 */
public class gelang_aksi {
    public static void main(String[] args) {
        
        
        
        gelang_class arab = new gelang_class();
        System.out.println("gelang arab");
        arab.nama="bapukah";
        arab.jenis="kayu bapukah";
        arab.harga=250000;
        arab.ukuran="L";
        arab.bahan="kayu kasturi";
        arab.aksesoris();
        
        gelang_class rantau = new gelang_class();
        System.out.println("gelang rantau");
        rantau.nama="perak";
        rantau.jenis="almunium";
        rantau.harga=350000;
        rantau.ukuran="S";
        rantau.bahan="almunium Baja";
        rantau.aksesoris();
        
        gelang_class indonesia = new gelang_class();
        System.out.println("gelang indonesia");
        indonesia.nama="batik";
        indonesia.jenis="rotan";
        indonesia.harga=300000;
        indonesia.ukuran="L";
        indonesia.bahan="kayu mahoni";
        indonesia.aksesoris();
        
        
        indonesia.aksesoris();
        
        
        
    }
    
}
