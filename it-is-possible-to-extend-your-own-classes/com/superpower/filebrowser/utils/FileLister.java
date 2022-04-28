package com.superpower.filebrowser.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileList {

  public static List<FBFile> list() {
    // By returning a List we can chose any the subclasses (in
    // nthis case actually sub interfaces - more on that in the
    // coming chapter) and change it afterwards, since the users
    // of this method only uses the methods as "provided" by List
    List<FBFile> list = new ArrayList<FBFile>();
        
    File dir = new File(".");
            
    File[] files = dir.listFiles();
    for (File file : files) {
      if (file.isFile()) {
        list.add(new FBFile(file.getPath()));
      } else if (file.isDirectory()) {
        System.err.println("Ignoring directory: " + file.getPath());
      }
    }
  }

}

