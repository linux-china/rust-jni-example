package io.questdb.example.rust;

import io.questdb.jar.jni.JarJniLoader;

public class StrReverse {
    static {
        JarJniLoader.loadLib(Main.class, "/io/questdb/example/rust/libs", "str_reverse");
    }

    public static native String reversedString(String str);
}
