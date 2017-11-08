/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Lenovo
 */
public class SoundRecorder {
     private static final int RECORD_TIME = 10000;   // 10 seconds
    static final SoundRecordingUtil recorder = new SoundRecordingUtil();
     
   
     
    public void startRecording (String username) {
        String filename = "C:\\Users\\Lenovo\\Desktop\\RecordUsers\\"+username;
         File wavFile = new File(filename);
         
         
        // create a separate thread for recording
        Thread recordThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Start recording...");
                    recorder.start();
                } catch (LineUnavailableException ex) {
                    ex.printStackTrace();
                    System.exit(-1);
                }              
            }
        });
         
        recordThread.start();
         
        try {
            Thread.sleep(RECORD_TIME);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    
    
         
        try {
            recorder.stop();
            recorder.save(wavFile);
            System.out.println("STOPPED");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
        System.out.println("DONE");
    }
    
}
