package cn.yhsh.createsolib;

/**
 * @author Zheng Cong
 * @date 2022/2/14 14:37
 */
public class MyJniNative {
    static {
        System.loadLibrary("TestSo");
    }

    public static native String helloWorld();
}
