package jp.ac.aiit.pbl.fizzbuzz.service;

import jp.ac.aiit.pbl.fizzbuzz.model.*;

/**
 * FizzBuzzのファクトリークラス
 */
public class SpeakerFactory {

    public static Speaker create(int index){
        if(index % 15 == 0 ){
            return new FizzBuzzSpeaker();
        }else if ( index % 3 == 0 ){
            return new FizzSpeaker();
        }else if (index % 5 == 0){
            return  new BuzzSpeaker();
        }
        return new NumberSpeaker();
    }
}
