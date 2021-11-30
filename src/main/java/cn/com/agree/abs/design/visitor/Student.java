package cn.com.agree.abs.design.visitor;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:57
 */
public class Student implements School {
    @Override
    public void accept(LeaderVisitorGroup leaderVisitor) {
        leaderVisitor.visitor(this);
    }
}
