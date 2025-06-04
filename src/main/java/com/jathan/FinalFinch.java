
package com.jathan;

import com.birdbrain.Finch;


public class FinalFinch extends MusicFinch {
    public static void main(String[] args){
       MusicFinch bird = new MusicFinch(); 

       //Sets the tail to be blue
bird.setTail("all",0,0,75);

//Hard coded to complete the specified Maze in Class
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
//for loop to run code 3 times to keep code organized
for (int i = 0; i < 3; i++){
bird.setMove("F",25,100); 
bird.setTurn("L",90,100);
}

    //plays Final Fantasy VII ost "Victory Fanfare"

    //plays high C 3 times
for (int i = 0; i < 3; i++){
    bird.playNoteAndPause(74,.2);
}

bird.playNoteAndPause(74,0.75);
bird.playNoteAndPause(70,0.75);
bird.playNoteAndPause(72,0.75); 

bird.playNoteAndPause(74,.25);
bird.stop();
bird.playNoteAndPause(72,.2);
bird.playNoteAndPause(74,1.6);


    bird.stopAll();
        bird.disconnect();
    }
}
