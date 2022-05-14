
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

class Encript {

    private final String dic[] = {
        
        "99%Xf&", "98#Xf&", "97$Xf&", "96!Xf&", "95wXf&", "94GXf&", "93gXf&",
        "92HXf&", "91jXf&", "90bXf&", "89NXf&", "88MXf&", "87VXf&", "86@Xf&",
        "850Xf&", "840Xf&", "830Xf&", "820Xf&", "810Xf&", "800Xf&", "79LXf&",
        "780Xf&", "770Xf&", "760Xf&", "750Xf&", "74uXf&", "73KXf&", "72lXf&",
        "71OXf&", "70oXf&", "69iXf&", "68IXf&", "67UXf&", "660Xf&", "650Xf&",
        "64RXf&", "63eXf&", "62rXf&", "61aXf&", "60AXf&", "59xXf&", "58zXf&",
        "570Xf&", "560Xf&", "550Xf&", "540Xf&", "530Xf&", "520Xf&", "51ZXf&",
        "500Xf&", "490Xf&", "480Xf&", "470Xf&", "460Xf&", "450Xf&", "44?Xf&",
        "420Xf&", "430Xf&", "410Xf&", "400Xf&", "390Xf&", "380Xf&", "3?0Xf&",
        "280Xf&", "290Xf&", "270Xf&", "300Xf&", "330Xf&", "320Xf&", "3v0Xf&",
        "$9SXf&", "210Xf&", "190Xf&", "87&Xf&", "$30Xf&", "1%#Xf&", "1$FXf&",
        "$9SHf&", "210hf&", "190lf&", "87&pf&", "$30qf&", "1%#rf&", "1$Fxf&",
        "$9SXa&", "210Xb&", "190Xd&", "87&Xx&", "$30Xj&", "1%#XJ&", "1$FXk&",
        "$xSXf&", "2c0Xf&", "1n0Xf&", "n7&Xf&", "m30Xf&", "r%#Xf&", "p$FXf&",
        "z9SXf&", "o10Xf&", "y90Xf&", "Y7&Xf&", "T30Xf&", "t%#Xf&", "q$FXf&",
        "S$%#Xf", "S$02Xf", "S$03Xf", "S$0%%f", "S%05Xf", "S$06Xf", "S$07Xf",
        "S$08##", "S$0#Xf", "S$&0Xf", "S&11Xf", "S$12Xf", "S$13Xf", "S$14Xf",
        "S$hsX#", "S$h1Xf", "S$l1Xf", "S$B1Xf", "S$f1Xf", "S$C1Xf", "S#c1Xf",
        "S$0bXf", "S$0cXf", "S$0dXf", "S$0eXf", "S$0fXf", "S$0GXf", "S$0hXf",
        "S$jkXf", "S$lxXf", "%$01$f", "S$01Uf", "S$0FKf", "X$01xf", "S$#dXf",
        "S$0iXf", "A$01Xf", "B$01Xf", "C$01Xf", "d$01Xf", "e$01Xf", "f$01Xf",
        "G$01Xf", "h$0YXf", "k$01Yf", "P$01Jf", "Sa@1Xf", "S##1Xf", "J$01Xf",
        "S$0QXf", "SQF1XG", "b$01Xf", "C&01Xf", "l$01Xf", "k%01Xf", "K$01Xf",
        "R$01Xf", "M$%1Xf", "x%@1Xf", "%$01Xf", "%%01Xf", "S$0%Xf", "S$01X%",
        "A%51Xf", "S&07X@", "S$0&%f", "S$91xf", "S$01cf", "S$01bf", "S$01hf",
        "SG01Xf", "Sj01X@", "Sk01Xf", "s$01Xf", "x$01Xf", "h!01Xf", "l!01Xf",
        "n$01Xf", "@$01X@", "S$@1Xf", "S@01Xf", "S401Xf", "S&#1Xf", "%$%1Xf",
        "S$0&Xf", "S$#1X@", "S$01#F", "SF0#XJ", "#$01XQ", "S%#1Xf", "S#01XG",
        "S$0X17", "S$012@", "S$013f", "S$014f", "S$015f", "S$016f", "S$017f",
        "8$81Xf", "9$01o@", "Sytf0f", "1201Xf", "3301Xf", "S301Xf", "S$S1Xf",
        "S%5#Xf", "#5%1X@", "43Vh4f", "S@Y1Xf", "D@01XF", "X@X1Xf", "H$J1Jf",
        "S$9&&f", "%%05X@", "S$#33f", "S$69Xf", "S$65Xf", "S$01Xf", "S$58Xf",
        "9$09Xf", "S!51X@", "S$!&Xf", "S$010&", "S$55Xf", "S$56Xf", "S$57Xf",
        "S901X9", "S$!1X@", "SII1Xf", "S$77Xf", "$%Gdxf", "@761Xf", "x$01xf",
        "S$815f", "!@t@X@", "S$09X9", "S$CdYF", "SSC1H!", "S$!1&f", "2F$243",
        "S@69@f", "!$11!f", "S$0!#f", "!#01Xf", "S#0!Xf", "S$@!Xf", "!!!4Xf",
        "S$01X@", "@$01@f", "S@01@f", "S&01&f"

    };

