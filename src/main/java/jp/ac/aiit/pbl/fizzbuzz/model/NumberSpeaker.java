package jp.ac.aiit.pbl.fizzbuzz.model;

/**
 * 数字のときのSpeakerクラス
 */
public class NumberSpeaker implements  Speaker{
    @Override
    public String speak(int index) {
        return String.valueOf(index);
    }
}
