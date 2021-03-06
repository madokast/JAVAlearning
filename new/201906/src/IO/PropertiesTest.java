package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.rmi.server.ExportException;
import java.util.Properties;

/**
 * Properties（Java.util.Properties），
 * 该类主要用于读取Java的配置文件，
 * 不同的编程语言有自己所支持的配置文件，
 * 配置文件中很多变量是经常改变的，
 * 为了方便用户的配置，
 * 能让用户够脱离程序本身去修改相关的变量设置。
 * 就像在Java中，
 * 其配置文件常为.properties文件，
 * 是以键值对的形式进行参数配置的。
 *
 *
 * 2.API 中的Properties
 * ---------------------
 * 作者：China渔火
 * 来源：CSDN
 * 原文：https://blog.csdn.net/amosjob/article/details/82747733
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */

public class PropertiesTest {
    public static void main(String[] args) {
//        show1();
//        show2();
    }

    public static void show2(){
        File file = new File("./a.txt");
        Properties properties = new Properties();
        try(FileInputStream fileInputStream = new FileInputStream(file)){
            properties.load(fileInputStream);
            System.out.println(properties);
            //{xzc=8484561, gfd=212484651, jyt=67461866, qwe=1343645765}
        }catch (Exception e){e.printStackTrace();}
    }

    public static void show1(){
        Properties properties = new Properties();

        //setProperty(String key, String value)
        properties.setProperty("qwe","1343645765");
        properties.setProperty("xzc","8484561");
        properties.setProperty("gfd","212484651");
        properties.setProperty("jyt","67461866");


        properties.stringPropertyNames().forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("properties.getProperty(\"xzc\") = " + properties.getProperty("xzc"));

        File file = new File("./a.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
            properties.store(fileOutputStream,"");
            //#
            //#Tue Jun 18 16:18:56 CST 2019
            //xzc=8484561
            //gfd=212484651
            //jyt=67461866
            //qwe=1343645765
        }catch (Exception e){e.printStackTrace();}

    }
}
