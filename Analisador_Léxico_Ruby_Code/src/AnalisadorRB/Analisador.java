package AnalisadorRB;

//O scanner gerado pelo jflex 1.6.1  do arquivo de especificação linguagem.lex
public class Analisador {

  //Indica o final do arquivo
  public static final int YYEOF = -1;

  //O Tamanho inicial do buffer lookahead
  private static final int ZZ_BUFFERSIZE = 16384;

  //Estados do lexal
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int CHAR = 4;

  //ZZ_LEXSTATE [l] é o estado no automato finito deterministico(DFA) para o estado lexical l
  //ZZ_LEXSTATE [l + 1] é o estado no automato finito deterministico para o status lexical l,
  //Mas no início de uma linha l é da forma l = 2 * k, onde k número inteiro não negativo
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };
  
//#######################################################################################################################################
  
  /** 
   *Converte caracteres em classes de caracteres
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\13\1\14\1\1\22\0\1\3\1\7\1\101"+
    "\1\102\1\36\1\21\1\42\1\0\1\33\1\34\1\20\1\15\1\40"+
    "\1\17\1\11\1\12\12\5\1\41\1\37\1\25\1\16\1\26\1\10"+
    "\1\35\1\4\1\51\1\4\1\66\1\52\1\77\1\53\1\4\1\54"+
    "\2\4\1\100\1\4\1\55\14\4\1\27\1\103\1\30\1\23\1\6"+
    "\1\0\1\43\1\56\1\63\1\50\1\57\1\64\1\60\1\75\1\45"+
    "\1\4\1\62\1\44\1\70\1\47\1\65\1\74\1\4\1\61\1\46"+
    "\1\72\1\67\1\4\1\76\1\71\1\73\1\4\1\31\1\24\1\32"+
    "\1\22\6\0\1\13\u1fa2\0\1\13\1\13\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Converte caracteres em classes de caracteres
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Converte os estados do DFA em rótulos de chave de ação.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\3\2\1\3\1\4\1\3\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\22\3\1\37\1\1\1\40\1\41\1\1\1\42\1\0"+
    "\1\10\1\43\1\0\1\44\1\0\1\3\1\45\1\46"+
    "\1\47\1\50\1\51\1\0\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65"+
    "\1\66\1\67\1\70\2\3\1\71\1\72\6\3\1\73"+
    "\13\3\1\74\6\3\1\2\1\75\1\76\1\77\1\100"+
    "\1\101\1\4\1\102\2\0\2\3\1\103\1\0\1\104"+
    "\1\105\1\106\1\107\1\110\1\111\1\3\1\112\2\3"+
    "\1\113\1\3\1\114\1\115\1\3\1\116\4\3\1\117"+
    "\6\3\1\120\11\3\1\121\1\122\1\123\1\0\1\102"+
    "\2\3\1\0\1\3\1\124\1\3\1\125\5\3\1\126"+
    "\2\3\1\127\2\3\1\130\6\3\1\131\1\132\2\3"+
    "\1\133\1\102\2\3\1\0\1\134\1\135\1\3\1\136"+
    "\1\137\1\140\1\141\2\3\1\142\1\3\1\143\1\144"+
    "\1\3\1\145\1\146\1\3\1\147\1\150\2\3\1\0"+
    "\1\3\1\151\1\152\1\153\1\154\1\155\2\3\1\0"+
    "\1\3\1\156\1\157\1\0\1\160\1\0\1\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[245];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* índice em sequência compactada  */
    int j = offset;  /* índice na matriz descompactada */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

//#######################################################################################################################################
  
  /** 
   * Converte um estado em um índice de linha na tabela de transição
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\104\0\210\0\314\0\u0110\0\u0154\0\314\0\u0198"+
    "\0\u01dc\0\u0220\0\u0264\0\314\0\u02a8\0\u02ec\0\u0330\0\u0374"+
    "\0\u03b8\0\u03fc\0\u0440\0\314\0\u0484\0\u04c8\0\u050c\0\u0550"+
    "\0\314\0\314\0\314\0\314\0\314\0\314\0\u0594\0\314"+
    "\0\314\0\314\0\u05d8\0\u061c\0\u0660\0\u06a4\0\u06e8\0\u072c"+
    "\0\u0770\0\u07b4\0\u07f8\0\u083c\0\u0880\0\u08c4\0\u0908\0\u094c"+
    "\0\u0990\0\u09d4\0\u0a18\0\u0a5c\0\u0aa0\0\u0ae4\0\314\0\u0b28"+
    "\0\u0b6c\0\314\0\u0bb0\0\314\0\u0154\0\314\0\314\0\u0bf4"+
    "\0\u0c38\0\u0c7c\0\u0cc0\0\314\0\314\0\314\0\u0d04\0\314"+
    "\0\u0d48\0\314\0\314\0\u0d8c\0\314\0\314\0\314\0\u0dd0"+
    "\0\u0e14\0\u0e58\0\314\0\u0e9c\0\314\0\314\0\314\0\u0ee0"+
    "\0\u0f24\0\u0f68\0\u0198\0\u0198\0\u0fac\0\u0ff0\0\u1034\0\u1078"+
    "\0\u10bc\0\u1100\0\u0198\0\u1144\0\u1188\0\u11cc\0\u1210\0\u1254"+
    "\0\u1298\0\u12dc\0\u1320\0\u1364\0\u13a8\0\u13ec\0\u0198\0\u1430"+
    "\0\u1474\0\u14b8\0\u14fc\0\u1540\0\u1584\0\u0b28\0\314\0\314"+
    "\0\314\0\314\0\u15c8\0\u160c\0\u1650\0\u1694\0\u16d8\0\u171c"+
    "\0\u1760\0\314\0\u17a4\0\314\0\314\0\314\0\314\0\314"+
    "\0\314\0\u17e8\0\u0198\0\u182c\0\u1870\0\u0198\0\u18b4\0\u0198"+
    "\0\u18f8\0\u193c\0\u0198\0\u1980\0\u19c4\0\u1a08\0\u1a4c\0\u0198"+
    "\0\u1a90\0\u1ad4\0\u1b18\0\u1b5c\0\u1ba0\0\u1be4\0\u0198\0\u1c28"+
    "\0\u1c6c\0\u1cb0\0\u1cf4\0\u1d38\0\u1d7c\0\u1dc0\0\u1e04\0\u1e48"+
    "\0\314\0\314\0\314\0\u1e8c\0\u1694\0\u1ed0\0\u1f14\0\u1f58"+
    "\0\u1f9c\0\u0198\0\u1fe0\0\u0198\0\u2024\0\u2068\0\u20ac\0\u20f0"+
    "\0\u2134\0\u0198\0\u2178\0\u21bc\0\u0198\0\u2200\0\u2244\0\u0198"+
    "\0\u2288\0\u22cc\0\u2310\0\u2354\0\u2398\0\u23dc\0\u0198\0\u0198"+
    "\0\u2420\0\u2464\0\u0198\0\u24a8\0\u24ec\0\u2530\0\u2574\0\u0198"+
    "\0\u0198\0\u25b8\0\u0198\0\u0198\0\u0198\0\u0198\0\u25fc\0\u2640"+
    "\0\u0198\0\u2684\0\u0198\0\u0198\0\u26c8\0\u0198\0\u0198\0\u270c"+
    "\0\u0198\0\u0198\0\u2750\0\u2794\0\u27d8\0\u281c\0\u0198\0\u0198"+
    "\0\u0198\0\u0198\0\u0198\0\u2860\0\u28a4\0\u28e8\0\u292c\0\u0198"+
    "\0\u0198\0\u2970\0\314\0\u29b4\0\u27d8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[245];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* índice em sequência compactada  */
    int j = offset;  /* índice na matriz descompactada */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

