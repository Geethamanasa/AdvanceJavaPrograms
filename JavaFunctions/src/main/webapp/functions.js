//simple function's with return types
function greet()
{
	document.write("good moring sathya <br>");
}
function add(num1,num2)
{
	let res;
	res=num1+num2;
	document.write("Addition.."+res+"<br>")
}
function billcalc(name,price,quantity)
{
	let totalBill;
	totalBill=price*quantity;
	returntotalBill;
}
function dummy()
{
	
}
greet()
add(10,20);
let bill=billcalc("sugar",120,5);
document.write("your Bill..."+bill+"<br>")
let res=dummy();
document.write("dummy return value...."+res);