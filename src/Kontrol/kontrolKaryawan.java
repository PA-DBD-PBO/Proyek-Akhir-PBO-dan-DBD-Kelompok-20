/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kontrol;

import controller.karyawan;
import implement.implementKaryawan;
import java.util.List;
import javax.swing.JOptionPane;
import model.modelTabelKaryawan;
import model.model_karyawan;
import view.crudKaryawan;

/**
 *
 * @author Asus-GK
 */
public class kontrolKaryawan {
    crudKaryawan cKaryawan;
    implementKaryawan ImpKaryawan;
    List<model_karyawan> listKaryawans;
    
    
    public kontrolKaryawan(crudKaryawan cKaryawan){
        this.cKaryawan = cKaryawan;
        ImpKaryawan = new karyawan();
        listKaryawans = ImpKaryawan.getAll();
    
    }
    
    public void reset(){
         cKaryawan.getId_KaryawanTxt().setText("");
         cKaryawan.getNamaTxt().setText("");
         cKaryawan.getAlamatTxt().setText("");
         cKaryawan.getNo_HpTxt().setText("");
         cKaryawan.getJabatanTxt().setText("");
         cKaryawan.getUsnAdminTxt().setText("");

    }
    
    public void isiTable(){
        listKaryawans = ImpKaryawan.getAll();
        modelTabelKaryawan mtk = new modelTabelKaryawan(listKaryawans);
        cKaryawan.getTabelModelKaryawan().setModel(mtk);
    }
    
    public void isiTablebyid(String id){
        listKaryawans = ImpKaryawan.getCariKaryawan(id);
        modelTabelKaryawan mtk = new modelTabelKaryawan(listKaryawans);
        cKaryawan.getTabelModelKaryawan().setModel(mtk);
    }
    
    public void isiField (int row) {
        cKaryawan.getId_KaryawanTxt().setText("");
        cKaryawan.getNamaTxt().setText("");
        cKaryawan.getAlamatTxt().setText("");
        cKaryawan.getNo_HpTxt().setText("");
        cKaryawan.getJabatanTxt().setText("");
        cKaryawan.getUsnAdminTxt().setText("");
    }
    
    public void insert() {
        if(!cKaryawan.getId_KaryawanTxt().getText().trim().isEmpty()&!cKaryawan.getNamaTxt().getText().trim().isEmpty()&!cKaryawan.getAlamatTxt().getText().trim().isEmpty()&!cKaryawan.getNo_HpTxt().getText().trim().isEmpty()&!cKaryawan.getJabatanTxt().getText().trim().isEmpty()&!cKaryawan.getUsnAdminTxt().getText().trim().isEmpty()){
            model_karyawan mk = new model_karyawan();
            mk.setId_karyawan(cKaryawan.getId_KaryawanTxt().getText());
            mk.setNama_karyawan(cKaryawan.getNamaTxt().getText());
            mk.setAlamat(cKaryawan.getAlamatTxt().getText());
            mk.setNo_hp(cKaryawan.getNo_HpTxt().getText());
            mk.setJabatan(cKaryawan.getJabatanTxt().getText());
            mk.setAdminUsername(cKaryawan.getUsnAdminTxt().getText());
            
            ImpKaryawan.insert(mk);
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
        } else {
            JOptionPane.showMessageDialog(cKaryawan, "DATA TIDAK BOLEH KOSONG");
        }
    }

    public void update() {
        if (!cKaryawan.getId_KaryawanTxt().getText().trim().isEmpty()) {
            model_karyawan mk = new model_karyawan();
            mk.setId_karyawan(cKaryawan.getId_KaryawanTxt().getText());
            mk.setNama_karyawan(cKaryawan.getNamaTxt().getText());
            mk.setAlamat(cKaryawan.getAlamatTxt().getText());
            mk.setNo_hp(cKaryawan.getNo_HpTxt().getText());
            mk.setAdminUsername(cKaryawan.getUsnAdminTxt().getText());

            ImpKaryawan.update(mk); // Panggil metode update pada kontrolKaryawan
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUPDATE");
        } else {
            JOptionPane.showMessageDialog(cKaryawan, "PILIH DATA YANG AKAN DI UPDATE");
        }
    }



    public void delete(){
        if(!cKaryawan.getId_KaryawanTxt().getText().trim().isEmpty()){
            String Id_karyawan = (cKaryawan.getId_KaryawanTxt().getText());
            ImpKaryawan.delete(Id_karyawan);
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
        } else {
            JOptionPane.showMessageDialog(cKaryawan, "SILAHKAN PILIH DATA YANG AKAN DIHAPUS");
        }
    }
    
    public void isiTabelCariNama(){
        listKaryawans = ImpKaryawan.getCariKaryawan(cKaryawan.getCariTxt().getText());
        modelTabelKaryawan mtk = new modelTabelKaryawan(listKaryawans);
        cKaryawan.getTabelModelKaryawan().setModel(mtk);
    }
    
    public void cariWahana(){
        if(!cKaryawan.getCariTxt().getText().trim().isEmpty()){
            ImpKaryawan.getCariKaryawan(cKaryawan.getCariTxt().getText());
            isiTabelCariNama();
        } else {
            JOptionPane.showMessageDialog(cKaryawan, "SILAHKAN PILIH DATA");
        }
    }
}

