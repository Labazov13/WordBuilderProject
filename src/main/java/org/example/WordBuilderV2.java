package org.example;

import java.util.Stack;

/***
 * Способ с использованием Stack. Можно "откатиться" до любой предыдущей версии объекта класса WordBuilderV2
 */
public class WordBuilderV2 {
    private StringBuilder stringBuilder;
    private final Stack<String> memory;


    public WordBuilderV2() {
        stringBuilder = new StringBuilder();
        memory = new Stack<>();
    }

    public void append(String text) {
        stringBuilder.append(text);
        memory.push(stringBuilder.toString());
    }

    public void undo() {
        if (!memory.isEmpty()) {
            stringBuilder = new StringBuilder(memory.pop());
        }
    }
    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
