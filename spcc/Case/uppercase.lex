%{
    int count = 0;
%}

%%
[A-Z] {printf("%s capital letter\n", yytext); count++;}
[a-z0-9] {printf("%s not a capital letter\n", yytext);}
([ ])+ ;
\t ;
\n return 0;
%%

int yywrap(){
    return 0;
}

int main(){
yylex();
printf("No of capital letters in given input is %d\n", count);
return 0;
}