package com.example;

import java.util.List;

public interface Predator {
    int getChildren();
    int getChildren(int childrenCount);
    List<String> eatMeat() throws Exception;
}
