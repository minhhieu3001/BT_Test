import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

    public static String checkStudentGraduated(int credits, double gpa, double ielts) {
        if(credits < 0 ) {
            return "Đầu vào không hợp lệ";
        }
        if(gpa < 0.0 || gpa > 4.0) {
            return "Đầu vào không hợp lệ";
        }
        if(ielts < 0.0 || ielts > 9.0) {
            return "Đầu vào không hợp lệ";
        }
        if(credits < 154) {
            return "Sinh viên không thể tốt nghiệp";
        }
        if(gpa < 2.5) {
            return "Sinh viên không thể tốt nghiệp";
        }
        if(ielts < 5.5) {
            return "Sinh viên không thể tốt nghiệp";
        }
        return "Sinh viên đạt yêu cầu tốt nghiệp";
    }


}