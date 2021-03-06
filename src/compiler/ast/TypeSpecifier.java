package compiler.ast;

public class TypeSpecifier extends ASTNode
{
	public static enum Type{VOID, CHAR, INT, STRUCT, UNION};
	
	public Type type;
	public String tag;
	public NonInitDeclarationList comp;
	public compiler.semantic.Type detail;

	public TypeSpecifier(Type _t, String _tag, NonInitDeclarationList _c)
	{
		type = _t;
		tag = _tag;
		comp = _c;
	}
	
    public void accept(ASTNodeVisitor v) throws Exception
    {
        v.visit(this);
    }
}
