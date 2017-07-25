package com.finepointmobile;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number of processors:");
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(Runtime.getRuntime().totalMemory());

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
    }
}
