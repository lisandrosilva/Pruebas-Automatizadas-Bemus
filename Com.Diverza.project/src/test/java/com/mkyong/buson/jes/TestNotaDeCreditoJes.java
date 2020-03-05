package com.mkyong.buson.jes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class TestNotaDeCreditoJes<WebElement> extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingNotadeCredito().click();
		SearchPage s = new SearchPage(driver);
		s.BasicaSelectFiscal().sendKeys("603");
		s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		s.RFC().sendKeys("FUNK671228PH6");
		s.SelectCFDI().sendKeys("G03");
		s.SelectCFDI().sendKeys(Keys.ENTER);
		s.formaPago().sendKeys("1");
		Thread.sleep(1000);
		s.SelectformaPago1().sendKeys("01");
		s.SelectformaPago1().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		s.SelectMethodPago().click();
		Thread.sleep(1000);
		s.MethodPago1Exhibicion().click();
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("12");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura");
		s.ValorUnitarioConsept().sendKeys("80");
		s.AddConsept().click();
		Thread.sleep(2000);
		s.EmitirFactura().click();
		Thread.sleep(6000);
		ld.SignOut().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ld.CloseBotton().click();
		}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	
	}
 }
 


