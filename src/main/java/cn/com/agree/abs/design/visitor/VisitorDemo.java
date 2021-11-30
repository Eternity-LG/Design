package cn.com.agree.abs.design.visitor;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 18:03
 */
public class VisitorDemo {
    public static void main(String[] args) {
        Header header = new Header();
        header.accept(new LeaderVisitorGroup());
    }
}
