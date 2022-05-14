
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

package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class File {
    
    public String read(String namefile){
        
        String c = "", cadena = "";
        
        try { 
        
           FileReader f  =  new FileReader(namefile);
           BufferedReader b = new BufferedReader(f);
           while(  (c = b.readLine() )   !=    null)
           cadena   +=   c   +   "\n";    b.close();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe el archivo: \n" +
            namefile,"Error JDataBase",JOptionPane.ERROR_MESSAGE);
        }
        	
        return cadena.substring(0, cadena.length() - 1);
        
    }
    
    public void write(String texto, String namefile){
        
        try {
            FileWriter myWriter = new FileWriter(namefile);
            myWriter.write(texto); myWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en el proceso...\n" 
            + "No se puede crear file en: " + namefile); e.printStackTrace();
        }
        
    }
    
    public int getTextSize(String namefile){
        return read(namefile).length();
    }
    
    public boolean isExitsFile(String namefile){
        return new java.io.File(namefile).exists();
    }
    
    public String getDir(String namefile){
                
        int i = 0; String lex = "";
        while(i  <  namefile.length()){ if(namefile.substring(i,i+1).equals("\\") || 
        namefile.substring(i,i+1).equals("//"))lex = namefile.substring(0,i+1);i++;}
        return lex;
        
    }
    
    public String getName(String namefile){
        return namefile.substring(getDir(namefile).length(),namefile.length());
    }
    
    public boolean newDir(String nameDir){
        if(new java.io.File(nameDir).exists())return true;
        return new java.io.File(nameDir).mkdir();
    }
    
    public boolean Delete(String deleteFile){
        return new java.io.File(deleteFile).delete();
    }
 
    private long getSizeBytesFile(String namefile){
        return new java.io.File(namefile).length();
    }
    
    public String getSizeFile(String namefile){
        if(getSizeBytesFile(namefile) > (1024) && getSizeBytesFile(namefile) < (1024*1024))
        return Float.toString(getSizeBytesFile(namefile) / 1024) + " KB";
        if(getSizeBytesFile(namefile) > (1024*1024))return Long.toString(getSizeBytesFile(namefile) / 1024 / 1024) + " MB";
        else return Long.toString(getSizeBytesFile(namefile)) + " Bytes";
    }
    
    public String getExtensionFile(String namefile){
        return getName(namefile).substring(getName(namefile).indexOf("."),getName(namefile).length());
    }
    
    public String getLastModifiedFile(String namefile){
        return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").
        format(new java.io.File(namefile).lastModified());
    }
    
    public String getCreationFile(String namefile){
        
        try { 
            
            BasicFileAttributes bt = Files.readAttributes(new java.
            io.File(namefile).toPath(), BasicFileAttributes.class);
            FileTime ft = bt.creationTime(); 
            return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").
            format(new Date(ft.toMillis()));
            
        } catch(IOException ex){ return "Error: " + ex; }
    
    }
    
    public String getLastAccessFile(String namefile){
        
        try { 
            
            BasicFileAttributes bt = Files.readAttributes(new java.
            io.File(namefile).toPath(), BasicFileAttributes.class);
            FileTime ft = bt.lastAccessTime(); 
            return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").
            format(new Date(ft.toMillis()));
            
        } catch(IOException ex){ return "Error: " + ex; }
    
    }
    
    public boolean Rename(String NameLast,String NameNew){
        return new java.io.File(NameLast).renameTo(new java.io.File(NameNew));
    }
    
}
