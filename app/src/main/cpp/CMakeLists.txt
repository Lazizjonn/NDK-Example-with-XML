cmake_minimum_required(VERSION 3.22.1)

project("ndkexample")

add_library(ndkexample SHARED libs/native-lib.cpp)
add_library(utils SHARED libs/utils.cpp)

target_link_libraries(${CMAKE_PROJECT_NAME} android log)