%{
#include<stdio.h>
#include<string.h> 
int no_of_lines = 0, no_of_chars = 0, no_of_tabs = 0, no_of_words = 0, no_of_uppercase =0, no_of_lowercase =0, no_of_sent = 0, no_of_num = 0;
%}

%%
\n {no_of_words++; no_of_lines++;};
\t {no_of_words++;++no_of_tabs;}; 
[.?!] {no_of_sent++; no_of_chars++;}; 
[0-9] {++no_of_num; no_of_chars++;};
[a-z] {++no_of_lowercase;no_of_chars++;}; 
[A-Z] {++no_of_uppercase;no_of_chars++;}; 
[' '] {no_of_words++;};
. no_of_chars++; 
end return 0;
%%

int yywrap(){}

int main(int argc, char **argv){
yylex();
printf("Count of characters = %d \nCount of words = %d \nCount of sentences = %d \nCount of lines= %d \nCount of uppercase letters = %d \nCount of lowercase letters =%d \nCount of tabs = %d \nCount of numbers = %d \n",no_of_chars, no_of_words, no_of_sent,no_of_lines,no_of_uppercase,no_of_lowercase, no_of_tabs, no_of_num);
return 0;
}