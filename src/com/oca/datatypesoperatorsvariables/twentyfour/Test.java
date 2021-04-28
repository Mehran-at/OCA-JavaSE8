package com.oca.datatypesoperatorsvariables.twentyfour;

class Test {

    public static void main(String[] args) {

        String string = "string";
        char chaar = 'Z';
        byte bite = 127;
        short shoort = 32_767;
        int integer = 2_147_483_647;
        long loong = 9_223_372_036_854_775_807L;
        float floaat = 340_282_346_638_528_860_000_000_000_000_000_000_000.000000f;
        double dooble = 10_0.35d;
        Integer integerObject = 2_147_483_647;
//        string = (String) chaar;
//        ---------------------------
//        chaar = (char)string;
        chaar = (char) bite;
        chaar = (char) shoort;
        chaar = (char) integer;
        chaar = (char) loong;
        chaar = (char) floaat;
        chaar = (char) dooble;
//        chaar = (short) bite;
//        chaar = (int) bite;
//        chaar = (long) bite;
//        chaar = (float) bite;
//        chaar = (double) bite;
//        ---------------------------
        bite = (byte) chaar;
        bite = (byte) shoort;
        bite = (byte) integer;
        bite = (byte) loong;
        bite = (byte) floaat;
        bite = (byte) dooble;
//        bite = (short) chaar;
//        bite = (int) chaar;
//        bite = (long) chaar;
//        bite = (float) chaar;
//        bite = (double) chaar;
//        ---------------------------
        shoort = (short) chaar;
        shoort = bite;
        shoort = (short) integer;
        shoort = (short) loong;
        shoort = (short) floaat;
        shoort = (short) dooble;
//        ---------------------------
        integer = chaar;
        integer = bite;
        integer = shoort;
        integer = (int) loong;
        integer = (int) floaat;
        integer = (int) dooble;
//        ---------------------------
        loong = chaar;
        loong = bite;
        loong = shoort;
        loong = integer;
        loong = (long) floaat;
        loong = (long) dooble;

        loong = (char) chaar;
        loong = (byte) chaar;
        loong = (short) chaar;
        loong = (int) chaar;
        loong = (long) chaar;

        loong = (char) bite;
        loong = (byte) bite;
        loong = (short) bite;
        loong = (int) bite;
        loong = (long) bite;
//        loong = (float) bite;

        loong = (char) shoort;
        loong = (byte) shoort;
        loong = (short) shoort;
        loong = (int) shoort;
        loong = (long) shoort;
//        loong = (float) shoort;

        loong = (char) integer;
        loong = (byte) integer;
        loong = (short) integer;
        loong = (int) integer;
        loong = (long) integer;
//        loong = (float) integer;

        loong = (char) loong;
        loong = (byte) loong;
        loong = (short) loong;
        loong = (int) loong;
        loong = (long) loong;
//        loong = (float) loong;
        loong = (char) dooble;
        loong = (byte) dooble;
//        ---------------------------
        floaat = chaar;
        floaat = bite;
        floaat = shoort;
        floaat = integer;
        floaat = (char) chaar;
        floaat = (byte) chaar;
        floaat = (short) chaar;
        floaat = (int) chaar;
        floaat = (long) chaar;
        floaat = (float) chaar;
        floaat = (char) bite;
        floaat = (byte) bite;
        floaat = (short) bite;
        floaat = (int) bite;
        floaat = (long) bite;
        floaat = (float) bite;
        floaat = (char) shoort;
        floaat = (byte) shoort;
        floaat = (short) shoort;
        floaat = (int) shoort;
        floaat = (long) shoort;
        floaat = (float) shoort;
        floaat = (char) integer;
        floaat = (byte) integer;
        floaat = (short) integer;
        floaat = (int) integer;
        floaat = (long) integer;
        floaat = (float) integer;
        floaat = (char) loong;
        floaat = (byte) loong;
        floaat = (short) loong;
        floaat = (int) loong;
        floaat = (long) loong;
        floaat = (float) loong;
        floaat = (char) dooble;
        floaat = (byte) dooble;
        floaat = (short) dooble;
        floaat = (int) dooble;
        floaat = (long) dooble;
        floaat = (float) dooble;
//        ---------------------------
        dooble = chaar;
        dooble = bite;
        dooble = shoort;
        dooble = integer;
        dooble = loong;
        dooble = floaat;
        dooble = (char) chaar;
        dooble = (byte) chaar;
        dooble = (short) chaar;
        dooble = (int) chaar;
        dooble = (long) chaar;
        dooble = (float) chaar;
        dooble = (char) bite;
        dooble = (byte) bite;
        dooble = (short) bite;
        dooble = (int) bite;
        dooble = (long) bite;
        dooble = (float) bite;
        dooble = (char) shoort;
        dooble = (byte) shoort;
        dooble = (short) shoort;
        dooble = (int) shoort;
        dooble = (long) shoort;
        dooble = (float) shoort;
        dooble = (char) integer;
        dooble = (byte) integer;
        dooble = (short) integer;
        dooble = (int) integer;
        dooble = (long) integer;
        dooble = (float) integer;
        dooble = (char) loong;
        dooble = (byte) loong;
        dooble = (short) loong;
        dooble = (int) loong;
        dooble = (long) loong;
        dooble = (float) loong;
        dooble = (char) dooble;
        dooble = (byte) dooble;
        dooble = (short) dooble;
        dooble = (int) dooble;
        dooble = (long) dooble;
        dooble = (float) dooble;

        dooble = (char) floaat;
        dooble = (byte) floaat;
        dooble = (short) floaat;
        dooble = (int) floaat;
        dooble = (long) floaat;
//        ---------------------------
        loong = chaar + integer;
        floaat = chaar * loong * integer * floaat;
        floaat = loong + integer + chaar;
        dooble = floaat;
//        floaat = dooble;
//        floaat = (double)dooble;
    }
}
/*
    Double takes more space but more precise during computation and float takes less space but less precise. According
    to the IEEE standards_ float is a 32 bit representation of a real number while double is a 64 bit representation.
    In Java programs we normally mostly see the use of double data type.
 */
