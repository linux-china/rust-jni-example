package io.questdb.example.rust;

import io.questdb.jar.jni.JarJniLoader;

public class StrReverse {
    static {
           JarJniLoader.loadLib(
                   Main.class,
                   // A platform-specific path is automatically suffixed to path below.
                   "/io/questdb/example/rust/libs",

                   // The "lib" prefix and ".so|.dynlib|.dll" suffix are added automatically as needed.
                   "str_reverse");
       }

       public static native String reversedString(String str);
}
