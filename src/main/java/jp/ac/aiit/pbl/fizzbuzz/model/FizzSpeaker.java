package jp.ac.aiit.pbl.fizzbuzz.model;

/**
 * 3で割り切れるときのSpeakerクラス
 */
public class FizzSpeaker implements  Speaker {
    @Override
    public String speak(int index) {
        return "Fizz";
    }
}
