package item18;

import com.sun.tools.javac.util.List;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyHashSet<String> myHashSet = new MyHashSet<>();
        myHashSet.addAll(List.of("a", "b", "c"));
        System.out.println(myHashSet.getAddCount());

        Set mySet = new HashSet();
        InstrumentedSet<String> instrumentedSet = new InstrumentedSet<>(mySet); //데코레이터 패턴. 데코레이터 객체로 구성요소를 감싼다.

        instrumentedSet.addAll(List.of("a", "b", "c")); // 구성요소 객체에 영향을 주지 않는다. 따라서 사이드 이펙트가 발생하지 않는다.
        instrumentedSet.add("d");
        System.out.println(instrumentedSet.getAddCount());

    }
}
