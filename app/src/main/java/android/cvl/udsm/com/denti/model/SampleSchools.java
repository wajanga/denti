package android.cvl.udsm.com.denti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aronkondoro on 8/7/14.
 */
public class SampleSchools {

    public static List<School> SCHOOLS = new ArrayList<School>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, School> SCHOOL_MAP = new HashMap<String, School>();

    static {
        // Add 3 sample items.
        addItem(new School("S0106", "Kantalamba Secondary School", new SchoolResult(100, "100%", "1", 20, 20, 20, 40, 0)));
        addItem(new School("S1234", "Azania Secondary School", new SchoolResult(200, "80%", "2", 10, 10, 40, 70, 70)));
        addItem(new School("S0775", "Marian Girls Secondary School", new SchoolResult(150, "70%", "3", 8, 2, 90, 25, 25)));
    }

    private static void addItem(School school) {
        SCHOOLS.add(school);
        SCHOOL_MAP.put(school.getSchoolNumber(), school);
    }
}
