class core{
	public static void main(String[] args){
		int firstNum = 12;
		int secondNum = 114;

		long beginningTime = System.nanoTime();
		BinaryAddition Bin = new BinaryAddition(firstNum, secondNum);
		long endTime = System.nanoTime();
		long totalTime = endTime - beginningTime;
		System.out.println("time taken 1: " + totalTime);


		long otherBeginningTime = System.nanoTime();
		System.out.println(firstNum + secondNum);
		long otherEndTime = System.nanoTime();
		long otherTotalTime = otherEndTime - otherBeginningTime;
		System.out.println("time taken 2: " + otherTotalTime);
	}
}
