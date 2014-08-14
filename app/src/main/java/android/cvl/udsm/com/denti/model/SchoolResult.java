package android.cvl.udsm.com.denti.model;

/**
 * Created by aronkondoro on 8/13/14.
 */
public class SchoolResult {

    private int candidatesCount;
    private String passRate;
    private String rank;
    private int div1Count;
    private int div2Count;
    private int div3Count;
    private int div4Count;
    private int div0Count;

    public SchoolResult(int candidatesCount, String passRate, String rank, int div1Count, int div2Count, int div3Count, int div4Count, int div0Count) {
        this.candidatesCount = candidatesCount;
        this.passRate = passRate;
        this.rank = rank;
        this.div1Count = div1Count;
        this.div2Count = div2Count;
        this.div3Count = div3Count;
        this.div4Count = div4Count;
        this.div0Count = div0Count;
    }

    public int getCandidatesCount() {
        return candidatesCount;
    }

    public void setCandidatesCount(int candidatesCount) {
        this.candidatesCount = candidatesCount;
    }

    public String getPassRate() {
        return passRate;
    }

    public void setPassRate(String passRate) {
        this.passRate = passRate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getDiv1Count() {
        return div1Count;
    }

    public void setDiv1Count(int div1Count) {
        this.div1Count = div1Count;
    }

    public int getDiv2Count() {
        return div2Count;
    }

    public void setDiv2Count(int div2Count) {
        this.div2Count = div2Count;
    }

    public int getDiv3Count() {
        return div3Count;
    }

    public void setDiv3Count(int div3Count) {
        this.div3Count = div3Count;
    }

    public int getDiv4Count() {
        return div4Count;
    }

    public void setDiv4Count(int div4Count) {
        this.div4Count = div4Count;
    }

    public int getDiv0Count() {
        return div0Count;
    }

    public void setDiv0Count(int div0Count) {
        this.div0Count = div0Count;
    }
}
