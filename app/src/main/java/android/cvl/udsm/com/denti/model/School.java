package android.cvl.udsm.com.denti.model;

import java.util.Map;

/**
 * Created by aronkondoro on 8/7/14.
 */
public class School {

    private String schoolNumber;
    private String schoolName;
    private SchoolResult schoolResult;
    private Map<String, String> rankHistory;

    public School(String schoolNumber, String schoolName, SchoolResult schoolResult) {
        this.schoolNumber = schoolNumber;
        this.schoolName = schoolName;
        this.schoolResult = schoolResult;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public SchoolResult getSchoolResult() {
        return schoolResult;
    }

    public void setSchoolResult(SchoolResult schoolResult) {
        this.schoolResult = schoolResult;
    }
}
