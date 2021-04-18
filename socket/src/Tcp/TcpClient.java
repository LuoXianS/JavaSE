package Tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    private  static final  int port = 9002;
    private  static final String ip = "127.0.0.1";
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(ip,port);
        Scanner scanner = new Scanner(System.in);
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()))
        ){
            while(true){
                System.out.println("->");
                String msg = scanner.nextLine();
                writer.write(msg+"\n");
                writer.flush();//刷新
                String clmsg = reader.readLine();
                System.out.println(clmsg);
            }
        }
    }
}
