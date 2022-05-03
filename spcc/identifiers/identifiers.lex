%{
enum {LOOKUP = 0,INT,FLOAT,DOUBLE,DEF};
int state;
int add_count = 1000;
int add_word(int type, char *word);
int lookup_word(char *word);
%}

%%
[\n] {state=LOOKUP;}
[(] {state=LOOKUP;}
^int { state =INT;}
^float { state = FLOAT;}
^double { state = DOUBLE;}
^def { state = DEF;}
end return 0;
[0-9][a-zA-Z0-9]* ;
[a-zA-Z_][a-zA-Z0-9_][(] {
    if(state != LOOKUP){
        add_word(DEF, yytext);
    }
}
[a-zA-Z_][a-zA-Z0-9_]* {
    if(state != LOOKUP) {
        add_word(state, yytext);
    }
}
. ;
%%

int yywrap(){}
struct word *word_list;
struct word {
    char *word_name;
    int word_type;
    int word_address;
    struct word *next;
};

extern void *malloc();

int main(int argc, char **argv){
    yylex();
    struct word *wp = word_list;
    printf("<--------------------Symbol Table-------------------->\nIdentifier\t\tAddress\t\tType\n");
    for(; wp; wp = wp->next) {
        switch(wp->word_type) {
            case INT: 
                printf("%s\t\t\t%d\t\tInteger\n", wp->word_name, wp->word_address); 
                break;
            case FLOAT: 
                printf("%s\t\t\t%d\t\tFloat\n", wp->word_name, wp->word_address);
                break; 
            case DOUBLE: 
                printf("%s\t\t\t%d\t\tDouble\n", wp->word_name, wp->word_address); 
                break;
            case DEF: 
                printf("%s\t\t%d\t\tFunction\n", wp->word_name, wp->word_address); 
                break;
        }
    }
    return 0;
}

int add_word(int type, char *word){
    struct word *wp;
    if(lookup_word(word) != LOOKUP) {
        printf("!!! warning: identifier %s already defined \n", word);
        return 0;
    }

    wp = (struct word *) malloc(sizeof(struct word));
    wp->next = word_list;
    wp->word_name = (char *) malloc(strlen(word)+1);
    strcpy(wp->word_name, word);
    wp->word_type = type;
    add_count += 4;
    wp->word_address = add_count;
    word_list = wp;
    return 1;
}

int lookup_word(char *word){
    struct word *wp = word_list;
    for(; wp; wp = wp->next){
        if(strcmp(wp->word_name, word) == 0)
            return wp->word_type;
    }
    return LOOKUP;
}