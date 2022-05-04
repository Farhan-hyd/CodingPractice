%{
#include<stdio.h>
#include<string.h>
int cap = 0;
%}

%%
([A-Z])* {cap++;} 
"\n" {printf("%d\n", cap);}
"#" return 0;
%%

int yywrap(void){}

int main() {
	yylex();
	return 0;
}
