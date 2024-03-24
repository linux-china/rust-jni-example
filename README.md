Java with Rust by JNI
======================

# Project structure:

* `src/main/rust`: Rust library with JNI
* `src/main/java`: Java code
* `StrReverse.java`: Java JNI interface

# Cross compile

Please use GitHub Actions to build the Rust library for all platforms by `mvn rust:build`,
then use `mvn -DskipTests package` to build the Java project.

# References

* rust-maven-plugin: Build Rust Cargo crates within a Java Maven Project - https://github.com/questdb/rust-maven-plugin
* jni-rs: JNI Bindings for Rust - https://github.com/jni-rs/jni-rs