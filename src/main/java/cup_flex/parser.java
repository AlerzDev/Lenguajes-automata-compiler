
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
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
    "\000\012\000\002\002\007\000\002\002\004\000\002\003" +
    "\004\000\002\003\003\000\002\005\015\000\002\004\007" +
    "\000\002\004\007\000\002\007\017\000\002\007\015\000" +
    "\002\007\015" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\102\000\004\004\004\001\002\000\004\005\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\004\013\010\001\002\000\004\007\073\001\002\000" +
    "\006\014\012\015\015\001\002\000\004\007\024\001\002" +
    "\000\004\006\023\001\002\000\010\006\ufffe\014\012\015" +
    "\015\001\002\000\004\007\016\001\002\000\002\001\002" +
    "\000\004\010\020\001\002\000\004\011\021\001\002\000" +
    "\010\006\ufffb\014\ufffb\015\ufffb\001\002\000\004\006\uffff" +
    "\001\002\000\004\002\001\001\002\000\010\016\030\017" +
    "\027\020\026\001\002\000\004\010\071\001\002\000\004" +
    "\007\057\001\002\000\004\007\045\001\002\000\004\007" +
    "\031\001\002\000\002\001\002\000\004\012\033\001\002" +
    "\000\002\001\002\000\004\012\035\001\002\000\002\001" +
    "\002\000\004\012\037\001\002\000\002\001\002\000\004" +
    "\012\041\001\002\000\002\001\002\000\004\010\043\001" +
    "\002\000\004\011\044\001\002\000\004\010\ufffa\001\002" +
    "\000\002\001\002\000\004\012\047\001\002\000\002\001" +
    "\002\000\004\012\051\001\002\000\002\001\002\000\004" +
    "\012\053\001\002\000\002\001\002\000\004\010\055\001" +
    "\002\000\004\011\056\001\002\000\004\010\ufff9\001\002" +
    "\000\002\001\002\000\004\012\061\001\002\000\002\001" +
    "\002\000\004\012\063\001\002\000\002\001\002\000\004" +
    "\012\065\001\002\000\002\001\002\000\004\010\067\001" +
    "\002\000\004\011\070\001\002\000\004\010\ufff8\001\002" +
    "\000\004\011\072\001\002\000\010\006\ufffc\014\ufffc\015" +
    "\ufffc\001\002\000\002\001\002\000\004\012\075\001\002" +
    "\000\002\001\002\000\004\012\077\001\002\000\002\001" +
    "\002\000\004\012\101\001\002\000\002\001\002\000\004" +
    "\010\103\001\002\000\004\011\104\001\002\000\006\014" +
    "\ufffd\015\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\102\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\010\001\001" +
    "\000\002\001\001\000\006\003\012\004\013\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\021\004\013" +
    "\001\001\000\002\001\001\000\004\006\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\024\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\031\001\001\000\002\001\001\000" +
    "\004\011\033\001\001\000\002\001\001\000\004\011\035" +
    "\001\001\000\002\001\001\000\004\011\037\001\001\000" +
    "\002\001\001\000\004\011\041\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\045\001" +
    "\001\000\002\001\001\000\004\011\047\001\001\000\002" +
    "\001\001\000\004\011\051\001\001\000\002\001\001\000" +
    "\004\011\053\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\057\001\001\000\002\001" +
    "\001\000\004\011\061\001\001\000\002\001\001\000\004" +
    "\011\063\001\001\000\002\001\001\000\004\011\065\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\073\001" +
    "\001\000\002\001\001\000\004\010\075\001\001\000\002" +
    "\001\001\000\004\011\077\001\001\000\002\001\001\000" +
    "\004\011\101\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

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
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.yylex(); 
    }


  Lexer lexer;

  public parser (java.io.Reader input) {
    lexer = new Lexer(input);
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
          case 0: // program ::= CodeDraw keyOpen createCanvas nextLineCode keyClose 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
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
          case 2: // nextLineCode ::= lineCode nextLineCode 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nextLineCode",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // nextLineCode ::= lineCode 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nextLineCode",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // createCanvas ::= Canvas parentOpen color coma position coma n coma n parentClose pointComa 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int widthleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int widthright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Integer width = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int heightleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int heightright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer height = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		


              CUP$parser$result = parser.getSymbolFactory().newSymbol("createCanvas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // lineCode ::= CanvasAddFigure parentOpen figure parentClose pointComa 
            {
              Object RESULT =null;
		


              CUP$parser$result = parser.getSymbolFactory().newSymbol("lineCode",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // lineCode ::= CanvasBackground parentOpen color parentClose pointComa 
            {
              Object RESULT =null;
		


              CUP$parser$result = parser.getSymbolFactory().newSymbol("lineCode",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // figure ::= Line parentOpen color coma n coma n coma n coma n parentClose pointComa 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-10)).value;
		int x1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int x1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		Integer x1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int y1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int y1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Integer y1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int x2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int x2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Integer x2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int y2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int y2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer y2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		


              CUP$parser$result = parser.getSymbolFactory().newSymbol("figure",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // figure ::= Square parentOpen color coma n coma n coma n parentClose pointComa 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sizeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sizeright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer size = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		


              CUP$parser$result = parser.getSymbolFactory().newSymbol("figure",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // figure ::= Circle parentOpen color coma n coma n coma n parentClose pointComa 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		


              CUP$parser$result = parser.getSymbolFactory().newSymbol("figure",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
