# AnalisadorLexicoJAVA-RUBY

Desenvolvido em Java na disciplina de Compiladores (IFCE MARACANAU).

A linguagem Ruby nasceu em 24 de fevereiro de 1993 por Yukihiro Matsumoto. Ruby está posicionado no top 10 da maioria dos índices que medem o crescimento da popularidade de linguagens de programação pelo mundo todo. O Ruby também é totalmente livre. Não somente livre de custos, mas também livre para utilizar, copiar, modificar e distribuir.
Características
 • Todas as variáveis são objetos, onde até os "tipos primitivos" (tais como inteiro, real, entre outros) são classes
 • Métodos de geração de código em tempo real, como os "attribute accessors"
 • Através do RubyGems, é possível instalar e atualizar bibliotecas com uma linha de comando, de maneira similar    ao APT do Debian Linux
 • Code blocks (blocos de código) passados como parâmetros para métodos; permite a criação de clausuras
 • Mixins, uma forma de emular a herança múltipla
 • Tipagem dinâmica, mas forte. Isso significa que todas as variáveis devem ter um tipo (fazer parte de uma classe), mas a     classe pode ser alterada dinamicamente

O seu criador, Yukihiro Matsumoto, uniu partes das suas linguagens favoritas (Perl, Smalltalk, Eiffel, Ada e Lisp) para formar uma nova linguagem que equilibra a programação funcional com a programação imperativa.
Ele disse com frequência que está “tentando tornar o Ruby natural, não simples”, de uma forma que reflita a vida. Elaborando sobre isto, acrescenta: 

Detalhes do Analisador
Tokens

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

/* ExpressÃƒÂ£o Regular */
\/.*|\n*\/ "Expressao Regular."); 

