package com.lyc.javaPjt;

import java.io.*;

class LFile {
    void fileFun() throws IOException{
        /**
         * File有2个构造方法
         * 1. new File(String "路径");
         * 1. new File(String "父路径", String "当前文件名");
         * */
        File f = new File("./../statics/test.txt");
        System.out.println(f.getPath()); // 获取构造函数传入的参数地址
        System.out.println(f.getAbsolutePath()); // 获取file绝对地址
        System.out.println(f.getCanonicalPath()); // 获取file绝对地址的规范地址
        System.out.println(f.length()); // 获取file绝对地址的规范地址
/*        System.out.println(f.separator); // 获取当前平台的系统分隔符
        System.out.println(f.isFile()); // 判断该File对象是否是一个已存在的文件
        System.out.println(f.isDirectory()); // 断该File对象是否是一个已存在的目录
        System.out.println(f.canRead()); // 断该File对象是否是一个已存在的目录
        System.out.println(f.canWrite()); // 断该File对象是否是一个已存在的目录
        System.out.println(f.canExecute()); // 断该File对象是否是一个已存在的目录*/
    }
    void createFile() throws IOException {
       String path = "C:\\job\\codes\\java\\pjt\\statics";
       String fileName = "newFile.txt";
       File newFile = new File(path, fileName);
       if (newFile.exists()) {
           newFile.delete();
       } else {
           newFile.createNewFile();
           newFile.mkdir();
       }
    }
    void createDirectory() throws IOException{
        String path = "C:\\job\\codes\\java\\pjt\\src\\com\\lyc\\javaPjt\\test";
        File dir = new File(path);
        if (dir.exists()) {
            dir.delete();
        } else {
            dir.mkdir();
        }
    }
}