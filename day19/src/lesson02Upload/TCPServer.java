package lesson02Upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TCPServer {
        public static void main(String[] args) throws IOException {
            ServerSocket ss = new ServerSocket(3334);
            ExecutorService es= Executors.newFixedThreadPool(3);
            /*
            * 让服务器一直处于监听状态
            * */
            while (true){
                Socket soc = ss.accept();
                es.submit(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            InputStream is = soc.getInputStream();
                            FileOutputStream fos = new FileOutputStream("day19\\"+System.currentTimeMillis()+new Random().nextInt(99999)+"upload.pdf");
                            int len;
                            OutputStream os = soc.getOutputStream();
                            byte[] b = new byte[102];
                            while ((len = is.read(b)) != -1) {
                                System.out.println(len);
                                fos.write(b,0,len);
                            }
                            os.write("上传成功!".getBytes());
                            soc.shutdownInput();
                            soc.close();
                        }catch (IOException e){
                            System.out.println(e);
                        }
                        System.out.println(Thread.currentThread());
                    }
                });
            }

        }
}
