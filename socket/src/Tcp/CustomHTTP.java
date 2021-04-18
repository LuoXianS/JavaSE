package Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class CustomHTTP {
    private static final int port = 9004;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器端连接成功");
        //等待客户端连接
        Socket client  = serverSocket.accept();
        System.out.println(String.format("客户端已连接，客户端IP：%s,客户端Port:%d",client.getInetAddress().getHostAddress(),client.getPort()));
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(client.getOutputStream()))
        )
      {
            String FirstLine = bufferedReader.readLine();
            if (FirstLine!=null &&!FirstLine.equals("")){
                String[] FLine = FirstLine.split(" ");
                String method = FLine[0];
                String URL = FLine[1];
                String Ver = FLine[2];
                System.out.println(String.format("读取到客户端请求，方法类型：%s,URL：%s,版本：%s",
                        method, URL, Ver));
                //处理业务
                String content= "<h1>未知</h1>";
                if (URL.contains("404")){
                    content = "<h1>页面没有找到</h1>";
                }else if (URL.contains("200")){
                   content = "<h1>Hello,World</h1>";
                }
                //返回header
                bufferedWriter.write(Ver+" 200 OK\n ");
                bufferedWriter.write("Content-Type: text/html;charset=utf-8\n");
                bufferedWriter.write("Content-Length: " + content.getBytes().length + "\n");
                // 写入空行
                bufferedWriter.write("\n");
                // 写入 body
                bufferedWriter.write(content);
                bufferedWriter.flush();
            }
        }
    }
}
