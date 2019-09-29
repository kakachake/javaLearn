package Demo02Filter;

/*
* 需求，遍历.avi文件
*
* 我们可以使用过滤器实现
* 在File类中有两个和ListFIles重载的方法，方法的参数就是过滤器
* File[] listFiles(FileFilter filter)
*   java.io.FileFilter接口，用于抽象路径名（File对象）的过滤器
*         作用：用来过滤文件（File对象）
*         抽象方法:用来过滤文件的方法
*           accept(File pathname)
                测试指定抽象路径名是否应该包含在某个路径名列表中。
          参数：
            File pathName:就是使用listFiles方法遍历目录得到的每一个文件对象
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。

  File[] listFiles(FilenameFilter filter)
  java.io.FilenameFilter接口，实现此接口的类实例可用于过滤器文件名
          作用：用于过滤文件名称
          抽象方法：用来过滤文件的方法
              accept(File dir, String name)
                测试指定文件是否应该包含在某一文件列表中。
                参数：File dir: 构造方法中传递的被遍历的目录
                      String name: 使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
      注意：
            两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤方法accept,在方法中自己定义过滤的
        规则
* */

import java.io.File;

public class Demo01Filter {

    public static void main(String[] args) {
        File file = new File("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\03 过滤器");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        File[] files = file.listFiles(new FileFilterImpl()); //传递过滤器对象
        /*
        * listFiles一共做了三件事情
        * 1.listFiles会对构造方法中传递的目录进行遍历，获取目录中每一个文件/文件夹--->封装为File对象
        * 2.listFiles方法会调用参数传递的过滤器中的方法accept
        * 3.listFiles方法会把遍历的到的每一个File对象传递给accept方法的参数pathname
        * */
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f.getName());
            }
        }
    }
}

