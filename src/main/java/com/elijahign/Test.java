package com.elijahign;

import com.birdbrain.Finch;

public class Test{
public static void main(String[] args) {
    Finch myFinch = new Finch();
    myFinch.setMotors(-50,50);

// while loop that makes the finch move forward
while(myFinch.getDistance() >=7){
    myFinch.setMove("F",15,100);
while(myFinch.getDistance() < 7){
    myFinch.setTurn("L",90,50);
    myFinch.setMove("B",7,100);
}}
// if there is something infront of the finch it will turn left and move

    myFinch.stopAll();
    myFinch.disconnect();



}

}