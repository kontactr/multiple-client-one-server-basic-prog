/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
/**
 *
 * @author student
 */

public class chats {
    ServerSocket s;
    chats(int port)
    {
       
             try{
            s = new ServerSocket(port);
            
        } catch (Exception ex) {
            Logger.getLogger(chats.class.getName()).log(Level.SEVERE, null, ex);
        }
	   
    }
	
	void conn()
	{
		while(true){
		try{
		Socket ac = s.accept();
            new multi(ac).start();
		}catch(Exception e){System.out.println("asasa");break;}
		}
	}
    
    
    public static void main(String[] args)throws Exception {
            Scanner s1 = new Scanner(System.in);
            chats chats = new chats(s1.nextInt());
			chats.conn();
    
    
}
}
