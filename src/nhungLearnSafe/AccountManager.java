/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhungLearnSafe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author surface pro 6
 */
public class AccountManager {
    //static method to write to file
    public static void writeToFile(ArrayList<Account> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("accounts.dat"))) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.out.println("Writing to file error: "+ e);
        }
    }
    
    //load method
    public static ArrayList<Account> load() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("accounts.dat"))){
            ArrayList<Account> users = (ArrayList<Account>)ois.readObject();
            return users;
        }catch(FileNotFoundException | ClassNotFoundException e){
            System.out.println("File not found "+ e);
            return new ArrayList<>();
        }catch(IOException e){
            System.out.println("IO Exception on load "+ e);
            return new ArrayList<>();
        }
    }
    
    // Check login credentials method
    public static Account authenticate(ArrayList<Account> users, String username, String password) {
        for (Account tempA : users) {
            if (tempA.getUsername().equals(username) && tempA.getPassword().equals(password)) {
                return tempA;
            }
        }
        return null;
    }
    
    // Check if username already exists
    public static boolean usernameExists(ArrayList<Account> users, String username) {
        for (Account tempA : users) {
            if (tempA.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }


}
