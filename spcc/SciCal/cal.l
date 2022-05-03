%{
#include"y.tab.h"
%}

%%
[0-9]+ {yylval.num=atof(yytext); return number;}
[-+*/.] {return yytext[0];}
[\t]+ ;
\n {return 0;}
COS|cos {return cos1;}
SIN|sin {return sin1;}
TAN|tan {return tan1;}
%%

int yywrap(){
return 1;
}
