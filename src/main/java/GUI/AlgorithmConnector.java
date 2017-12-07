/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class AlgorithmConnector {
    
    public void AlgorithmTester (){
        List<String> testcmds = Arrays.asList("cmd.exe", "/C", "dir");
        
    ProcessBuilder builder = new ProcessBuilder(testcmds);
    builder.directory(new File("C:\\Users\\Lenovo\\Desktop\\RecordUsers"));
        try {
            Process proc = builder.start();
            BufferedReader reader = new BufferedReader (new InputStreamReader(proc.getInputStream()));
            StringBuilder sbuilder = new StringBuilder();
            String line = null;
            while((line= reader.readLine()) != null){
                sbuilder.append(line);
                sbuilder.append(System.getProperty("line.seperator"));
                
            }
            String result = sbuilder.toString();
            System.out.println(result);
            OutputStream out = proc.getOutputStream();
            
        } catch (IOException ex) {
            Logger.getLogger(AlgorithmConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String AlgorithmTrainer (String username){
        List<String> testcmds = Arrays.asList("cmd.exe", "/C", "dir");
        
    ProcessBuilder builder = new ProcessBuilder(testcmds);
    builder.directory(new File("C:\\Users\\Lenovo\\Desktop\\RecordUsers"));
    String result =("Try Failed");
        try {
            Process proc = builder.start();
            BufferedReader reader = new BufferedReader (new InputStreamReader(proc.getInputStream()));
            StringBuilder sbuilder = new StringBuilder();
            String line = null;
            while((line= reader.readLine()) != null){
                sbuilder.append(line);
                sbuilder.append(System.getProperty("line.seperator"));
                
            }
             result = sbuilder.toString();            
            OutputStream out = proc.getOutputStream();
            
        } catch (IOException ex) {
            Logger.getLogger(AlgorithmConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
        
        
    }
    

