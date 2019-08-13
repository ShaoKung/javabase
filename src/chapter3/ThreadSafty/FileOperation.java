package chapter3.ThreadSafty;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

/**
 * @program: javabase
 * @description: Java文件操作类
 * @author: Andy
 * @create: 2019-08-13 17:33
 **/

public class FileOperation {
    public static void main(String[] args) throws IOException {

        String filePath="testFile.txt";
        File file=new File(filePath);

        if(!file.exists()){
            file.createNewFile();
        }

        FileWriter fileWriter=new FileWriter(file.getName(),true);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        //String data="";
        StringBuffer data=new StringBuffer("This sentence will be added to file \n");
        bufferedWriter.write(data.toString());
        bufferedWriter.close();
        System.out.println(file.getAbsolutePath());
    }
}
