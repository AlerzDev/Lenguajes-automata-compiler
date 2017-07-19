import java.cup.runtime.Symbol:

%%

%cup
%full
%line
%char
%ignorecase
%eofval{
	return new Symbol(sys.EDF , new String("End of file"));
%eofval}

Integer = ( 0, (1-9)(0-9)* )

Spaces = (\t\r\n\f)
%%

";" 		        { return new Symbol( sym.pointComa,        new String(yytex())) }
"," 		        { return new Symbol( sym.coma,             new String(yytex())) }
"(" 		        { return new Symbol( sym.parentOpen,       new String(yytex())) }
")" 		        { return new Symbol( sym.parentClose,      new String(yytex())) }
"{" 		        { return new Symbol( sym.keyOpen,          new String(yytex())) }
"}" 		        { return new Symbol( sym.keyClose,         new String(yytex())) }
{Integer}           { return new Symbol( sym.n,                new String(yytex())) }
"terminal" 	        { return new Symbol( sym.terminal,         new String(yytex())) }
"CodeDraw" 	        { return new Symbol( sym.CodeDraw,         new String(yytex())) }
"Canvas" 	        { return new Symbol( sym.Canvas,           new String(yytex())) }
"CanvasAddFigure" 	{ return new Symbol( sym.CanvasAddFigure,  new String(yytex())) }
"CanvasBackground" 	{ return new Symbol( sym.CanvasBackground, new String(yytex())) }
"Line" 		        { return new Symbol( sym.Line,             new String(yytex())) }
"Square"            { return new Symbol( sym.Square,           new String(yytex())) }
"Circle"            { return new Symbol( sym.Circle,           new String(yytex())) }
{Spaces} 	        {                                                               }
. 			        { system.out.println("Illegal character: " +yytext());          }
