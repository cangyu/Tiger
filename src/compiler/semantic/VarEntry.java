package compiler.semantic;

public final class VarEntry extends Entry 
{
	public boolean hasInitialized;
	public int offset = 0;
	
	public VarEntry(Type t, boolean hi)
	{
		super(t, true);
		hasInitialized = hi;
	}
}
