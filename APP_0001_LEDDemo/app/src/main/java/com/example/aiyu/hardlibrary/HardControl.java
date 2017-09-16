
package com.example.aiyu.hardlibrary;

public class HardControl {
    public static native int ledCtrl(int which, int status);
    public static native int ledOpen();
    public static native void ledClose();

    static {
        // ctrl+alt+T 快速添加关键字
        try {
            System.loadLibrary("hardcontrol");   // hardcontrol.so c实现的库
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
