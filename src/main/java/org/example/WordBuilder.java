package org.example;

/***
 * Способ без использования Stack. Можно "откатиться" только до предыдущей версии объекта класса WordBuilder
 */
public class WordBuilder {
    private final StringBuilder stringBuilder;
    private String lastAddition;

    public WordBuilder() {
        stringBuilder = new StringBuilder();
        lastAddition = null;
    }

    public void append(String str){
        lastAddition = str;
        stringBuilder.append(lastAddition);
    }
    public void undo(){
        int totalIndex = stringBuilder.length();
        stringBuilder.delete(totalIndex - lastAddition.length(), totalIndex);
    }
    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
