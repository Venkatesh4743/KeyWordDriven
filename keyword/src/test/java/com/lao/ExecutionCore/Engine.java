package com.lao.ExecutionCore;

import java.io.IOException;

import com.lao.utilities.ExcelUtilities;
import com.laoactionKeywords.ActionKeywords;

public class Engine {
	
	public static void main(String[] args) throws IOException {
		
		ExcelUtilities Utilities=new ExcelUtilities();
		
		Utilities.readExcelFile("C:\\Users\\venka\\eclipse-workspace\\keyword\\src\\main\\resources\\Testdata.xlsx");
	
	for(int row=1;row<=5;row++) {
		
		String Keyword=Utilities.getValuesFromExcel(row, 3);
		
		if(Keyword.equalsIgnoreCase("openbrowser")) {
			
			ActionKeywords.openBrowser();
		}else if(Keyword.equalsIgnoreCase("gotUrl")) {
			
			ActionKeywords.goToUrl();
			
		}else if(Keyword.equalsIgnoreCase("enterUserName")) {
			ActionKeywords.enterUsername();

	}else if(Keyword.equalsIgnoreCase("enterPassword")) {
		
		ActionKeywords.enterPassword();
	}else if(Keyword.equalsIgnoreCase("clickOnLoginButton")) {
		ActionKeywords.clickOnLoginButton();
	
	}
	
	
}
}
}