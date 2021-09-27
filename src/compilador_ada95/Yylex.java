// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: lexer.txt

package compilador_ada95;

import java_cup.runtime.Symbol;
import javax.swing.JOptionPane;
import java.util.ArrayList;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int COMENTARIOS = 2;
  public static final int STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\5\1\0"+
    "\1\6\3\0\1\7\1\0\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\12\12\17\1\20\1\21\1\22"+
    "\1\23\1\22\2\0\1\24\1\25\3\24\1\26\2\24"+
    "\1\27\21\24\4\0\1\30\1\0\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\2\24\1\42"+
    "\1\24\1\43\1\44\1\45\1\24\1\46\1\47\1\50"+
    "\1\51\1\24\1\52\1\53\2\24\1\0\1\54\10\0"+
    "\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\10\1\1\1\12\1\13\1\14\2\15"+
    "\4\16\1\1\13\16\1\17\1\20\2\21\1\22\1\23"+
    "\1\24\1\25\1\0\1\26\13\16\1\27\1\30\1\31"+
    "\15\16\1\32\2\16\1\33\1\16\1\34\2\16\1\35"+
    "\1\16\1\36\11\16\1\37\1\0\1\40\3\16\1\41"+
    "\2\16\1\42\1\43\1\44\2\16\1\45\1\16\1\46"+
    "\1\16\2\0\1\47\1\16\1\50\2\16\1\51\2\16"+
    "\1\52\1\53\1\0\2\16\1\54\1\55\1\56\1\0"+
    "\2\16\1\57\1\60\1\16\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[136];
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
    "\0\0\0\55\0\132\0\207\0\207\0\264\0\207\0\207"+
    "\0\207\0\207\0\207\0\207\0\207\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\207\0\u0195\0\207\0\u01c2\0\u01ef\0\u021c\0\u0249"+
    "\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1"+
    "\0\u03de\0\u040b\0\u0438\0\u0465\0\207\0\207\0\u0492\0\207"+
    "\0\207\0\207\0\207\0\u010e\0\u010e\0\207\0\u04bf\0\u04ec"+
    "\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa\0\u0627\0\u0654"+
    "\0\u0681\0\u01c2\0\u06ae\0\u01c2\0\u06db\0\u0708\0\u0735\0\u0762"+
    "\0\u078f\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca"+
    "\0\u08f7\0\u0924\0\u0951\0\u097e\0\u01c2\0\u09ab\0\u01c2\0\u09d8"+
    "\0\u0a05\0\u01c2\0\u0a32\0\u01c2\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6"+
    "\0\u0b13\0\u0b40\0\u0b6d\0\u0b9a\0\u0bc7\0\u0bf4\0\u0c21\0\u01c2"+
    "\0\u0c4e\0\u0c7b\0\u0ca8\0\u01c2\0\u0cd5\0\u0d02\0\u01c2\0\u01c2"+
    "\0\u01c2\0\u0d2f\0\u0d5c\0\u01c2\0\u0d89\0\u01c2\0\u0db6\0\u0de3"+
    "\0\u0e10\0\u01c2\0\u0e3d\0\u01c2\0\u0e6a\0\u0e97\0\u01c2\0\u0ec4"+
    "\0\u0ef1\0\u01c2\0\207\0\u0f1e\0\u0f4b\0\u0f78\0\u01c2\0\u01c2"+
    "\0\u01c2\0\u0fa5\0\u0fd2\0\u0fff\0\207\0\u01c2\0\u102c\0\u01c2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[136];
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
    "\1\4\1\5\1\6\1\0\2\5\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\25\1\32\2\25\1\33\1\34\1\35\1\25\1\36"+
    "\1\37\1\25\1\40\1\41\1\42\1\25\1\43\1\25"+
    "\1\44\1\25\1\45\2\46\1\47\1\0\1\50\50\46"+
    "\2\51\3\0\1\51\1\52\46\51\61\0\1\5\65\0"+
    "\1\53\56\0\1\54\53\0\1\55\1\20\60\0\1\56"+
    "\54\0\1\24\50\0\1\25\4\0\30\25\20\0\1\25"+
    "\4\0\20\25\1\57\7\25\20\0\1\25\4\0\16\25"+
    "\1\60\11\25\20\0\1\25\4\0\17\25\1\61\10\25"+
    "\25\0\4\25\1\0\23\25\20\0\1\25\4\0\11\25"+
    "\1\62\16\25\20\0\1\25\4\0\16\25\1\63\1\64"+
    "\7\25\1\65\20\0\1\25\4\0\5\25\1\66\12\25"+
    "\1\67\4\25\1\70\2\25\20\0\1\25\4\0\11\25"+
    "\1\71\16\25\20\0\1\25\4\0\12\25\1\72\4\25"+
    "\1\73\3\25\1\74\4\25\20\0\1\25\4\0\20\25"+
    "\1\75\7\25\20\0\1\25\4\0\25\25\1\76\2\25"+
    "\20\0\1\25\4\0\22\25\1\77\2\25\1\100\2\25"+
    "\20\0\1\25\4\0\11\25\1\101\16\25\20\0\1\25"+
    "\4\0\14\25\1\102\5\25\1\103\5\25\20\0\1\25"+
    "\4\0\14\25\1\104\13\25\5\0\1\50\67\0\1\25"+
    "\4\0\20\25\1\105\7\25\20\0\1\25\4\0\20\25"+
    "\1\106\7\25\20\0\1\25\4\0\24\25\1\107\3\25"+
    "\20\0\1\25\4\0\13\25\1\110\14\25\20\0\1\25"+
    "\4\0\23\25\1\111\4\25\20\0\1\25\4\0\10\25"+
    "\1\112\17\25\20\0\1\25\4\0\15\25\1\113\12\25"+
    "\20\0\1\25\4\0\16\25\1\114\11\25\20\0\1\25"+
    "\4\0\22\25\1\115\5\25\20\0\1\25\4\0\17\25"+
    "\1\116\10\25\20\0\1\25\4\0\24\25\1\117\3\25"+
    "\20\0\1\25\4\0\20\25\1\120\7\25\20\0\1\25"+
    "\4\0\20\25\1\121\7\25\20\0\1\25\4\0\24\25"+
    "\1\122\3\25\20\0\1\25\4\0\20\25\1\123\7\25"+
    "\20\0\1\25\4\0\24\25\1\124\3\25\20\0\1\25"+
    "\4\0\24\25\1\125\3\25\20\0\1\25\4\0\11\25"+
    "\1\126\16\25\20\0\1\25\4\0\25\25\1\127\2\25"+
    "\20\0\1\25\4\0\11\25\1\130\3\25\1\131\12\25"+
    "\20\0\1\25\4\0\16\25\1\132\11\25\20\0\1\25"+
    "\4\0\5\25\1\133\22\25\20\0\1\25\4\0\11\25"+
    "\1\134\16\25\20\0\1\25\4\0\15\25\1\135\12\25"+
    "\20\0\1\25\4\0\11\25\1\136\16\25\6\0\1\137"+
    "\11\0\1\25\4\0\30\25\20\0\1\25\4\0\24\25"+
    "\1\140\3\25\20\0\1\25\4\0\23\25\1\141\4\25"+
    "\20\0\1\25\4\0\7\25\1\142\20\25\20\0\1\25"+
    "\4\0\25\25\1\143\2\25\20\0\1\25\4\0\21\25"+
    "\1\144\6\25\20\0\1\25\4\0\7\25\1\145\20\25"+
    "\20\0\1\25\4\0\25\25\1\146\2\25\20\0\1\25"+
    "\4\0\17\25\1\147\10\25\20\0\1\25\4\0\11\25"+
    "\1\150\16\25\20\0\1\25\4\0\17\25\1\151\10\25"+
    "\20\0\1\25\4\0\16\25\1\152\11\25\20\0\1\25"+
    "\4\0\11\25\1\153\16\25\20\0\1\25\4\0\24\25"+
    "\1\154\3\25\20\0\1\25\4\0\13\25\1\155\14\25"+
    "\20\0\1\25\4\0\17\25\1\156\10\25\20\0\1\25"+
    "\4\0\15\25\1\157\12\25\6\0\1\137\33\0\1\160"+
    "\1\161\31\0\1\25\4\0\11\25\1\162\16\25\20\0"+
    "\1\25\4\0\24\25\1\163\3\25\20\0\1\25\4\0"+
    "\24\25\1\164\3\25\20\0\1\25\4\0\11\25\1\165"+
    "\16\25\20\0\1\25\4\0\22\25\1\166\5\25\20\0"+
    "\1\25\4\0\11\25\1\167\16\25\20\0\1\25\4\0"+
    "\5\25\1\170\22\25\20\0\1\25\4\0\11\25\1\171"+
    "\16\25\20\0\1\25\4\0\12\25\1\172\15\25\37\0"+
    "\1\173\62\0\1\174\27\0\1\25\4\0\15\25\1\175"+
    "\12\25\20\0\1\25\4\0\10\25\1\176\17\25\20\0"+
    "\1\25\4\0\17\25\1\177\10\25\20\0\1\25\4\0"+
    "\17\25\1\200\10\25\20\0\1\25\4\0\22\25\1\201"+
    "\5\25\45\0\1\202\27\0\1\25\4\0\20\25\1\203"+
    "\7\25\20\0\1\25\4\0\25\25\1\204\2\25\46\0"+
    "\1\205\26\0\1\25\4\0\17\25\1\206\10\25\20\0"+
    "\1\25\4\0\22\25\1\207\5\25\20\0\1\25\4\0"+
    "\11\25\1\210\16\25\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4185];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\2\11\1\1\7\11\4\1\1\11\1\1\1\11"+
    "\20\1\2\11\1\1\4\11\1\1\1\0\1\11\60\1"+
    "\1\0\20\1\2\0\11\1\1\11\1\0\5\1\1\0"+
    "\2\1\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[136];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    String comentario="";
    String cadena="";
    ArrayList erroresLexicos = new ArrayList();
    


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

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
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { erroresLexicos.add("Error lexico en linea "+yyline+" y columna "+yycolumn+" y en el texto: "+yytext());
            }
            // fall through
          case 50: break;
          case 2:
            { 
            }
            // fall through
          case 51: break;
          case 3:
            { yybegin(STRING);
            }
            // fall through
          case 52: break;
          case 4:
            { return new Symbol (sym.TK_AND, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 53: break;
          case 5:
            { return new Symbol (sym.TK_PARENTESISI, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 54: break;
          case 6:
            { return new Symbol (sym.TK_PARENTESISD, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 55: break;
          case 7:
            { return new Symbol (sym.TK_MULTI, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 56: break;
          case 8:
            { return new Symbol (sym.TK_OPADICION, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 57: break;
          case 9:
            { return new Symbol (sym.TK_COMA, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 58: break;
          case 10:
            { return new Symbol (sym.TK_DIGITO, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 59: break;
          case 11:
            { return new Symbol (sym.TK_COLON, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 60: break;
          case 12:
            { return new Symbol (sym.TK_PUNTOCOMA, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 61: break;
          case 13:
            { return new Symbol (sym.TK_OPREL, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 62: break;
          case 14:
            { return new Symbol (sym.TK_ID, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 63: break;
          case 15:
            { return new Symbol (sym.TK_OR, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 64: break;
          case 16:
            { comentario = comentario+yytext();
            }
            // fall through
          case 65: break;
          case 17:
            { System.out.println("Este es un comentario: "+comentario); comentario =" ";yybegin(YYINITIAL);
            }
            // fall through
          case 66: break;
          case 18:
            { cadena=cadena+yytext();
            }
            // fall through
          case 67: break;
          case 19:
            { String temp = cadena; cadena=""; yybegin(YYINITIAL); return new Symbol(sym.TK_STRING, yyline + 1, yycolumn +1 , temp);
            }
            // fall through
          case 68: break;
          case 20:
            { yybegin(COMENTARIOS);
            }
            // fall through
          case 69: break;
          case 21:
            { return new Symbol (sym.TK_DIGITOFLOAT, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 70: break;
          case 22:
            { return new Symbol (sym.TK_IGUAL, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 71: break;
          case 23:
            { return new Symbol (sym.TK_IF, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 72: break;
          case 24:
            { return new Symbol (sym.TK_IN, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 73: break;
          case 25:
            { return new Symbol (sym.TK_IS, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 74: break;
          case 26:
            { return new Symbol (sym.TK_END, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 75: break;
          case 27:
            { return new Symbol (sym.TK_FOR, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 76: break;
          case 28:
            { return new Symbol (sym.TK_GET, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 77: break;
          case 29:
            { return new Symbol (sym.TK_OUT, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 78: break;
          case 30:
            { return new Symbol (sym.TK_PUT, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 79: break;
          case 31:
            { return new Symbol (sym.TK_ELSE, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 80: break;
          case 32:
            { return new Symbol (sym.TK_EXIT, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 81: break;
          case 33:
            { return new Symbol (sym.TK_LOOP, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 82: break;
          case 34:
            { return new Symbol (sym.TK_THEN, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 83: break;
          case 35:
            { return new Symbol (sym.TK_TRUE, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 84: break;
          case 36:
            { return new Symbol (sym.TK_WHEN, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 85: break;
          case 37:
            { return new Symbol (sym.TK_FLOAT, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 86: break;
          case 38:
            { return new Symbol (sym.TK_BEGIN, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 87: break;
          case 39:
            { return new Symbol (sym.TK_FALSE, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 88: break;
          case 40:
            { return new Symbol (sym.TK_INOUT, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 89: break;
          case 41:
            { return new Symbol (sym.TK_WHILE, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 90: break;
          case 42:
            { return new Symbol (sym.TK_ELSEIF, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 91: break;
          case 43:
            { return new Symbol (sym.TK_ENDIF, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 92: break;
          case 44:
            { return new Symbol (sym.TK_RETURN, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 93: break;
          case 45:
            { return new Symbol (sym.TK_BOOLEAN, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 94: break;
          case 46:
            { return new Symbol (sym.TK_INTEGER, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 95: break;
          case 47:
            { return new Symbol (sym.TK_ENDLOOP, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 96: break;
          case 48:
            { return new Symbol (sym.TK_FUNCTION, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 97: break;
          case 49:
            { return new Symbol (sym.TK_PROCEDURE, yyline + 1, yycolumn +1 , yytext() ) ;
            }
            // fall through
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
