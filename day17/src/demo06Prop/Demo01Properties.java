package demo06Prop;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
* java.utils.properties集合 extends Hashtable<k, v> implements Map<k, v>
*
* Properties类表示了一个持久的属性类，Properties可以保存在流中或从流中加载
* Properties集合是唯一一个和IO流相结合的集合
*       可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
*       可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
*
* 属性列表中每一个键及其对应的值都是一个字符串
*       Properties集合是一个双列集合，key和value默认都是字符串
* */
public class Demo01Properties {

    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    /*
    * 可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
    *  void load(InputStream inStream)
              从输入流中读取属性列表（键和元素对）。
              注意：不能读取含有中文的键值对
       void load(Reader reader)
              按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
              可以读取含有中文的键值对
       使用步骤：
            1.创建Properties集合对象
            2.使用Properties集合对象的方法load读取保存键值对的文件
            3.遍历Properties集合
       注意：
            1.存储键值对的文件中，键与值默认的链接符号可以使用等号或者空格（其他符号）
            2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不会在被读取
            3.存储键值对的文件中，键与值默认都是字符串，不用再加引号

    * */
    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\06 Properties集合\\a.txt"));
        for (String s : prop.stringPropertyNames()) {
            System.out.println(s+prop.getProperty(s));
        }
    }

    //可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
    // void store(OutputStream out, String comments)
    //          以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
    // void store(Writer writer, String comments)
    //          以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
    //      参数： outputStream out: 字节输出流, 不能写入中文
    //             Writer writer：字符输出流，可以写中文
    //             string comments: 注释，用来解释保存文件是做什么用的
    //                      不能使用中文，默认Unicode编码，一般为空字符串
    //
    private static void show02() throws IOException {
       //1.创建Properties集合对象，添加数据
        Properties prop = new Properties();
        //使用setProperty添加数据
        prop.setProperty("张三", "17");
        prop.setProperty("李四", "18");
        prop.setProperty("王五", "19");
       //2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
//        FileWriter fw = new FileWriter("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\06 Properties集合\\a.txt");
        FileOutputStream fw = new FileOutputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\06 Properties集合\\b.txt");
        //3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中
        prop.store(fw,"");
       //4.释放资源
        fw.close();
    }


    /*
    * 使用Properties集合存储数据，遍历取出集合中的数据
    *   有一些操作字符串的特有方法
    *   setProperty(String key, String value)
          调用 Hashtable 的方法 put。
        getProperty(String key)
          用指定的键在此属性列表中搜索属性。
        stringPropertyNames()
          返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键。
    * */
    private static void show01() {
        //创建对象
        Properties prop = new Properties();
        //使用setProperty添加数据
        prop.setProperty("张三", "17");
        prop.setProperty("李四", "18");
        prop.setProperty("王五", "19");

        //使用stringPropertyNames把Propties集合中的键取出，存储到一个set集合中
        Set<String> set = prop.stringPropertyNames();
        for (String o : set) {
            System.out.println(o+prop.getProperty(o));
        }

    }
}
