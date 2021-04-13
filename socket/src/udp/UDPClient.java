package udp;

import java.io.IOException;
import java.net.*;
import java.util.Date;
import java.util.Scanner;

public class UDPClient {
    private static final String IP = "127.0.0.1";
    private static final int Port = 9001;
    private static final int length = 1024;
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while(true){
            String msg = sc.nextLine();
            DatagramPacket packet = new DatagramPacket(
                    msg.getBytes(),
                    msg.getBytes().length,
                    InetAddress.getByName(IP),
                    Port
            );
            socket.send(packet);
            DatagramPacket packet1 = new DatagramPacket(new byte[length],length);
            socket.receive(packet1);
            System.out.println("收到服务器端的消息:"+ new String(packet1.getData()));
        }

    }
}
