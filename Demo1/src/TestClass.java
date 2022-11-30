class TestClass { 
	
	static int maxValue(int a, int b, int c) 
	{ 
		
		int max = Math.max(a, Math.max(b, c)); 
		
		
		int val = 0; 
		
		for (int i = 0; i <= max; i++) 
			val = Math.max(val, a^i + b^i + c^i); 
		
		return val; 
	} 
	
	
	public static void main(String args[]) 
	{ 
		int a = 2, b = 4, c = 5; 
		System.out.println(a^b); 
	} 
}