package sortingbycomparator;

import java.util.Comparator;

public class EmployeeSortSecondNameReversed implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSecondName().compareTo(o1.getSecondName());
    }

}
