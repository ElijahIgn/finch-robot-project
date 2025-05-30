package com.elijahign;

import com.birdbrain.Finch;

public class Test{
public static void main(String[] args) {
    Finch myFinch = new Finch();
    myFinch.setMotors(-50,50);

    

    myFinch.stopAll();
    myFinch.disconnect();



}

}