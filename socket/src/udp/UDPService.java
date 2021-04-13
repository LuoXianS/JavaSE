package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPService {
    private static final int Port = 9001;
    private static final int length = 1024;
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(Port);
        while(true){
            DatagramPacket  packet = new DatagramPacket(new byte[length],length);
            socket.receive(packet);
            //拿到信息
            String msg = new String(packet.getData());
            System.out.println("接收到客户端的消息:"+msg);
            //给客户端返回信息
            String msg1 = "我收到了";
            DatagramPacket packet1 = new DatagramPacket(
                    msg1.getBytes(),
                    msg1.getBytes().length,
                    packet.getAddress(),
                    packet.getPort());
            socket.send(packet1);
        }
    }
}
