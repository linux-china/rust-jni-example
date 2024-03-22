package io.questdb.example.rust;

import io.questdb.jar.jni.JarJniLoader;

public class Main {
    static {
        JarJniLoader.loadLib(
                Main.class,
                // A platform-specific path is automatically suffixed to path below.
                "/io/questdb/example/rust/libs",

                // The "lib" prefix and ".so|.dynlib|.dll" suffix are added automatically as needed.
                "str_reverse");
    }

    public static native String reversedString(String str);

    public static void main(String[] args) {
        System.out.println(reversedString("Hello World!"));
    }
}
