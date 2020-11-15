package modul5;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class People {

    public static void main(String[] args) {
        List<People> arrayPeople = getPeoples();

        System.out.println("-----  Using Interface Comparator and sort collections -----");
        Comparator<People> comparatorPeople = Comparator.comparing(People :: getOccupation);
        Collections.sort(arrayPeople, comparatorPeople);
        arrayPeople.forEach(System.out::println);
        System.out.println();

        System.out.println("----- Using max in comparator for filtering data -----");
        People maxAge = Collections.max(arrayPeople, comparatorPeople);
        System.out.println(maxAge);
        System.out.println();

        System.out.println("----- Using min in comparator for filtering data -----");
        People minAge = Collections.min(arrayPeople, comparatorPeople);
        System.out.println(minAge);
        System.out.println();

        System.out.println("----- Using Interface Function -----");
        List<String> peopleByOccuption = printOccuptionByFunction(arrayPeople, (e) -> e.getOccupation()+" - "+e.getName());
        peopleByOccuption.forEach(System.out::println);
        System.out.println();

        System.out.println("----- Using Predicate With Condition Age > 30 -----");
        arrayPeople.stream()
                    .filter(ageFilter)
                    .forEach((people) -> System.out.println(people));
        System.out.println();

        System.out.println("----- Using Predicate With Condition salary < 1000000 -----");
        arrayPeople.stream()
                    .filter(salaryFilter)
                    .forEach((people) -> System.out.println(people));
        System.out.println();

        System.out.println("----| Using Consumer with calculate up salary 5% |----");
        printPeopleByConsumer(arrayPeople, giveRaiseSalary);
        System.out.println("----| Using Consumer with calculate up salary 5% |----");
        System.out.println();

        System.out.println("----- Using Supplier -----");
        Supplier<People> peopleSupplier = () -> new People("David Swan", 25, "Programmer", 61200000);
        People p = (People) peopleSupplier.get();
        arrayPeople.add(p);
        arrayPeople.forEach(System.out::println);
        System.out.println();

        System.out.println("----- Using Binary Opperator -----");
        Optional<People> binaryPeopleByAge = arrayPeople.stream().collect(Collectors.reducing(BinaryOperator.maxBy(comparatorPeople)));
        System.out.println(binaryPeopleByAge);
        System.out.println();

        System.out.println("----- Using Unary Opperator -----");
        printUpSalaryByUnary(unaryPeopleSalary, arrayPeople).forEach(System.out::println);
        System.out.println();
    }

    private String name;
    private int age;
    private String occupation;
    private long salary;

    public People(String name, int age, String occupation, long salary){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getOccupation() {
        return occupation;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }
    public String toString(){
        return name+" "+age+" "+occupation+" "+salary;
    }
    public static List<People> getPeoples(){
        List<People> people = new ArrayList<>();
        people.add(new People("Smith William", 36, "Head Programmer", 23000000));
        people.add(new People("Allan Goldfum", 41, "Head IT Division", 251000000));
        people.add(new People("Julia Rimal", 51, "Senior Engineer", 51000000));
        people.add(new People("John Mecanism", 25, "Developer", 22000000));
        people.add(new People("Butt Torriel", 44, "HR", 120000000));

        return people;
    }

    // FUNCTION INTERFACE
    public static List<String> printOccuptionByFunction (List<People> arr, Function<People, String> function){
        List <String> result = new ArrayList<>();
        for (People t : arr){
            result.add(function.apply(t));
        }
        return result;
    }

    // PREDICATE INTERFACE
    public static Predicate<People> ageFilter = (p) -> (p.getAge() > 30);
    public static Predicate<People> salaryFilter = (p) -> (p.getSalary() > 100000);


    // CONSUMER INTERFACE
    public static Consumer<People> giveRaiseSalary = p -> {
        p.setSalary(p.getSalary() * 5/100 + p.getSalary());
    };

    public static void printPeopleByConsumer(List<People> arrPeople, Consumer<People> conPeople){
        System.out.println("---- Data Before Update Salary 5% ----");
        arrPeople.forEach(System.out::println);
        System.out.println("---- Data After Update Salary 5% ----");
        for (People peo : arrPeople){
            conPeople.accept(peo);
            System.out.println(peo);
        }
        System.out.println();
    }

    // SUPPLIER INTERFACE
    // Supplier<People> peopleSupplier = () -> new People("David Swan", 25, "Programmer", 61200000);
    // People p = (People) peopleSupplier.get();
    // arrayPeople.add(p);
    // arrayPeople.forEach(System.out::println)

    // BINARYOPERATOR INTERFACE
    // Optional<People> binaryPeopleByAge = arrayPeople.stream().collect(Collectors.reducing(BinaryOperator.maxBy(comparatorPeople)));
    // System.out.println(binaryPeopleByAge);

    // UNARY OPERATION INTERFACE
    public static UnaryOperator<People> unaryPeopleSalary = p -> {
        p.setSalary(p.getSalary() * 10/100 + p.getSalary());
        return p;
    };

    public static List<People> printUpSalaryByUnary(UnaryOperator<People> un, List<People> arr){
        List<People> listPeople = new ArrayList<>();
        arr.forEach( a -> listPeople.add(un.apply(a)));
        return listPeople;
    };
}
