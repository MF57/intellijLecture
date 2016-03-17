import com.intellij.lecture.exam.Exam;
import com.intellij.lecture.student.Student;
import com.intellij.lecture.student.StudentBuilder;

/**
 * Created by mf57 on 13.03.2016.
 */
public class Main {

    public static final int IQ = 100;
    public static final int TIME = 100;

    public static void main(String[] args) {

        Student student = null;
        if (args.length == 4) {
            student = new StudentBuilder()
                    .setName(args[0])
                    .setSurname(args[1])
                    .setIndexNumber(args[2])
                    .setMail(args[3])
                    .setIq(IQ)
                    .setTime(TIME)
                    .createStudent();
        }
        if (student != null) {
            System.out.println(student.toString());
            System.out.println("Exam result: " + student.writeExam(new Exam("WDI", 120, 120)));
        }
    }
}
