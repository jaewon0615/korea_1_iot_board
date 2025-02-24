package com.korit.test2;

import java.util.List;
import java.util.Optional;
import java.util.Random;

class Nums{
    private Integer[] nums;
    private Random random;

    public Nums(int size){
        nums = new Integer[size];
        random = new Random();
    }

    public void setRandomNumsAll(){
        for(int i = 0; i<nums.length; i++){
            nums[i] = random.nextInt(100);
        }
    }

}

public class Function1 {


    public static void main(String[] args) {
        Nums nums = new Nums(20);
        nums.setRandomNumsAll();

        List<Integer> integers = List.of(1,2,3,4,5,6,7);

        integers.forEach(n -> System.out.println(n));

        for (Integer n : integers){
            System.out.println(n);
        }


        Optional<String> nameOptional = Optional.of(null);
        String name = nameOptional.orElse("김준이");
        String name2 = nameOptional.orElseThrow(()->new RuntimeException());

        


    }

}
