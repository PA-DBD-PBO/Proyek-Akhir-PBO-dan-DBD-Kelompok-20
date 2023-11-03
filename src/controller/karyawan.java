/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.*;
import implement.implementKaryawan;
import database.database;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.model_karyawan;

/**
 *
 * @author Asus-GK
 */
public class karyawan implements implementKaryawan{ 
        Connection connection;
        final String insert = "INSERT INTO karyawan (id_karyawan, nama_karyawan, alamat, no_hp, jabatan, admin_username) VALUES (?,?,?,?,?,?);";
        final String update = "UPDATE karyawan SET nama_karyawan= ?, alamat= ?, no_hp, jabatan= ?, admin_username= ?, WHERE id_karyawan= ?;";
        final String delete = "DELETE FROM karyawan where id_karyawan=?;";
        final String select = "SELECT * FROM karyawan;";
        final String Search = "SELECT * FROM karyawan where nama_karyawan LIKE ?";
        final String searhbyid = "SELECT * FROM karyawan WHERE id_karyawan = ?";

        public karyawan(){
            connection = database.configDB();
        }
    

    @Override
    public void insert(model_karyawan mk) {
       PreparedStatement statement = null;
       try{
           statement = connection.prepareStatement(insert);
           statement.setString(1, mk.getId_karyawan());
           statement.setString(2, mk.getNama_karyawan());
           statement.setString(3, mk.getAlamat());
           statement.setString(4, mk.getNo_hp());
           statement.setString(5, mk.getJabatan());
           statement.setString(6, mk.getAdminUsername());
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
    public void update(model_karyawan mk) {
        PreparedStatement statement = null;
        try {
           statement = connection.prepareStatement(update);
           statement.setString(1, mk.getId_karyawan());
           statement.setString(2, mk.getNama_karyawan());
           statement.setString(3, mk.getAlamat());
           statement.setString(4, mk.getNo_hp());
           statement.setString(5, mk.getJabatan());
           statement.setString(6, mk.getAdminUsername());
           statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(String id_karyawan) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, id_karyawan);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public java.util.List<model_karyawan> getAll() {
        java.util.List<model_karyawan> lb = null;
        try {
            lb = new ArrayList<model_karyawan>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                model_karyawan mk = new model_karyawan();
                mk.setId_karyawan(rs.getString("id_karyawan"));
                mk.setNama_karyawan(rs.getString("nama_karyawan"));
                mk.setAlamat(rs.getString("alamat"));
                mk.setNo_hp(rs.getString("no_hp"));
                mk.setJabatan(rs.getString("jabatan"));
                mk.setAdminUsername(rs.getString("admin_Username"));
                lb.add(mk);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    @Override
    public java.util.List<model_karyawan> getCariKaryawan(String nama_karyawan) {
       java.util.List<model_karyawan> lb = null;
       try {
           lb = new ArrayList<model_karyawan>();
           PreparedStatement st = connection.prepareStatement(searhbyid);
           st.setString(1, "%" + nama_karyawan + "%");
           ResultSet rs = st.executeQuery();
           while (rs.next()) {
                model_karyawan mk = new model_karyawan();
                mk.setId_karyawan(rs.getString("Id_karyawan"));
                mk.setNama_karyawan(rs.getString("nama_karyawan"));
                mk.setAlamat(rs.getString("alamat"));
                mk.setNo_hp(rs.getString("No_hp"));
                mk.setJabatan(rs.getString("Jabatan"));
                mk.setAdminUsername(rs.getString("Admin Username"));
                lb.add (mk);
                
           }
       } catch (SQLException ex) {
           Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
       }
       return lb;
    }

    @Override
    public java.util.List<model_karyawan> getCariKaryawanbyid(String id_karyawan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
