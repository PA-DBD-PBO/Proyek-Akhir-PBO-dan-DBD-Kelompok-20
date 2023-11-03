/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kontrol;

import controller.wahana_bermain;
import implement.implementWahana_bermain;
import java.util.List;
import javax.swing.JOptionPane;
import model.modelWahana_bermain;
import view.crudWahana;
import model.modelTabelWahana;

/**
 *
 * @author Asus-GK
 */
public class kontrolWahana {

    crudWahana cWahana;
    implementWahana_bermain ImpWahana_bermain;
    List<modelWahana_bermain> listWahana;
    
    
    public kontrolWahana(crudWahana cWahana){
        this.cWahana = cWahana;
        ImpWahana_bermain = new wahana_bermain();
        listWahana = ImpWahana_bermain.getALL();
    
    }
    
    public void reset(){
         cWahana.getIdWahanaTxt().setText("");
         cWahana.getNamaWahanaTxt().setText("");
         cWahana.getKpsWahanaTxt().setText("");
         cWahana.getKtgrCb().setSelectedItem("");         

    }
    
    public void isiTable(){
        listWahana = ImpWahana_bermain.getALL();
        modelTabelWahana mwb = new modelTabelWahana(listWahana);
        cWahana.getTabelModelWahana().setModel(mwb);
    }
    
    public void isiTablebyid(String id){
        listWahana = ImpWahana_bermain.getCariWahanabyid(id);
        modelTabelWahana mwb = new modelTabelWahana(listWahana);
        cWahana.getTabelModelWahana().setModel(mwb);
    }
    
    public void isiField (int row) {
        cWahana.getIdWahanaTxt().setText("");
        cWahana.getNamaWahanaTxt().setText("");
        cWahana.getKpsWahanaTxt().setText("");
        cWahana.getKtgrCb().setSelectedItem("");
    }
    
    public void insert() {
        if(!cWahana.getIdWahanaTxt().getText().trim().isEmpty()&!cWahana.getNamaWahanaTxt().getText().trim().isEmpty()&!cWahana.getKpsWahanaTxt().getText().trim().isEmpty()){
            modelWahana_bermain mwb = new modelWahana_bermain();
            mwb.setId_wahana(cWahana.getIdWahanaTxt().getText());
            mwb.setNama_wahana(cWahana.getNamaWahanaTxt().getText());
            mwb.setKapasitas_maksimum(cWahana.getKpsWahanaTxt().getText());
            mwb.setKategori_wahana((String)cWahana.getKtgrCb().getSelectedItem());
            
            ImpWahana_bermain.insert(mwb);
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
        } else {
            JOptionPane.showMessageDialog(cWahana, "DATA TIDAK BOLEH KOSONG");
        }
    }

    public void update() {
        if (!cWahana.getIdWahanaTxt().getText().trim().isEmpty()) {
            modelWahana_bermain mwb = new modelWahana_bermain();
            mwb.setId_wahana(cWahana.getIdWahanaTxt().getText());
            mwb.setNama_wahana(cWahana.getNamaWahanaTxt().getText());
            mwb.setKapasitas_maksimum(cWahana.getKpsWahanaTxt().getText());
            mwb.setKategori_wahana((String) cWahana.getKtgrCb().getSelectedItem());

            ImpWahana_bermain.update(mwb); // Panggil metode update pada kontrolWahana
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUPDATE");
        } else {
            JOptionPane.showMessageDialog(cWahana, "PILIH DATA YANG AKAN DI UPDATE");
        }
    }



    public void delete(){
        if(!cWahana.getIdWahanaTxt().getText().trim().isEmpty()){
            String Id_wahana = (cWahana.getIdWahanaTxt().getText());
            ImpWahana_bermain.delete(Id_wahana);
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
        } else {
            JOptionPane.showMessageDialog(cWahana, "SILAHKAN PILIH DATA YANG AKAN DIHAPUS");
        }
    }
    
    public void isiTabelCariNama(){
        listWahana = ImpWahana_bermain.getCariWahana(cWahana.getTxtCari().getText());
        modelTabelWahana mtw = new modelTabelWahana(listWahana);
        cWahana.getTabelModelWahana().setModel(mtw);
    }
    
    public void cariWahana(){
        if(!cWahana.getTxtCari().getText().trim().isEmpty()){
            ImpWahana_bermain.getCariWahana(cWahana.getTxtCari().getText());
            isiTabelCariNama();
        } else {
            JOptionPane.showMessageDialog(cWahana, "SILAHKAN PILIH DATA");
        }
    }
}


