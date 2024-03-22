Java with Rust by JNI
======================

# Cross compile

Please use GitHub actions to build the Rust library for all platforms.

```
$ mvn rust:build
```

Then build the Java project.

# References

* rust-maven-plugin: Build Rust Cargo crates within a Java Maven Project - https://github.com/questdb/rust-maven-plugin
* jni-rs: JNI Bindings for Rust - https://github.com/jni-rs/jni-rs