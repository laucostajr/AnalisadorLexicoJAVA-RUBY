package dlince;

%%

%public
%class Analisador
%unicode
%line
%column
%type TokenRuby

%{
	StringBuffer string = new StringBuffer();
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]
Alfa = [a-zA-Z]
AlfaNumerico = [a-zA-Z0-9]
Identificador = ({Alfa}|_)({AlfaNumerico}|_)*
IdentificadorMetodo = ({Alfa}|_)({AlfaNumerico}|_)*("!"|"?")?
Digito = [0-9]
Inteiro = {Digito}+("_"{Digito}+)*
Decimal = {Digito}+"."{Digito}+|"."{Digito}+|{Digito}+"."
DecOrInt = {Decimal}|{Inteiro}
Invalido = ({Alfa}|_)({AlfaNumerico}|_)*

%state STRING
%state CHAR

%%

<YYINITIAL> {

/* ExpressÃ£o Regular */
\/.*|\n*\/					{ return new TokenRuby("REGEX", yytext(), yyline, yycolumn, "Expressao Regular."); }

/* SIMBOLOS */
"+="						{ return new TokenRuby("PLUSEQ", yytext(), yyline, yycolumn, "(a += b) equivalente a (a = a + b)"); }
"-="						{ return new TokenRuby("SUBEQ", yytext(), yyline, yycolumn, "(a -= b) equivalente a (a = a - b)"); }
"*="						{ return new TokenRuby("MULTEQ", yytext(), yyline, yycolumn, "(a *= b) equivalente a (a = a * b)"); }
"/="						{ return new TokenRuby("DIVEQ", yytext(), yyline, yycolumn, "(a /= b) equivalente a (a = a / b)"); }
"%="						{ return new TokenRuby("MODEQ", yytext(), yyline, yycolumn, "(a %= b) equivalente a (a = a % b)"); }
"**="						{ return new TokenRuby("EXPEQ", yytext(), yyline, yycolumn, "(a **= b) equivalente a (a = a ** b)"); }
"**"						{ return new TokenRuby("EXP", yytext(), yyline, yycolumn, "Exponenciacao: 2**3 = 8"); }
"=~"						{ return new TokenRuby("CORRESP", yytext(), yyline, yycolumn, "Correspondencia padrao, usado para expressao regular. O explo a seguie ira retornar 4, que eh a posicao que corresponde a expressao regular: \"abc 123\" =~ /[0-9]/"); }
"!~"						{ return new TokenRuby("NOTCORRESP", yytext(), yyline, yycolumn, "Nao-Correspondencia padrao, usado para expressao regular, retorna true quando a string nÃ£o corresponde a expressao regular, ou false quando corresponde."); }
"==="						{ return new TokenRuby("EQEQEQ", yytext(), yyline, yycolumn, "Verifica se um subconjunto esta contido em um conjunto. No exmplo a seguir ira retornar true, pois abc esta contido no conjunto de letras de a Ã  z: /[a-z]/ === \"abc\""); }
"=="						{ return new TokenRuby("EQEQ", yytext(), yyline, yycolumn, "Verifica se dois operandos sao iguais: (a == a) retorna true, (a == b) retorna false"); }
"^="						{ return new TokenRuby("BITXOREQ", yytext(), yyline, yycolumn, "Faz uma operacao binaria XOR e atribui a variavel. 10^3 retorna 9"); }
"||="						{ return new TokenRuby("ORBOOLEQ", yytext(), yyline, yycolumn, "Operador condicional, se 'a' for true mantenha 'a', se for false atribua 'b': a ||= b "); }
"|="						{ return new TokenRuby("OREQ", yytext(), yyline, yycolumn, "Retorna e atribui true se pelomenos um dos operandos for true: A |= B eh equivalente a A = A | B" ); }
"!="						{ return new TokenRuby("DIFERENTE", yytext(), yyline, yycolumn, "Retorna true se os operandos forem diferente: a != b retorna true"); }
"<=>"						{ return new TokenRuby("COMPCOMB", yytext(), yyline, yycolumn, "A <=> B avalia para -1, 0 ou 1; se A for menor do que, igual ou maior do que B, respectivamente"); }
"<<="						{ return new TokenRuby("SHIFTLEQ", yytext(), yyline, yycolumn, "Left Shift com atribuicao: A <<= B eh equivalente a A = A << B"); }
">>="						{ return new TokenRuby("SHIFTREQ", yytext(), yyline, yycolumn, "Right Shift com atribuicao: A >>= B eh equivalente a A = A >> B"); }
">="						{ return new TokenRuby("MAIOREQ", yytext(), yyline, yycolumn, "Retorna true se o valor da esquerda for maior que o da direita ou igual: 10 >= 5"); }
"<="						{ return new TokenRuby("MENOREQ", yytext(), yyline, yycolumn, "Retorna true se o valor da esquerda for menor que o da direita ou igual: 5 <= 10"); }
"<<"						{ return new TokenRuby("SHIFTL", yytext(), yyline, yycolumn, "Left Shift, faz o deslocamento binario a esquerda, ocorrendo uma multiplicacao: 10<<1 == 20"); }
">>"						{ return new TokenRuby("SHIFTR", yytext(), yyline, yycolumn, "Left Right, faz o deslocamento binario a direita, ocorrendo uam divisao: 10>>1 == 5"); }
"="							{ return new TokenRuby("EQ", yytext(), yyline, yycolumn, "Atribuicao de valores"); }
"+"							{ return new TokenRuby("PLUS", yytext(), yyline, yycolumn, "Operador de soma"); }
"-"							{ return new TokenRuby("SUB", yytext(), yyline, yycolumn, "Operador de subtracao"); }
"*"							{ return new TokenRuby("MULT", yytext(), yyline, yycolumn, "Operador de multiplicacao"); }
"/"							{ return new TokenRuby("DIV", yytext(), yyline, yycolumn, "Operador de divisao"); }
"%"							{ return new TokenRuby("MOD", yytext(), yyline, yycolumn, "Operador de modulo, retorna o resto de ums divisao"); }
"["							{ return new TokenRuby("COLCHETE", yytext(), yyline, yycolumn, "Usado em Arrays: ary = [1, \"two\", 3.0]."); }
"]"							{ return new TokenRuby("COLCHETE2", yytext(), yyline, yycolumn, "Usado em Arrays: ary = [1, \"two\", 3.0]."); }
"{"							{ return new TokenRuby("CHAVE", yytext(), yyline, yycolumn, "Usado para delimitar Hash: h = { 7 => 35, \"c\" => 2, \"a\" => 1 }"); }
"}"							{ return new TokenRuby("CHAVE2", yytext(), yyline, yycolumn, "Usado para delimitar Hash: h = { 7 => 35, \"c\" => 2, \"a\" => 1 }"); }
"("							{ return new TokenRuby("PARENTESE", yytext(), yyline, yycolumn, "Usado para limitar um conjundo de dados: \"(1 + 2)*5\" ou \"for a in (1..6)\""); }
")"							{ return new TokenRuby("PARENTESE2", yytext(), yyline, yycolumn, "Usado para limitar um conjundo de dados: \"(1 + 2)*5\" ou \"for a in (1..6)\""); }
"@@"						{ return new TokenRuby("ARROBA2", yytext(), yyline, yycolumn, "Prescede uma variavel de classe, equivalente ao atributo estatico do Java."); }
"@"							{ return new TokenRuby("ARROBA", yytext(), yyline, yycolumn, "Prescede uma variavel de instancia \"Atributo do objeto\"."); }
"$"							{ return new TokenRuby("DOLAR", yytext(), yyline, yycolumn, "Prescede uma variavel global."); }
";"							{ return new TokenRuby("PONTOVIRG", yytext(), yyline, yycolumn, "Delimitador de instrucao, pode ser omitido."); }
"."							{ return new TokenRuby("PONTO", yytext(), yyline, yycolumn, "Usado para trabalhar com objetos: \"arr = Array.new(3)\" ou \"arr.drop(3)\"."); }
","							{ return new TokenRuby("VIRGULA", yytext(), yyline, yycolumn, "Usado para separar identificadores e dados: \"ary = [1, \"two\", 3.0]\" ou \"Array.new(3, true)\"."); }
"||"						{ return new TokenRuby("ORBOOL", yytext(), yyline, yycolumn, "Operador logico, retorna true se pelomenos um dos operandos forem true"); }
"|"							{ return new TokenRuby("BITOR", yytext(), yyline, yycolumn, "Operador OR binario: 1010 | 0011 = 1011"); }
"?"							{ return new TokenRuby("INTERROG", yytext(), yyline, yycolumn, "Aplicado noperador ternÃ¡rio"); }
"!"							{ return new TokenRuby("NOT", yytext(), yyline, yycolumn, "Inverte o estado da logica do operando: !true eh equivalente a false"); }
"::"						{ return new TokenRuby("DOISPONTDUP", yytext(), yyline, yycolumn, "Permite acessar uma constante, modulo ou classe definida dentro de outra classe ou modulo."); }
":"							{ return new TokenRuby("DOISPONTOS", yytext(), yyline, yycolumn,"Aplicado no operador ternario"); }
"^"							{ return new TokenRuby("BITXOR", yytext(), yyline, yycolumn, "Operador binario XOR: 1010 ^ 0011 = 1001"); }
"~"							{ return new TokenRuby("BITCOMP", yytext(), yyline, yycolumn, "Operador de complemento binario: ~10 retorna -11"); }
"&&="						{ return new TokenRuby("ANDBOOLEQ", yytext(), yyline, yycolumn,"Operador logico AND: A &&= B Ã© equivalente a A = A && B "); }
"&&"						{ return new TokenRuby("ANDBOOL", yytext(), yyline, yycolumn, "Operador logico AND: (a==true && b==true) retorna true "); }
"&="						{ return new TokenRuby("BITANDEQ", yytext(), yyline, yycolumn, "Operador AND binario com atribuicao, sendo a=10 e b=3, a recebe o valor 2: a &= b, a == 2 "); }
"&"							{ return new TokenRuby("BITAND", yytext(), yyline, yycolumn, "Operador AND binario: 1010 & 0011 = 0010"); }
"<"							{ return new TokenRuby("MENOR", yytext(), yyline, yycolumn, "Retorna true se o operando da esquerda for menor que o da direita: 5<10"); }
">"							{ return new TokenRuby("MAIOR", yytext(), yyline, yycolumn, "Retorna true se o operando da esquerda for maior que o da direita: 10>5"); }


/* PALAVRAS RESERVADAS */
"alias"						{ return new TokenRuby("ALIAS", yytext(), yyline, yycolumn, "Mantem a definicao atual do metodo, mesmo quando os metodos sao substitui­dos."); }
"and"						{ return new TokenRuby("AND", yytext(), yyline, yycolumn, "eh equivalente a &&.Avalia o lado esquerdo e, se o resultado for verdadeiro, avalia o lado direito."); }
"BEGIN"						{ return new TokenRuby("BEGIN", yytext(), yyline, yycolumn, "Registra a rotina de inicializacao. O bloco seguido depois BEGIN eh avaliado antes de qualquer outra declaracao nesse arquivo"); }
"begin"						{ return new TokenRuby("BEGIN2", yytext(), yyline, yycolumn, "Expressao executa seu corpo e retorna o valor da ultima expressao avaliada."); }
"break"						{ return new TokenRuby("BREAK", yytext(), yyline, yycolumn, "Sai do loop mais interno. O break nao sai da expressÃ£o case"); }
"case"						{ return new TokenRuby("CASE", yytext(), yyline, yycolumn, "As case expressoes tambem sao para execucao condicional. sendo que suas comparacoes equivale ao mesmo que ===."); }
"class"						{ return new TokenRuby("CLASS", yytext(), yyline, yycolumn, "Define uma nova classe."); }
"def"						{ return new TokenRuby("DEF", yytext(), yyline, yycolumn, "Palavra para indentificar metodos, a partir dela que o programa identifica a palavra a frente como um metodo"); }
"defined?"					{ return new TokenRuby("DEFINED?", yytext(), yyline, yycolumn, "Retorna false se a expressao nao estiver definida. Retorna a sequencia de caracteres que descreve um tipo de expressao."); }
"do"						{ return new TokenRuby("DO", yytext(), yyline, yycolumn, "Define uma estrutura de repeticao sem condicao" ); }
"else"						{ return new TokenRuby("ELSE", yytext(), yyline, yycolumn, "Representa a execucao de um comando quando a condicao nao eh validada"); }
"elsif"						{ return new TokenRuby("ELSIF", yytext(), yyline, yycolumn, "Equivale ao fechamento de uma condicao e abertura de outra, mas resumida em uma unica palavra."); }
"END"						{ return new TokenRuby("END", yytext(), yyline, yycolumn, "Define o final da Rotina de inicializacao, finaliza o bloco"); }
"end"						{ return new TokenRuby("END2", yytext(), yyline, yycolumn, "Define o final de um bloco de Expressoes"); }
"ensure"					{ return new TokenRuby("ENSURE", yytext(), yyline, yycolumn, "Seu corpo de clausula eh executado sempre que o begincorpobegin for encerrado."); }
"false"						{ return new TokenRuby("FALSE", yytext(), yyline, yycolumn, "A unica instancia da classe FalseClass (representa falso)"); }
"for"						{ return new TokenRuby("FOR", yytext(), yyline, yycolumn, "Palavra para estrutura de repeticao, Executa o corpo para cada elemento no resultado da expressao."); }
"if"						{ return new TokenRuby("IF", yytext(), yyline, yycolumn, "Expressaos usadas para execucao condicional. Os valores false e nil sao falsos, e tudo o mais eh verdade."); }
"in"						{ return new TokenRuby("IN", yytext(), yyline, yycolumn, "Define um contado para uma estrutura de Repeticao For"); }
"module"					{ return new TokenRuby("MODULE", yytext(), yyline, yycolumn, "Tipo de objeto, que eh usado para armazenar comandos, valores e formulas, eh mais pratico pois nao eh necessario que seja inicializado "); }
"next"						{ return new TokenRuby("NEXT", yytext(), yyline, yycolumn, "Salta para a proxima iteracao do loop mais interno."); }
"nil"						{ return new TokenRuby("NIL", yytext(), yyline, yycolumn, "eh equivalente a Nulo.a unica instancia da Classe NilClass (representa falso)"); }
"not"						{ return new TokenRuby("NOT", yytext(), yyline, yycolumn, "Retorna verdadeiro se for falso, falso se verdadeiro."); }
"or"						{ return new TokenRuby("OR", yytext(), yyline, yycolumn, "eh equivalente a ||.Avalia o lado esquerdo, entao se o resultado for falso, avalia o lado direito"); }
"redo"						{ return new TokenRuby("REDO", yytext(), yyline, yycolumn, "Reinicia a iteracao do loop mais interno, sem verificar a condicao do loop."); }
"rescue"					{ return new TokenRuby("RESCUE", yytext(), yyline, yycolumn, "Clausula com o tipo de excecaoo de um Bloco correspondente"); }
"retry"						{ return new TokenRuby("RETRY", yytext(), yyline, yycolumn, "Reinicia a invocacao de uma chamada"); }
"return"					{ return new TokenRuby("RETURN", yytext(), yyline, yycolumn, "Sai do metodo com o valor de retorno."); }
"self"						{ return new TokenRuby("SELF", yytext(), yyline, yycolumn, "O receptor do mÃ©todo atual"); }
"super"						{ return new TokenRuby("SUPER", yytext(), yyline, yycolumn, "Chama o metodo que substitui o metodo atual"); }
"then"						{ return new TokenRuby("THEN", yytext(), yyline, yycolumn, "Indica o proximo comando a ser executado. sua colocacao eh opcional "); }
"true"						{ return new TokenRuby("TRUE", yytext(), yyline, yycolumn, "A unica instancia da classe TrueClass (valor verdadeiro tipico)"); }
"undef"						{ return new TokenRuby("UNDEF", yytext(), yyline, yycolumn, "Cancela a definicao do metodo."); }
"unless"					{ return new TokenRuby("UNLESS", yytext(), yyline, yycolumn, "Expressoes usadas para a execucao condicional reversa. eh equivalente a: if !(cond) ... else ...end"); }
"until"						{ return new TokenRuby("UNTIL", yytext(), yyline, yycolumn, "Executa o corpo ate a expressao de condicao retornar verdadeira."); }
"when"						{ return new TokenRuby("WHEN", yytext(), yyline, yycolumn, "Palavra utilizada para subdividir as condicoes em uma expressao case"); }
"while"						{ return new TokenRuby("WHILE", yytext(), yyline, yycolumn, "Executa o corpo enquanto a expressÃ£o de condicao retorna verdadeira."); }
"puts"						{ return new TokenRuby("PUTS", yytext(), yyline, yycolumn, "Retorna na tela o valor informado."); }
"yield"						{ return new TokenRuby("YIELD", yytext(), yyline, yycolumn, "Avalia o bloco dado ao metodo atual com argumentos, se nenhum argumento for dado, nil eh usado como um argumento."); }
"__FILE__"					{ return new TokenRuby("__FILE__", yytext(), yyline, yycolumn, "O nome do arquivo fonte atual"); }
"__LINE__"					{ return new TokenRuby("__LINE__", yytext(), yyline, yycolumn, "O numero da linha atual no arquivo de origem."); }

}

