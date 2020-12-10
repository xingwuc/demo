package com.cmh.demo;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

//postfix completion

public class test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(sfnq(23));

    }
    public static int sfnq(int i){
      if (i==0){
          return 0;
      }
      if (i<0){
          return -1;
      }
        if (i==1||i==2) {
          return 1;
        }
        int pro=1;
        int curr=1;
        for (int j = 3; j <=i ; j++) {
          int sum=pro+curr;
          pro=curr;
          curr=sum;
        }

        ArrayList<Object> objects = new ArrayList<>();
        return curr;
    }
}