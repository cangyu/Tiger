package compiler.semantic;

public class Symbol 
{
	private String name;

	public Symbol(String n) 
	{
		name = n;
	}

	@Override
	public String toString() 
	{
		return name;
	}

	private static java.util.Dictionary<String, Symbol> dict = new java.util.Hashtable<String, Symbol>();

	/**
	 * Make return the unique symbol associated with a string. Repeated calls to
	 * <tt>symbol("abc")</tt> will return the same Symbol.
	 */
	public static Symbol getSymbol(String n) 
	{
		String u = n.intern();
		Symbol s = dict.get(u);
		if (s == null)
		{
			s = new Symbol(u);
			dict.put(u, s);
		}
		return s;
	}
}