<YYINITIAL> {
/* IDENTIFICADORES */ 
{Identificador}				{ return new TokenRuby("IDENTIFICADOR", yytext(), yyline, yycolumn, "Identificador de metodos, variaveis, constantes, etc"); }
{IdentificadorMetodo}			{ return new TokenRuby("IDENTIFICADOR_METODO", yytext(), yyline, yycolumn, "Identificador de metodos que utilizam ? ou ! no final"); }

/* NÃšMEROS */
{DecOrInt}("e"|"E")("+"|"-")?{DecOrInt} { return new TokenRuby("NOTACAO_CIENTIFICA", yytext(), yyline, yycolumn, "Escrita de notacao cientefica"); }
{Inteiro}					{ return new TokenRuby("INTEIRO", yytext(), yyline, yycolumn, "Valor de numero inteiro."); }
{Decimal}					{ return new TokenRuby("DECIMAL", yytext(), yyline, yycolumn, "Valor de numero decimal"); }


\"							{yybegin(STRING); string.setLength(0); }

/* COMENTARIO */
"=begin"(.*{LineTerminator}*)*"=end" | "#"+.+	{ /* ignore */ }

/* espaco em branco */
{WhiteSpace}				{ /* ignore */ }
}

/* ESTADO PARA TRATAR STRINGS */
<STRING> {
\"							{ 
							  yybegin(YYINITIAL);
                              return new TokenRuby("STRING", string.toString(), yyline, yycolumn, "String, sequencia de caracteres."); 
							}

/* CONDICAO PARA TRATAR O CHAR
   CASO A LINGUAGEM TIVESSE
   COMENTAMOS POIS O RUBY NAO PRECISA */
/* [^\n\r]						{ string.append( yytext() ); yybegin(CHAR); } */

[^\n\r\"\\]+				{ string.append( yytext() ); }
\\\\n						{ string.append("\\n"); }
\\\\t						{ string.append("\\t"); }
\\\\r						{ string.append("\\r"); }
\\t							{ string.append("\t"); }
\\n							{ string.append("\n"); }
\\r							{ string.append("\r"); }
\\\"						{ string.append('\"'); }
\\\\						{ string.append("\\"); }
}

/* ESTADOS PARA TRATAR CHAR
 */
<CHAR> {
\"							{ 
                              new TokenRuby("CHAR", string.toString(), yyline, yycolumn);
                              yybegin(YYINITIAL);  
							}
}

/* Excecao caso entre caractere invalido */
{Invalido}						{ 
							  throw new RuntimeException("Caractere invalido " + yytext() + " na linha " + (yyline+1) + ", coluna " +(yycolumn+1)); 
						      return new TokenRuby("INVALIDO", yytext(), yyline, yycolumn, "Caractere invalido");
            
							}

