/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Chatc extends Thread {

    Socket s ;
    Chatc(String sname,int port)throws Exception
    {
        s = new Socket(sname,port);
    }
    @Override
    public void run()
    {
        Scanner s1 = new Scanner(System.in);
        try(DataInputStream is = new DataInputStream(s.getInputStream()); DataOutputStream os = new DataOutputStream(s.getOutputStream()))
        {
			System.out.println("hello");
            System.out.println(is.readUTF());
            os.writeUTF(s1.nextLine());
        }catch(Exception e){}
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        new Chatc("localhost",1024).start();
                
        
    }
    
}
