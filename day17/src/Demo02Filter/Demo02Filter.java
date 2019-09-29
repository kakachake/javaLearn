package Demo02Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02Filter {

    public static void main(String[] args) {
        File file = new File("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\03 过滤器");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                //如果pathname是一个文件夹，返回true,继续便利这个文件夹
//                if(pathname.isDirectory()){
//                    return  true;
//                }
//                return pathname.getName().toLowerCase().endsWith(".avi");
//                //如果返回的是true就会把传递过去的File对象保存到File数组中
//            }
//        }); //传递过滤器对象

//        File[] files = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".avi");
//            }
//        });


        //使用lambda表达式
        File[] files = file.listFiles((File dir, String name)->{
            return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".avi");
        });
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f.getName());
            }
        }
    }
}
