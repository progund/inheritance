package com.superpower.filebrowser.main;

import com.superpower.filebrowser.FBDir;
import com.superpower.filebrowser.FBFile;
import com.superpower.filebrowser.FBJavaFile;
import com.superpower.filebrowser.utils.FileList;
import java.util.List;

public class TextMain {

  public static void main(String[] args) {
        
    List<FBFile> files = FileList.list();

    for (FBFile f : files) {
      System.out.println(f.thumbnail() + " " + f.name());
    }        
  }

}
