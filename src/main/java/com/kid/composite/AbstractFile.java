package com.kid.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象组件
 */
public interface AbstractFile {
    void killVirus();
}
/**
 * 叶子组件  图片文件
 */
class ImageFile implements AbstractFile{
    private String name;
    public ImageFile(String name) {
        super();
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("--图片文件："+name+"进行查杀");
    }
}

/**
 * 叶子组件  文本文件
 */
class TextFile implements AbstractFile{
    private String name;
    public TextFile(String name) {
        super();
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("--文本文件："+name+"进行查杀");
    }
}

/**
 * 叶子组件  视频文件
 */
class VideoFile implements AbstractFile{
    private String name;
    public VideoFile(String name) {
        super();
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("--视频文件："+name+"进行查杀");
    }
}

/**
 * 容器组件
 */
class Folder implements AbstractFile{
    private String name;
    //定义容器，用来存放本容器构建下的子节点
    private List<AbstractFile> list = new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    public void add(AbstractFile abstractFile){
        list.add(abstractFile);
    }
    public void romove(AbstractFile abstractFile){
        list.remove(abstractFile);
    }
    public AbstractFile getChile(int index){
        return list.get(index);
    }
    @Override
    public void killVirus() {
        System.out.println("==文件夹："+name+"进行查杀");
        for (AbstractFile file: list) {
            file.killVirus();
        }
    }
}