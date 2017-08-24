
class BinaryAddition{

	public BinaryAddition(int a, int b){
		int product = 0;
		int biggerval = 0;
		if(a >= b){
			biggerval = a;
		}
		else{
			biggerval = b;
		}
		for(int i = 1; i <= biggerval; i<<=1){
			// System.out.println("Now printing i value"+i);
			boolean first = inttobool(i&a);
			boolean last = inttobool(i&b);
			boolean gate1 = NAND(first, last);
			boolean gate2 = NAND(gate1, first);
			boolean gate3 = NAND(gate1, last);
			boolean gate4 = NAND(gate2, gate3);
			boolean gate5 = NAND(gate1, gate1);
			if(gate4){
				if((i & product) > 0){
					product = i<<1 | product;
					product = ~i & product;
				}
				else{
				product = i | product;
				}
			}
			if(gate5){
				product = i<<1 | product;
			}
		}
		System.out.println(product);
	}

	//NAND Gate
	public boolean NAND(boolean b1, boolean b2){
			// System.out.println("b1: "+b1);
			// System.out.println("b2: "+b2);
			return !(b1 && b2);
	}

	public boolean inttobool(int value){
			if (value > 0) return true;
			return false;
	}
}
