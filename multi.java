/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
class multi extends Thread {

    Socket ac;

    multi(Socket ac) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.ac = ac;
    }

    @Override
    public void run() {
        DataOutputStream ds;
        try {
			System.out.println("hello");
            ds = new DataOutputStream(ac.getOutputStream());
            ds.writeUTF("hello");
			System.out.println("hello -1");
			DataInputStream di = new DataInputStream(ac.getInputStream());
			System.out.println(di.readUTF());
        } catch (IOException ex) {
            Logger.getLogger(multi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
