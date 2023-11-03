/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.modelWahana_bermain;
/**
 *
 * @author Asus-GK
 */
public class modelTabelWahana extends AbstractTableModel{
    List<modelWahana_bermain> listWahanas;
    
    public modelTabelWahana(List<modelWahana_bermain> listWahana){
        this.listWahanas = listWahana;
      
    }
    
    @Override
    public int getRowCount() {
        return listWahanas.size();
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "id_wahana";
            case 1:
                return "nama_wahana";
            case 2:
                return "kapasitas_maksimum";
            case 3:
                return "kategori_wahana";
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
                return listWahanas.get(row).getId_wahana();
            case 1:
                return listWahanas.get(row).getNama_wahana();
            case 2:
                return listWahanas.get(row).getKapasitas_maksimum();
            case 3:
                return listWahanas.get(row).getKategori_wahana();
            default:
                return null;
        }
    }            
}


