package cn.com.agree.abs.design.visitor;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:55
 */
public interface School {
    void accept(LeaderVisitorGroup leaderVisitor);
}
