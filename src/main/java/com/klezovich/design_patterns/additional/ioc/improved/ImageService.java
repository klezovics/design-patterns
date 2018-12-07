package com.klezovich.design_patterns.additional.ioc.improved;


public class ImageService {

    private FileSystem fileSystem;

    public String readImage(){
        return fileSystem.readFile();
    }

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }
}