/* SIMBOLOS */
"+=" "(a += b) equivalente a (a = a + b)"
"-=" "(a -= b) equivalente a (a = a - b)"
"*=" "(a *= b) equivalente a (a = a * b)"
"/=" "(a /= b) equivalente a (a = a / b)"
"%=" "(a %= b) equivalente a (a = a % b)"
"**=" "(a **= b) equivalente a (a = a ** b)"
"**" "Exponenciacao: 2**3 = 8"); 
"=~" "Correspondencia padrao, usado para expressao regular. O exemplo a seguir ira retornar 4, que eh a posicao que corresponde a expressao regular: \"abc 123\" =~ /[0-9]/" 
"!~" "Nao-Correspondencia padrao, usado para expressao regular, retorna true quando a string nÃƒÂ£o corresponde a expressao regular, ou false quando corresponde.");
"===" "Verifica se um subconjunto esta contido em um conjunto. No exmplo a seguir ira retornar true, pois abc esta contido no conjunto de letras de a ÃƒÂ  z: /[a-z]/ === \"abc\"");
"==" "Verifica se dois operandos sao iguais: (a == a) retorna true, (a == b) retorna false");
"^=" "Faz uma operacao binaria XOR e atribui a variavel. 10^3 retorna 9");
"||=" "Operador condicional, se 'a' for true mantenha 'a', se for false atribua 'b': a ||= b ");
"|=" "Retorna e atribui true se pelomenos um dos operandos for true: A |= B eh equivalente a A = A | B" );
"!=" "Retorna true se os operandos forem diferente: a != b retorna true");
"<=>" "A <=> B avalia para -1, 0 ou 1; se A for menor do que, igual ou maior do que B, respectivamente");
"<<=" "Left Shift com atribuicao: A <<= B eh equivalente a A = A << B");
">>=" "Right Shift com atribuicao: A >>= B eh equivalente a A = A >> B");
">=" "Retorna true se o valor da esquerda for maior que o da direita ou igual: 10 >= 5");
"<=" "Retorna true se o valor da esquerda for menor que o da direita ou igual: 5 <= 10");
"<<" "Left Shift, faz o deslocamento binario a esquerda, ocorrendo uma multiplicacao: 10<<1 == 20");
">>" "Left Right, faz o deslocamento binario a direita, ocorrendo uam divisao: 10>>1 == 5");
"=" "Atribuicao de valores");
"+" "Operador de soma");
"-" "Operador de subtracao");
"*" "Operador de multiplicacao");
"/" "Operador de divisao");
"%" "Operador de modulo, retorna o resto de ums divisao");
"[" "Usado em Arrays: ary = [1, \"two\", 3.0].");
"]" "Usado em Arrays: ary = [1, \"two\", 3.0].");
"{" "Usado para delimitar Hash: h = { 7 => 35, \"c\" => 2, \"a\" => 1 }");
"}" "Usado para delimitar Hash: h = { 7 => 35, \"c\" => 2, \"a\" => 1 }");
"(" "Usado para limitar um conjundo de dados: \"(1 + 2)*5\" ou \"for a in (1..6)\"");
")" "Usado para limitar um conjundo de dados: \"(1 + 2)*5\" ou \"for a in (1..6)\"");
"@@" "Prescede uma variavel de classe, equivalente ao atributo estatico do Java.");
"@" "Prescede uma variavel de instancia \"Atributo do objeto\".");
"$" "Prescede uma variavel global.");
";" "Delimitador de instrucao, pode ser omitido.");
"." "Usado para trabalhar com objetos: \"arr = Array.new(3)\" ou \"arr.drop(3)\".");
"," "Usado para separar identificadores e dados: \"ary = [1, \"two\", 3.0]\" ou \"Array.new(3, true)\".");
"||" "Operador logico, retorna true se pelomenos um dos operandos forem true");
"|" "Operador OR binario: 1010 | 0011 = 1011");
"?" "Aplicado noperador ternÃƒÂ¡rio");
"!" "Inverte o estado da logica do operando: !true eh equivalente a false");
"::" "Permite acessar uma constante, modulo ou classe definida dentro de outra classe ou modulo.");
":" "Aplicado no operador ternario");
"^" "Operador binario XOR: 1010 ^ 0011 = 1001");
"~" "Operador de complemento binario: ~10 retorna -11");
"&&=" "Operador logico AND: A &&= B ÃƒÂ© equivalente a A = A && B ");
"&&" "Operador logico AND: (a==true && b==true) retorna true ");
"&=" "Operador AND binario com atribuicao, sendo a=10 e b=3, a recebe o valor 2: a &= b, a == 2 ");
"&" "Operador AND binario: 1010 & 0011 = 0010");
"<" "Retorna true se o operando da esquerda for menor que o da direita: 5<10");
">" "Retorna true se o operando da esquerda for maior que o da direita: 10>5");

PALAVRAS_RESERVADAS:
BEGIN, class, ensure, nil, self, when, END, def, false, not, super, whil, ealias, defined, for, or, then, yieldand, do, if, redo, true, begin,  else, in, rescue, undef, break, elsif, module, retry, unless, case, end, next, return, until.

/* IDENTIFICADORES */ 
{Identificador} "Identificador de metodos, variaveis, constantes, etc");
{IdentificadorMetodo} "Identificador de metodos que utilizam ? ou ! no final");

/* NÃO NÚMEROS */
{DecOrInt}("e"|"E")("+"|"-")? "Escrita de notacao cientefica");
{Inteiro} "Valor de numero inteiro.");
{Decimal} "Valor de numero decimal");

/* COMENTARIO */
"=begin"(.*{LineTerminator}*)*"=end" | "#"+.+	{ /* ignore */ }

/* espaco em branco */
{WhiteSpace}				{ /* ignore */ }
}

/* ESTADO PARA TRATAR STRINGS */
<STRING> "String, sequencia de caracteres."); 

/* CONDICAO PARA TRATAR O CHAR
   CASO A LINGUAGEM TIVESSE
   COMENTAMOS POIS O RUBY NAO PRECISA */

/* Excecao caso entre caractere invalido */
{Invalido} "Caractere invalido ";
         
						
