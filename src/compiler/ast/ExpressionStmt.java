package compiler.ast;

public class ExpressionStmt extends Stmt
{
	public Expr expr;
	
	public ExpressionStmt(Expr e)
	{
		expr = e;
	}
	
    public void accept(ASTNodeVisitor v)
    {
        v.visit(this);
    }
}
