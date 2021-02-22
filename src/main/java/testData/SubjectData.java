package testData;

import java.util.ArrayList;
import java.util.List;

public class SubjectData {

    public static List<String> getSubjectData() {
        String subject1 = "test subject";
        String subject2 = "SPEC_CHARS!@#$%^&*()_+?><";
        String subject3 = "453587\tArthur E. Powell\t989-00-2795\t86867\tIsrael\t9/10/1966";
        List<String> subjectList = new ArrayList<>();
        subjectList.add(subject1);
        subjectList.add(subject2);
        subjectList.add(subject3);
        return subjectList;
    }
}
