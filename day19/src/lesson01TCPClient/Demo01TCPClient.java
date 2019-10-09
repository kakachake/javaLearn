package lesson01TCPClient;

/*
* TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
* 表示客户端的类：
*       java.net.Socket:此类实现客户端套接字。套接字是两台机器间通信的端点
*       套接字：包含了IP地址和端口号的网络单位
*
*
*  构造方法:
*       Socket(String host, int port)
          创建一个流套接字并将其连接到指定主机上的指定端口号。
   成员方法：
         OutputStream getOutputStream() 返回此套接字的输出流。
         InputStream getInputStream() 返回此套接字的输入流。
         close关闭套接字
   实现步骤：
        1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
        2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
        4.使用Socket对象中的方法getInputStream()获取网络字节输入流对象
        5.使用网络字节输入流InputStream中的read方法读取服务器回写的数据
        6.释放资源
   注意：
        1.客户端和服务器进行交互，必须使用Socket中提供的网络流，不能使用自己创建的流对象
        2.当我们创建客户端对象Socket的时候，就会请求服务器，和服务器经过三次握手建立连接通路，
        如果服务器没有启动，那么就会抛出异常
        如果已经启动，就可以进行交互了。
* */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Demo01TCPClient {

    public static void main(String[] args) throws IOException {
        //1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 3333);
        //2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
        os.write("hello".getBytes());
        InputStream is = socket.getInputStream();
        byte[] b = new byte[1024];

        /*
        * 创建一个线程来进行发送数据
        * */
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

        /*
        * 循环监听返回的数据
        * */
        while (true){
            int len = is.read(b);
            if(len!=-1){
                System.out.println(new String(b));
            }
        }
    }

}
