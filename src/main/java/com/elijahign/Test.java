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
//student-made method 
myFinch.readjust();


while(myFinch.getDistance() >= 7){
    myFinch.setMove("F",30,100);
}

myFinch.readjust();
myFinch.setMove("F",30,100);
myFinch.setTurn("R",90,50);
while(myFinch.getDistance() >= 7){
    myFinch.setMove("F",30,100);
}




    myFinch.stopAll();
    myFinch.disconnect();

}

}