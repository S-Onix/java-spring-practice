package org.springpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class JavaSort <T extends  Comparable<T>> implements Sort<T>{
    @Override
    public List<T> sort(List<T> input) {
        List<T> output = new ArrayList<>(input);
        Collections.sort(output);
        return output;
    }

}
