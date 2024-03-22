use jni::JNIEnv;
use jni::objects::{JClass, JString};
use jni::sys::jstring;

#[no_mangle]
pub extern "system" fn Java_io_questdb_example_rust_Main_reversedString<'local>(
    mut env: JNIEnv,
        _class: JClass<'local>,
        input: JString<'local>) -> jstring {
    let input: String =
        env.get_string(&input).expect("Couldn't get java string!").into();
    let reversed: String = input.chars().rev().collect();
    let reversed = format!("{}: {}", "Reversed", reversed);
    let output = env.new_string(reversed)
        .expect("Couldn't create java string!");
    output.into_raw()
}

#[cfg(test)]
mod tests {
    #[test]
    fn test_rubber_duck() {
        assert_ne!("rubber", "duck");
    }
}
