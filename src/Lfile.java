import java.io.*;
public class Lfile {
    public void fileFun() throws IOException{
        File f = new File("./../statics/test.txt");
        System.out.println(f.getPath()); // 获取构造函数传入的参数地址
        System.out.println(f.getAbsolutePath()); // 获取file绝对地址
        System.out.println(f.getCanonicalPath()); // 获取file绝对地址的规范地址
        System.out.println(f.separator); // 获取当前平台的系统分隔符
    }
}