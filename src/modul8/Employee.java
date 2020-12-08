package modul8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = getListOfEmps();
        System.out.println("---- Show All Data in List ----");
        Stream.of(getListOfEmps()).forEach(System.out::println);
        System.out.println();

        System.out.println("---- method filter() ----");
        System.out.println(" Filter data: salary > 150000");
        getListOfEmps()
                .stream()
                .filter(p -> p.salary > 150000)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("---- method map() ----");
        listOfEmployee
                .stream()
                .filter(p -> p.salary > 150000)
                .map(p -> p.nama.toUpperCase())
                .forEach(System.out::println);

        System.out.println("---- method sort() ----");
        listOfEmployee
                .stream()
                .map(p -> p.salary > 150000)
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("---- method limit() ----");
        listOfEmployee
                .stream()
                .filter(p -> p.salary > 150000)
                .map(p -> p.nama.toUpperCase())
                .sorted()
                .limit(5)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("---- method distinct() ----");
        listOfEmployee
                .stream()
                .map(p -> p.salary)
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("---- method reduce() ----");
        Double salaryAdd = listOfEmployee
                .stream()
                .map(p -> p.salary)
                .reduce(0.0, (x,p) -> {
                    return x + p;
                });
        System.out.println("[ Total Salary Employee: "+ salaryAdd +" ]");
        System.out.println();

        System.out.println("---- method peek() ----");
        listOfEmployee
                .stream()
                .filter(p -> p.salary > 150000)
                .peek(e -> System.out.println("Filter Data: "+e))
                .map(p -> p.nama.toUpperCase())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("---- method collect() ----");
        System.out.println(
                listOfEmployee
                    .stream()
                    .map(p -> p.salary)
                    .collect(Collectors.partitioningBy(p -> p > 200000)));
        System.out.println("Maximum Salary : "+listOfEmployee
                                                .stream()
                                                .map(p -> p.salary)
                                                .collect(Collectors.maxBy(Double::compare)));
        System.out.println();

        System.out.println("---- method max() ----");
        System.out.println(
                listOfEmployee
                    .stream()
                    .map(p -> p.nama)
                    .max(String::compareTo).get()
        );
        System.out.println();

        System.out.println("---- method min() ----");
        System.out.println(
                listOfEmployee
                    .stream()
                    .map(p -> p.nama)
                    .min(String::compareTo).get()
        );
        System.out.println();

        System.out.println("---- method count() ----");
        System.out.println("Sum of employee : "+
                listOfEmployee
                    .stream()
                    .map(p -> p.nama)
                    .count()
        );
        System.out.println();

        System.out.println("---- method allMatch() ----");
        System.out.println(
                listOfEmployee
                        .stream()
                        .map(p -> p.age)
                        .allMatch(p -> p < 35)
        );
        System.out.println();

        System.out.println("---- method anyMatch() ----");
        System.out.println(
                listOfEmployee
                    .stream()
                    .map(p -> p.age)
                    .anyMatch(p -> p < 35)
        );
        System.out.println();

        System.out.println("---- method noneMatch() ----");
        System.out.println(
                listOfEmployee
                    .stream()
                    .map(p -> p.age)
                    .noneMatch(p -> p < 35)
        );
        System.out.println();

        System.out.println("---- method findfirst() ----");
        Optional<String> findNameM = listOfEmployee
                                        .stream()
                                        .map(p -> p.nama)
                                        .filter(p -> p.startsWith("B"))
                                        .findFirst();
        System.out.println(findNameM);
        System.out.println();

        System.out.println("---- method iterate ----");
        Stream.iterate(1, a -> a + 1)
                .filter(x -> x%2 != 0)
                .limit(10)
                .forEach(System.out::println);
        System.out.println();
    }

    private int no;
    private String nama;
    private double salary;
    private int age;

    Employee(int no, String nama, double salary, int age){
        this.no = no;
        this.nama = nama;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return "[ No: "+ no +", Nama: "+ nama +", Salary: "+ salary +", Age: "+ age +"] ";
    }

    public static List<Employee> getListOfEmps() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Jeff",151000,55));
        employees.add(new Employee(2,"George",13200,22));
        employees.add(new Employee(3,"Bill",827500,71));
        employees.add(new Employee(4,"Do-san",615000,61));
        employees.add(new Employee(5,"In-jae",125000,55));
        employees.add(new Employee(6,"Dal-mi",532000,25));
        employees.add(new Employee(7,"Chul-in",121000,43));
        employees.add(new Employee(8,"Ji-pyeon",712000,51));
        employees.add(new Employee(9,"Chriss",213000,33));
        employees.add(new Employee(10,"Tara",417500,36));
        employees.add(new Employee(11,"Gema",27500,38));
        return employees;
    }

}
