package cn.com.agree.abs.design.visitor;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 17:56
 */
public class Header implements School {
    School[] parts;

    public Header(){
        parts = new School[] {new Teacher(), new Student()};
    }


    @Override
    public void accept(LeaderVisitorGroup leaderVisitorGroup) {
        for (School part : parts) {
            part.accept(leaderVisitorGroup);
        }
            leaderVisitorGroup.visitor(this);
    }
}
