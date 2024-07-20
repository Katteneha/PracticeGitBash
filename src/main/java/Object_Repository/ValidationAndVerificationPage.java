package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidationAndVerificationPage {
	
	public ValidationAndVerificationPage(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}

	public void orgValidation(WebDriver dr, String data)
	{
String actData = dr.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();	
		
	    if(actData.contains(data))
	    {
	    	System.out.println("org data is passed");
	    }
	    else
	    {
	    	System.out.println("org data is not passed");
	    }
	}
}