package android.cvl.udsm.com.denti.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aronkondoro on 8/4/14.
 */
public class SubjectResult implements Parcelable {

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.subject);
        dest.writeString(this.grade);
    }

    private SubjectResult(Parcel in) {
        this.subject = in.readString();
        this.grade = in.readString();
    }

    public static final Parcelable.Creator<SubjectResult> CREATOR = new Parcelable.Creator<SubjectResult>() {
        public SubjectResult createFromParcel(Parcel source) {
            return new SubjectResult(source);
        }

        public SubjectResult[] newArray(int size) {
            return new SubjectResult[size];
        }
    };
}
