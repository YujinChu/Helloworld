package com.company.t19_multithreadsocket;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-10.
 */
public class EchoThreadServer {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(10000);
            System.out.println("���Ӵ��....");

            while (true){
                Socket socket = server.accept();
                EchoThread th = new EchoThread(socket);
                th.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
