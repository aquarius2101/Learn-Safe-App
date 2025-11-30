/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhungLearnSafe;

import java.io.Serializable;

/**
 *
 * @author hong-nhung-nguyen
 */
public class Account implements Serializable{
    private String username, password;
    private String[] score;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.score = new String[] {"null", "null"}; // default all scores null
    }

    public Account() {
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // getter for each quiz score
    public String getFireScore() {
        return score[0];
    }
    
    public String getFloodScore() {
        return score[1];
    }

    // setter for each quiz score
    public void setFireScore(String fireScore) {
        score[0] = fireScore;
    }
    public void setFloodScore(String floodScore) {
        score[1] = floodScore;
    }
    
    public String viewProgress(){
        return "Fire quiz result: "+ score[0]+"\n"+
                "Flood quiz result: "+ score[1];
    }

    
}
