package inClassAct;

public class classCode {
	public static boolean IsValidMod10Number(String number)
	 {
	 int [] numberArray = new int[number.length()];
	 boolean checkBit = false;
	 int sumTotal =0;
	for(int i=0; i < number.length() ; i++)
	{
		//numberArray[i] = Character.getNumericValue(number.charAt(i));
		numberArray[i] = (int) number.charAt(i);
	 }

	 for(int index = numberArray.length -1 ; index >= 0 ; index--)
	 {
	if(checkBit)
	{
	numberArray[index] *=2;
	if(numberArray[index] > 9)
	 {
	 numberArray[index] -= 9;
	 }
	 }
	 sumTotal += numberArray[index];
	 checkBit = !checkBit;
	 }
	 return sumTotal % 10 ==0;
	}


}
