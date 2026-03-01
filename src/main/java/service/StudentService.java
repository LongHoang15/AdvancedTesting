package service;

import entity.Student;

public class StudentService {

    // Stub dữ liệu sinh viên

    protected Student student =new Student(
            "SV001",
            "Đoàn Hoàng Long",
            20,
            8.5F,
            3,
            "cntt"
    ) ;

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student student){
        this.student=student;
    }

    public void updateStudent(Student newStudent){
        if (newStudent == null){
            throw new IllegalArgumentException("Đối tượng sinh viên không được null");
        }
        if (newStudent.getId()==null || newStudent.getId().isEmpty()){
            throw new IllegalArgumentException("id không được null");
        }
        if (newStudent.getName()==null || newStudent.getName().isEmpty()){
            throw new IllegalArgumentException("id không được null");
        }
        if (newStudent.getScore() < 0 || newStudent.getScore() > 10){
            throw new IllegalArgumentException("điểm tb phải từ 0 tới 10");
        }

        student.setId(newStudent.getId());
        student.setName(newStudent.getName());
        student.setScore(newStudent.getScore());
        student.setSemester(newStudent.getSemester());
        student.setMajor(newStudent.getMajor());


    }
}
