package com.subscribe.pages;

import org.openqa.selenium.By;

import com.subscribe.utility.Action;

public class HomePage {
	private static final By btn_language = By.xpath("//a[@id='translation-btn']");
	private static final By countrylist = By.xpath("//a[@id='country-btn']");
	private static final By product_lite = By.xpath("//strong[@id='name-lite']");
	private static final By amount_lite = By.xpath("//div[@id='currency-lite']/b");
	private static final By currency_lite = By.xpath("//div[@id='currency-lite']/i");
	private static final By product_classic = By.xpath("//strong[@id='name-classic']");
	private static final By amount_classic = By.xpath("//div[@id='currency-classic']/b");
	private static final By currency_classic = By.xpath("//div[@id='currency-classic']/i");
	private static final By product_premium = By.xpath("//strong[@id='name-premium']");
	private static final By amount_premium = By.xpath("//div[@id='currency-premium']/b");
	private static final By currency_premium = By.xpath("//div[@id='currency-premium']/i");
	Action act;

	
	public HomePage(){
		act=new Action();
		act.clickElement(btn_language);
	}
	
	public void validatePackage(String country) {
		
		
		act.clickElement(countrylist);
		By btn_country = By.xpath("//span[contains(text(),'"+country+"')]");
		act.clickElement(btn_country);
		
		String product1 = act.getValue(product_lite);
		String product1_Currency = act.getValue(currency_lite);
		String product1_Amount = act.getValue(amount_lite);		
		String product2 = act.getValue(product_classic);
		String product2_Currency=act.getValue(currency_classic);
		String product2_Amount=act.getValue(amount_classic);
		String product3 = act.getValue(product_premium);
		String product3_Currency=act.getValue(currency_premium);
		String product3_Amount=act.getValue(amount_premium);
		
		switch (country) {
		case "Bahrain":
			
			act.verifyData(product1, "LITE","Product name");			
			act.verifyData(product1_Currency, "BHD/month","Product currency"); 
			act.verifyData(product1_Amount, "2","Product amount"); 
			act.verifyData(product2, "CLASSIC","Product name");
			act.verifyData(product2_Amount, "3","Product amount");
			act.verifyData(product2_Currency, "BHD/month","Product currency");
			act.verifyData(product3, "PREMIUM","Product name");
			act.verifyData(product3_Amount, "6","Product amount");
			act.verifyData(product3_Currency, "BHD/month","Product currency");
			break;
		case "KSA":
			act.verifyData(product1, "LITE","Product name");			
			act.verifyData(product1_Amount, "15","Product amount"); 
			act.verifyData(product1_Currency, "SAR/month","Product currency"); 
			act.verifyData(product2, "CLASSIC","Product name");
			act.verifyData(product2_Amount, "25","Product amount");
			act.verifyData(product2_Currency, "SAR/month","Product currency");
			act.verifyData(product3, "PREMIUM","Product name");
			act.verifyData(product3_Amount, "60","Product amount");
			act.verifyData(product3_Currency, "SAR/month","Product currency");
			break;
		case "Kuwait":
			act.verifyData(product1, "LITE","Product name");			
			act.verifyData(product1_Amount, "1.2","Product amount"); 
			act.verifyData(product1_Currency, "KWD/month","Product currency"); 
			act.verifyData(product2, "CLASSIC","Product name");
			act.verifyData(product2_Amount, "2.5","Product amount");
			act.verifyData(product2_Currency, "KWD/month","Product currency");
			act.verifyData(product3, "PREMIUM","Product name");
			act.verifyData(product3_Amount, "4.8","Product amount");
			act.verifyData(product3_Currency, "KWD/month","Product currency");
			break;
		}
		
	}

}
