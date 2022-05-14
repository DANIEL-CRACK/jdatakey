
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

import File.File;

class ReadData {
    
    private File file = new File();
    
    private String index = "";
    
    private String dir = "";
    
    public boolean setEncriptFile(String urlfile){
        if(!file.isExitsFile(urlfile))return false; dir = urlfile;
        return true;
    }
    
    protected String readKey(String key,String url){
        
        Encript encript = new Encript(dir);
        
        if(!getFindKey("K:" + key, url) || url.equals("")) return "";
        
        String desn = encript.desencript(index);
        
        desn = desn.substring(key.length() + 5,desn.length());
       
        return desn;
        
    }
    
    private boolean getFindKey(String namekey, String url){
        
        Encript encript = new Encript(dir);
        
        if(namekey.equals("")) return false;
        String r = file.read(url);
        int index = r.indexOf(encript.encript(namekey)); 
        if(index == -1)return false;
        int indx = r.indexOf("\n",index);
        if(indx == -1) this.index = r.substring(index,r.length());
        else this.index = r.substring(index,indx);
        return true;
    
    }
    
}