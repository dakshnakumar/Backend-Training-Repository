package lab4.Qn6;


import java.util.AbstractList;
import java.util.ArrayList;


interface StorageLayer{

    public abstract void addEmployee(Employee e);
    Employee getEmployee(int empNo);
}
public class Storage implements StorageLayer {


    AbstractList<Employee> employeesList = new ArrayList<>();

    @Override
    public void addEmployee(Employee e){
        employeesList.add(e);
        System.out.println("Employee added successfully");
    }

    @Override
    public Employee getEmployee(int empNo){
        for (Employee e:employeesList){
            if (e.empNo == empNo){
                return e;
            }
        }

        return null;
    }

}

