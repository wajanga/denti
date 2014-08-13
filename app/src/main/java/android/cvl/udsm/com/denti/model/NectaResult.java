package android.cvl.udsm.com.denti.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aronkondoro on 8/4/14.
 */
public class NectaResult implements Parcelable {

    String studentNumber;
    String studentName;
    List<SubjectResult> results;
    String division;
    String points;

    public NectaResult(String studentNumber, String studentName, List<SubjectResult> results, String division, String points) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.results = results;
        this.division = division;
        this.points = points;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.studentNumber);
        dest.writeString(this.studentName);
        dest.writeList(this.results);
        dest.writeString(this.division);
        dest.writeString(this.points);
    }

    private NectaResult(Parcel in) {
        this.studentNumber = in.readString();
        this.studentName = in.readString();
        this.results = new ArrayList<SubjectResult>();
        this.results = in.readArrayList(SubjectResult.class.getClassLoader());
        this.division = in.readString();
        this.points = in.readString();
    }

    public static final Parcelable.Creator<NectaResult> CREATOR = new Parcelable.Creator<NectaResult>() {
        public NectaResult createFromParcel(Parcel source) {
            return new NectaResult(source);
        }

        public NectaResult[] newArray(int size) {
            return new NectaResult[size];
        }
    };
}
