import junit.framework.TestCase;
import com.hibernate.crud.CriteriaAPI;
import com.hibernate.crud.CrudClass;
import com.hibernate.crud.HQLClass;
import com.hibernate.crud.StudentAddress;
import com.hibernate.entities.Student;

public class Test extends TestCase {

    static void crudClass() {

        Student student = new Student();
        student.setName("updated Alamgir");

        CrudClass crud = new CrudClass();
        Student s2 = crud.updateStudent(student, 1);
        Student s = crud.ReadStudentById(1);
        crud.deleteStudent(1);

        System.out.println(s);
        System.out.println(s2);
    }

    static void hqlClass() {
        HQLClass hqlClass = new HQLClass();
        hqlClass.getStudentById(2);
        hqlClass.getAllStudentByName("Alamgir");
        hqlClass.updateStudentById(2, "HQL updated Name");
        hqlClass.deleteStudentById(2);
        hqlClass.getAllStudent();
        hqlClass.getAllStudentsPaginated(1, 5);

    }

    static void criteriaAPI() {
        CriteriaAPI cApi = new CriteriaAPI();
        cApi.getAllStudent();
        cApi.getStudentById(2);

    }

    public static void main(String[] args) {

        // Insert data both Student and Address Table
        StudentAddress sa = new StudentAddress();
        sa.Start();

        // crudClass();
        // hqlClass();
        criteriaAPI();

    }
}
