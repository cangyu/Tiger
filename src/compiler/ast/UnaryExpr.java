package compiler.ast;

public class UnaryExpr extends Expr
{
	public static enum Op{BIT_AND, STAR, POSITIVE, NEGATIVE, BIT_NOT, NOT, SIZEOF, INC, DEC};
	
	public Op operation_type;
	public Expr expr;
	public TypeName type;
	
	public UnaryExpr(Op _t, Expr _e)
	{
		operation_type=_t;
		expr=_e;
	}
	
	public UnaryExpr(TypeName _type)
	{
		operation_type=Op.SIZEOF;
		type=_type;
	}
}