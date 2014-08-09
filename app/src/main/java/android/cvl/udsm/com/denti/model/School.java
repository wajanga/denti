package android.cvl.udsm.com.denti.model;

/**
 * Created by aronkondoro on 8/7/14.
 */
public class School {

    private String schoolNumber;
    private String schoolName;
    private int rank;
    private String passRate;
    private int totalStudent;
    private int divOneCount;
    private int divTwoCount;
    private int divThreeCount;
    private int divFourCount;
    private int divZeroCount;

    public School() {}

    public School(String schoolNumber, String schoolName, int rank, String passRate, int totalStudent, int divOneCount, int divTwoCount, int divThreeCount, int divFourCount, int divZeroCount) {
        this.schoolNumber = schoolNumber;
        this.schoolName = schoolName;
        this.rank = rank;
        this.passRate = passRate;
        this.totalStudent = totalStudent;
        this.divOneCount = divOneCount;
        this.divTwoCount = divTwoCount;
        this.divThreeCount = divThreeCount;
        this.divFourCount = divFourCount;
        this.divZeroCount = divZeroCount;
    }

    public String getPassRate() {
        return passRate;
    }

    public void setPassRate(String passRate) {
        this.passRate = passRate;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    public int getDivOneCount() {
        return divOneCount;
    }

    public void setDivOneCount(int divOneCount) {
        this.divOneCount = divOneCount;
    }

    public int getDivTwoCount() {
        return divTwoCount;
    }

    public void setDivTwoCount(int divTwoCount) {
        this.divTwoCount = divTwoCount;
    }

    public int getDivThreeCount() {
        return divThreeCount;
    }

    public void setDivThreeCount(int divThreeCount) {
        this.divThreeCount = divThreeCount;
    }

    public int getDivFourCount() {
        return divFourCount;
    }

    public void setDivFourCount(int divFourCount) {
        this.divFourCount = divFourCount;
    }

    public int getDivZeroCount() {
        return divZeroCount;
    }

    public void setDivZeroCount(int divZeroCount) {
        this.divZeroCount = divZeroCount;
    }
}
