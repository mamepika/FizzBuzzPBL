package jp.ac.aiit.pbl.fizzbuzz.model;

/**
 * 3と5で割り切れるときのSpeakerクラス
 */
public class FizzBuzzSpeaker implements  Speaker {
    @Override
    public String speak(int index) {
        return "FizzBuzz";
    }
}
