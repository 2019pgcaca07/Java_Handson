import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

abstract class Employee{
    String name,skillSet;
    int id,salary,experience;
    public abstract int getId();
    public abstract int getExperience();
    public abstract String getSkillSet();
    public abstract String toString();
}
class oldEmployees extends Employee{
    public oldEmployees(String name, String skillSet, int id, int salary, int experience) {
        this.name = name;
        this.skillSet = skillSet;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "oldEmployees{" +
                "name='" + name + '\'' +
                ", skillSet='" + skillSet + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getExperience() {
        return this.experience;
    }

    @Override
    public String getSkillSet() {
        return this.skillSet;
    }
}
class newEmployees extends Employee{
    public newEmployees(String name, String skillSet, int id, int salary, int experience) {
        this.name = name;
        this.skillSet = skillSet;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "newEmployees{" +
                "name='" + name + '\'' +
                ", skillSet='" + skillSet + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getExperience() {
        return this.experience;
    }

    @Override
    public String getSkillSet() {
        return this.skillSet;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<Employee>();

        Employee []nbj = new newEmployees[6];
         nbj[0] = new newEmployees("K","A",101,1500,2);
         nbj[1] = new newEmployees("L","B",102,1500,2);
         nbj[2] = new newEmployees("M","C",103,1500,2);
         nbj[3] = new newEmployees("N","D",104,1500,2);
         nbj[4] = new newEmployees("O","E",105,1500,2);
         nbj[5] = new newEmployees("P","F",106,1500,2);

        Employee []obj = new oldEmployees[6];

         obj[0] = new oldEmployees("K","A",101,4500,5);
         obj[1] = new oldEmployees("L","B",102,4500,5);
         obj[2] = new oldEmployees("M","Java",103,4500,5);
         obj[3] = new oldEmployees("N","D",104,4500,5);
         obj[4] = new oldEmployees("O","E",105,4500,5);
         obj[5] = new oldEmployees("P","F",106,4500,5);

        for (int i = 0; i < 5; i++) {
            employeeSet.add(nbj[i]);
            employeeSet.add(obj[i]);
        }

        System.out.println("Total number of employees : "+employeeSet.size());
//      Checking employee with id 106 exist or not
        for(Employee e : employeeSet){
            if(e.getId() == 106)
                System.out.println("Employee with id 106 exists");
        }

//      Removing the employee who have less than 4 years of experience
        employeeSet.removeIf(e -> e.getExperience() < 4);

        System.out.println("Set size : "+employeeSet.size());

//      Employees having skill set Java
        for (Employee e: employeeSet) {
            if(e.getSkillSet().toLowerCase().contains("Java".toLowerCase(Locale.ROOT)))
                System.out.println(e);
        }
    }
}
