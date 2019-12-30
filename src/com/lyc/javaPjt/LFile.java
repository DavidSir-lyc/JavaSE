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
            dir.mkdirs();
        }
        // listFiles获取当前路径下子文件，子目录的list
        File[] arr = dir.listFiles();
        for (File item : arr) {
            System.out.println(item);
        }
    }
    void fileFilterFun() throws IOException{
        String path = "C:\\job\\codes\\java\\pjt\\src\\com\\lyc\\javaPjt\\test";
        File f = new File(path);
        File[] fileFilter = f.listFiles(
                // FileFilter接口的实现，过滤listFiles符合条件的文件
                new FileFilter() {
                    @Override
                    public boolean accept(File f) {
                        return f.isFile(); // 过滤条件
                    }
                }
        );
        for (File item : fileFilter) {
            System.out.println(item);
        }
    }
    /**
     * RandimAccessFile是基于当前指针的读写操作
     **/
    void rafFun() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("C:\\job\\codes\\java\\pjt\\src\\com\\lyc\\javaPjt\\test\\read","rw");
        raf.write('A');
        long pointer = raf.getFilePointer(); // 获取当前指针位置
        // System.out.println(pointer);
        raf.seek(0);// 移动指针位置到
        raf.close();
    }
}