    private final int size = dic.length;
    private final int A = 0, B = 1, a = 2, b = 3;
    private final int C = 7, D = 6, c = 5, d = 4;
    private final int E = 8, F = 9, e = 10, f = 11;
    private final int G = 15, H = 14, g = 13, h = 12;
    private final int I = 16, J = 17, i = 18, j = 19;
    private final int K = 23, L = 22, k = 21, l = 20;
    private final int M = 24, N = 25, m = 26, n = 27;
    private final int O = 28, P = 29, o = 30, p = 31;
    private final int Q = 35, R = 34, q = 33, r = 32;
    private final int S = 36, T = 37, s = 38, t = 39;
    private final int U = 51, V = 46, u = 45, v = 40;
    private final int W = 50, X = 47, w = 44, x = 41;
    private final int Y = 49, Z = 48, y = 43, z = 42;

    private final int S_INTRG = 52;
    private final int S_COMILLAS = 53;
    private final int S_SHARP = 54;
    private final int S_DOLLAR = 55;
    private final int S_PORCIENTO = 56;
    private final int S_AND = 57;
    private final int S_COMILLAS_S = 58;
    private final int S_PAR_A = 59;
    private final int S_PAR_C = 60;
    private final int S_ASTERISCO = 61;
    private final int S_MAS = 62;
    private final int S_COMA = 63;
    private final int S_MENOS = 64;
    private final int S_PUNTO = 65;
    private final int S_DIAGONAL_D = 66;
    private final int N_0 = 67;
    private final int N_1 = 68;
    private final int N_2 = 69;
    private final int N_3 = 70;
    private final int N_4 = 71;
    private final int N_5 = 72;
    private final int N_6 = 73;
    private final int N_7 = 74;
    private final int N_8 = 75;
    private final int N_9 = 76;
    private final int S_DOS_PUNTOS = 77;
    private final int S_PUNTO_Y_COMA = 78;
    private final int S_MENOR_Q = 79;
    private final int S_IGUAL = 80;
    private final int S_MAYOR_Q = 81;
    private final int S_QUESTION = 82;
    private final int S_CORCHETE_A = 83;
    private final int S_CORCHETE_C = 84;
    private final int S_DIAGONAL_I = 85;
    private final int S_POW = 86;
    private final int S_GUION_BAJO = 87;
    private final int S_LLAVE_A = 88;
    private final int S_LLAVE_C = 89;
    private final int S_OR = 90;
    private final int S_REDONDEAR = 91;
    private final int S_COMILLA_INCLINADA_I = 92;
    private final int SPACE = 93;
    private final int SALTO_LN = 94;
    private final int RETORNO_C = 95;
    private final int AROBA = 96;
    private final int TAB = 97;

