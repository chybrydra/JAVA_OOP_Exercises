package sortingbycomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", "Hawke", 56, 39.5));
        list.add(new Employee("Danny", "Dawney", 44, 41.0));
        list.add(new Employee("Linlin", "Kayleeh", 27, 43.5));
        list.add(new Employee("Jason", "Gyando", 17, 41.0));
        list.add(new Employee("Owen", "Heredoc", 21, 40.5));

        System.out.println("Name-sorting: ");
        Collections.sort(list);
        printList(list);

        System.out.println("2nd-name-sorting: ");
        Collections.sort(list, new EmployeeSortSecondName());
        printList(list);

        System.out.println("age-sorting: ");
        Collections.sort(list, new EmployeeSortAge());
        printList(list);

        System.out.println("shoe-sorting");
        Collections.sort(list, new EmployeeSortShoe());
        printList(list);

        System.out.println("age-sorting-reversed: ");
        Collections.sort(list, new EmployeeSortAgeReversed());
        printList(list);

        System.out.println("2nd-name-sorting-reversed: ");
        Collections.sort(list, new EmployeeSortSecondNameReversed());
        printList(list);
    }

    public static void printList(List<Employee> list) {
        System.out.printf("%-10s %-10s %-5s %-5s\n", "NAME", "2nd NAME", "AGE", "SHOE");
        for (Employee x : list) {
            System.out.printf("%-10s %-10s %-5d %-5.2f\n", x.getName(), x.getSecondName(), x.getAge(), x.getShoeSize());
        }
        System.out.println();
    }
}
