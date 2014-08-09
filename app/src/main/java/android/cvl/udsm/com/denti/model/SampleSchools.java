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
        addItem(new School("1", "Kantalamba Secondary School", 1, "100%", 100, 20, 20, 20, 40, 0));
        addItem(new School("2", "Azania Secondary School", 2, "80%", 200, 10, 10, 40, 70, 70));
        addItem(new School("3", "Marian Girls Secondary School", 3, "70%", 150, 8, 2, 90, 25, 25));
    }

    private static void addItem(School school) {
        SCHOOLS.add(school);
        SCHOOL_MAP.put(school.getSchoolNumber(), school);
    }
}
