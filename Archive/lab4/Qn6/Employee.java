package lab4.Qn6;

import java.util.Scanner;

public class Employee {

    public int empNo;
    public String fName;
    public String lName;
    public String city;
    public String salary;
    public int getEmp;
    public int num;

    Storage storage = new Storage();

    Scanner input = new Scanner(System.in);

    Employee(){

    }

    Employee(int empNo, String fName , String lName, String city , String salary){
        this.empNo = empNo;
        this.fName = fName;
        this.lName = lName;
        this.city = city;
        this.salary = salary;
    }
    public void acceptEmpDetailsAndStore(){

        while(true) {
            System.out.println("1.Add Employee ");
            System.out.println("2.Get Employee Details");

            num = input.nextInt();

            if (num==1){
                System.out.println("Enter the Employee ID");
                empNo = input.nextInt();
                input.nextLine();

                System.out.println("Enter the employee First name");
                fName = input.nextLine();

                System.out.println("Enter the employee Last name");
                lName = input.nextLine();

                System.out.println("Enter the employee city");
                city = input.nextLine();

                System.out.println("Enter the employee salary");
                salary = input.nextLine();

                Employee obj = new Employee(empNo,fName,lName,city,salary);
                storage.addEmployee(obj);

            } else if (num == 2) {
                System.out.println("Enter the empNo you want to get more details");
                getEmp = input.nextInt();
                Object result = storage.getEmployee(getEmp);

                System.out.println("Emp no "+ ((Employee)result).empNo);
                System.out.println("Emp no "+ ((Employee)result).fName);
                System.out.println("Emp no "+ ((Employee)result).lName);
                System.out.println("Emp no "+ ((Employee)result).city);
                System.out.println("Emp no "+ ((Employee)result).salary);
            }


        }

    }
}
