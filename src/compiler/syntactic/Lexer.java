/* The following code was generated by JFlex 1.6.1 */

package compiler.syntactic;
import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexer.jflex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner, Symbols {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int YYCOMMENT = 2;
  public static final int YYLINECOMMENT = 4;
  public static final int YYSTRING = 6;
  public static final int YYCHAR = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\62\1\15"+
    "\2\0\1\53\1\57\1\65\1\41\1\42\1\13\1\51\1\50\1\52"+
    "\1\63\1\12\1\4\1\70\1\76\1\71\3\6\1\67\1\5\1\73"+
    "\1\0\1\47\1\55\1\54\1\56\2\0\1\74\4\10\1\75\21\11"+
    "\1\7\2\11\1\45\1\66\1\46\1\60\1\11\1\0\1\24\1\36"+
    "\1\22\1\21\1\33\1\32\1\11\1\23\1\20\1\11\1\37\1\34"+
    "\1\11\1\26\1\17\2\11\1\25\1\30\1\27\1\31\1\16\1\35"+
    "\1\72\1\11\1\40\1\43\1\61\1\44\1\64\u1f99\0\1\14\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udff7\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\2\1\1\2\1\0\1\3\1\4\1\5\1\6"+
    "\1\7\12\3\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\1\2\34"+
    "\1\35\2\36\1\37\1\35\1\40\2\41\1\42\1\40"+
    "\2\43\1\0\1\2\1\44\1\45\1\46\1\47\1\50"+
    "\2\3\1\51\12\3\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
    "\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
    "\1\77\1\0\1\100\1\101\1\0\1\102\1\103\1\104"+
    "\1\105\1\0\1\106\1\107\1\0\1\110\1\3\1\111"+
    "\6\3\1\112\3\3\1\113\1\114\4\0\1\115\1\3"+
    "\1\116\4\3\1\117\2\3\4\0\4\3\1\120\1\121"+
    "\1\122\4\0\1\3\1\123\1\124\1\125\4\0\1\3"+
    "\4\0\1\126\14\0\1\127\1\0\1\130\15\0\1\131"+
    "\1\132";

  private static int [] zzUnpackAction() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u01b9"+
    "\0\u01f8\0\u0237\0\u0276\0\u02b5\0\u013b\0\u013b\0\u02f4\0\u0333"+
    "\0\u0372\0\u03b1\0\u03f0\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b"+
    "\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b"+
    "\0\u056a\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\u0723"+
    "\0\u0762\0\u07a1\0\u013b\0\u013b\0\u07e0\0\u013b\0\u081f\0\u013b"+
    "\0\u013b\0\u085e\0\u013b\0\u089d\0\u013b\0\u013b\0\u08dc\0\u013b"+
    "\0\u091b\0\u095a\0\u013b\0\u0999\0\u013b\0\u013b\0\u013b\0\u013b"+
    "\0\u013b\0\u013b\0\u09d8\0\u0a17\0\u0237\0\u0a56\0\u0a95\0\u0ad4"+
    "\0\u0b13\0\u0b52\0\u0b91\0\u0bd0\0\u0c0f\0\u0c4e\0\u0c8d\0\u013b"+
    "\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u0ccc"+
    "\0\u013b\0\u0d0b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b"+
    "\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b\0\u0d4a\0\u013b\0\u013b"+
    "\0\u0d89\0\u013b\0\u013b\0\u013b\0\u013b\0\u0dc8\0\u013b\0\u013b"+
    "\0\u0e07\0\u013b\0\u0e46\0\u0237\0\u0e85\0\u0ec4\0\u0f03\0\u0f42"+
    "\0\u0f81\0\u0fc0\0\u0237\0\u0fff\0\u103e\0\u107d\0\u013b\0\u013b"+
    "\0\u10bc\0\u10fb\0\u113a\0\u1179\0\u0237\0\u11b8\0\u0237\0\u11f7"+
    "\0\u1236\0\u1275\0\u12b4\0\u0237\0\u12f3\0\u1332\0\u1371\0\u13b0"+
    "\0\u13ef\0\u142e\0\u146d\0\u14ac\0\u14eb\0\u152a\0\u0237\0\u0237"+
    "\0\u0237\0\u1569\0\u15a8\0\u15e7\0\u1626\0\u1665\0\u0237\0\u0237"+
    "\0\u0237\0\u16a4\0\u16e3\0\u1722\0\u1761\0\u17a0\0\u17df\0\u181e"+
    "\0\u185d\0\u189c\0\u0237\0\u18db\0\u191a\0\u1959\0\u1998\0\u19d7"+
    "\0\u1a16\0\u1a55\0\u1a94\0\u1ad3\0\u1b12\0\u1b51\0\u1b90\0\u013b"+
    "\0\u1bcf\0\u013b\0\u1c0e\0\u1c4d\0\u1c8c\0\u1ccb\0\u1d0a\0\u1d49"+
    "\0\u1d88\0\u1dc7\0\u1e06\0\u1e45\0\u1e84\0\u1ec3\0\u1f02\0\u013b"+
    "\0\u013b";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\6\1\7\1\6\1\10\2\11\3\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\12\1\20\1\12\1\21"+
    "\2\12\1\22\2\12\1\23\1\24\1\25\1\26\1\12"+
    "\1\27\1\30\2\12\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\2\0"+
    "\3\11\1\12\1\11\2\12\1\11\13\6\1\55\64\6"+
    "\1\56\1\57\74\6\1\60\1\61\1\62\12\60\1\63"+
    "\50\60\1\64\10\60\1\65\1\66\1\67\62\65\1\70"+
    "\1\71\10\65\100\0\1\6\101\0\1\72\1\0\1\73"+
    "\1\74\57\0\3\73\1\74\3\0\1\73\4\0\3\75"+
    "\60\0\3\75\1\0\1\75\2\0\1\75\4\0\6\12"+
    "\4\0\23\12\26\0\10\12\12\0\1\76\1\77\40\0"+
    "\1\100\34\0\1\101\41\0\1\102\26\0\6\12\4\0"+
    "\1\12\1\103\21\12\26\0\10\12\4\0\6\12\4\0"+
    "\10\12\1\104\3\12\1\105\6\12\26\0\10\12\4\0"+
    "\6\12\4\0\1\12\1\106\3\12\1\107\15\12\26\0"+
    "\10\12\4\0\6\12\4\0\15\12\1\110\5\12\26\0"+
    "\10\12\4\0\6\12\4\0\2\12\1\111\6\12\1\112"+
    "\11\12\26\0\10\12\4\0\6\12\4\0\10\12\1\113"+
    "\12\12\26\0\10\12\4\0\6\12\4\0\1\12\1\114"+
    "\21\12\26\0\10\12\4\0\6\12\4\0\16\12\1\115"+
    "\4\12\26\0\10\12\4\0\6\12\4\0\5\12\1\116"+
    "\15\12\26\0\10\12\4\0\6\12\4\0\7\12\1\117"+
    "\13\12\26\0\10\12\51\0\1\120\2\0\1\121\74\0"+
    "\1\122\1\0\1\123\1\0\1\124\74\0\1\125\76\0"+
    "\1\126\76\0\1\127\1\130\75\0\1\131\1\0\1\132"+
    "\74\0\1\133\2\0\1\134\73\0\1\135\76\0\1\136"+
    "\4\0\1\137\71\0\1\140\34\0\1\141\65\0\1\56"+
    "\76\0\1\61\112\0\1\142\7\0\1\143\1\144\1\145"+
    "\15\0\1\146\17\0\1\147\1\150\3\0\1\151\5\0"+
    "\1\66\112\0\1\152\7\0\1\153\1\154\1\155\15\0"+
    "\1\156\17\0\1\157\1\160\3\0\1\161\10\0\1\72"+
    "\1\0\1\73\60\0\3\73\4\0\1\73\4\0\3\162"+
    "\1\0\1\162\10\0\2\162\1\0\1\162\5\0\2\162"+
    "\2\0\1\162\30\0\3\162\1\0\4\162\4\0\6\12"+
    "\4\0\2\12\1\163\20\12\26\0\10\12\4\0\6\12"+
    "\4\0\11\12\1\164\11\12\26\0\10\12\4\0\6\12"+
    "\4\0\10\12\1\165\12\12\26\0\10\12\4\0\6\12"+
    "\4\0\6\12\1\166\14\12\26\0\10\12\4\0\6\12"+
    "\4\0\11\12\1\167\11\12\26\0\10\12\4\0\6\12"+
    "\4\0\22\12\1\170\26\0\10\12\4\0\6\12\4\0"+
    "\7\12\1\171\13\12\26\0\10\12\4\0\6\12\4\0"+
    "\2\12\1\172\20\12\26\0\10\12\4\0\6\12\4\0"+
    "\7\12\1\173\13\12\26\0\10\12\4\0\6\12\4\0"+
    "\12\12\1\174\10\12\26\0\10\12\4\0\6\12\4\0"+
    "\2\12\1\175\20\12\26\0\10\12\4\0\6\12\4\0"+
    "\15\12\1\176\5\12\26\0\10\12\54\0\1\177\76\0"+
    "\1\200\26\0\1\201\137\0\1\202\35\0\1\203\137\0"+
    "\1\204\35\0\6\12\4\0\3\12\1\205\17\12\26\0"+
    "\10\12\4\0\6\12\4\0\11\12\1\206\11\12\26\0"+
    "\10\12\4\0\6\12\4\0\7\12\1\207\13\12\26\0"+
    "\10\12\4\0\6\12\4\0\13\12\1\210\7\12\26\0"+
    "\10\12\4\0\6\12\4\0\15\12\1\211\5\12\26\0"+
    "\10\12\4\0\6\12\4\0\13\12\1\212\7\12\26\0"+
    "\10\12\4\0\6\12\4\0\1\12\1\213\21\12\26\0"+
    "\10\12\4\0\6\12\4\0\15\12\1\214\5\12\26\0"+
    "\10\12\4\0\6\12\4\0\16\12\1\215\4\12\26\0"+
    "\10\12\4\0\6\12\4\0\6\12\1\216\14\12\26\0"+
    "\10\12\52\0\1\217\30\0\1\220\144\0\1\221\30\0"+
    "\1\222\76\0\6\12\4\0\2\12\1\223\20\12\26\0"+
    "\10\12\4\0\6\12\4\0\7\12\1\224\13\12\26\0"+
    "\10\12\4\0\6\12\4\0\1\12\1\225\21\12\26\0"+
    "\10\12\4\0\6\12\4\0\4\12\1\226\16\12\26\0"+
    "\10\12\4\0\6\12\4\0\10\12\1\227\12\12\26\0"+
    "\10\12\4\0\6\12\4\0\15\12\1\230\5\12\26\0"+
    "\10\12\4\0\6\12\4\0\21\12\1\231\1\12\26\0"+
    "\10\12\67\0\1\232\61\0\1\233\113\0\1\234\61\0"+
    "\1\235\30\0\6\12\4\0\10\12\1\236\12\12\26\0"+
    "\10\12\4\0\6\12\4\0\10\12\1\237\12\12\26\0"+
    "\10\12\4\0\6\12\4\0\14\12\1\240\6\12\26\0"+
    "\10\12\4\0\6\12\4\0\11\12\1\241\11\12\26\0"+
    "\10\12\46\0\1\242\123\0\1\243\51\0\1\244\123\0"+
    "\1\245\7\0\6\12\4\0\13\12\1\246\7\12\26\0"+
    "\10\12\43\0\1\247\57\0\1\250\115\0\1\251\57\0"+
    "\1\252\56\0\6\12\4\0\15\12\1\253\5\12\26\0"+
    "\10\12\70\0\1\254\60\0\1\255\114\0\1\256\60\0"+
    "\1\257\74\0\1\260\60\0\1\261\114\0\1\262\60\0"+
    "\1\263\135\0\1\264\101\0\1\265\73\0\1\266\101\0"+
    "\1\267\46\0\1\270\104\0\1\271\70\0\1\272\104\0"+
    "\1\273\121\0\1\274\76\0\1\275\47\0\1\276\76\0"+
    "\1\277\73\0\1\300\76\0\1\301\123\0\1\302\76\0"+
    "\1\303\56\0\1\304\76\0\1\305\124\0\1\306\76\0"+
    "\1\307\44\0\1\310\76\0\1\311\32\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8001];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\1\11\2\1\1\0\3\1\2\11\12\1\10\11"+
    "\12\1\2\11\1\1\1\11\1\1\2\11\1\1\1\11"+
    "\1\1\2\11\1\1\1\11\2\1\1\11\1\0\6\11"+
    "\15\1\10\11\1\1\1\11\1\1\13\11\1\0\2\11"+
    "\1\0\4\11\1\0\2\11\1\0\1\11\14\1\2\11"+
    "\4\0\12\1\4\0\7\1\4\0\4\1\4\0\1\1"+
    "\4\0\1\1\14\0\1\11\1\0\1\11\15\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	private int charLen;
	private char charContent;
	private StringBuffer strContent;

	private void err(String msg)
	{
		System.out.println("Scanning error in line " + yyline + ", column " + yycolumn + ": " + msg);
		System.exit(1);
	}
	
	private java_cup.runtime.Symbol token(int kind)
	{
		return new java_cup.runtime.Symbol(kind,yyline,yycolumn);
	}
	
	private java_cup.runtime.Symbol token(int kind, Object val)
	{
		return new java_cup.runtime.Symbol(kind, yyline, yycolumn, val);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 192) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
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


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
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


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
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
        // peek one character ahead if it is \n (if we have counted one line too much)
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

      // set up zzAction for empty match case:
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
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
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

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { 	{
		if(yystate()==YYCOMMENT)
			err("Comment symbol doesn't match on EOF!");
		if(yystate()==YYSTRING)
			err("String symbol doesn't match on EOF!");
		if(yystate()==YYCHAR)
			err("Char symbol doesn't match on EOF!");
		return token(EOF, null);
	}
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 91: break;
          case 2: 
            { return token(NUM, new Integer(yytext());
            }
          case 92: break;
          case 3: 
            { return token(ID,yytext());
            }
          case 93: break;
          case 4: 
            { return token(DIVIDE);
            }
          case 94: break;
          case 5: 
            { return token(TIMES);
            }
          case 95: break;
          case 6: 
            { charLen=0; yybegin(YYCHAR);
            }
          case 96: break;
          case 7: 
            { strContent=new StringBuffer(); yybegin(YYSTRING);
            }
          case 97: break;
          case 8: 
            { return token(LPAREN);
            }
          case 98: break;
          case 9: 
            { return token(RPAREN);
            }
          case 99: break;
          case 10: 
            { return token(LBRACE);
            }
          case 100: break;
          case 11: 
            { return token(RBRACE);
            }
          case 101: break;
          case 12: 
            { return token(LMPAREN);
            }
          case 102: break;
          case 13: 
            { return token(RMPAREN);
            }
          case 103: break;
          case 14: 
            { return token(SEMI);
            }
          case 104: break;
          case 15: 
            { return token(COMMA);
            }
          case 105: break;
          case 16: 
            { return token(PLUS);
            }
          case 106: break;
          case 17: 
            { return token(MINUS);
            }
          case 107: break;
          case 18: 
            { return token(MODULE);
            }
          case 108: break;
          case 19: 
            { return token(ASSIGN);
            }
          case 109: break;
          case 20: 
            { return token(LT);
            }
          case 110: break;
          case 21: 
            { return token(GT);
            }
          case 111: break;
          case 22: 
            { return token(BIT_AND);
            }
          case 112: break;
          case 23: 
            { return token(BIT_XOR);
            }
          case 113: break;
          case 24: 
            { return token(BIT_OR);
            }
          case 114: break;
          case 25: 
            { return token(NOT);
            }
          case 115: break;
          case 26: 
            { return token(DOT);
            }
          case 116: break;
          case 27: 
            { return token(BIT_NOT);
            }
          case 117: break;
          case 28: 
            { yybegin(YYINITIAL);
            }
          case 118: break;
          case 29: 
            { strContent.append(yytext().charAt(0));
            }
          case 119: break;
          case 30: 
            { err("Line Terminator detected! Invalid string representation!");
            }
          case 120: break;
          case 31: 
            { yybegin(YYINITIAL); return token(STRINGCONTENT,strContent.toString());
            }
          case 121: break;
          case 32: 
            { charContent=yytext().charAt(0); ++charLen;
            }
          case 122: break;
          case 33: 
            { err("Line Terminator detected! Invalid character representation!");
            }
          case 123: break;
          case 34: 
            { if(charLen==1)
		{	
			yybegin(YYINITIAL);
			return token(CHARCONTENT, new Character(charContent));
		} 
		else
			err("Not a character!");
            }
          case 124: break;
          case 35: 
            { return token(NUM, Integer.valueOf(yytext().substring(1),8));
            }
          case 125: break;
          case 36: 
            { yybegin(YYLINECOMMENT);
            }
          case 126: break;
          case 37: 
            { yybegin(YYCOMMENT);
            }
          case 127: break;
          case 38: 
            { return token(DIV_ASSIGN);
            }
          case 128: break;
          case 39: 
            { error("Comment symbol doesn't match!");
            }
          case 129: break;
          case 40: 
            { return token(MUL_ASSIGN);
            }
          case 130: break;
          case 41: 
            { return token(IF);
            }
          case 131: break;
          case 42: 
            { return token(INC);
            }
          case 132: break;
          case 43: 
            { return token(ADD_ASSIGN);
            }
          case 133: break;
          case 44: 
            { return token(DEC);
            }
          case 134: break;
          case 45: 
            { return token(SUB_ASSIGN);
            }
          case 135: break;
          case 46: 
            { return token(PTR);
            }
          case 136: break;
          case 47: 
            { return token(MOD_ASSIGN);
            }
          case 137: break;
          case 48: 
            { return token(EQ);
            }
          case 138: break;
          case 49: 
            { return token(LE);
            }
          case 139: break;
          case 50: 
            { return token(SHL);
            }
          case 140: break;
          case 51: 
            { return token(GE);
            }
          case 141: break;
          case 52: 
            { return token(SHR);
            }
          case 142: break;
          case 53: 
            { return token(AND_ASSIGN);
            }
          case 143: break;
          case 54: 
            { return token(AND);
            }
          case 144: break;
          case 55: 
            { return token(XOR_ASSIGN);
            }
          case 145: break;
          case 56: 
            { return token(OR_ASSIGN);
            }
          case 146: break;
          case 57: 
            { return token(OR);
            }
          case 147: break;
          case 58: 
            { return token(NE);
            }
          case 148: break;
          case 59: 
            { yybegin(YYINTIAL);
            }
          case 149: break;
          case 60: 
            { strContent.append('\"');
            }
          case 150: break;
          case 61: 
            { strContent.append('\r');
            }
          case 151: break;
          case 62: 
            { strContent.append('\n');
            }
          case 152: break;
          case 63: 
            { strContent.append('\t');
            }
          case 153: break;
          case 64: 
            { strContent.append('\'');
            }
          case 154: break;
          case 65: 
            { strContent.append('\\');
            }
          case 155: break;
          case 66: 
            { charContent='\"'; ++charLen;
            }
          case 156: break;
          case 67: 
            { charContent='\r'; ++charLen;
            }
          case 157: break;
          case 68: 
            { charContent='\n'; ++charLen;
            }
          case 158: break;
          case 69: 
            { charContent='\t'; ++charLen;
            }
          case 159: break;
          case 70: 
            { charContent='\''; ++charLen;
            }
          case 160: break;
          case 71: 
            { charContent='\\'; ++charLen;
            }
          case 161: break;
          case 72: 
            { return token(NUM, Integer.valueOf(yytext().substring(2),16));
            }
          case 162: break;
          case 73: 
            { return token(INT);
            }
          case 163: break;
          case 74: 
            { return token(FOR);
            }
          case 164: break;
          case 75: 
            { return token(SHL_ASSIGN);
            }
          case 165: break;
          case 76: 
            { return token(SHR_ASSIGN);
            }
          case 166: break;
          case 77: 
            { return token(VOID);
            }
          case 167: break;
          case 78: 
            { return token(CHAR);
            }
          case 168: break;
          case 79: 
            { return token(ELSE);
            }
          case 169: break;
          case 80: 
            { return token(UNION);
            }
          case 170: break;
          case 81: 
            { return token(WHILE);
            }
          case 171: break;
          case 82: 
            { return token(BREAK);
            }
          case 172: break;
          case 83: 
            { return token(RETURN);
            }
          case 173: break;
          case 84: 
            { return token(SIZEOF);
            }
          case 174: break;
          case 85: 
            { return token(STRUCT);
            }
          case 175: break;
          case 86: 
            { return token(CONTINUE);
            }
          case 176: break;
          case 87: 
            { int tmp=Integer.parseInt(yytext().substring(1),8); 
		if(tmp<256)
			strContent.append((char)tmp);
		else
			err("Octal escape sequence out of range!");
            }
          case 177: break;
          case 88: 
            { int tmp=Integer.parseInt(yytext().substring(1),8); 
		if(tmp<256)
		{
			charContent=(char)tmp;
			 ++charLen;
		}
		else
			err("Octal escape sequence out of range!");
            }
          case 178: break;
          case 89: 
            { strContent.append((char)Integer.parseInt(yytext().substring(2),16));
            }
          case 179: break;
          case 90: 
            { charContent=(char)Integer.parseInt(yytext().substring(2),16); ++charLen;
            }
          case 180: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
