package android.cvl.udsm.com.denti.model;

/**
 * Created by aronkondoro on 8/4/14.
 */
public class SubjectResult {

    String subject;
    String grade;

    public SubjectResult(String subject, String grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
