package pattern.strategy;

public class SHAEncodor extends Encodor {
    @Override
    public String encoding(String source) {
        return "SHA" + source;
    }
}