///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Kontrol;
//
//import controller.wahana_bermain;
//import implement.implementWahana_bermain;
//import java.util.List;
//import javax.swing.JOptionPane;
//import javax.swing.table.TableModel;
//import model.modelWahana_bermain;
//import view.crudWahana;
//import model.modelTabelWahana;
//
///**
// *
// * @author Asus-GK
// */
//public class kontrolWahana {
//
//    crudWahana cWahana;
//    implementWahana_bermain ImpWahana_bermain;
//    List<modelWahana_bermain> listWahana;
//    
//    
//    public kontrolWahana(crudWahana cWahana){
//        this.cWahana = cWahana;
//        ImpWahana_bermain = new wahana_bermain();
//        listWahana = ImpWahana_bermain.getALL();
//    
//    }
//    
//    public void reset(){
//         cWahana.getIdWahanaTxt().setText("");
//         cWahana.getNamaWahanaTxt().setText("");
//         cWahana.getKpsWahanaTxt().setText("");
//         cWahana.getKtgrCb().setSelectedItem("");         
//
//    }
//    
//    public void isiTable(){
//        listWahana = ImpWahana_bermain.getALL();
//        modelTabelWahana mwb = new modelTabelWahana(listWahana);
//        cWahana.getTabelModelWahana().setModel(mwb);
//    }
//    
//    public void isiField (int row) {
//        cWahana.getIdWahanaTxt().setText("");
//        cWahana.getNamaWahanaTxt().setText("");
//        cWahana.getKpsWahanaTxt().setText("");
//        cWahana.getKtgrCb().setSelectedItem("");
//    }
//    
//    public void insert() {
//        if(!cWahana.getIdWahanaTxt().getText().trim().isEmpty()&!cWahana.getNamaWahanaTxt().getText().trim().isEmpty()&!cWahana.getKpsWahanaTxt().getText().trim().isEmpty()){
//            modelWahana_bermain mwb = new modelWahana_bermain();
//            mwb.setId_wahana(cWahana.getIdWahanaTxt().getText());
//            mwb.setNama_wahana(cWahana.getNamaWahanaTxt().getText());
//            mwb.setKapasitas_maksimum(cWahana.getKpsWahanaTxt().getText());
//            mwb.setKategori_wahana((String)cWahana.getKtgrCb().getSelectedItem());
//            
//            ImpWahana_bermain.insert(mwb);
//            JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
//        } else {
//            JOptionPane.showMessageDialog(cWahana, "DATA TIDAK BOLEH KOSONG");
//        }
//    }
//
//    public void update(){
//        if(!cWahana.getIdWahanaTxt().getText().trim().isEmpty()){
//            modelWahana_bermain mwb = new modelWahana_bermain();
//            mwb.setId_wahana(cWahana.getIdWahanaTxt().getText());
//            mwb.setNama_wahana(cWahana.getNamaWahanaTxt().getText());
//            mwb.setKapasitas_maksimum(cWahana.getKpsWahanaTxt().getText());
//            mwb.setKategori_wahana((String)cWahana.getKtgrCb().getSelectedItem());
//            
//            ImpWahana_bermain.insert(mwb);
//            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUPDATE");
//        } else {
//            JOptionPane.showMessageDialog(cWahana, "PILIH DATA YANG AKAN DI UPDATE");
//        }
//    }
//
//    public void delete(){
//        if(!cWahana.getIdWahanaTxt().getText().trim().isEmpty()){
//            String Id_wahana = (cWahana.getIdWahanaTxt().getText());
//            ImpWahana_bermain.delete(Id_wahana);
//            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
//        } else {
//            JOptionPane.showMessageDialog(cWahana, "SILAHKAN PILIH DATA YANG AKAN DIHAPUS");
//        }
//    }
//    
//    public void isiTabelCariNama(){
//        listWahana = ImpWahana_bermain.getCariWahana(cWahana.getTxtCari().getText());
//        modelTabelWahana mtw = new modelTabelWahana(listWahana);
//        cWahana.getTabelModelWahana().setModel(mtw);
//    }
//    
//    public void cariWahana(){
//        if(!cWahana.getTxtCari().getText().trim().isEmpty()){
//            ImpWahana_bermain.getCariWahana(cWahana.getTxtCari().getText());
//            isiTabelCariNama();
//        } else {
//            JOptionPane.showMessageDialog(cWahana, "SILAHKAN PILIH DATA");
//        }
//    }
//}
