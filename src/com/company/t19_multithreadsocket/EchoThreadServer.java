package com.company.t19_multithreadsocket;

import java.io.IOException;
import java.net.*;

/**
 * Created by Mirim on 2015-09-10.
 */
public class EchoThreadServer {
    try{
        ServerSocket server = null;
        try {
            server = new ServerSocket(10000);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        System.out.println("접속대기....");

        while (true){
            Socket socket = server.accept();
            EchoThread th = new EchoThread(socket);
            th.start();
        }
    } catch (Exception e){
        e.printStackTrace();
    }
}
