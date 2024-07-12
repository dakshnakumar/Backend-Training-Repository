package lab2.qn1;


public class Employee extends WithZoom{

    private int empId;

    Employee(){

    }

    Employee(int id){
        this.empId = id;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }
}


