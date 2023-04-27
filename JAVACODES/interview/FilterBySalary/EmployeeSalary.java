package interview.FilterBySalary;

public class EmployeeSalary {
	 
    private String name;
    private String account;
    private Integer salary;
 
    public EmployeeSalary(String name,Integer salary) {
        super();
        this.name = name;
        this.salary = salary;
    }
 
    @Override
    public String toString() {
 
        return "name: "+ this.name +" Salary: "+this.salary;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
 
    public Integer getSalary() {
        return salary;
    }
 
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}