package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SafeList implements Runnable{
    private ArrayList<String> l;
    private String[] arr;
    SafeList(ArrayList<String>l,String[] arr){
        this.l=l;
        this.arr=arr;
    }
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());
        File file = new File( "C:\\Users\\hotoe\\IdeaProjects\\HelloThreads\\src\\main\\java\\org\\example\\" +arr[Integer.parseInt(Thread.currentThread().getName().replace("pool-1-thread-",""))-1]);
          String line;
            try {
                    Scanner s = new Scanner(file);
                    while (s.hasNextLine()) {
                    line = s.nextLine();

                    append(line);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }


    }
    private synchronized void append(String x){
        l.add(x);

    }

}
