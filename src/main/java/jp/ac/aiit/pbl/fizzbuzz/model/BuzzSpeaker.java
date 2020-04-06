package jp.ac.aiit.pbl.fizzbuzz.model;

/**
 * 5で割り切れるときのSpeakerクラス
 */
public class BuzzSpeaker implements  Speaker {
    @Override
    public String speak(int index) {
        return "Buzz";
    }
}
