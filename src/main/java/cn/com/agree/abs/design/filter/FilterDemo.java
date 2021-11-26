package cn.com.agree.abs.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 14:05
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("1号", "female", "double"));
        list.add(new Person("2号", "male", "single"));
        list.add(new Person("3号", "female", "single"));
        list.add(new Person("4号", "male", "single"));
        list.add(new Person("5号", "female", "double"));

        CriteriaMale criteriaMale = new CriteriaMale();
        CriteriaFemale criteriaFemale = new CriteriaFemale();
        CriteriaSingle criteriaSingle = new CriteriaSingle();
        AndCriteria andCriteria = new AndCriteria(criteriaMale, criteriaSingle);
        OrCriteria orCriteria = new OrCriteria(criteriaFemale, criteriaMale);

        printPersons(criteriaMale.meetCriteria(list));
        System.out.println("-------------------------------");
        printPersons(criteriaFemale.meetCriteria(list));
        System.out.println("-------------------------------");
        printPersons(criteriaSingle.meetCriteria(list));
        System.out.println("-------------------------------");
        printPersons(andCriteria.meetCriteria(list));
        System.out.println("-------------------------------");
        printPersons(orCriteria.meetCriteria(list));





    }
    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }

}
