package pattern.strategy;

public class MD5Encodor extends Encodor {
    @Override
    public String encoding(String source) {
        return "md5编码" + source;
    }
}
