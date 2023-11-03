/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.model_karyawan;

/**
 *
 * @author Asus-GK
 */

public class modelTabelKaryawan extends AbstractTableModel{
    List<model_karyawan> listKaryawans;
    
    public modelTabelKaryawan(List<model_karyawan> listKaryawan){
        this.listKaryawans = listKaryawan;
      
    }
    
    @Override
    public int getRowCount() {
        return listKaryawans.size();
    }    
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "id_karyawan";
            case 1:
                return "nama_karyawan";
            case 2:
                return "alamat";
            case 3:
                return "no_hp";
            case 4:
                return "jabatan";
            case 5:
                return "username_admin";
            default:
                return null;           
        }
    }

    /**
     *
     * @param row
     * @param column
     * @return
     */
    @Override
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0:
                return listKaryawans.get(row).getId_karyawan();
            case 1:
                return listKaryawans.get(row).getNama_karyawan();
            case 2:
                return listKaryawans.get(row).getAlamat();
            case 3:
                return listKaryawans.get(row).getNo_hp();
            case 4:
                return listKaryawans.get(row).getJabatan();
            case 5:
                return listKaryawans.get(row).getAdminUsername();
            default:
                return null;
        }
    }            
}


