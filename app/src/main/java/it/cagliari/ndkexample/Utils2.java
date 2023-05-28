package it.cagliari.ndkexample;

public class Utils2 {

    static {
        System.loadLibrary("utils");
    }

    public native String getMessage();

}