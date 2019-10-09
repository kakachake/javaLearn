package lesson02Upload;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket soc = new Socket("127.0.0.1", 3334);
        File file = new File("day19\\19.pdf");
        FileInputStream fis = new FileInputStream(file);
        OutputStream os = soc.getOutputStream();
        byte[] b = new byte[1024];
        int len = 0;
        int program = 0;
        while((len = fis.read(b))!=-1){
            os.write(b,0, len);
            program += len;
            System.out.println("已上传"+(double)program/(file.length())*100+"%");
        }
        soc.shutdownOutput();
        InputStream is = soc.getInputStream();
        while((len = is.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        fis.close();
        soc.close();
    }
}
