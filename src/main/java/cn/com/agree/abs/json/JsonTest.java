package cn.com.agree.abs.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JsonTest {

    public static void main(String[] args) {
        jsonTest01();
    }

    static void jsonTest01() {
        //关闭json对循环依赖的处理
        JSON.DEFAULT_GENERATE_FEATURE |= SerializerFeature.DisableCircularReferenceDetect.getMask();

        C c = new C();
        B b = new B();
        D d = new D();
        b.setC(c);
        c.setD(d);
        A a = new A(b);
        d.setA(a);
        Map<Object, Object> hashMap = new HashMap<>();
        hashMap.put(a,a);
        //普通对象转json对象
        String s = JSON.toJSONString(hashMap, 3089);
        Object resObj = JSON.parse(s);


        ArrayList<Integer> objectCache = new ArrayList<>();
        Object desensitive = desensitive(resObj, objectCache);

        System.out.println(JSON.toJSONString(desensitive,3089));

    }

    static class A {
        private B b;


        public B getB() {
            return b;
        }

        public void setB(B b) {
            this.b = b;
        }

        public A(B b) {
            this.b = b;
        }
    }

    static class B {
        private C c;

        public C getC() {
            return c;
        }

        public void setC(C c) {
            this.c = c;
        }
    }

    static class C {
        private D d;

        public D getD() {
            return d;
        }

        public void setD(D d) {
            this.d = d;
        }
    }

    static class D{
        private A a;

        public A getA() {
            return a;
        }

        public void setA(A a) {
            this.a = a;
        }
    }

    /**
     * 通过递归查找对象的每一个字段的值，将与脱敏配置的相同字段的值进行脱敏
     *
     * @param object 要脱敏的对象
     * @return
     */
    private static Object desensitive(Object object, ArrayList<Integer> objectCache) {

        int objID = System.identityHashCode(object);
        if (objectCache.contains(objID)){
            return object;
        }

        objectCache.add(objID);

        if (object instanceof JSONArray) {
            JSONArray jsonArray = (JSONArray) object;
            for (int i = 0; i < jsonArray.size(); i++) {
                Object obj = jsonArray.get(i);
                if (obj instanceof JSON) {
                    Object desensitiveObject = desensitive(obj, objectCache);
                    jsonArray.set(i, desensitiveObject);
                } else {
                    jsonArray.set(i, obj);
                }
            }
            return jsonArray;
        }

        if (object instanceof JSONObject) {
            JSONObject jsonObject = (JSONObject) object;
            for (String key : jsonObject.keySet()) {
                Object obj = jsonObject.get(key);
                if (obj instanceof JSON) {
                    Object desensitiveObject = desensitive(obj, objectCache);
                    jsonObject.put(key, desensitiveObject);
                } else {
                    String desensitiveValue = "已脱敏" + obj;
                    jsonObject.put(key, desensitiveValue);
                }
            }
            return jsonObject;
        }

        // 对象无法解析为JSON对象,则直接返回
        return object;
    }
}
