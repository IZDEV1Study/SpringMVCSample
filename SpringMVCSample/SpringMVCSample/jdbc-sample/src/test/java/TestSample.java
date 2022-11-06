import org.example.Department;
import org.example.DepartmentDAO;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.logging.Logger;

public class TestSample {
    public static Logger log = Logger.getLogger("DepartmentMain");

    @Test
    public void testConnet() {
        DepartmentDAO dao = new DepartmentDAO();
        List<Department> list = dao.selectList();

        print(list);
    }

    void print(List<Department> list) {
        for (Department department : list) {
            log.info(department.toString());
        }
    }
}
