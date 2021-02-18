public class ConvertStringToInt {
public static void main(String[] args) {

String str = "6789";
boolean validDigit=convertStringToInt(str);

if(validDigit){
int digit=Integer.parseInt(str);
System.out.println(digit);
}else{
System.out.println("given string is not a number");
}
}



public static boolean convertStringToInt(String str){
boolean validDigit=true;
Pattern pattern=Pattern.compile(".*[^0-9].*");
boolean digitsArePresent=!pattern.matcher(str).matches();
if(!digitsArePresent){
validDigit=false;
}else{
validDigit=true;
}

return validDigit;
}
}
