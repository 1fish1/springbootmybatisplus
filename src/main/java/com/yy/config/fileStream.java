package com.yy.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class fileStream {
    public static void main(String[] args) {
        File f = new File("D:\\1.txt");
        System.out.println("向文件中输入你要存的数据");
        Scanner in2 = new Scanner(System.in);
        String input = in2.nextLine();
        //向文件里写如"Hello"字符串.
        try {
            //要写入的数据转换成字节数组
            byte[] buf = input.getBytes();

            //如果1.txt存在,则删除1.txt里面的内容,文本所有内容变为Hello
            //如果1.txt不存在,在新建1.txt文本,写入Hello
            FileOutputStream out = new FileOutputStream(f);

            out.write(buf);

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        //读取文件中的内容。可在程序中单独使用,不用关心"写"是否存在.
        try {
            //只要f存在就可以读出f的内容,与写操作代码没有关联性.
            FileInputStream in = new FileInputStream(f);

            byte[] buf = new byte[1024];

            int len = in.read(buf);        //从流中读取内容
            String str = new String(buf, 0, len);

            System.out.println(str);    //打印f文件的内容.
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
