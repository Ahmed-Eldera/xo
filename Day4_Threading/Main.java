package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> nameList = new ArrayList<>();
        String[] filenames = new String[] {"3.txt","1.txt" , "2.txt"};
        ExecutorService executorService = Executors.newFixedThreadPool(filenames.length);

        Runnable runnable= new SafeList(nameList,filenames);
        for(int i =0;i< filenames.length;i++){
            executorService.execute(runnable);
        }
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        executorService.close();
        Collections.sort(nameList);
        System.out.println(nameList);
        return;
    }
}

//pass file name to runnable
//callable