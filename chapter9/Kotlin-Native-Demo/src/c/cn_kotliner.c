#include "cn_kotliner.h"
#include <stdio.h>

void printHello(){
    printf("[C] HelloWorld\n");
}

int factorial(int n){
    printf("[C] calc factorial: %d\n", n);
    if(n == 0) return 1;
    return n * factorial( n - 1 );
}
//clang -std=c99 -c cn_kotliner.c -o cn_kotliner.bc -emit-llvm