package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.fizzbuzz.service.FizzBuzzService;

/**
 * FizzBuzz Application
 *
 */
public class App 
{
    public static void main( String[] args ){
        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        for ( int i = 1 ; i <= 100; i++){
            System.out.println(fizzBuzzService.execute(i));
        }
    }
}
