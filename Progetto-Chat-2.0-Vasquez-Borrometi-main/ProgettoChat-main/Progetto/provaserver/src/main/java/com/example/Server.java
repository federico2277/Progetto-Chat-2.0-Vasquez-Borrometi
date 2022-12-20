 package com.example;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

  private static List<ClientHandler> clients = new ArrayList<>();

  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(3000);
    System.out.println("Server in ascolto sulla porta 3000");
    boolean running = true;
    while (running) {
      Socket s = ss.accept();
      System.out.println("Connesso al client!");
      ClientHandler clientThread = new ClientHandler(s, clients);
      
      clients.add(clientThread);
      clientThread.start();
    }
    ss.close();
  }
}