package com.demo.store.frameworks.supports;

import java.io.File;

public class CreateFolder {

    public static void createDirectory(String caminho){
        File directory = new File(caminho);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }
}
