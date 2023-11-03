/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implement;

import model.model_karyawan;
import java.util.List;

/**
 *
 * @author Asus-GK
 */
public interface implementKaryawan {
    public void insert(model_karyawan mk);
    public void update(model_karyawan mk);
    public void delete(String id_karyawan);
    
    List<model_karyawan> getAll();
    List<model_karyawan> getCariKaryawan(String nama_karyawan);
    List<model_karyawan> getCariKaryawanbyid(String id_karyawan);      
}
