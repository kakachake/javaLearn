package Demo02Filter;

import java.io.File;
import java.io.FileFilter;

/*
* 过滤的规则：
*   在accept方法中，判断File对象是否是以.avi结尾，
*   是就返回true,不是就返回false
* */

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {

        //如果pathname是一个文件夹，返回true,继续便利这个文件夹
        if(pathname.isDirectory()){
            return  true;
        }

        return pathname.getName().toLowerCase().endsWith(".avi");
        //如果返回的是true就会把传递过去的File对象保存到File数组中
    }
}
