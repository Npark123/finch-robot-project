package com.jathan; 

import com.birdbrain.Finch;

//class extends the Finch robot 
public class MusicFinch extends Finch {
 
    /**The playNoteAndPause() method is used to 
  * play a note with specified beat time and 
  *then pause shortly so it runs without error
  * @param notes the note played 
  * @param beats the amount of beats the note is played for 
  */


 public void playNoteAndPause(int note, double beats){
playNote(note, beats);
pause(beats + 0.05);
        }
    }

