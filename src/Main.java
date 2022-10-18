import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

    public static String checkStudentGraduated(int credits, double gpa, double ielts) {
        if(credits < 0 ) {                                                      //1
            return "Đầu vào không hợp lệ";                                      //2
        }
        if(gpa < 0.0 || gpa > 4.0) {                                            //3
            return "Đầu vào không hợp lệ";                                      //4
        }
        if(ielts < 0.0 || ielts > 9.0) {                                        //5
            return "Đầu vào không hợp lệ";                                      //6
        }
        if(credits < 154) {                                                     //7
            return "Sinh viên không thể tốt nghiệp";                            //8
        }
        if(gpa < 2.5) {                                                         //9
            return "Sinh viên không thể tốt nghiệp";                            //10
        }
        if(ielts < 5.5) {                                                       //11
            return "Sinh viên không thể tốt nghiệp";                            //12
        }
        return "Sinh viên đạt yêu cầu tốt nghiệp";                              //13
    }


}