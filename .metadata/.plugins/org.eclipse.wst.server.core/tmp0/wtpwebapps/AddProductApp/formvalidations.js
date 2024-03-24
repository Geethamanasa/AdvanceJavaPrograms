function ValidateForm()
{
	var proId=Document.getElementsById("proId").value;
	var proName=Document.getElementsById("proName").value;
	var proPrice=Document.getElementsById("proPrice").value;
	var proBrand=Document.getElementsById("proBrand").value;
	var proMadeIn=Document.getElementsById("proMadeIn").value;
	var proManufactureDate=Document.getElementsById("proManufactureDate").value;
	var proExpireDate=Document.getElementsById("proExpireDate").value;
	var Image=Document.getElementsById("Image").value;
	var Audio=Document.getElementsById("Audio").value;
	var Video=Document.getElementsById("Video").value;
	
	if(proId.trim()  === " "  ||   proName.trim() ===" "  ||  proPrice.trim() ===" "  ||  proBrand.trim() ===" " ||  proMadeIn.trim() ===" ")
	{
		alert("All fields must be filled out");
		return false();
	}
	if(parseFloat(proPrice)<0)
	{
		alert("proprice must be a non-negative value");
		return false();
	}
	if(proName.length>50 || proBrand.length>50)
	{
		alert("productname and probrand must be <50 characters");
		return false();
	}
	//get the mfg & exp dates
	var proManufactureDate=document.getElementById("proManufactureDate").value;
	var proExpireDate=document.getElementById("proExpireDate").value;
	
	//convert into date format
	var ManufacturingDateObj=new Date(proManufactureDate);
	var ExpDateObj=new Date(proExpireDate);
	
	//check the validation of dates
	if(ManufacturingDateObj>ExpDateObj)
	{
		alert("Manufacturing Data cannot be greater than expire date");
		return false();
	}
	return true();
	}