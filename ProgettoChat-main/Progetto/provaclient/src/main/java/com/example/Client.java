package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
        
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 3000);
        ServerConnection serverConn = new ServerConnection(s);
        serverConn.start();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        boolean controllo = true;

        try {
            String hostname="";
            System.out.println(in.readLine());
            hostname=keyboard.readLine();
            out.println(hostname);
                //scelta tipologia mesaggio
                while(controllo){
                String command = keyboard.readLine();
                out.println(command);
                }
            
        } catch (Exception e) {
           
        }

        in.close();
        out.close();
        s.close();
    }


}
