package cn.com.agree.abs.wsdlCache;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-12-06 14:21
 */
public class Utils {


    public static Definition getDefinition(int i) throws Exception{
        WsdlCache cache = new WsdlCache();
        Definition def = cache.getDefinition(i);
        return def;
    }

}
