import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_marginal_value {

    @Test
    public void test1() {
        int credits = 77;
        double gpa = 2.5;
        double ielts = 9.0;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test2() {
        int credits = 77;
        double gpa = 2.5;
        double ielts = 8.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test3() {
        int credits = 77;
        double gpa = 2.5;
        double ielts = 0.0;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test4() {
        int credits = 77;
        double gpa = 2.5;
        double ielts = 0.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test5() {
        int credits = 77;
        double gpa = 4.0;
        double ielts = 5.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test6() {
        int credits = 77;
        double gpa = 3.9;
        double ielts = 5.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test7() {
        int credits = 77;
        double gpa = 0.0;
        double ielts = 5.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test8() {
        int credits = 77;
        double gpa = 0.1;
        double ielts = 5.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test9() {
        int credits = 160;
        double gpa = 2.5;
        double ielts = 5.5;
        assertEquals("Sinh viên đạt yêu cầu tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test10() {
        int credits = 159;
        double gpa = 2.5;
        double ielts = 5.5;
        assertEquals("Sinh viên đạt yêu cầu tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test11() {
        int credits = 0;
        double gpa = 2.5;
        double ielts = 5.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test12() {
        int credits = 1;
        double gpa = 2.5;
        double ielts = 5.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
    @Test
    public void test13() {
        int credits = 77;
        double gpa = 2.5;
        double ielts = 5.5;
        assertEquals("Sinh viên không thể tốt nghiệp", Main.checkStudentGraduated(credits, gpa, ielts));
    }
}
