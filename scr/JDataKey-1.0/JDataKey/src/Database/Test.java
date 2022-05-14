
/********************************************************************
           Copyright (C) 2022 Daniel Andino Camacho

 This program is free software; you can redistribute it and/or modify
 it under the terms of the LGPL GNU General Public License as 
 published by the Free Software Foundation; either version 3 of the 
 License, or (at your option) any later version.

 This program can be distributed, copied and/or modified by referring
 to its author name and email address. 
 
 Created by Daniel Andino Camacho 
 Email address is hellotecnologic@gmail.com  

********************************************************************/

package Database;

class Test {
    
    public static void main(String[] args) {
        
        /*Database.DataManager dataManager = new DataManager("C:\\Users\\Daniel\\Desktop\\data1.dat");
        dataManager.setName("MyData");
        dataManager.setAuthor("Daniel Andino Camacho");
        dataManager.setGmail("hellotecnologic@gmail.com");
        dataManager.setPassword("1234");
        dataManager.setEncriptFile("C:\\Users\\Daniel\\Desktop\\encript.txt");
        dataManager.newDatabase();*/
        
        Dat d = new Dat("C:\\Users\\Daniel\\Desktop\\data1.dat","C:\\Users\\Daniel\\Desktop\\encript.txt");
        d.setPassword("1234"); 
        
        System.out.println("Author: " + d.getAuthor());
        System.out.println("Name: " + d.getNameDatabase());
        System.out.println("Gmail: " + d.getGmail());
        //d.setKey("hola", "Hola Mundo!");
        //System.out.println("KEY: " + d.getKey("hola")); 
        
    }

}
