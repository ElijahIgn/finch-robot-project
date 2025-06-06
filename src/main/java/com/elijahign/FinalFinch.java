package com.elijahign;

import com.birdbrain.Finch;

public class FinalFinch{
public static void main(String[] args) {
    Finch myFinch = new Finch();
    myFinch.setMotors(50,50);

// while loop that makes the finch move forward
while(myFinch.getDistance() >=7){
    myFinch.setMove("F",30,100);
}
//student-made method 
myFinch.readjust();


while(myFinch.getDistance() >= 7){
    myFinch.setMove("F",30,100);
}

myFinch.readjust();
myFinch.setMove("F",30,100);
myFinch.setTurn("R",90,50);

    myFinch.setMove("F",50,50);

myFinch.setTurn("R",90,50);



    myFinch.setMove("F",110,40);


myFinch.setTurn("R",90,50);

    myFinch.setMove("F",40,35);

myFinch.readjust();
myFinch.setMove("F",30,100);
myFinch.setTurn("L",90,50);
myFinch.setMove("F",30,100);



    myFinch.stopAll();
    myFinch.disconnect();

}

}