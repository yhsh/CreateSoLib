cmake_minimum_required(VERSION 3.4.1)
add_library(
# 设置so文件名称.
TestSo


# 设置这个so文件为共享.
SHARED

# 指向要编译的c文件.
#src/main/jni/chenxi_com_serialportjni_SerialPort.c)
src/main/jni/cn_yhsh_createsolib_MyJniNative.c)

find_library(
log-lib

# Specifies the name of the NDK library that
# you want CMake to locate.
log )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries(
# Specifies the target library.
# 指定目标库.
TestSo

# Links the target library to the log library
# included in the NDK.
${log-lib} )