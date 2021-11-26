package cn.com.agree.abs.design.observer;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 10:27
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
