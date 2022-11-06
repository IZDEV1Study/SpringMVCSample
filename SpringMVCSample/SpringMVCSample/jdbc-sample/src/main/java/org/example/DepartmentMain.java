package org.example;

import java.util.List;
import java.util.logging.Logger;

public class DepartmentMain {

    public static Logger log = Logger.getLogger("DepartmentMain");

    public static void main(String[] args){
        DepartmentDAO dao = new DepartmentDAO();
        List<Department> list = dao.selectList();

        print(list);
    }

    private static void print(List<Department> list) {
        for (Department department : list){
            log.info(department.toString());
        }
    }

}
