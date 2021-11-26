package cn.com.agree.abs.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 14:13
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> person) {
        List<Person> female = new ArrayList<>();
        for (Person one : person) {
            if (one.getGender().equalsIgnoreCase("FEMALE")){
                female.add(one);
            }
        }
        return female;
    }
}