//#######################################################################################################################################
  
  //A tabela de transição do DFA.
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\4\1\7\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\10\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\3\10\1\54\1\55\1\10\1\56"+
    "\1\10\1\57\1\60\1\61\1\10\1\62\1\63\1\10"+
    "\1\64\1\65\2\10\1\66\2\10\1\67\1\70\1\4"+
    "\1\71\2\4\76\71\1\72\1\71\1\73\101\4\1\74"+
    "\2\4\106\0\1\7\103\0\1\75\7\0\1\76\75\0"+
    "\3\10\2\77\32\0\36\10\10\0\1\11\1\100\2\0"+
    "\1\101\40\0\1\102\4\0\1\102\30\0\2\10\1\103"+
    "\2\77\32\0\36\10\21\0\1\104\3\0\1\105\66\0"+
    "\1\101\76\0\1\16\2\0\10\16\2\0\67\16\16\0"+
    "\1\106\103\0\1\107\3\0\1\110\33\0\1\111\43\0"+
    "\1\112\103\0\1\113\1\0\1\114\101\0\1\115\103\0"+
    "\1\116\103\0\1\117\5\0\1\120\75\0\1\121\6\0"+
    "\1\122\74\0\1\123\7\0\1\124\112\0\1\125\107\0"+
    "\1\126\60\0\1\127\23\0\1\130\45\0\3\10\2\77"+
    "\32\0\1\10\1\131\2\10\1\132\31\10\7\0\3\10"+
    "\2\77\32\0\4\10\1\133\14\10\1\134\14\10\7\0"+
    "\3\10\2\77\32\0\14\10\1\135\7\10\1\136\11\10"+
    "\7\0\3\10\2\77\32\0\2\10\1\137\11\10\1\140"+
    "\5\10\1\141\13\10\7\0\3\10\2\77\32\0\14\10"+
    "\1\142\5\10\1\143\13\10\7\0\3\10\2\77\32\0"+
    "\7\10\1\144\26\10\7\0\3\10\2\77\32\0\12\10"+
    "\1\145\23\10\7\0\3\10\2\77\32\0\14\10\1\146"+
    "\1\10\1\147\17\10\7\0\3\10\2\77\32\0\1\10"+
    "\1\150\2\10\1\151\31\10\7\0\3\10\2\77\32\0"+
    "\14\10\1\152\21\10\7\0\3\10\2\77\32\0\1\153"+
    "\1\154\34\10\7\0\3\10\2\77\32\0\1\155\21\10"+
    "\1\156\13\10\7\0\3\10\2\77\32\0\16\10\1\157"+
    "\17\10\7\0\3\10\2\77\32\0\4\10\1\160\31\10"+
    "\7\0\3\10\2\77\32\0\22\10\1\161\13\10\7\0"+
    "\3\10\2\77\32\0\16\10\1\162\13\10\1\163\3\10"+
    "\7\0\3\10\2\77\32\0\2\10\1\164\33\10\7\0"+
    "\3\10\2\77\32\0\32\10\1\165\3\10\3\0\1\166"+
    "\2\0\10\166\2\0\67\166\1\71\2\0\76\71\1\0"+
    "\1\71\50\0\1\167\11\0\1\170\10\0\1\171\6\0"+
    "\1\172\1\0\1\173\5\0\1\174\103\0\1\101\44\0"+
    "\1\102\4\0\1\102\31\0\1\175\3\0\1\176\3\0"+
    "\1\177\1\0\1\177\70\0\3\10\2\77\32\0\34\10"+
    "\1\200\1\201\21\0\1\202\144\0\1\203\42\0\1\204"+
    "\103\0\1\205\113\0\1\206\73\0\1\207\103\0\1\210"+
    "\103\0\1\211\71\0\3\10\2\77\32\0\2\10\1\212"+
    "\33\10\7\0\3\10\2\77\32\0\5\10\1\213\30\10"+
    "\7\0\3\10\2\77\32\0\1\10\1\214\34\10\7\0"+
    "\3\10\2\77\32\0\31\10\1\215\4\10\7\0\3\10"+
    "\2\77\32\0\1\10\1\216\34\10\7\0\3\10\2\77"+
    "\32\0\26\10\1\217\7\10\7\0\3\10\2\77\32\0"+
    "\27\10\1\220\6\10\7\0\3\10\2\77\32\0\21\10"+
    "\1\221\14\10\7\0\3\10\2\77\32\0\10\10\1\222"+
    "\25\10\7\0\3\10\2\77\32\0\23\10\1\223\12\10"+
    "\7\0\3\10\2\77\32\0\15\10\1\224\20\10\7\0"+
    "\3\10\2\77\32\0\14\10\1\225\21\10\7\0\3\10"+
    "\2\77\32\0\3\10\1\226\32\10\7\0\3\10\2\77"+
    "\32\0\3\10\1\227\1\10\1\230\30\10\7\0\3\10"+
    "\2\77\32\0\3\10\1\231\1\10\1\232\21\10\1\233"+
    "\6\10\7\0\3\10\2\77\32\0\3\10\1\234\32\10"+
    "\7\0\3\10\2\77\32\0\1\235\35\10\7\0\3\10"+
    "\2\77\32\0\1\10\1\236\34\10\7\0\3\10\2\77"+
    "\32\0\16\10\1\237\17\10\7\0\3\10\2\77\32\0"+
    "\1\10\1\240\3\10\1\241\21\10\1\242\6\10\7\0"+
    "\3\10\2\77\32\0\5\10\1\243\30\10\7\0\3\10"+
    "\2\77\32\0\24\10\1\244\11\10\7\0\3\10\2\77"+
    "\32\0\14\10\1\245\21\10\7\0\3\10\2\77\32\0"+
    "\14\10\1\246\21\10\7\0\3\10\2\77\32\0\2\10"+
    "\1\247\11\10\1\250\21\10\52\0\1\251\11\0\1\252"+
    "\10\0\1\253\16\0\1\174\1\100\43\0\1\102\4\0"+
    "\1\102\31\0\1\175\1\254\2\0\1\255\77\0\1\255"+
    "\103\0\1\175\3\0\1\176\76\0\3\10\2\77\32\0"+
    "\11\10\1\256\24\10\7\0\3\10\2\77\32\0\11\10"+
    "\1\257\24\10\63\0\1\260\27\0\3\10\2\77\32\0"+
    "\1\261\35\10\7\0\3\10\2\77\32\0\21\10\1\262"+
    "\14\10\7\0\3\10\2\77\32\0\14\10\1\263\21\10"+
    "\7\0\3\10\2\77\32\0\27\10\1\264\6\10\7\0"+
    "\3\10\2\77\32\0\2\10\1\265\33\10\7\0\3\10"+
    "\2\77\32\0\11\10\1\266\24\10\7\0\3\10\2\77"+
    "\32\0\2\10\1\267\33\10\7\0\3\10\2\77\32\0"+
    "\1\270\35\10\7\0\3\10\2\77\32\0\2\10\1\271"+
    "\11\10\1\272\21\10\7\0\3\10\2\77\32\0\24\10"+
    "\1\273\11\10\7\0\3\10\2\77\32\0\20\10\1\274"+
    "\15\10\7\0\3\10\2\77\32\0\22\10\1\275\13\10"+
    "\7\0\3\10\2\77\32\0\16\10\1\276\5\10\1\277"+
    "\11\10\7\0\3\10\2\77\32\0\14\10\1\300\21\10"+
    "\7\0\3\10\2\77\32\0\3\10\1\301\32\10\7\0"+
    "\3\10\2\77\32\0\3\10\1\302\32\10\7\0\3\10"+
    "\2\77\32\0\14\10\1\303\21\10\7\0\3\10\2\77"+
    "\32\0\14\10\1\304\21\10\7\0\3\10\2\77\32\0"+
    "\2\10\1\305\33\10\7\0\3\10\2\77\32\0\24\10"+
    "\1\306\11\10\7\0\3\10\2\77\32\0\14\10\1\307"+
    "\21\10\7\0\3\10\2\77\32\0\4\10\1\310\31\10"+
    "\7\0\3\10\2\77\32\0\1\10\1\311\34\10\7\0"+
    "\3\10\2\77\32\0\1\10\1\312\34\10\7\0\3\10"+
    "\2\77\32\0\4\10\1\313\31\10\10\0\1\314\102\0"+
    "\3\10\2\77\32\0\35\10\1\315\7\0\3\10\2\77"+
    "\32\0\12\10\1\316\23\10\50\0\1\317\42\0\3\10"+
    "\2\77\32\0\3\10\1\320\32\10\7\0\3\10\2\77"+
    "\32\0\16\10\1\321\17\10\7\0\3\10\2\77\32\0"+
    "\4\10\1\322\31\10\7\0\3\10\2\77\32\0\12\10"+
    "\1\323\23\10\7\0\3\10\2\77\32\0\4\10\1\324"+
    "\31\10\7\0\3\10\2\77\32\0\17\10\1\325\16\10"+
    "\7\0\3\10\2\77\32\0\21\10\1\326\14\10\7\0"+
    "\3\10\2\77\32\0\16\10\1\327\17\10\7\0\3\10"+
    "\2\77\32\0\24\10\1\330\11\10\7\0\3\10\2\77"+
    "\32\0\30\10\1\331\5\10\7\0\3\10\2\77\32\0"+
    "\16\10\1\332\17\10\7\0\3\10\2\77\32\0\3\10"+
    "\1\333\32\10\7\0\3\10\2\77\32\0\14\10\1\334"+
    "\21\10\7\0\3\10\2\77\32\0\3\10\1\335\32\10"+
    "\7\0\3\10\2\77\32\0\21\10\1\336\14\10\7\0"+
    "\3\10\2\77\32\0\1\10\1\337\34\10\7\0\3\10"+
    "\2\77\32\0\1\10\1\340\34\10\7\0\3\10\2\77"+
    "\32\0\5\10\1\341\30\10\7\0\3\10\2\77\32\0"+
    "\14\10\1\342\21\10\10\0\1\314\1\254\101\0\3\10"+
    "\2\77\32\0\7\10\1\343\26\10\7\0\3\10\2\77"+
    "\32\0\7\10\1\344\26\10\52\0\1\345\40\0\3\10"+
    "\2\77\32\0\14\10\1\346\21\10\7\0\3\10\2\77"+
    "\32\0\14\10\1\347\21\10\7\0\3\10\2\77\32\0"+
    "\14\10\1\350\21\10\7\0\3\10\2\77\32\0\4\10"+
    "\1\351\31\10\7\0\3\10\2\77\32\0\3\10\1\352"+
    "\32\10\7\0\3\10\2\77\32\0\14\10\1\353\21\10"+
    "\7\0\2\10\1\354\2\77\32\0\36\10\7\0\2\10"+
    "\1\355\2\77\32\0\36\10\3\0\13\345\2\0\1\345"+
    "\1\356\65\345\4\0\3\10\2\77\32\0\5\10\1\357"+
    "\30\10\7\0\2\10\1\360\2\77\32\0\36\10\7\0"+
    "\2\10\1\361\2\77\32\0\36\10\3\0\13\345\2\0"+
    "\1\345\1\356\40\345\1\362\24\345\4\0\3\10\1\77"+
    "\1\363\32\0\36\10\3\0\13\345\2\0\1\345\1\356"+
    "\30\345\1\364\47\345\2\0\1\345\1\356\31\345\1\365"+
    "\33\345";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10744];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* índice em sequência compactada  */
    int j = offset;  /* índice na matriz descompactada */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  //Códigos de erro.
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  //Mensagens de erro para os códigos das variáveis acima.
  private static final String ZZ_ERROR_MSG[] = {

    "Erro desconhecido no scanner interno",
    "Erro: não foi possível corresponder à entrada",
    "Erro: o valor do pushback era muito grande"
  };

  //ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\2\1\1\11\4\1\1\11\7\1\1\11"+
    "\4\1\6\11\1\1\3\11\24\1\1\11\2\1\1\11"+
    "\1\1\1\11\1\0\2\11\1\0\1\1\1\0\1\1"+
    "\3\11\1\1\1\11\1\0\2\11\1\1\3\11\3\1"+
    "\1\11\1\1\3\11\37\1\4\11\3\1\2\0\2\1"+
    "\1\11\1\0\6\11\37\1\3\11\1\0\3\1\1\0"+
    "\36\1\1\0\25\1\1\0\10\1\1\0\3\1\1\0"+
    "\1\11\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[245];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* índice em sequência compactada  */
    int j = offset;  /* índice na matriz descompactada */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }
  
