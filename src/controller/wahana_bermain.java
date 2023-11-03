/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.*;
import implement.implementWahana_bermain;
import database.database;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.modelWahana_bermain;
/**
 *
 * @author Asus-GK
 */
public class wahana_bermain implements implementWahana_bermain{
   Connection connection;
   final String insert = "INSERT INTO wahana_bermain (id_wahana, nama_wahana, kapasitas_maksimum, kategori_wahana) VALUES (?,?,?,?);";
   final String update = "UPDATE wahana_bermain SET nama_wahana= ?, kapasitas_maksimum= ?, kategori_wahana= ? WHERE id_wahana= ?;";
   final String delete = "DELETE FROM wahana_bermain where id_wahana=?;";
   final String select = "SELECT * FROM wahana_bermain;";
   final String Search = "SELECT * FROM wahana_bermain where nama_wahana LIKE ?";
   final String searhbyid = "SELECT * FROM wahana_bermain WHERE id_wahana = ?";
   
   public wahana_bermain(){
       connection = database.configDB();
   }
   
   @Override
   public void insert (modelWahana_bermain wb){
       PreparedStatement statement = null;
       try{
           statement = connection.prepareStatement(insert);
           statement.setString(1, wb.getId_wahana());
           statement.setString(2, wb.getNama_wahana());
           statement.setString(3, wb.getKapasitas_maksimum());
           statement.setString(4, wb.getKategori_wahana());
           statement.executeUpdate();

       } catch (SQLException ex) {
           ex.printStackTrace();
       } finally {
           try {
               statement.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
   }

   @Override
   public void update(modelWahana_bermain wb) {
    PreparedStatement statement = null;
    try {
        statement = connection.prepareStatement(update);
        statement.setString(1, wb.getNama_wahana());
        statement.setString(2, wb.getKapasitas_maksimum()); // Sesuaikan tipe data jika perlu
        statement.setString(3, wb.getKategori_wahana());
        statement.setString(4, wb.getId_wahana()); // Menambahkan id_wahana ke pernyataan WHERE
        statement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace(); // Atau lakukan penanganan exception yang lebih tepat
    } finally {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace(); // Atau lakukan penanganan exception yang lebih tepat
            }
        }
    }
}



    @Override
    public void delete(String id_wahana) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, id_wahana);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

   
   
    @Override
    public java.util.List<modelWahana_bermain> getCariWahana(String nama_wahana) {
        java.util.List<modelWahana_bermain> lb = null;
        try {
            lb = new ArrayList<modelWahana_bermain>();
            PreparedStatement st = connection.prepareStatement(searhbyid);
            st.setString(1, "%" + nama_wahana + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                modelWahana_bermain mhb = new modelWahana_bermain();
                mhb.setId_wahana(rs.getString("id_wahana"));
                mhb.setNama_wahana(rs.getString("nama_wahana"));
                mhb.setKapasitas_maksimum(rs.getString("kapasitas_maksimum"));
                mhb.setKategori_wahana(rs.getString("kategori_wahana"));
                lb.add(mhb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(wahana_bermain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    @Override
    public java.util.List<modelWahana_bermain> getCariWahanabyid(String nama_wahana) {
        java.util.List<modelWahana_bermain> lb = null;
        try {
            lb = new ArrayList<modelWahana_bermain>();
            PreparedStatement st = connection.prepareStatement(Search);
            st.setString(1, "%" + nama_wahana + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                modelWahana_bermain mhb = new modelWahana_bermain();
                mhb.setId_wahana(rs.getString("id_wahana"));
                mhb.setNama_wahana(rs.getString("nama_wahana"));
                mhb.setKapasitas_maksimum(rs.getString("kapasitas_maksimum"));
                mhb.setKategori_wahana(rs.getString("kategori_wahana"));
                lb.add(mhb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(wahana_bermain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
   @Override
   public java.util.List<modelWahana_bermain> getALL(){
       java.util.List<modelWahana_bermain> lb = null;
       try {
           lb = new ArrayList<modelWahana_bermain>();
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(select);
           while (rs.next()){
               modelWahana_bermain wb = new modelWahana_bermain();
               wb.setId_wahana(rs.getString("Id_wahana"));
               wb.setNama_wahana(rs.getString("nama_wahana"));
               wb.setKapasitas_maksimum(rs.getString("kapasitas_maksimum"));
               wb.setKategori_wahana(rs.getString("kategori_wahana"));
               lb.add(wb);
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(wahana_bermain.class.getName()).log(Level.SEVERE, null, ex);
       }
       return lb;
   }

}

