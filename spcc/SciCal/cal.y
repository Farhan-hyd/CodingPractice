%{
#include<stdio.h>
#include<math.h>
%}

%union{ double num; }
%token <num> cos1 sin1 tan1 number
%type <num> line exp

%%
line : exp {
    printf("\nResult = %f\n", $$);
    return 0;
}
exp:number {$$=$1;}
|exp'+'number {$$=$1+$3;}
|exp'-'number {$$=$1-$3;}
|exp'*'number {$$=$1*$3;}
|exp'/'number {$$=$1/$3;}
|cos1 number {$$ = cos(($2/180)*3.14);}
|sin1 number {$$ = sin(($2/180)*3.14);}
|tan1 number {$$ = tan(($2/180)*3.14);};
%%

int main(){
    printf("Enter an expression: ");
    yyparse();
}

int yyerror(){
    exit(0);
}
