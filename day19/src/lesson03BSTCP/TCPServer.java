package lesson03BSTCP;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 创建BS版本的TCP服务器
 * */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        //使用accept方法获取到请求的客户端对象
        ExecutorService es= Executors.newFixedThreadPool(3);
        while(true){
            Socket socket = ss.accept();
            es.submit(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String[] a = br.readLine().split(" ");
                        String path = a[1].substring(1);
                        System.out.println(path);
                        FileInputStream fis = new FileInputStream("day19//web//"+path);
                        System.out.println(fis); byte[] bytes= new byte[1024];
                        int len = 0 ;
                        //向浏览器 回写数据
                        OutputStream out = socket.getOutputStream();
                        out.write("HTTP/1.1 200 OK\r\n".getBytes());
                        out.write("Content-Type:text/html\r\n".getBytes());
                        out.write("\r\n".getBytes());
                        while((len = fis.read(bytes))!=-1){
                            out.write(bytes,0,len);
                        }
                        out.close();
                        br.close();
                        is.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            });
        }

    }
}
