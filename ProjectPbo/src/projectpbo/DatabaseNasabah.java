/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

/**
 *
 * @author aizaki
 */
public class DatabaseNasabah {
    
    private int id_user;
    private String namaNasabah;
    private String email;
    private String noTelp;
    private String ibuKandung;
    

    public DatabaseNasabah(String namaNasabah, String email, String noTelp, String ibuKandung, int id_user) {
        this.namaNasabah = namaNasabah;
        this.email = email;
        this.noTelp = noTelp;
        this.ibuKandung = ibuKandung;
        this.id_user = id_user;
    }
    
    public void setIdUser(int ud_user){
        this.id_user = id_user;
    }
    public String getNamaNasabah(){
        return this.namaNasabah;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getNoTelp(){
        return this.noTelp;
    }
    
    public String getIbuKandung(){
        return this.ibuKandung;
    }
    
    public int getIdUser(){
        return this.id_user;
    }
}
