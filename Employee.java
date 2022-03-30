package com.CSCI185;

public class Employee extends Person {

    //variables
    private double salary;
    private int hireYear;
    private String id;

    //default constructor
    public Employee()
    {
        super();
        salary = 10000;
        hireYear = 2010;
        id = "No ID yet";
    }

    //parameterized constructor
    public Employee(String initialName, double newSalary, int newhireYear, String newId)
    {
        super(initialName);
        salary = newSalary;
        hireYear = newhireYear;
        id = newId;
    }

    //accessor and mutator
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public boolean equals(Object otherObject)
    {
        boolean isEqual = false;
        if((otherObject != null) &&
                (otherObject instanceof Employee))
        {
            Employee otherEmployee = (Employee) otherObject;
            isEqual = this.hasSameName(otherEmployee) &&
                    this.id.equalsIgnoreCase(otherEmployee.id) &&
                    this.salary == otherEmployee.salary &&
                    this.hireYear == otherEmployee.hireYear;
        }
        return isEqual;
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Salary: "+salary);
        System.out.println("Hire year: "+hireYear);
        System.out.println("ID: "+id);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Terry", 120000, 2026, "Terry1234");
        Employee e2 = new Employee("William", 150000, 2014, "William5678");
        e1.writeOutput();
        e2.writeOutput();

        if(e1.equals(e2))
        {
            System.out.println("The employees have the same information");
        }
        else
        {
            System.out.println("The employees have different information");
        }
    }
}
