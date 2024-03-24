var day=prompt("enter the day");
switch(day)
{
	case "mom":document.write("mondays are bad");
				break;
	case "tue":
	case "wed":
	case "thr":document.write("mid days are okok...");
		 		break;
	case "fir":document.write("firday are better");
				break;
	case "sat":
	case "sun":document.write("weekends are party days");
				break;
				
	default:document.write("your entered day is not correct");
}