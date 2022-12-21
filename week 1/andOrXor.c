// Online C compiler to run C program online
#include <stdio.h>

void andOrXor(char *str){
    char *c = str; 
    printf("String Recived: ");
    while(*c != '\0'){
        printf("%c",*c);
        c++;
    }
    printf("\n");
    
    printf("After AND-OR-XOR with 127: ");
    while(*str != '\0'){
        printf("%c",(*str)&127|127^127);
        str++;                                                              
    }
    printf("\n");
}
int main() {
    // Write C code here
    char *c = "Hello World.";
    andOrXor(c);
    return 0;
}

