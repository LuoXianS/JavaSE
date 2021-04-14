package Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.Buffer;

public class TcpServer {
    private static final  int port = 9002;
    public static void main(String[] args) throws IOException {
        //创建服务器端
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器端连接成功");
        //等待客户端连接
        Socket client  = serverSocket.accept();
        System.out.println(String.format("客户端已连接，客户端IP：%s,客户端Port:%d",client.getInetAddress().getHostAddress(),client.getPort()));
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(client.getOutputStream()))
        ){
            while (true){
                String msg = bufferedReader.readLine();
                if (msg != null && !msg.equals("")){
                    System.out.println("收到客户端消息："+msg);
                    String reMsg = "我已收到信息";
                    bufferedWriter.write(reMsg+"\n");
                    //刷新缓冲区
                    bufferedWriter.flush();
                }
            }
        }
    }
}
