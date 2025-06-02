package com.elijahign;

import com.birdbrain.Finch;

public class Test{
public static void main(String[] args) {
    Finch myFinch = new Finch();
    myFinch.setMotors(-50,50);
myFinch.setMove("F",15,100);

while(myFinch.getDistance() < 10){
myFinch.setTurn("L",90,50);
myFinch.setMove("F",100,100);
}
    myFinch.stopAll();
    myFinch.disconnect();



}

}