    private String value = "encript.txt";
    
    public Encript(String encript_file_name){
        value = encript_file_name;
        if(!value.equals(""))getEncriptCodes();
    }
    
    protected String desencript(String code) {

        int i = 0;
        String lexema = "";
        code = code + ":";
        while (i < code.length()) {
            lexema += getEncriptToChar(code.substring(i, code.indexOf(":", i)));
            i = code.indexOf(":", i);
            i++;
        }
        return lexema;

    }

    private int sfrecuency(String b) {

        int in = 0;
        int cv = 0;

        while (in < size) {
            if (b.equals(dic[in])) {
                cv = cv + 1;
            }
            in++;
        }

        return cv;
    }

    private String getCharEncript(String c) {

        if (c.equals("A")) {
            return dic[A];
        }
        if (c.equals("B")) {
            return dic[B];
        }
        if (c.equals("C")) {
            return dic[C];
        }
        if (c.equals("D")) {
            return dic[D];
        }
        if (c.equals("E")) {
            return dic[E];
        }
        if (c.equals("F")) {
            return dic[F];
        }
        if (c.equals("G")) {
            return dic[G];
        }
        if (c.equals("H")) {
            return dic[H];
        }
        if (c.equals("I")) {
            return dic[I];
        }
        if (c.equals("J")) {
            return dic[J];
        }
        if (c.equals("K")) {
            return dic[K];
        }
        if (c.equals("L")) {
            return dic[L];
        }
        if (c.equals("M")) {
            return dic[M];
        }
        if (c.equals("N")) {
            return dic[N];
        }
        if (c.equals("O")) {
            return dic[O];
        }
        if (c.equals("P")) {
            return dic[P];
        }
        if (c.equals("Q")) {
            return dic[Q];
        }
        if (c.equals("R")) {
            return dic[R];
        }
        if (c.equals("S")) {
            return dic[S];
        }
        if (c.equals("T")) {
            return dic[T];
        }
        if (c.equals("U")) {
            return dic[U];
        }
        if (c.equals("V")) {
            return dic[V];
        }
        if (c.equals("W")) {
            return dic[W];
        }
        if (c.equals("X")) {
            return dic[X];
        }
        if (c.equals("Y")) {
            return dic[Y];
        }
        if (c.equals("Z")) {
            return dic[Z];
        }

        if (c.equals("a")) {
            return dic[a];
        }
        if (c.equals("b")) {
            return dic[b];
        }
        if (c.equals("c")) {
            return dic[this.c];
        }
        if (c.equals("d")) {
            return dic[d];
        }
        if (c.equals("e")) {
            return dic[e];
        }
        if (c.equals("f")) {
            return dic[f];
        }
        if (c.equals("g")) {
            return dic[g];
        }
        if (c.equals("h")) {
            return dic[h];
        }
        if (c.equals("i")) {
            return dic[i];
        }
        if (c.equals("j")) {
            return dic[j];
        }
        if (c.equals("k")) {
            return dic[k];
        }
        if (c.equals("l")) {
            return dic[l];
        }
        if (c.equals("m")) {
            return dic[m];
        }
        if (c.equals("n")) {
            return dic[n];
        }
        if (c.equals("o")) {
            return dic[o];
        }
        if (c.equals("p")) {
            return dic[p];
        }
        if (c.equals("q")) {
            return dic[q];
        }
        if (c.equals("r")) {
            return dic[r];
        }
        if (c.equals("s")) {
            return dic[s];
        }
        if (c.equals("t")) {
            return dic[t];
        }
        if (c.equals("u")) {
            return dic[u];
        }
        if (c.equals("v")) {
            return dic[v];
        }
        if (c.equals("w")) {
            return dic[w];
        }
        if (c.equals("x")) {
            return dic[x];
        }
        if (c.equals("y")) {
            return dic[y];
        }
        if (c.equals("z")) {
            return dic[z];
        }

        if (c.equals("!")) {
            return dic[S_INTRG];
        }
        if (c.equals("\"")) {
            return dic[S_COMILLAS];
        }
        if (c.equals("#")) {
            return dic[S_SHARP];
        }
        if (c.equals("$")) {
            return dic[S_DOLLAR];
        }
        if (c.equals("%")) {
            return dic[S_PORCIENTO];
        }
        if (c.equals("&")) {
            return dic[S_AND];
        }
        if (c.equals("\'")) {
            return dic[S_COMILLAS_S];
        }
        if (c.equals("(")) {
            return dic[S_PAR_A];
        }
        if (c.equals(")")) {
            return dic[S_PAR_C];
        }
        if (c.equals("*")) {
            return dic[S_ASTERISCO];
        }
        if (c.equals("+")) {
            return dic[S_MAS];
        }
        if (c.equals(",")) {
            return dic[S_COMA];
        }
        if (c.equals("-")) {
            return dic[S_MENOS];
        }
        if (c.equals(".")) {
            return dic[S_PUNTO];
        }
        if (c.equals("/")) {
            return dic[S_DIAGONAL_D];
        }
        if (c.equals("0")) {
            return dic[N_0];
        }
        if (c.equals("1")) {
            return dic[N_1];
        }
        if (c.equals("2")) {
            return dic[N_2];
        }
        if (c.equals("3")) {
            return dic[N_3];
        }
        if (c.equals("4")) {
            return dic[N_4];
        }
        if (c.equals("5")) {
            return dic[N_5];
        }
        if (c.equals("6")) {
            return dic[N_6];
        }
        if (c.equals("7")) {
            return dic[N_7];
        }
        if (c.equals("8")) {
            return dic[N_8];
        }
        if (c.equals("9")) {
            return dic[N_9];
        }

        if (c.equals(":")) {
            return dic[S_DOS_PUNTOS];
        }
        if (c.equals(";")) {
            return dic[S_PUNTO_Y_COMA];
        }
        if (c.equals("<")) {
            return dic[S_MENOR_Q];
        }
        if (c.equals("=")) {
            return dic[S_IGUAL];
        }
        if (c.equals(">")) {
            return dic[S_MAYOR_Q];
        }
        if (c.equals("?")) {
            return dic[S_QUESTION];
        }

        if (c.equals("[")) {
            return dic[S_CORCHETE_A];
        }
        if (c.equals("]")) {
            return dic[S_CORCHETE_C];
        }
        if (c.equals("\\")) {
            return dic[S_DIAGONAL_I];
        }
        if (c.equals("^")) {
            return dic[S_POW];
        }
        if (c.equals("_")) {
            return dic[S_GUION_BAJO];
        }
        if (c.equals("{")) {
            return dic[S_LLAVE_A];
        }
        if (c.equals("}")) {
            return dic[S_LLAVE_C];
        }
        if (c.equals("|")) {
            return dic[S_OR];
        }
        if (c.equals("~")) {
            return dic[S_REDONDEAR];
        }
        if (c.equals("`")) {
            return dic[S_COMILLA_INCLINADA_I];
        }
        if (c.equals(" ")) {
            return dic[SPACE];
        }
        if (c.equals("  ")) {
            return dic[TAB];
        }
        if (c.equals("\n")) {
            return dic[SALTO_LN];
        }
        if (c.equals("\r")) {
            return dic[RETORNO_C];
        }
        if (c.equals("@")) {
            return dic[AROBA];
        }
        
        return "nrr";
    }

