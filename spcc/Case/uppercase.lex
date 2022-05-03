%{
    int count = 0;
}%

%%
[A-Z] {printf("%s capital letter\n", yytext); count++;}
. {printf("%s not a capital letter\n", yytext);}
\n\n\n return 0;
%%

nt yywrap(){} 

int main(){
FILE *fp;
char filename[50];
printf("Enter the filename: \n");
scanf("%s",filename);
fp = fopen(filename,"r");
yyin = fp;
yylex();
printf("No of capital letters in given input is %d", count);
return 0;
}