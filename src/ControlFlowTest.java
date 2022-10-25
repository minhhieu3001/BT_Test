import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControlFlowTest {
    @Test
    public void test1() {
        int credits = -2;
        double gpa = 2.0;
        double ielts = 4.0;
        assertEquals("Đầu vào không hợp lệ", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test2() {
        int credits = 100;
        double gpa = 4.1;
        double ielts = 5.0;
        assertEquals("Đầu vào không hợp lệ", Main.checkStudentGraduated(credits, gpa, ielts));
    }@Test
    public void test3() {
        int credits = 100;
        double gpa = 3.0;
        double ielts = 9.1;
        assertEquals("Đầu vào không hợp lệ", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test4() {
        int credits = 120;
        double gpa = 3.0;
        double ielts = 6.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test5() {
        int credits = 155;
        double gpa = 2.4;
        double ielts = 6.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test6() {
        int credits = 155;
        double gpa = 2.6;
        double ielts = 5.0;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test7() {
        int credits = 155;
        double gpa = 2.6;
        double ielts = 6.6;
        assertEquals("Sinh viên đạt yêu cầu tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
}
