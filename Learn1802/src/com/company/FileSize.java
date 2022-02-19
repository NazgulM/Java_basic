package com.company;

import java.io.File;

public class FileSize {
    public static long getFileSize (String filename) {
        File file = new File(filename);
        if(!file.exists() || !file.isFile()) {
            System.out.println("File doesn\'t exist");
            return -1;
        }
        return file.length();
    }

    public static void main(String[] args) {
        long size = getFileSize("C:\\Python397/NEWS.txt");
        System.out.println("File in bytes " + size);
    }
}
