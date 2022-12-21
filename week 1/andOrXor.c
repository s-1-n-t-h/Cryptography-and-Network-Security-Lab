// Online C compiler to run C program online
#include <stdio.h>

void andOrXor(char *str){
    char *c = str; 
    char *a = str;
    char *b = str;
    printf("String Recived: ");
    while(*c != '\0'){
        printf("%c",*c);
        c++;
    }
    printf("\n");
    
    printf("After AND with 127: ");
    while(*str != '\0'){
        printf("%c",(*str)&127);
        str++;                                                              
    }
    printf("\n");
    
     printf("After OR with 127: ");
    while(*b != '\0'){
        printf("%c",(*b|127));
        b++;                                                              
    }
    printf("\n");
    
    printf("After XOR with 127: ");
    while(*a != '\0'){
        printf("%c",(*a^127));
        a++;                                                              
    }
    printf("\n");
}
int main() {
    // Write C code here
    char *c = "Hello World.";
    andOrXor(c);
    return 0;
}
