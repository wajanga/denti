package android.cvl.udsm.com.denti.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aronkondoro on 8/4/14.
 */
public class SampleData {

    private static SubjectResult[] subResults1 = {new SubjectResult("CIVICS", "A"), new SubjectResult("CIVICS", "A"),
            new SubjectResult("KISWAHILI", "A"), new SubjectResult("ENGLISH", "A"),
            new SubjectResult("BASIC MATH", "A"), new SubjectResult("PHYSICS", "A"),
            new SubjectResult("CHEMISTRY", "A"), new SubjectResult("BIOLOGY", "A"),
            new SubjectResult("COMMERCE", "A"), new SubjectResult("BOOK-KEEPING", "A")};
    private static NectaResult result1 = new NectaResult("1", "Aron Kondoro", Arrays.asList(subResults1), "I", "7");

    private static SubjectResult[] subResults2 = {new SubjectResult("CIVICS", "F"), new SubjectResult("CIVICS", "F"),
            new SubjectResult("KISWAHILI", "F"), new SubjectResult("ENGLISH", "C"),
            new SubjectResult("BASIC MATH", "F"), new SubjectResult("PHYSICS", "F"),
            new SubjectResult("CHEMISTRY", "F"), new SubjectResult("BIOLOGY", "F"),
            new SubjectResult("COMMERCE", "F"), new SubjectResult("BOOK-KEEPING", "F")};
    private static NectaResult result2 = new NectaResult("2", "Oscar Mashauri", Arrays.asList(subResults2), "0", "40");

    private static SubjectResult[] subResults3 = {new SubjectResult("CIVICS", "C"), new SubjectResult("CIVICS", "C"),
            new SubjectResult("KISWAHILI", "C"), new SubjectResult("ENGLISH", "C"),
            new SubjectResult("BASIC MATH", "C"), new SubjectResult("PHYSICS", "C"),
            new SubjectResult("CHEMISTRY", "C"), new SubjectResult("BIOLOGY", "C"),
            new SubjectResult("COMMERCE", "C"), new SubjectResult("BOOK-KEEPING", "C")};
    private static NectaResult result3 = new NectaResult("3", "David Luiz", Arrays.asList(subResults3), "III", "30");

    private static Map<String, NectaResult> results = new HashMap<String, NectaResult>();

    private static void populateResults() {
        results.put("1", result1);
        results.put("2", result2);
        results.put("3", result3);
    }

    public static NectaResult getResult(String studentNumber) {
        populateResults();
        return results.get(studentNumber);
    }


}
