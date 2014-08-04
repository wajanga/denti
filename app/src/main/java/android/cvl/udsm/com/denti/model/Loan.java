package android.cvl.udsm.com.denti.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aronkondoro on 8/1/14.
 */
public class Loan implements Parcelable {

    public static int PENDING = 0;
    public static int REJECTED = 1;
    public static int SUCCESSFUL = 2;
    public static int NONE = 3;

    private int status;
    private String studentName;
    private String grade;
    private float amount;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.status);
        dest.writeString(this.studentName);
        dest.writeString(this.grade);
        dest.writeFloat(this.amount);
    }

    public Loan() {
    }

    private Loan(Parcel in) {
        this.status = in.readInt();
        this.studentName = in.readString();
        this.grade = in.readString();
        this.amount = in.readFloat();
    }

    public static final Parcelable.Creator<Loan> CREATOR = new Parcelable.Creator<Loan>() {
        public Loan createFromParcel(Parcel source) {
            return new Loan(source);
        }

        public Loan[] newArray(int size) {
            return new Loan[size];
        }
    };
}
