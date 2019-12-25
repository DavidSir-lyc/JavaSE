package com.lyc.javaPjt;

import java.io.*;

public class LFile {
    public void fileFun() throws IOException{
        File f = new File("./../statics/test.txt");
        System.out.println(f.getPath()); // 获取构造函数传入的参数地址
        System.out.println(f.getAbsolutePath()); // 获取file绝对地址
        System.out.println(f.getCanonicalPath()); // 获取file绝对地址的规范地址
/*        System.out.println(f.separator); // 获取当前平台的系统分隔符
        System.out.println(f.isFile()); // 判断该File对象是否是一个已存在的文件
        System.out.println(f.isDirectory()); // 断该File对象是否是一个已存在的目录
        System.out.println(f.canRead()); // 断该File对象是否是一个已存在的目录
        System.out.println(f.canWrite()); // 断该File对象是否是一个已存在的目录
        System.out.println(f.canExecute()); // 断该File对象是否是一个已存在的目录*/
    }
    public void createFile() throws IOException {
       String path = "C:\\job\\codes\\java\\pjt\\statics";
       String fileName = "newFile.txt";
       File newFile = new File(path, fileName);
       if (newFile.exists()) {
           newFile.delete();
       } else {
           newFile.createNewFile();
       }
    }
}