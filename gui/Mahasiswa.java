/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui;
import java.util.ArrayList ;
/**
 *
 * @author HP
 */


public class Mahasiswa {
    
    private String nim,nama, jenisKelamin;
    private int umur;
    private String alamat, provinsi;
    private ArrayList<String> hobi;


public String getNim() { 
return nim;
}

public void setNim(String nim){
this.nim=nim;
}

public String getNama() { 
return nama; 
} 
/** * @param nama the nama to set */ 
public void setNama(String nama) { 
this.nama = nama; 
}

/** * @return the jenisKelamin */ 
public String getJenisKelamin() { 
return jenisKelamin; }

public void setJenisKelamin(String jenisKelamin) {
this.jenisKelamin = jenisKelamin; 
}

public int getUmur() { 
    return umur; 
} 
/** * @param umur the umur to set */ 

public void setUmur(int umur) { 
    this.umur = umur; 
}

public String getAlamat() { 
    return alamat; 
} 
/** * @param alamat the alamat to set */
public void setAlamat(String alamat) { 
    this.alamat = alamat; 
}

public String getProvinsi() { 
    return provinsi; 
}
public void setProvinsi(String provinsi) {
this.provinsi = provinsi; 
}

public ArrayList<String> getHobi() { 
    return hobi; 
}

public void setHobi(ArrayList<String> hobi) { 
    this.hobi = hobi; 
}




}

