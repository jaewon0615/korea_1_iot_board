package com.korit.test1;

class Test1{

    Test1(){

    }

    void a(){System.out.println("a함수 호출");
    }
}

public class Test1Main {

    public static void main(String[] args){
        new Test1().a();

        int num2;
        int num3;
        int num4;
        int[] nums = new int[3];
        int[] nums2 = new int[3];

        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        for(int n : nums2){
            System.out.println(n);
        }



    }
}
