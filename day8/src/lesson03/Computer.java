package lesson03;

import javax.security.auth.kerberos.KerberosKey;

public class Computer{

    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    //使用USB设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb) {
        usb.open(); //打开设备

        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.keyDown();
        }

        usb.close(); //关闭设备
    }
}
