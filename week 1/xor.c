#include <stdio.h>
#include<string.h>
void xor(char *str){
    char *c = str; 
    printf("String Recived: ");
    while(*c != '\0'){
        printf("%c",*c);
        c++;
    }
    printf("\n");
    
    printf("After XOR with 0: ");
    while(*str != '\0'){
        printf("%c",*str^0);
        str++;                                                              
    }
    printf("\n");
    
}
int main() {
    // Write C code here
    char *c = "Hello World.";
    xor(c);
    return 0;
}

