package item18;

import java.util.Collection;
import java.util.HashSet;

public class MyHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> e) {
        addCount = addCount + e.size();
        return super.addAll(e);
    }

    public int getAddCount(){
        return addCount;
    }

}
