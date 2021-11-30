package cn.com.agree.abs.design.iterator;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 16:46
 */
public class IteratorDemo {
    public static void main(String[] args) {
        NameContainer nameContainer = new NameContainer();
        for(Iterator iter = nameContainer.getIterator();iter.hasNext();){
            String name = (String)iter.next();
            System.out.println(name);
        }
    }
}
