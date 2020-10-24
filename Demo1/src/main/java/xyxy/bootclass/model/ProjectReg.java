package xyxy.bootclass.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * @program: Demo1
 * @description: 实验三
 * @author: 龙龙
 * @create: 2020-09-30 10:37
 **/

public class ProjectReg {

    private Integer id;
    private String project_name;
    private String sg_unit;
    private String js_unit;
    private String  jl_unit;
    private MultipartFile projectFile;
    private String file_path;

    public MultipartFile getProjectFile() {
        return projectFile;
    }

    public void setProjectFile(MultipartFile projectFile) {
        this.projectFile = projectFile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getSg_unit() {
        return sg_unit;
    }

    public void setSg_unit(String sg_unit) {
        this.sg_unit = sg_unit;
    }

    public String getJs_unit() {
        return js_unit;
    }

    public void setJs_unit(String js_unit) {
        this.js_unit = js_unit;
    }

    public String getJl_unit() {
        return jl_unit;
    }

    public void setJl_unit(String jl_unit) {
        this.jl_unit = jl_unit;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    @Override
    public String toString() {
        return "ProjectReg{" +
                "id=" + id +
                ", project_name='" + project_name + '\'' +
                ", sg_unit='" + sg_unit + '\'' +
                ", js_unit='" + js_unit + '\'' +
                ", jl_unit='" + jl_unit + '\'' +
                ", projectFile=" + projectFile +
                ", file_path='" + file_path + '\'' +
                '}';
    }
}
