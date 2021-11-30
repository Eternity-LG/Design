package cn.com.agree.abs.design.visitor;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:59
 */
public class LeaderVisitorGroup implements LeaderVisitor {
    @Override
    public void visitor(Header header) {
        System.out.println("this is a header");
    }

    @Override
    public void visitor(Teacher teacher) {
        System.out.println("this is a teacher");
    }

    @Override
    public void visitor(Student student) {
        System.out.println("this is a student");
    }
}
