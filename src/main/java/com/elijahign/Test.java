package com.elijahign;

import com.birdbrain.Finch;

public class Test{
public static void main(String[] args) {
    Finch myFinch = new Finch();
    myFinch.setMotors(50,50);

// while loop that makes the finch move forward
while(myFinch.getDistance() >=7){
    myFinch.setMove("F",15,100);
}
//these two actions ensure smooth movement for the finch    
myFinch.setMove("B",7,100);
myFinch.setTurn("L",90,50);

while(myFinch.getDistance() >= 7){
    myFinch.setMove("F",30,100);
}

myFinch.setMove("B",20,100);
myFinch.setTurn("L",90,50);
myFinch.setMove("F",30,100);
myFinch.setTurn("R",90,50);
while(myFinch.getDistance() >= 7){
    myFinch.setMove("F",30,100);
}




    myFinch.stopAll();
    myFinch.disconnect();

}

}