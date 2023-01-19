package com.isvaso.composite.compositecodingexercise;

import java.util.*;
import java.util.function.Consumer;

interface ValueContainer extends Iterable<Integer> {}

class SingleValue implements ValueContainer
{
    public int value;

    // please leave this constructor as-is
    public SingleValue(int value) {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return Arrays.asList(value).iterator();
        //return Collections.singleton(this.value).iterator();
    }

    // Must must allow the "action" method to fire on each element of this collection.
    // So in THIS collection only one element it is "this.value".
    @Override
    public void forEach(Consumer<? super Integer> action) {
        action.accept(this.value);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        //return Arrays.asList(value).spliterator();
        return Collections.singleton(this.value).spliterator();
    }
}

class ManyValues extends ArrayList<Integer> implements ValueContainer {
}


class MyList extends ArrayList<ValueContainer>
{
    // please leave this constructor as-is
    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public MyList() {}

    public int sum() {
        int result = 0;

        for (ValueContainer elem : this)
            for (Integer value : elem) {
                result += value;
            }
        return result;
    }
}

class Main {

    public static void main(String[] args) {
        SingleValue s1 = new SingleValue(10);
        SingleValue s2 = new SingleValue(10);

        ManyValues m1 = new ManyValues();
        m1.add(s1.value);
        ManyValues m2 = new ManyValues();
        m2.add(s2.value);

        MyList myList = new MyList();
        myList.add(s1);
        myList.add(s2);

        myList.add(m1);
        myList.add(m2);

        System.out.println(myList.sum());

    }
}