    private String getEncriptToChar(String c) {

        if (c.equals(dic[A])) {
            return "A";
        }
        if (c.equals(dic[B])) {
            return "B";
        }
        if (c.equals(dic[C])) {
            return "C";
        }
        if (c.equals(dic[D])) {
            return "D";
        }
        if (c.equals(dic[E])) {
            return "E";
        }
        if (c.equals(dic[F])) {
            return "F";
        }
        if (c.equals(dic[G])) {
            return "G";
        }
        if (c.equals(dic[H])) {
            return "H";
        }
        if (c.equals(dic[I])) {
            return "I";
        }
        if (c.equals(dic[J])) {
            return "J";
        }
        if (c.equals(dic[K])) {
            return "K";
        }
        if (c.equals(dic[L])) {
            return "L";
        }
        if (c.equals(dic[M])) {
            return "M";
        }
        if (c.equals(dic[N])) {
            return "N";
        }
        if (c.equals(dic[O])) {
            return "O";
        }
        if (c.equals(dic[P])) {
            return "P";
        }
        if (c.equals(dic[Q])) {
            return "Q";
        }
        if (c.equals(dic[R])) {
            return "R";
        }
        if (c.equals(dic[S])) {
            return "S";
        }
        if (c.equals(dic[T])) {
            return "T";
        }
        if (c.equals(dic[U])) {
            return "U";
        }
        if (c.equals(dic[V])) {
            return "V";
        }
        if (c.equals(dic[W])) {
            return "W";
        }
        if (c.equals(dic[X])) {
            return "X";
        }
        if (c.equals(dic[Y])) {
            return "Y";
        }
        if (c.equals(dic[Z])) {
            return "Z";
        }

        if (c.equals(dic[a])) {
            return "a";
        }
        if (c.equals(dic[b])) {
            return "b";
        }
        if (c.equals(dic[this.c])) {
            return "c";
        }
        if (c.equals(dic[d])) {
            return "d";
        }
        if (c.equals(dic[e])) {
            return "e";
        }
        if (c.equals(dic[f])) {
            return "f";
        }
        if (c.equals(dic[g])) {
            return "g";
        }
        if (c.equals(dic[h])) {
            return "h";
        }
        if (c.equals(dic[i])) {
            return "i";
        }
        if (c.equals(dic[j])) {
            return "j";
        }
        if (c.equals(dic[k])) {
            return "k";
        }
        if (c.equals(dic[l])) {
            return "l";
        }
        if (c.equals(dic[m])) {
            return "m";
        }
        if (c.equals(dic[n])) {
            return "n";
        }
        if (c.equals(dic[o])) {
            return "o";
        }
        if (c.equals(dic[p])) {
            return "p";
        }
        if (c.equals(dic[q])) {
            return "q";
        }
        if (c.equals(dic[r])) {
            return "r";
        }
        if (c.equals(dic[s])) {
            return "s";
        }
        if (c.equals(dic[t])) {
            return "t";
        }
        if (c.equals(dic[u])) {
            return "u";
        }
        if (c.equals(dic[v])) {
            return "v";
        }
        if (c.equals(dic[w])) {
            return "w";
        }
        if (c.equals(dic[x])) {
            return "x";
        }
        if (c.equals(dic[y])) {
            return "y";
        }
        if (c.equals(dic[z])) {
            return "z";
        }

        if (c.equals(dic[S_INTRG])) {
            return "!";
        }
        if (c.equals(dic[S_COMILLAS])) {
            return "\"";
        }
        if (c.equals(dic[S_SHARP])) {
            return "#";
        }
        if (c.equals(dic[S_DOLLAR])) {
            return "$";
        }
        if (c.equals(dic[S_PORCIENTO])) {
            return "%";
        }
        if (c.equals(dic[S_AND])) {
            return "&";
        }
        if (c.equals(dic[S_COMILLAS_S])) {
            return "\'";
        }
        if (c.equals(dic[S_PAR_A])) {
            return "(";
        }
        if (c.equals(dic[S_PAR_C])) {
            return ")";
        }
        if (c.equals(dic[S_ASTERISCO])) {
            return "*";
        }
        if (c.equals(dic[S_MAS])) {
            return "+";
        }
        if (c.equals(dic[S_COMA])) {
            return ",";
        }
        if (c.equals(dic[S_MENOS])) {
            return "-";
        }
        if (c.equals(dic[S_PUNTO])) {
            return ".";
        }
        if (c.equals(dic[S_DIAGONAL_D])) {
            return "/";
        }
        if (c.equals(dic[N_0])) {
            return "0";
        }
        if (c.equals(dic[N_1])) {
            return "1";
        }
        if (c.equals(dic[N_2])) {
            return "2";
        }
        if (c.equals(dic[N_3])) {
            return "3";
        }
        if (c.equals(dic[N_4])) {
            return "4";
        }
        if (c.equals(dic[N_5])) {
            return "5";
        }
        if (c.equals(dic[N_6])) {
            return "6";
        }
        if (c.equals(dic[N_7])) {
            return "7";
        }
        if (c.equals(dic[N_8])) {
            return "8";
        }
        if (c.equals(dic[N_9])) {
            return "9";
        }

        if (c.equals(dic[S_DOS_PUNTOS])) {
            return ":";
        }
        if (c.equals(dic[S_PUNTO_Y_COMA])) {
            return ";";
        }
        if (c.equals(dic[S_MENOR_Q])) {
            return "<";
        }
        if (c.equals(dic[S_IGUAL])) {
            return "=";
        }
        if (c.equals(dic[S_MAYOR_Q])) {
            return ">";
        }
        if (c.equals(dic[S_QUESTION])) {
            return "?";
        }

        if (c.equals(dic[S_CORCHETE_A])) {
            return "[";
        }
        if (c.equals(dic[S_CORCHETE_C])) {
            return "]";
        }
        if (c.equals(dic[S_DIAGONAL_I])) {
            return "\\";
        }
        if (c.equals(dic[S_POW])) {
            return "^";
        }
        if (c.equals(dic[S_GUION_BAJO])) {
            return "_";
        }
        if (c.equals(dic[S_LLAVE_A])) {
            return "{";
        }
        if (c.equals(dic[S_LLAVE_C])) {
            return "}";
        }
        if (c.equals(dic[S_OR])) {
            return "|";
        }
        if (c.equals(dic[S_REDONDEAR])) {
            return "~";
        }
        if (c.equals(dic[S_COMILLA_INCLINADA_I])) {
            return "`";
        }
        if (c.equals(dic[SPACE])) {
            return " ";
        }
        if (c.equals(dic[TAB])) {
            return "  ";
        }
        if (c.equals(dic[SALTO_LN])) {
            return "\n";
        }
        if (c.equals(dic[RETORNO_C])) {
            return "\r";
        }
        if (c.equals(dic[AROBA])) {
            return "@";
        }
        
        return "nrr";
    }

    protected String encript(String code) {

        int index = 0;
        String le = "";
        while (index < code.length()) {
            le += getCharEncript(code.substring(index, index + 1)) + ":";
            index++;
        }
        return le.substring(0, le.length() - 1);

    }
    
    protected void getEncriptCodes(){
       
       File file = new File();
       
       if(!file.isExitsFile(value))return;
       
       String lex = "";
       
       String text = file.read(value);
       
       if(text.length() == 0) return;
       
       int index = 0, count = 0;
       
       while(index < text.length()){
           
           //if(!text.substring(index,index+1).equals("\n"));
           
           if(text.substring(index,index+1).equals("[")){
               
               index = index + 1;
               
               while(!text.substring(index,index+1).equals("]")){
                   
                   lex += text.substring(index,index+1);
                   
                   index++;
                   
               }   index++;
               
               //System.out.println("C: " + lex);
               
               if(count != 98) dic[count] = lex; count++; lex = "";
               
           }
           
           index++;
       }
       
       /*int i = 0;
       
       while(i < 255){
           System.out.println("Code: " + dic[i]);
           i++;
       }*/
       
    }
    
}
