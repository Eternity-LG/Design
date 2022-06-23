package cn.com.agree.abs.wsdlCache;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-12-06 14:23
 */
public class WsdlCache {
    private static Map<String, WsdlFileBean> cacheMap = new HashMap<String, WsdlFileBean>();


    public Definition getDefinition(int i) throws MalformedURLException {

        System.out.println("已经获得类WsdlFileBean实例，放到cachepam中");

        Definition def = new Definition() {
        public void newDefinition(){
            System.out.println("dfinition 类型创建完成");
        }
        };
        if (def != null) {
            WsdlFileBean bean = new WsdlFileBean(def);
            cacheMap.put(String.valueOf(i), bean);
        }
        return def;
    }

    class WsdlFileBean {
        String url;
        long lastModified;
        Definition def;
        File file;

        public WsdlFileBean(Definition def) {
            this.def = def;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public long getLastModified() {
            return lastModified;
        }

        public void setLastModified(long lastModified) {
            this.lastModified = lastModified;
        }

        public Definition getDef() {
            return def;
        }

        public void setDef(Definition def) {
            this.def = def;
        }

        public File getFile() {
            return file;
        }

        public void setFile(File file) {
            this.file = file;
        }
    }
}
