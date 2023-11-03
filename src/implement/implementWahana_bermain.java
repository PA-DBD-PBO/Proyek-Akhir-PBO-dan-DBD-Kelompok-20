/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implement;
import model.modelWahana_bermain;
import java.util.List;
/**
 *
 * @author Asus-GK
 */
public interface implementWahana_bermain {
    public void insert(modelWahana_bermain wb);
    public void update(modelWahana_bermain wb);
    public void delete(String id_wahana);
    
    List<modelWahana_bermain> getALL();
    List<modelWahana_bermain> getCariWahana(String nama_wahana);
    List<modelWahana_bermain> getCariWahanabyid(String idWahana);
    
}
