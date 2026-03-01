import entity.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.StudentService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentServiceTest {

    protected static Student student;
    protected static StudentService studentService;

    @BeforeAll
    public static void setup(){
        studentService = new StudentService();
    }

    //điểm hợp lệ
    @Test
    void testUpdateScoreNormal(){
        //stub dữ liệu
        student =new Student(
                "SV001",
                "Đoàn Hoàng Long",
                20,
                7.5F,
                3,
                "cntt"
        );
        studentService.updateStudent(student);
        assertEquals(7.5F,studentService.getStudent().getScore());
    }

    //điểm nhỏ hơn 0
    @Test
    void testUpdateScoreLessThan0(){
        //stub dữ liệu
        student =new Student(
                "SV001",
                "Đoàn Hoàng Long",
                20,
                -1F,
                3,
                "cntt"
        );
        Exception exception = assertThrows(IllegalArgumentException.class, () ->studentService.updateStudent(student));

        assertEquals("điểm tb phải từ 0 tới 10",exception.getMessage());
    }

    //điểm lớn hon 10
    @Test
    void testUpdateScoreGreaterThan10(){
        //stub dữ liệu
        student =new Student(
                "SV001",
                "Đoàn Hoàng Long",
                20,
                11F,
                3,
                "cntt"
        );
        Exception exception = assertThrows(IllegalArgumentException.class, () ->studentService.updateStudent(student));
        assertEquals("điểm tb phải từ 0 tới 10",exception.getMessage());
    }

    //điểm = 0
    @Test
    void testUpdateScoreEqual0(){
        //stub dữ liệu
        student =new Student(
                "SV001",
                "Đoàn Hoàng Long",
                20,
                0F,
                3,
                "cntt"
        );
        studentService.updateStudent(student);
        assertEquals(0F,studentService.getStudent().getScore());
    }

    //điểm = 10
    @Test
    void testUpdateScoreEqual10(){
        //stub dữ liệu
        student =new Student(
                "SV001",
                "Đoàn Hoàng Long",
                20,
                10F,
                3,
                "cntt"
        );
        studentService.updateStudent(student);
        assertEquals(10F,studentService.getStudent().getScore());
    }
}
