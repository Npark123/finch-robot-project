
package com.jathan;

import com.birdbrain.Finch;
import com.jathan.NoteCreator;

public class test extends NoteCreator {
    public static void main(String[] args){
        Finch bird = new Finch(); 
        System.out.println("Hello"); 


      //  bird.setMove("F", 20 , 50);
      // bird.setTurn("R", 90, 50);
       //bird.setTurn("L",90, 50);
     // bird.setTail("all", 50, 100, 100);
//bird.completeMaze();

/* 
bird.setTail("all",0,0,75);
bird.setMove("F",105,75);
bird.setTurn("L",90,100); 
bird.setMove("F",40,100);
bird.setTurn("L",90,100);
bird.setMove("F",30,100);
bird.setTurn("R",90,100);
bird.setMove("F",47,100);
bird.setTurn("R",90,100);
bird.setMove("F",110,50); 
bird.setTurn("R",90,100);
bird.setMove("F",25,100); 
bird.setTurn("L",90,100);
bird.setMove("F",25,100); 
bird.setTurn("L",90,100);
bird.setMove("F",25,100);  */
    
//bird.playNote(getMajorChord("C"), 16.0);
bird.playNote(64,16.0);
bird.pause(0.5);
bird.stop();
bird.pause(0.5);
bird.playNote(64,16.0);
bird.pause(0.5);
bird.stop();
bird.pause(0.5);
bird.playNote(64,16.0);
bird.pause(0.5);
bird.stop();
bird.pause(2);
bird.playNote(64,16.0);
bird.pause(0.5);
bird.stop();
bird.pause(0.5);
bird.playNote(64,16.0);
bird.pause(0.5);
bird.stop();
bird.pause(0.5);
bird.playNote(64,16.0);
bird.pause(0.5);
bird.stop();
bird.pause(2);
bird.playNote(64,16.0);



bird.playNote(67,16.0);
bird.pause(0.5);
bird.stop();
bird.playNote(60,16.0);
bird.pause(0.5);
bird.stop();
bird.playNote(62,16.0);
bird.pause(0.5);
bird.stop();
bird.playNote(64,16.0);

//bird.playNote(60,16.0);
//bird.pause(0.5);
//bird.stop();
//bird.playNote(60,16.0);





   int count = 45;
  
/*bird.setTurn("R",360,75);
   while (count < 70){
      bird.playNote(count,16.0);
       bird.pause(0.5); 
       count += 1;
   } */

    
   
    bird.stopAll();
        bird.disconnect();
    }
}
