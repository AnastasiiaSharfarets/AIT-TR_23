package io_streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;

public class Main {
    public static String[] main(String[] args) throws IOException {
        System.out.println(Arrays.toString(args));
        System.out.println(args[0]);
        //                                      IO Streams
        /*
        Byte streams (бфйтовые потоки)              Character streams (символьные стримы)
        InputStream         OutputStream            Reader          Writer
        _________________________________________________________________________________

        predefined streams (уже определенные потоки)
        System.out
        System.in
        System.err
         */

        //System.in.read();
//read(byte[]data)
        byte[] data = new byte[10];
        System.out.println("Enter something");
        System.in.read(data);
        System.out.println("You entered ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }


        //чтение из файла через FileInputStream
        //close()
        int i;
        FileInputStream fin;
        //FileInputStream fin = new FileInputStream("Text1.txt");
        if (args.length != 1) {
            System.out.println("need file name");
            return args;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileSystemNotFoundException e) {
            System.out.println("File not found");
            return args;
        }
        //читаем байты их файла, пока не достигнем конца файла
       /* do {
            i = fin.read();
            if (i != -1) System.out.println((char) i);
        } while (i != -1);
        try{}

     catch(IOException e){
            System.out.println("Error reading file");
        } finally{
            //закрывает файлы ы любом случае
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        }

      */
        return args;
    }
}