//#######################################################################################################################################
  
  //O dispositivo de entrada.
  private java.io.Reader zzReader;

  //Estado atual do DFA.
  private int zzState;

  //O estado lexical atual.
  private int zzLexicalState = YYINITIAL;

  //O zzBuffer contém o texto atual a ser correspondido e é a fonte da string yytext ().
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  //Indica a posição do texto no último estado de aceitação.
  private int zzMarkedPos;

  //Indica a posição atual do texto no buffer.
  private int zzCurrentPos;

  //StartRead marca o início da string yytext () no buffer.
  private int zzStartRead;

  //O endRead marca o último caractere no buffer, que foi lido da entrada
  private int zzEndRead;

  //Número de novas linhas encontradas até o início do texto correspondente.
  private int yyline;

  //Indica o número de caracteres até o início do texto correspondente.
  private int yychar;

  //Indica o número de caracteres desde a última nova linha até o início do texto correspondente.
  private int yycolumn;

  //zzAtBOL == true indica que o scanner está atualmente no início de uma linha.
  private boolean zzAtBOL = true;

  //zzAtEOF == true indica que o scanner está no EOF.
  private boolean zzAtEOF;

  //Indica se o código EOF do usuário já foi executado.
  private boolean zzEOFDone;
   
  //O número de posições ocupadas em zzBuffer além de zzEndRead.
  //Quando um substituto principal / alto tiver sido lido do fluxo de entrada para a posição final zzBuffer, 
  //isso terá o valor 1; caso contrário, ele terá um valor 0.
  private int zzFinalHighSurrogate = 0;

  //Código do usuário.
  StringBuffer string = new StringBuffer();
  
