/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;

/**
 *
 * @author Lenovo
 */
public class User {
    
    public void createUser(String string){
        File f = new File("C:\\Users\\Lenovo\\Desktop\\RecordUsers\\"+string);
try{
    if(f.mkdir()) { 
        System.out.println("Directory Created");
    } else {
        System.out.println("Directory is not created");
    }
} catch(Exception e){
    e.printStackTrace();
} 
        
    }
    
}
