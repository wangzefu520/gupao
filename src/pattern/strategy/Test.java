package pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static final String MD5 = "MD5";
    public static final String SHA = "SHA";
    private Map<String, Encodor> encodorMap = new HashMap<>();

    public Test() {
        encodorMap.put(MD5, new MD5Encodor());
        encodorMap.put(SHA, new SHAEncodor());
    }

    public String encoding(String type, String source) {
        if (encodorMap.containsKey(type)) {
            return encodorMap.get(type).encoding(source);
        } else {
            return encodorMap.get(MD5).encoding(source);
        }
    }
}
