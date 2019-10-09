package lesson01TCPClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
* TCP通信的服务端：接收客户端发送的请求，读取客户端发送的数据，给客户端回写数据
* 表示服务器的类：
*       java.net.ServerSocket:此类实现服务器套接字
*
*    构造方法：
*       ServerSocket(int port)
          创建绑定到特定端口的服务器套接字。


      服务器端必须明确一件事情，必须知道是哪个客户端请求的服务器
      所以可以使用accept获取请求的客户端对象Socket
      成员方法：
         Socket accept() 侦听并接受到此套接字的连接。

      服务器实现步骤：
           1.创建服务器ServerSocket对象和系统指定的端口号
           2.使用accept方法获取请求的客户端对象Socket
           3.使用Socket对象中的方法getInputStream()获取网络字节输入流对象
           4.使用网络字节输入流InputStream中的read方法读取服务器回写的数据
           5.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
           6.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器ServerSocket对象和系统指定的端口号
        ServerSocket ss = new ServerSocket(3333);
        //2.使用accept方法获取请求的客户端对象Socket
        Socket soc = ss.accept();
        //3.使用Socket对象中的方法getInputStream()获取网络字节输入流对象
        InputStream is = soc.getInputStream();
        int len;
        OutputStream os = soc.getOutputStream();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Scanner sc = new Scanner(System.in);
                    String in = sc.nextLine();
                    try {
                        os.write(in.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        while (true) {
            byte[] b = new byte[1024];
            len = is.read(b);
            if(len!=-1){
                System.out.println(new String(b));
            }
        }

    }
}
