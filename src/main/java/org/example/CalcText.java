package org.example;

public class CalcText {

    /**
     * Слов к строке
     *
     * @param text
     * @return
     */
    public int countWorld(String text) {
        String[] d = text.split(" ");
        return d.length;
    }

}
