public class ArrayProgram{
	public static void main(String[] args){
		//Method 1
		int[] primeNumber;
		primeNumber = new int[5];
		
		int primeCount = 10;
		for(int i=0; i<5; i++){
			primeNumber[i] = primeCount;
			System.out.println(primeNumber[i]);
			primeCount++;
		}
		
		//Method 2
		int[] evenNumber = new int[5];
		
		//Method 3
		int[] myArray = new int[]{4,55,68,7,8};
		System.out.println("The Second element is: " + myArray[1]);
		//OR
		// You cannot mention size and value like this: int[] myArray = new int[4]{4,5,6,7};
		
		
		//Method 4
		int[] randomNumber = {10,1,22,37,4,90};
		
		//To find the total sum of elements in an array
		int sum = 0;
		for(int i=0; i<randomNumber.length; i++){
			sum += randomNumber[i];
		}
		System.out.println("The sum of Random numbers is:" + sum);
		
		//Program to find the largest element in an array
		int max = randomNumber[0];
		for(int i=1; i<randomNumber.length; i++){
			if(randomNumber[i]>max)
				max = randomNumber[i];
		}
		System.out.println("The Largest number in an array is:" + max);
		
		//Program to find the smallest element in an array
		int min = randomNumber[0];
		for(int i=1; i<randomNumber.length; i++){
			if(randomNumber[i]<min)
				min = randomNumber[i];
		}
		System.out.println("The smallest element in an array is: "+ min);
		
		System.out.println("The Fifth element in an array is: " + randomNumber[4]);
		int num = randomNumber.length;
		System.out.println("The Array length is: " + num);
		
	}
}