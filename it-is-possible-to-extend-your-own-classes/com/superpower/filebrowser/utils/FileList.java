package com.superpower.filebrowser.utils;

import java.util.List;
import java.util.ArrayList;
import java.io.File;

import com.superpower.filebrowser.*;


public class FileList {

    public static List<FBFile> list() {
        return list(".");
    }

    public static List<FBFile> list(String dir) {
        return list(new File(dir));
    }
    
    public static List<FBFile> list(File dir) {

        if ( (dir==null) || dir.isFile() ) {
            return null;
        }
        
        // By returning a List we can chose any the subclasses (in
        // this case actually sub interfaces - more on that in the
        // coming chapter) and change it afterwards, since the users
        // of this method only uses the methods as "provided" by List
        List<FBFile> list = new ArrayList<FBFile>();
        
        // Note that we use File below. File is a class in Java.
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.getPath().endsWith(".java")) {
                    list.add(new FBJavaFile(file.getPath()));
                } else {
                    list.add(new FBFile(file.getPath()));
                }
            } else if (file.isDirectory()) {
                // System.err.println("Ignoring directory: " + file.getPath());
                //
                //list.add(new FBFile(file.getPath()));
                list.add(new FBDir(file.getPath()));
            }
        }
        return list;
    }

}

