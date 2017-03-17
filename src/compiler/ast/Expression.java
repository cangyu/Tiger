package compiler.ast;

public class Expression extends Expr
{
	public Expr head;
	public Expression next;
	
	public Expression(Expr _e)
	{
	    head = _e;
	    next = null;
	}
	
    public void accept(ASTNodeVisitor v)
    {
        v.visit(this);
    }
}
