package it.cagliari.ndkexample

class Utils {

    val key : String= "123"

    companion object {
        init {
            System.loadLibrary("utils")
        }
    }

    external fun getInfo(): String

    external fun max(a: Int, b: Int): Int

    external fun neverShareKey() : String
}