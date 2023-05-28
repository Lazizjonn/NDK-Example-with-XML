//
// Created by user on 5/27/2023.
//

#ifndef NDK_EXAMPLE_FUNCTION_H
#define NDK_EXAMPLE_FUNCTION_H

#define repeat(n) for(int i = 0; i<n; i++)
#define nativeScope extern "C"
#define fun(ClassName, MethodName, ReturnType, ...) JNIEXPORT ReturnType JNICALL Java_it_cagliari_ndkexample##_##ClassName##_##MethodName(JNIEnv *env, jobject thiz, ## __VA_ARGS__)


#endif //NDK_EXAMPLE_FUNCTION_H
