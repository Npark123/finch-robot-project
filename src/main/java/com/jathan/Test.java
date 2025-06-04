package com.jathan;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args) {
        Finch bird = new Finch();
        // System.out.println("Hello");
        int dis = bird.getDistance();
        if(dis >= 20) {
            while(dis >= 20) {
                bird.setMove("F",5,10);
            }
        }
        bird.stop();
        bird.disconnect();
    }
}
