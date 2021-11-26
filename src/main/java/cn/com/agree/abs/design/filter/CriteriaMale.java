package cn.com.agree.abs.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 14:10
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> person) {
        List<Person> male = new ArrayList<>();
        for (Person one : person) {
            if (one.getGender().equalsIgnoreCase("male")){
                male.add(one);
            }
        }
        return male;
    }
}
