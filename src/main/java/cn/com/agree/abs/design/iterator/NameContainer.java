package cn.com.agree.abs.design.iterator;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 16:41
 */
public class NameContainer implements Container{
    public String[] name ={"A","B","C","D","E"};


    @Override
    public Iterator getIterator() {
        return new Iterator() {
            int index;
            @Override
            public boolean hasNext() {
                return index < name.length;
            }

            @Override
            public Object next() {
                if (this.hasNext()){
                    return name[index++];
                }
                return null;
            }
        };
    }
}
