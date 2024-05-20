package org.example;

import java.util.Stack;

/***
 * Способ с использованием Stack. Можно "откатиться" до любой предыдущей версии объекта класса WordBuilderV2
 */
public class WordBuilderV2 {
    private final StringBuilder stringBuilder;
    private final Stack<String> memory;

    public WordBuilderV2() {
        stringBuilder = new StringBuilder();
        memory = new Stack<>();
    }

    public void append(String text) {
        stringBuilder.append(text);
        memory.push("append:" + text);
    }

    public void undo() {
        if (!memory.isEmpty()) {
            String lastAddition = memory.pop();
            if (lastAddition.startsWith("append:")) {
                String text = lastAddition.substring(7);
                stringBuilder.delete(stringBuilder.length() - text.length(), stringBuilder.length());
            }
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
