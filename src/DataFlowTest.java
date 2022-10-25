import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataFlowTest {

    @Test
    public void test1() {
        int credits = 20;
        double gpa = 4.3;
        double ielts = 6.0;
        assertEquals("Đầu vào không hợp lệ", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test2() {
        int credits = 20;
        double gpa = 3.2;
        double ielts = 9.2;
        assertEquals("Đầu vào không hợp lệ", Main.checkStudentGraduated(credits, gpa, ielts));
    }

    @Test
    public void test3() {
        int credits = 155;
        double gpa = 3.2;
        double ielts = 6.5;
        assertEquals("Sinh viên đạt yêu cầu tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
}
