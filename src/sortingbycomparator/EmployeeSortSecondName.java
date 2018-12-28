package sortingbycomparator;

import java.util.Comparator;

public class EmployeeSortSecondName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSecondName().compareTo(o2.getSecondName());
    }

}
