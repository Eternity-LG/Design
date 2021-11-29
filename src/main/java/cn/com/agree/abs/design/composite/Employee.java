package cn.com.agree.abs.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-29 14:08
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subOrdinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subOrdinates = new ArrayList<>();
    }

    public List<Employee> getSubordinates(){
        return subOrdinates;
    }

    public void add(Employee employee){
        subOrdinates.add(employee);
    }

    public void remove(Employee employee){
        subOrdinates.remove(employee);
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
