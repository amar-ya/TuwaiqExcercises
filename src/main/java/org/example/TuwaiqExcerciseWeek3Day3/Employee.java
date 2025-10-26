package org.example.TuwaiqExcerciseWeek3Day3;

public class Employee
{
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raisedSalary(int percentage){
        System.out.println("Congrats Mr."+name+" you received a "+percentage+"% raise which equals "+((salary * percentage / 100))+ "RS to your salary");
        return salary + (salary * percentage / 100);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name=" + name +
                ", monthlySalary=" + salary +
                ", annualSalary=" + getAnnualSalary() +
                "]";
    }
}
