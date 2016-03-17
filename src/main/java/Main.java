import com.intellij.lecture.Exam;
import com.intellij.lecture.Student;

/**
 * Created by mf57 on 13.03.2016.
 */
public class Main {

    public static void main(String[] args) {

        Student student = null;
        if (args.length == 4) {
            student = new Student(args[0], args[1], args[2], args[3]);
        }
        if (student != null) {
            System.out.println(student.toString());
            System.out.println("Exam result: " + student.writeExam(new Exam("WDI", 120, 120)));
        }
    }
}
