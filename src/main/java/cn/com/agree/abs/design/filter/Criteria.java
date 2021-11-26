package cn.com.agree.abs.design.filter;

import java.util.List;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 14:06
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> person);
}
