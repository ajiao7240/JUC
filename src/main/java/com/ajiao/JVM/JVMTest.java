package com.ajiao.JVM;

import java.util.UUID;

public class JVMTest {
    public static void main(String[] args) {
        String a = "";
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("TOTAL_MEMORY(-Xms) = "+totalMemory+"字节、"+(totalMemory/(double)1024/1024)+"MB");
        System.out.println("TOTAL_MEMORY(-Xmx) = "+maxMemory+"字节、"+(maxMemory/(double)1024/1024)+"MB");
        while (true){
            a+= UUID.randomUUID().toString();
        }
    }
}
