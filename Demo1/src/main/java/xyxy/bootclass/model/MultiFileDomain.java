package xyxy.bootclass.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @program: Demo1
 * @description: 1
 * @author: 龙龙
 * @create: 2020-09-30 11:11
 **/
public class MultiFileDomain {
    private List<String> description;
    private List<MultipartFile> myfile;

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public List<MultipartFile> getMyfile() {
        return myfile;
    }

    public void setMyfile(List<MultipartFile> myfile) {
        this.myfile = myfile;
    }

    @Override
    public String toString() {
        return "MultiFileDomain{" +
                "description=" + description +
                ", myfile=" + myfile +
                '}';
    }
}
