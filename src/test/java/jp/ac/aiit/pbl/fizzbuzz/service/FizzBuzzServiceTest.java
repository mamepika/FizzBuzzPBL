package jp.ac.aiit.pbl.fizzbuzz.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzServiceTest {
    private FizzBuzzService fizzBuzzService;

    @Before
    public void before(){
        fizzBuzzService = new FizzBuzzService();
    }

    @Test
    public  void 引数1のときに1が返るか(){
        assertThat(fizzBuzzService.execute(1),is("1"));
    }
    @Test
    public  void 引数3のときにFizzが返るか(){
        assertThat(fizzBuzzService.execute(3),is("Fizz"));
    }
    @Test
    public  void 引数5のときにBuzzが返るか(){
        assertThat(fizzBuzzService.execute(5),is("Buzz"));
    }
    @Test
    public  void 引数15のときにFizzBuzzが返るか(){
        assertThat(fizzBuzzService.execute(15),is("FizzBuzz"));
    }
}
