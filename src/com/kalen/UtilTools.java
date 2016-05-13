package com.kalen;

public class UtilTools {

	public static void main(String[] args) {


	}

    public static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
