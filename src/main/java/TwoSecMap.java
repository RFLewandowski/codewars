import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TwoSecMap extends HashMap<Integer, String> {

    private Map<Integer, Long> timestamps = new HashMap<>();

    @Override
    public String get(Object key) {
        Long gettingTimestamp = System.currentTimeMillis();
        if (isTooOldOrInvalid(key, gettingTimestamp)) {
            return "";
        }
        return super.get(key);
    }

    @Override
    public String put(Integer key, String value) {
        Long puttingTimestamp = System.currentTimeMillis();
        timestamps.put(key, puttingTimestamp);
        super.put(key, value);
        return "";
    }

    private boolean isTooOldOrInvalid(Object key, Long gettingTimestamp) {
        return key == null
                || timestamps.get(key) == null
                || gettingTimestamp - timestamps.get(key) > 2000;
    }

    /*
        rest of method overridden and marked depricated for simplicity only put and get are used
     */

    @Deprecated
    @Override
    public Set<Entry<Integer, String>> entrySet() {
        return null;
    }

    @Deprecated
    @Override
    public String getOrDefault(Object key, String defaultValue) {
        return null;
    }

    @Deprecated
    @Override
    public void forEach(BiConsumer<? super Integer, ? super String> action) {

    }

    @Deprecated
    @Override
    public void replaceAll(BiFunction<? super Integer, ? super String, ? extends String> function) {

    }

    @Deprecated
    @Override
    public String putIfAbsent(Integer key, String value) {
        return null;
    }

    @Deprecated
    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Deprecated
    @Override
    public boolean replace(Integer key, String oldValue, String newValue) {
        return false;
    }

    @Deprecated
    @Override
    public String replace(Integer key, String value) {
        return null;
    }

    @Deprecated
    @Override
    public String computeIfAbsent(Integer key, Function<? super Integer, ? extends String> mappingFunction) {
        return null;
    }

    @Deprecated
    @Override
    public String computeIfPresent(Integer key, BiFunction<? super Integer, ? super String, ? extends String> remappingFunction) {
        return null;
    }

    @Deprecated
    @Override
    public String compute(Integer key, BiFunction<? super Integer, ? super String, ? extends String> remappingFunction) {
        return null;
    }

    @Deprecated
    @Override
    public String merge(Integer key, String value, BiFunction<? super String, ? super String, ? extends String> remappingFunction) {
        return null;
    }
}
