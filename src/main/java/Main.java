import impl.Client;
import impl.MyStreamImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyStreamImpl<Integer> myStream = MyStreamImpl.of(1,2,3,4,5).filter(i -> i % 2 == 0);
        System.out.println(myStream);
    }


}
