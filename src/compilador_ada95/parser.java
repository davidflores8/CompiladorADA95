
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package compilador_ada95;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\013\000\002\003" +
    "\004\000\002\003\004\000\002\003\004\000\002\003\004" +
    "\000\002\003\004\000\002\003\002\000\002\005\012\000" +
    "\002\006\006\000\002\006\010\000\002\006\010\000\002" +
    "\006\010\000\002\006\010\000\002\006\006\000\002\006" +
    "\006\000\002\006\006\000\002\004\012\000\002\011\003" +
    "\000\002\011\005\000\002\011\005\000\002\012\005\000" +
    "\002\012\005\000\002\012\005\000\002\012\005\000\002" +
    "\012\005\000\002\007\006\000\002\010\005\000\002\010" +
    "\003\000\002\013\003\000\002\013\005\000\002\013\005" +
    "\000\002\013\003\000\002\013\005\000\002\013\003\000" +
    "\002\013\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\133\000\014\002\ufffa\004\007\010\011\026\016\031" +
    "\006\001\002\000\004\002\135\001\002\000\024\002\ufffa" +
    "\004\007\010\011\015\ufffa\025\ufffa\026\016\031\006\033" +
    "\ufffa\034\ufffa\001\002\000\004\010\124\001\002\000\004" +
    "\006\115\001\002\000\024\002\ufffa\004\007\010\011\015" +
    "\ufffa\025\ufffa\026\016\031\006\033\ufffa\034\ufffa\001\002" +
    "\000\010\017\066\023\067\037\uffe5\001\002\000\024\002" +
    "\ufffa\004\007\010\011\015\ufffa\025\ufffa\026\016\031\006" +
    "\033\ufffa\034\ufffa\001\002\000\004\037\050\001\002\000" +
    "\024\002\ufffa\004\007\010\011\015\ufffa\025\ufffa\026\016" +
    "\031\006\033\ufffa\034\ufffa\001\002\000\024\002\ufffa\004" +
    "\007\010\011\015\ufffa\025\ufffa\026\016\031\006\033\ufffa" +
    "\034\ufffa\001\002\000\004\006\017\001\002\000\010\010" +
    "\023\012\021\013\024\001\002\000\010\007\uffef\040\043" +
    "\041\042\001\002\000\004\011\040\001\002\000\004\007" +
    "\033\001\002\000\004\011\027\001\002\000\004\011\025" +
    "\001\002\000\004\010\026\001\002\000\010\007\uffe8\040" +
    "\uffe8\041\uffe8\001\002\000\010\010\031\012\030\013\032" +
    "\001\002\000\010\007\uffeb\040\uffeb\041\uffeb\001\002\000" +
    "\010\007\uffec\040\uffec\041\uffec\001\002\000\010\007\uffea" +
    "\040\uffea\041\uffea\001\002\000\004\024\034\001\002\000" +
    "\014\004\007\010\011\025\ufffa\026\016\031\006\001\002" +
    "\000\004\025\036\001\002\000\004\016\037\001\002\000" +
    "\024\002\ufff0\004\ufff0\010\ufff0\015\ufff0\025\ufff0\026\ufff0" +
    "\031\ufff0\033\ufff0\034\ufff0\001\002\000\004\010\041\001" +
    "\002\000\010\007\uffe9\040\uffe9\041\uffe9\001\002\000\010" +
    "\010\023\012\021\013\024\001\002\000\010\010\023\012" +
    "\021\013\024\001\002\000\004\007\uffed\001\002\000\004" +
    "\007\uffee\001\002\000\014\002\ufffc\015\ufffc\025\ufffc\033" +
    "\ufffc\034\ufffc\001\002\000\014\002\uffff\015\uffff\025\uffff" +
    "\033\uffff\034\uffff\001\002\000\010\020\052\021\051\022" +
    "\054\001\002\000\006\016\uffe4\017\062\001\002\000\006" +
    "\016\uffe1\017\060\001\002\000\004\016\057\001\002\000" +
    "\006\016\uffdf\017\055\001\002\000\004\012\056\001\002" +
    "\000\004\016\uffde\001\002\000\024\002\uffe7\004\uffe7\010" +
    "\uffe7\015\uffe7\025\uffe7\026\uffe7\031\uffe7\033\uffe7\034\uffe7" +
    "\001\002\000\004\012\061\001\002\000\004\016\uffe0\001" +
    "\002\000\006\035\063\036\064\001\002\000\004\016\uffe2" +
    "\001\002\000\004\016\uffe3\001\002\000\014\002\ufffe\015" +
    "\ufffe\025\ufffe\033\ufffe\034\ufffe\001\002\000\012\010\075" +
    "\012\074\035\072\036\073\001\002\000\004\010\071\001" +
    "\002\000\004\037\uffe6\001\002\000\006\023\067\037\uffe5" +
    "\001\002\000\004\016\113\001\002\000\004\016\112\001" +
    "\002\000\004\016\111\001\002\000\010\016\100\027\076" +
    "\030\077\001\002\000\006\010\106\012\105\001\002\000" +
    "\006\010\102\012\101\001\002\000\024\002\ufff8\004\ufff8" +
    "\010\ufff8\015\ufff8\025\ufff8\026\ufff8\031\ufff8\033\ufff8\034" +
    "\ufff8\001\002\000\004\016\104\001\002\000\004\016\103" +
    "\001\002\000\024\002\ufff5\004\ufff5\010\ufff5\015\ufff5\025" +
    "\ufff5\026\ufff5\031\ufff5\033\ufff5\034\ufff5\001\002\000\024" +
    "\002\ufff4\004\ufff4\010\ufff4\015\ufff4\025\ufff4\026\ufff4\031" +
    "\ufff4\033\ufff4\034\ufff4\001\002\000\004\016\110\001\002" +
    "\000\004\016\107\001\002\000\024\002\ufff7\004\ufff7\010" +
    "\ufff7\015\ufff7\025\ufff7\026\ufff7\031\ufff7\033\ufff7\034\ufff7" +
    "\001\002\000\024\002\ufff6\004\ufff6\010\ufff6\015\ufff6\025" +
    "\ufff6\026\ufff6\031\ufff6\033\ufff6\034\ufff6\001\002\000\024" +
    "\002\ufff3\004\ufff3\010\ufff3\015\ufff3\025\ufff3\026\ufff3\031" +
    "\ufff3\033\ufff3\034\ufff3\001\002\000\024\002\ufff1\004\ufff1" +
    "\010\ufff1\015\ufff1\025\ufff1\026\ufff1\031\ufff1\033\ufff1\034" +
    "\ufff1\001\002\000\024\002\ufff2\004\ufff2\010\ufff2\015\ufff2" +
    "\025\ufff2\026\ufff2\031\ufff2\033\ufff2\034\ufff2\001\002\000" +
    "\014\002\ufffb\015\ufffb\025\ufffb\033\ufffb\034\ufffb\001\002" +
    "\000\010\010\023\012\021\013\024\001\002\000\004\007" +
    "\117\001\002\000\004\014\120\001\002\000\014\004\007" +
    "\010\011\015\ufffa\026\016\031\006\001\002\000\004\015" +
    "\122\001\002\000\004\016\123\001\002\000\024\002\ufff9" +
    "\004\ufff9\010\ufff9\015\ufff9\025\ufff9\026\ufff9\031\ufff9\033" +
    "\ufff9\034\ufff9\001\002\000\004\032\125\001\002\000\014" +
    "\004\007\010\011\026\016\031\006\033\ufffa\001\002\000" +
    "\004\033\127\001\002\000\014\004\007\010\011\026\016" +
    "\031\006\034\ufffa\001\002\000\004\034\131\001\002\000" +
    "\004\010\132\001\002\000\004\016\133\001\002\000\024" +
    "\002\000\004\000\010\000\015\000\025\000\026\000\031" +
    "\000\033\000\034\000\001\002\000\014\002\ufffd\015\ufffd" +
    "\025\ufffd\033\ufffd\034\ufffd\001\002\000\004\002\001\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\133\000\020\002\007\003\003\004\004\005\013\006" +
    "\014\007\011\010\012\001\001\000\002\001\001\000\020" +
    "\002\007\003\133\004\004\005\013\006\014\007\011\010" +
    "\012\001\001\000\002\001\001\000\002\001\001\000\020" +
    "\002\007\003\113\004\004\005\013\006\014\007\011\010" +
    "\012\001\001\000\002\001\001\000\020\002\007\003\064" +
    "\004\004\005\013\006\014\007\011\010\012\001\001\000" +
    "\002\001\001\000\020\002\007\003\046\004\004\005\013" +
    "\006\014\007\011\010\012\001\001\000\020\002\007\003" +
    "\045\004\004\005\013\006\014\007\011\010\012\001\001" +
    "\000\002\001\001\000\006\011\021\012\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\020\002\007\003" +
    "\034\004\004\005\013\006\014\007\011\010\012\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\012\044\001\001" +
    "\000\004\012\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\013\052" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\067\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\011\115\012\017\001\001" +
    "\000\002\001\001\000\002\001\001\000\020\002\007\003" +
    "\120\004\004\005\013\006\014\007\011\010\012\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\020\002\007\003\125\004\004\005\013" +
    "\006\014\007\011\010\012\001\001\000\002\001\001\000" +
    "\020\002\007\003\127\004\004\005\013\006\014\007\011" +
    "\010\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public void syntax_error (Symbol s){
    System.out.println("Error de sintaxis");
    System.out.println("Linea " +s.left);
    System.out.println("Columna " +s.right);
}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROCEDURE_PRIME EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROCEDURE ::= TK_PROCEDURE TK_ID TK_IS PROCEDURE_PRIME TK_BEGIN PROCEDURE_PRIME TK_END TK_ID TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROCEDURE",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PROCEDURE_PRIME ::= DECISION PROCEDURE_PRIME 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROCEDURE_PRIME",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // PROCEDURE_PRIME ::= DECLARACIONES PROCEDURE_PRIME 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROCEDURE_PRIME",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // PROCEDURE_PRIME ::= WHILE PROCEDURE_PRIME 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROCEDURE_PRIME",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // PROCEDURE_PRIME ::= ASIGNACIONES PROCEDURE_PRIME 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROCEDURE_PRIME",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // PROCEDURE_PRIME ::= PROCEDURE PROCEDURE_PRIME 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROCEDURE_PRIME",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // PROCEDURE_PRIME ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROCEDURE_PRIME",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECISION ::= TK_IF TK_PARENTESISI EXPRESIONES TK_PARENTESISD TK_THEN PROCEDURE_PRIME TK_ENDIF TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECISION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // ASIGNACIONES ::= TK_ID TK_IGUAL TK_ID TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ASIGNACIONES ::= TK_ID TK_IGUAL TK_ID TK_OPADICION TK_ID TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ASIGNACIONES ::= TK_ID TK_IGUAL TK_ID TK_OPADICION TK_DIGITO TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ASIGNACIONES ::= TK_ID TK_IGUAL TK_ID TK_MULTI TK_ID TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ASIGNACIONES ::= TK_ID TK_IGUAL TK_ID TK_MULTI TK_DIGITO TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ASIGNACIONES ::= TK_ID TK_IGUAL TK_DIGITO TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ASIGNACIONES ::= TK_ID TK_IGUAL TK_TRUE TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ASIGNACIONES ::= TK_ID TK_IGUAL TK_FALSE TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // WHILE ::= TK_WHILE TK_PARENTESISI EXPRESIONES TK_PARENTESISD TK_LOOP PROCEDURE_PRIME TK_ENDLOOP TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("WHILE",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPRESIONES ::= EP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESIONES",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPRESIONES ::= EP TK_OR EP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESIONES",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // EXPRESIONES ::= EP TK_AND EP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESIONES",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // EP ::= TK_ID TK_OPREL TK_ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EP",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EP ::= TK_ID TK_OPREL TK_DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EP",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // EP ::= TK_ID TK_OPREL TK_LETRA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EP",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // EP ::= TK_DIGITO TK_OPREL TK_ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EP",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // EP ::= TK_LETRA TK_OPREL TK_ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EP",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // DECLARACIONES ::= ID TK_COLON TIPOS TK_PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECLARACIONES",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ID ::= TK_ID TK_COMA ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ID",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ID ::= TK_ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ID",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // TIPOS ::= TK_BOOLEAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // TIPOS ::= TK_BOOLEAN TK_IGUAL TK_FALSE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // TIPOS ::= TK_BOOLEAN TK_IGUAL TK_TRUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // TIPOS ::= TK_INTEGER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // TIPOS ::= TK_INTEGER TK_IGUAL TK_DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // TIPOS ::= TK_FLOAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // TIPOS ::= TK_FLOAT TK_IGUAL TK_DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
