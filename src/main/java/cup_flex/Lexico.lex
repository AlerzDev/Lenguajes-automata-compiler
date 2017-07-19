import java.cup.runtime.Symbol:

%%

%{
public static void int linea = 1;

public static int pos =0;
%}

%cup // - - Para que sea compatible con cup
%full // - - Para que soporte todos los caracteres incluyendo la ñ
%line // - - para utilizar el atributo line
%char // - - para utilizar el atributo char
%ignorecase // - - para que no distinga entre mayusculas y minusculas
%eofval{
	return new Symbol(sys.EDF , new String("Fin de archivo"));
%eofval}

n = (int)
int = (0-9)+
blancos = (\t\r\n\f)
%%


";" 		{return new Symbol(sym.pointComa, new String(yytex())) }
"," 		{return new Symbol(sym.coma, new String(yytex())) }
"(" 		{return new Symbol(sym.parentOpen, new String(yytex())) }
")" 		{return new Symbol(sym.parentClose, new String(yytex())) }
"{" 		{return new Symbol(sym.keyOpen, new String(yytex())) }
"}" 		{return new Symbol(sym.keyClose, new String(yytex())) }
"@" 		{return new Symbol(sym.arroba, new String(yytex())) }
"int" 		{return new Symbol(sym.int, new String(yytex())) }
"terminal" 	{return new Symbol(sym.terminal, new String(yytex())) }
"CodeDraw" 	{return new Symbol(sym.CodeDraw, new String(yytex())) }
"Canvas" 	{return new Symbol(sym.Canvas, new String(yytex())) }
"CanvasaddFigure" 	{return new Symbol(sym.addFigure, new String(yytex())) }
"CanvasBackground" 	{return new Symbol(sym.CanvasBackground, new String(yytex())) }
"assignment" 	{return new Symbol(sym.assignment, new String(yytex())) }
"Line" 		{return new Symbol(sym.Line, new String(yytex())) }
"Square"    {return new Symbol(sym.Square, new String(yytex())) }
"Circle"    {return new Symbol(sym.Circle, new String(yytex())) }
"blancos" 	{ }
. 			{system.out.println("caracter ilegal : " +yytext()); }
