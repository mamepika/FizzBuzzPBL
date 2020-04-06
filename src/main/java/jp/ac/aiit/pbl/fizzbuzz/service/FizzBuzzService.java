package jp.ac.aiit.pbl.fizzbuzz.service;

import jp.ac.aiit.pbl.fizzbuzz.model.Speaker;

public class FizzBuzzService {

    public String execute(int index){
        Speaker speaker = SpeakerFactory.create(index);
        return speaker.speak(index);
    }
}
