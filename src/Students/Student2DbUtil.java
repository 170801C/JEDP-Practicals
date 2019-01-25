package Students;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@ManagedBean
public class Student2DbUtil {
    private List<Student2> students2;

    // Constructor
    public Student2DbUtil() {
        loadSampleData();
    }

    // Methods
    public void loadSampleData() {
        students2 = new ArrayList<>();


        students2.add(new Student2("Mary", "Public", "mary@gmail.com"));
        students2.add(new Student2("John", "Doe", "john@gmail.com"));
        students2.add(new Student2("Tom", "Dickson", "tom@gmail.com"));
    }

    // Get all students2 objects in list
    public List<Student2> getStudents2() {
        return students2;
    }
}

