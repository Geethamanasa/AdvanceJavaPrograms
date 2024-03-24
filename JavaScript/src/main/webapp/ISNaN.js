//isNaN() function used to validate the nNumber
//isNaN() return true if it is not a number
//isNaN() return false if it is a nNumber
 var num1=parseInt(prompt("enter first number"));
 var num2=parseInt(prompt("enter second number"));
 if(isNaN(num1)&& isNaN(num2))
 {
	 alert("given the valid numbers....")
 }
 else{
	 alert("Addition of two number..."+(num1+num2))
 }