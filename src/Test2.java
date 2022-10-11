import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test2 {
    @Test
    public void test1() {
        int credits = -1;
        double gpa = -1;
        double ielts = -1;
        assertEquals("Đầu vào không hợp lệ", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test2() {
        int credits = 100;
        double gpa = 2;
        double ielts = 3;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }@Test
    public void test3() {
        int credits = 154;
        double gpa = 2.8;
        double ielts = 6;
        assertEquals("Sinh viên đạt yêu cầu tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test4() {
        int credits = 161;
        double gpa = 4.1;
        double ielts = 9.5;
        assertEquals("Đầu vào không hợp lệ", Main.checkStudentGraduated(credits, gpa, ielts));
    }

}
