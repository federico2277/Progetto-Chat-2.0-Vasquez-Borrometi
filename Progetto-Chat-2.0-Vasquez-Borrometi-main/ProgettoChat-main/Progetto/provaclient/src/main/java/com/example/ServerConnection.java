package com.example;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ServerConnection extends Thread{
    private Socket s;
    PrintWriter out;
    BufferedReader in;
    BufferedReader keyboard;

    public ServerConnection(Socket s){
        this.s = s;
        try {
            out = new PrintWriter(s.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            keyboard = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void run() {
        String serverResponse;
        boolean controllo = true;
        while(controllo){
            try {
                serverResponse = in.readLine();
                if(serverResponse.equals("@")){
                    System.out.println("sto chiudendo");
                    controllo = false;
                    s.close();
                    System.exit(0);
                }

                System.out.println(serverResponse);
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
                break;
            }
               
        }   
    }



}