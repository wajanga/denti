package android.cvl.udsm.com.denti.model;

import java.util.List;

/**
 * Created by aronkondoro on 8/4/14.
 */
public class NectaResult {

    String studentNumber;
    List<SubjectResult> results;
    String division;
    String points;

    public NectaResult(String studentNumber, List<SubjectResult> results, String division, String points) {
        this.studentNumber = studentNumber;
        this.results = results;
        this.division = division;
        this.points = points;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public List<SubjectResult> getResults() {
        return results;
    }

    public void setResults(List<SubjectResult> results) {
        this.results = results;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
