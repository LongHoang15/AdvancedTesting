package entity;

public class Student {

    private String id;
    private  String name;
    private Integer age;
    private Float score;
    private Integer semester;
    private String major;

    public Student(String id, String name, Integer age, Float score, Integer semester, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.semester = semester;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
