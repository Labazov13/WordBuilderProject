package org.example;

public class Main {
    public static void main(String[] args) {
        /*WordBuilder word = new WordBuilder();
        word.append("Privet");
        System.out.println(word);
        word.append(" my");
        System.out.println(word);
        word.append(" dorogoi");
        System.out.println(word);
        word.undo();
        System.out.println(word);*/


        WordBuilderV2 wordBuilderV2 = new WordBuilderV2();
        wordBuilderV2.append("Privet");
        System.out.println(wordBuilderV2);
        wordBuilderV2.append(" moi");
        System.out.println(wordBuilderV2);
        wordBuilderV2.append(" dorogoi");
        System.out.println(wordBuilderV2);
        wordBuilderV2.append(" drug");
        System.out.println(wordBuilderV2);
        wordBuilderV2.append(" brat");
        System.out.println(wordBuilderV2);
        wordBuilderV2.append(" svat");
        System.out.println(wordBuilderV2);
        wordBuilderV2.undo();
        System.out.println(wordBuilderV2);
        wordBuilderV2.undo();
        System.out.println(wordBuilderV2);
        wordBuilderV2.undo();
        System.out.println(wordBuilderV2);

    }
}