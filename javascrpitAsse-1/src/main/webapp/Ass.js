var i;
for(i=1;i<=100;i++)
{
	if(i%3===0)
	{
		document.writeln("Fizz  ");
	}
	 if(i%5===0)
	{
		document.writeln("Buzz");	
	}
	if(i%3===0 && i%5===0)
	{
		document.writeln("FizzBuzz");
	}
}