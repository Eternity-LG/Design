package cn.com.agree.abs.design.visitor;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:56
 */
public interface LeaderVisitor {
    void visitor(Header header);
    void visitor(Teacher teacher);
    void visitor(Student student);
}