//#######################################################################################################################################

  //Cria um novo scanner @param no java.io.Reader para ler a entrada.
  public Analisador(java.io.Reader in) {
    this.zzReader = in;
  }


  //Descompacta a tabela de conversão de caracteres compactados. 
  //@param empacotou a tabela de tradução de caracteres compactados @retorno a tabela de tradução de caracteres descompactada.
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 206) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  //Recarrega o buffer de entrada. @return <code> false </code>, se houver uma nova entrada. @exception java.io.IOException se ocorrer algum erro de E / S
  private boolean zzRefill() throws java.io.IOException {

    //Primeiro: crie espaço (se você puder)
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      //Traduzir posições armazenadas.
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    //O buffer é grande o suficiente?
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    //Preencher o buffer com nova entrada
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    //Não deve ocorrer de acordo com a especificação de java.io.Reader
    if (numRead == 0) {
      throw new java.io.IOException("O leitor retornou 0 caracteres. Veja exemplos do JFlex para solução alternativa.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      //Se numRead == for solicitado, talvez tenhamos solicitado alguns caracteres para codificar um caractere Unicode completo. 
      //Supomos que um Reader nunca retornaria meio caractere. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    //Se numRead <0 então indica o final do fluxo.
    return true;
  }

    
  //Fecha o fluxo de entrada.
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indica final do arquivo */
    zzEndRead = zzStartRead;  /* invalidar buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  //Redefine o scanner para ler de um novo fluxo de entrada. Não fecha o leitor antigo. Todas as variáveis internas são redefinidas, 
  //o fluxo de entrada antigo <b> não pode </b> ser reutilizado (o buffer interno é descartado e perdido). 
  //O estado lexical está definido como <tt> ZZ_INITIAL </tt>. O buffer de verificação interno é redimensionado até o tamanho inicial.
  //se tiver crescido. @param reader o novo fluxo de entrada.
   
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }

//#######################################################################################################################################
  
  //Retorna o estado lexical atual.
  public final int yystate() {
    return zzLexicalState;
  }


  //Insere um novo estado lexical @param newState o novo estado lexical.
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  //Retorna o texto correspondido pela expressão regular atual.
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  //Retorna o caractere na posição <tt> pos </tt> do texto correspondente. 
  //É equivalente a yytext (). CharAt (pos), mas mais rápido @param pos a posição do caractere a ser buscado. 
  //Um valor de 0 a comprimento de yyl () - 1. @retornar o personagem na posição pos.
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }



  //Retorna o comprimento da região de texto correspondente.
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  //Relata um erro que ocorreu durante a verificação. 
  //Em um scanner bem-formado (não ou apenas o uso correto de yypushback (int) e uma regra de fallback correspondente a todos), 
  //esse método será chamado apenas com itens que "Não podem acontecer". Se esse método for chamado, 
  //algo estará seriamente errado (por exemplo, um bug do JFlex produzindo um scanner com defeito etc.). 
  //A manipulação usual de erros no nível da sintaxe / scanner deve ser feita nas regras de fallback de erros. 
  //@param errorCode o código da mensagem de erro a ser exibida
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /** Empurra a quantidade especificada de caracteres de volta para o fluxo de entrada. 
  	Eles serão lidos novamente até a próxima chamada do método de verificação @param number, 
   o número de caracteres a serem lidos novamente. Este número não deve ser maior que yylength ()!
   **/
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   *Continua a varredura até a próxima expressão regular ser correspondida, o final da entrada ser encontrado ou ocorrer um erro de E / S.
   * @return      o próximo token
   * @exception   java.io.IOException se ocorrer algum erro de E / S
   */
  public TokenRuby yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // campos em cache:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // espreite um caractere à frente, se for \ n (se contamos uma linha demais)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // configure zzAction para uma caixa de correspondência vazia:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // armazenar de volta as posições em cache

            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // obter posições traduzidas e possivelmente novo buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // ultima posição armazenada em cache
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
              return new TokenRuby("INVALIDO", yytext(), yyline, yycolumn, "Caractere invalido");
            }
          case 113: break;
          case 2: 
            { /* ignore */
            }
          case 114: break;
          case 3: 
            { return new TokenRuby("IDENTIFICADOR", yytext(), yyline, yycolumn, "Identificador de metodos, variaveis, constantes, etc");
            }
          case 115: break;
          case 4: 
            { return new TokenRuby("INTEIRO", yytext(), yyline, yycolumn, "Valor de numero inteiro.");
            }
          case 116: break;
          case 5: 
            { return new TokenRuby("NOT", yytext(), yyline, yycolumn, "Inverte o estado da logica do operando: !true eh equivalente a false");
            }
          case 117: break;
          case 6: 
            { return new TokenRuby("INTERROG", yytext(), yyline, yycolumn, "Aplicado noperador ternario");
            }
          case 118: break;
          case 7: 
            { return new TokenRuby("PONTO", yytext(), yyline, yycolumn, "Usado para trabalhar com objetos: \"arr = Array.new(3)\" ou \"arr.drop(3)\".");
            }
          case 119: break;
          case 8: 
            { return new TokenRuby("REGEX", yytext(), yyline, yycolumn, "Expressao Regular.");
            }
          case 120: break;
          case 9: 
            { return new TokenRuby("PLUS", yytext(), yyline, yycolumn, "Operador de soma");
            }
          case 121: break;
          case 10: 
            { return new TokenRuby("EQ", yytext(), yyline, yycolumn, "Atribuicao de valores");
            }
          case 122: break;
          case 11: 
            { return new TokenRuby("SUB", yytext(), yyline, yycolumn, "Operador de subtracao");
            }
          case 123: break;
          case 12: 
            { return new TokenRuby("MULT", yytext(), yyline, yycolumn, "Operador de multiplicacao");
            }
          case 124: break;
          case 13: 
            { return new TokenRuby("MOD", yytext(), yyline, yycolumn, "Operador de modulo, retorna o resto de ums divisao");
            }
          case 125: break;
          case 14: 
            { return new TokenRuby("BITCOMP", yytext(), yyline, yycolumn, "Operador de complemento binario: ~10 retorna -11");
            }
          case 126: break;
          case 15: 
            { return new TokenRuby("BITXOR", yytext(), yyline, yycolumn, "Operador binario XOR: 1010 ^ 0011 = 1001");
            }
          case 127: break;
          case 16: 
            { return new TokenRuby("BITOR", yytext(), yyline, yycolumn, "Operador OR binario: 1010 | 0011 = 1011");
            }
          case 128: break;
          case 17: 
            { return new TokenRuby("MENOR", yytext(), yyline, yycolumn, "Retorna true se o operando da esquerda for menor que o da direita: 5<10");
            }
          case 129: break;
          case 18: 
            { return new TokenRuby("MAIOR", yytext(), yyline, yycolumn, "Retorna true se o operando da esquerda for maior que o da direita: 10>5");
            }
          case 130: break;
          case 19: 
            { return new TokenRuby("COLCHETE", yytext(), yyline, yycolumn, "Usado em Arrays: ary = [1, \"two\", 3.0].");
            }
          case 131: break;
          case 20: 
            { return new TokenRuby("COLCHETE2", yytext(), yyline, yycolumn, "Usado em Arrays: ary = [1, \"two\", 3.0].");
            }
          case 132: break;
          case 21: 
            { return new TokenRuby("CHAVE", yytext(), yyline, yycolumn, "Usado para delimitar Hash: h = { 7 => 35, \"c\" => 2, \"a\" => 1 }");
            }
          case 133: break;
          case 22: 
            { return new TokenRuby("CHAVE2", yytext(), yyline, yycolumn, "Usado para delimitar Hash: h = { 7 => 35, \"c\" => 2, \"a\" => 1 }");
            }
          case 134: break;
          case 23: 
            { return new TokenRuby("PARENTESE", yytext(), yyline, yycolumn, "Usado para limitar um conjundo de dados: \"(1 + 2)*5\" ou \"for a in (1..6)\"");
            }
          case 135: break;
          case 24: 
            { return new TokenRuby("PARENTESE2", yytext(), yyline, yycolumn, "Usado para limitar um conjundo de dados: \"(1 + 2)*5\" ou \"for a in (1..6)\"");
            }
          case 136: break;
          case 25: 
            { return new TokenRuby("ARROBA", yytext(), yyline, yycolumn, "Prescede uma variavel de instancia \"Atributo do objeto\".");
            }
          case 137: break;
          case 26: 
            { return new TokenRuby("DOLAR", yytext(), yyline, yycolumn, "Prescede uma variavel global.");
            }
          case 138: break;
          case 27: 
            { return new TokenRuby("PONTOVIRG", yytext(), yyline, yycolumn, "Delimitador de instrucao, pode ser omitido.");
            }
          case 139: break;
          case 28: 
            { return new TokenRuby("VIRGULA", yytext(), yyline, yycolumn, "Usado para separar identificadores e dados: \"ary = [1, \"two\", 3.0]\" ou \"Array.new(3, true)\".");
            }
          case 140: break;
          case 29: 
            { return new TokenRuby("DOISPONTOS", yytext(), yyline, yycolumn,"Aplicado no operador ternario");
            }
          case 141: break;
          case 30: 
            { return new TokenRuby("BITAND", yytext(), yyline, yycolumn, "Operador AND binario: 1010 & 0011 = 0010");
            }
          case 142: break;
          case 31: 
            { yybegin(STRING); string.setLength(0);
            }
          case 143: break;
          case 32: 
            { string.append( yytext() );
            }
          case 144: break;
          case 33: 
            { yybegin(YYINITIAL);
                              return new TokenRuby("STRING", string.toString(), yyline, yycolumn, "String, sequencia de caracteres.");
            }
          case 145: break;
          case 34: 
            { new TokenRuby("CHAR", string.toString(), yyline, yycolumn);
                              yybegin(YYINITIAL);
            }
          case 146: break;
          case 35: 
            { return new TokenRuby("IDENTIFICADOR_METODO", yytext(), yyline, yycolumn, "Identificador de metodos que utilizam ? ou ! no final");
            }
          case 147: break;
          case 36: 
            { return new TokenRuby("DECIMAL", yytext(), yyline, yycolumn, "Valor de numero decimal");
            }
          case 148: break;
          case 37: 
            { return new TokenRuby("DIFERENTE", yytext(), yyline, yycolumn, "Retorna true se os operandos forem diferente: a != b retorna true");
            }
          case 149: break;
          case 38: 
            { return new TokenRuby("NOTCORRESP", yytext(), yyline, yycolumn, "Nao-Correspondencia padrao, usado para expressao regular, retorna true quando a string nao corresponde a expressao regular, ou false quando corresponde.");
            }
          case 150: break;
          case 39: 
            { return new TokenRuby("PLUSEQ", yytext(), yyline, yycolumn, "(a += b) equivalente a (a = a + b)");
            }
          case 151: break;
          case 40: 
            { return new TokenRuby("EQEQ", yytext(), yyline, yycolumn, "Verifica se dois operandos sao iguais: (a == a) retorna true, (a == b) retorna false");
            }
          case 152: break;
          case 41: 
            { return new TokenRuby("CORRESP", yytext(), yyline, yycolumn, "Correspondencia padrao, usado para expressao regular. O explo a seguie ira retornar 4, que eh a posicao que corresponde a expressao regular: \"abc 123\" =~ /[0-9]/");
            }
          case 153: break;
          case 42: 
            { return new TokenRuby("SUBEQ", yytext(), yyline, yycolumn, "(a -= b) equivalente a (a = a - b)");
            }
          case 154: break;
          case 43: 
            { return new TokenRuby("MULTEQ", yytext(), yyline, yycolumn, "(a *= b) equivalente a (a = a * b)");
            }
          case 155: break;
          case 44: 
            { return new TokenRuby("EXP", yytext(), yyline, yycolumn, "Exponenciacao: 2**3 = 8");
            }
          case 156: break;
          case 45: 
            { return new TokenRuby("MODEQ", yytext(), yyline, yycolumn, "(a %= b) equivalente a (a = a % b)");
            }
          case 157: break;
          case 46: 
            { return new TokenRuby("BITXOREQ", yytext(), yyline, yycolumn, "Faz uma operacao binaria XOR e atribui a varia¡vel. 10^3 retorna 9");
            }
          case 158: break;
          case 47: 
            { return new TokenRuby("OREQ", yytext(), yyline, yycolumn, "Retorna e atribui true se pelomenos um dos operandos for true: A |= B eh equivalente a A = A | B" );
            }
          case 159: break;
          case 48: 
            { return new TokenRuby("ORBOOL", yytext(), yyline, yycolumn, "Operador logico, retorna true se pelomenos um dos operandos forem true");
            }
          case 160: break;
          case 49: 
            { return new TokenRuby("MENOREQ", yytext(), yyline, yycolumn, "Retorna true se o valor da esquerda for menor que o da direita ou igual: 5 <= 10");
            }
          case 161: break;
          case 50: 
            { return new TokenRuby("SHIFTL", yytext(), yyline, yycolumn, "Left Shift, faz o deslocamento binario a esquerda, ocorrendo uma multiplicacao: 10<<1 == 20");
            }
          case 162: break;
          case 51: 
            { return new TokenRuby("MAIOREQ", yytext(), yyline, yycolumn, "Retorna true se o valor da esquerda for maior que o da direita ou igual: 10 >= 5");
            }
          case 163: break;
          case 52: 
            { return new TokenRuby("SHIFTR", yytext(), yyline, yycolumn, "Left Right, faz o deslocamento binario a direita, ocorrendo uam divisao: 10>>1 == 5");
            }
          case 164: break;
          case 53: 
            { return new TokenRuby("ARROBA2", yytext(), yyline, yycolumn, "Prescede uma variavel de classe, equivalente ao atributo estatico do Java.");
            }
          case 165: break;
          case 54: 
            { return new TokenRuby("DOISPONTDUP", yytext(), yyline, yycolumn, "Permite acessar uma constante, modulo ou classe definida dentro de outra classe ou modulo.");
            }
          case 166: break;
          case 55: 
            { return new TokenRuby("BITANDEQ", yytext(), yyline, yycolumn, "Operador AND binario com atribuicao, sendo a=10 e b=3, a recebe o valor 2: a &= b, a == 2 ");
            }
          case 167: break;
          case 56: 
            { return new TokenRuby("ANDBOOL", yytext(), yyline, yycolumn, "Operador logico AND: (a==true && b==true) retorna true ");
            }
          case 168: break;
          case 57: 
            { return new TokenRuby("IN", yytext(), yyline, yycolumn, "Define um contado para uma estrutura de Repeticao For");
            }
          case 169: break;
          case 58: 
            { return new TokenRuby("IF", yytext(), yyline, yycolumn, "Expressaos usadas para execucao condicional. Os valores false e nil sao falsos, e tudo o mais eh verdade.");
            }
          case 170: break;
          case 59: 
            { return new TokenRuby("DO", yytext(), yyline, yycolumn, "Define uma estrutura de repetiÃcao sem condicao" );
            }
          case 171: break;
          case 60: 
            { return new TokenRuby("OR", yytext(), yyline, yycolumn, "eh equivalente a ||.Avalia o lado esquerdo, entao se o resultado for falso, avalia o lado direito");
            }
          case 172: break;
          case 61: 
            { string.append("\n");
            }
          case 173: break;
          case 62: 
            { string.append("\r");
            }
          case 174: break;
          case 63: 
            { string.append("\t");
            }
          case 175: break;
          case 64: 
            { string.append('\"');
            }
          case 176: break;
          case 65: 
            { string.append("\\");
            }
          case 177: break;
          case 66: 
            { return new TokenRuby("NOTACAO_CIENTIFICA", yytext(), yyline, yycolumn, "Escrita de notacao cientifica");
            }
          case 178: break;
          case 67: 
            { return new TokenRuby("EQEQEQ", yytext(), yyline, yycolumn, "Verifica se um subconjunto esta contido em um conjunto. No exmplo a seguir ira retornar true, pois abc esta contido no conjunto de letras de a eh  z: /[a-z]/ === \"abc\"");
            }
          case 179: break;
          case 68: 
            { return new TokenRuby("EXPEQ", yytext(), yyline, yycolumn, "(a **= b) equivalente a (a = a ** b)");
            }
          case 180: break;
          case 69: 
            { return new TokenRuby("ORBOOLEQ", yytext(), yyline, yycolumn, "Operador condicional, se 'a' for true mantenha 'a', se for false atribua 'b': a ||= b ");
            }
          case 181: break;
          case 70: 
            { return new TokenRuby("COMPCOMB", yytext(), yyline, yycolumn, "A <=> B avalia para -1, 0 ou 1; se A for menor do que, igual ou maior do que B, respectivamente");
            }
          case 182: break;
          case 71: 
            { return new TokenRuby("SHIFTLEQ", yytext(), yyline, yycolumn, "Left Shift com atribuicao: A <<= B eh equivalente a A = A << B");
            }
          case 183: break;
          case 72: 
            { return new TokenRuby("SHIFTREQ", yytext(), yyline, yycolumn, "Right Shift com atribuicao: A >>= B eh equivalente a A = A >> B");
            }
          case 184: break;
          case 73: 
            { return new TokenRuby("ANDBOOLEQ", yytext(), yyline, yycolumn,"Operador logico AND: A &&= B eh equivalente a A = A && B ");
            }
          case 185: break;
          case 74: 
            { return new TokenRuby("AND", yytext(), yyline, yycolumn, "eh equivalente a &&.Avalia o lado esquerdo e, se o resultado for verdadeiro, avalia o lado direito.");
            }
          case 186: break;
          case 75: 
            { return new TokenRuby("NIL", yytext(), yyline, yycolumn, "eh equivalente a Nulo.a unica instancia da Classe NilClass (representa falso)");
            }
          case 187: break;
          case 76: 
            { return new TokenRuby("NOT", yytext(), yyline, yycolumn, "Retorna verdadeiro se for falso, falso se verdadeiro.");
            }
          case 188: break;
          case 77: 
            { return new TokenRuby("DEF", yytext(), yyline, yycolumn, "Palavra para indentificar metodos, a partir dela que o programa identifica a palavra a frente como um metodo");
            }
          case 189: break;
          case 78: 
            { return new TokenRuby("END", yytext(), yyline, yycolumn, "Define o final da Rotina de inicializacao, finaliza o bloco");
            }
          case 190: break;
          case 79: 
            { return new TokenRuby("END2", yytext(), yyline, yycolumn, "Define o final de um bloco de Expressoes");
            }
          case 191: break;
          case 80: 
            { return new TokenRuby("FOR", yytext(), yyline, yycolumn, "Palavra para estrutura de repeticao, Executa o corpo para cada elemento no resultado da expressao.");
            }
          case 192: break;
          case 81: 
            { string.append("\\n");
            }
          case 193: break;
          case 82: 
            { string.append("\\r");
            }
          case 194: break;
          case 83: 
            { string.append("\\t");
            }
          case 195: break;
          case 84: 
            { return new TokenRuby("SELF", yytext(), yyline, yycolumn, "O receptor do metodo atual");
            }
          case 196: break;
          case 85: 
            { return new TokenRuby("NEXT", yytext(), yyline, yycolumn, "Salta para a pro³xima iteracao do loop mais interno.");
            }
          case 197: break;
          case 86: 
            { return new TokenRuby("ELSE", yytext(), yyline, yycolumn, "Representa a execucao de um comando quando a condicao nao eh validada");
            }
          case 198: break;
          case 87: 
            { return new TokenRuby("REDO", yytext(), yyline, yycolumn, "Reinicia a iteracao do loop mais interno, sem verificar a condicao do loop.");
            }
          case 199: break;
          case 88: 
            { return new TokenRuby("CASE", yytext(), yyline, yycolumn, "As case expressoes tambem sao para execucao condicional. sendo que suas comparacoes equivale ao mesmo que ===.");
            }
          case 200: break;
          case 89: 
            { return new TokenRuby("TRUE", yytext(), yyline, yycolumn, "A unica instancia da classe TrueClass (valor verdadeiro ti­pico)");
            }
          case 201: break;
          case 90: 
            { return new TokenRuby("THEN", yytext(), yyline, yycolumn, "Indica o proximo comando a ser executado. sua colocacao eh opcional ");
            }
          case 202: break;
          case 91: 
            { return new TokenRuby("WHEN", yytext(), yyline, yycolumn, "Palavra utilizada para subdividir as condicoes em uma expressao case");
            }
          case 203: break;
          case 92: 
            { return new TokenRuby("ALIAS", yytext(), yyline, yycolumn, "Mantem a definicao atual do metodo, mesmo quando os metodos sao substitui­dos.");
            }
          case 204: break;
          case 93: 
            { return new TokenRuby("SUPER", yytext(), yyline, yycolumn, "Chama o metodo que substitui o metodo atual");
            }
          case 205: break;
          case 94: 
            { return new TokenRuby("BEGIN", yytext(), yyline, yycolumn, "Registra a rotina de inicializacao. O bloco seguido depois BEGIN eh avaliado antes de qualquer outra declaracao nesse arquivo");
            }
          case 206: break;
          case 95: 
            { return new TokenRuby("BEGIN2", yytext(), yyline, yycolumn, "ExpressÃƒÂ£o executa seu corpo e retorna o valor da ultima expressao avaliada.");
            }
          case 207: break;
          case 96: 
            { return new TokenRuby("BREAK", yytext(), yyline, yycolumn, "Sai do loop mais interno. O break nao sai da expressao case");
            }
          case 208: break;
          case 97: 
            { return new TokenRuby("ELSIF", yytext(), yyline, yycolumn, "Equivale ao fechamento de uma condicao e abertura de outra, mas resumida em uma unica palavra.");
            }
          case 209: break;
          case 98: 
            { return new TokenRuby("RETRY", yytext(), yyline, yycolumn, "Reinicia a invocacao de uma chamada");
            }
          case 210: break;
          case 99: 
            { return new TokenRuby("CLASS", yytext(), yyline, yycolumn, "Define uma nova classe.");
            }
          case 211: break;
          case 100: 
            { return new TokenRuby("FALSE", yytext(), yyline, yycolumn, "A unica instancia da classe FalseClass (representa falso)");
            }
          case 212: break;
          case 101: 
            { return new TokenRuby("UNDEF", yytext(), yyline, yycolumn, "Cancela a definicao do metodo.");
            }
          case 213: break;
          case 102: 
            { return new TokenRuby("UNTIL", yytext(), yyline, yycolumn, "Executa o corpo ate a expressÃƒÂ£o de condicao retornar verdadeira.");
            }
          case 214: break;
          case 103: 
            { return new TokenRuby("YIELD", yytext(), yyline, yycolumn, "Avalia o bloco dado ao metodo atual com argumentos, se nenhum argumento for dado, nil eh usado como um argumento.");
            }
          case 215: break;
          case 104: 
            { return new TokenRuby("WHILE", yytext(), yyline, yycolumn, "Executa o corpo enquanto a expressao de condicao retorna verdadeira.");
            }
          case 216: break;
          case 105: 
            { return new TokenRuby("ENSURE", yytext(), yyline, yycolumn, "Seu corpo de clausula eh executado sempre que o begincorpobegin for encerrado.");
            }
          case 217: break;
          case 106: 
            { return new TokenRuby("RESCUE", yytext(), yyline, yycolumn, "Clausula com o tipo de excecao de um Bloco correspondente");
            }
          case 218: break;
          case 107: 
            { return new TokenRuby("RETURN", yytext(), yyline, yycolumn, "Sai do metodo com o valor de retorno.");
            }
          case 219: break;
          case 108: 
            { return new TokenRuby("UNLESS", yytext(), yyline, yycolumn, "Expressoes usadas para a execuao condicional reversa. eh equivalente a: if !(cond) ... else ...end");
            }
          case 220: break;
          case 109: 
            { return new TokenRuby("MODULE", yytext(), yyline, yycolumn, "Tipo de objeto, que eh usado para armazenar comandos, valores e formulas, eh mais pratico pois nao eh necessario que seja inicializado ");
            }
          case 221: break;
          case 110: 
            { return new TokenRuby("__FILE__", yytext(), yyline, yycolumn, "O nome do arquivo fonte atual");
            }
          case 222: break;
          case 111: 
            { return new TokenRuby("__LINE__", yytext(), yyline, yycolumn, "O numero da linha atual no arquivo de origem.");
            }
          case 223: break;
          case 112: 
            { return new TokenRuby("DEFINED?", yytext(), yyline, yycolumn, "Retorna false se a expressao nao estiver definida. Retorna a sequencia de caracteres que descreve um tipo de expressao.");
            }
          case 224: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
