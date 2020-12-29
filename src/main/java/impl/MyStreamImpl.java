package impl;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamImpl<T> {
    private final List<T> data;

    public MyStreamImpl(List<? extends T> data) {
        this.data = (List<T>) data;
    }

    public static<T> MyStreamImpl<T> of(T... data) {
        return new MyStreamImpl<T>(Arrays.asList(data));
    }

    public MyStreamImpl<T> filter(Predicate<? super T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : data) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return new MyStreamImpl<>(result);
    }

//    public <R> MyStreamImpl<T> transform(Function<? super T, ? extends R> function) {
//
//    }


    public <T, R> Map<T, R> toMap(List<T> list, Function<? super T, ? extends R> function) {
        Map<T, R> result = new HashMap<>();
        for (T t : list){
            result.put(t, function.apply(t));
        }
        return result;
    }

}
