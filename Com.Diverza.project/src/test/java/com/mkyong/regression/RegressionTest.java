package com.mkyong.regression;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class RegressionTest extends base{
	public WebDriver driver;
	LandingPageBuson ld;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
			 
	 }
	 @Test 
		public void busquedaDeReportes10() throws IOException, InterruptedException {
			 
			        ld = new LandingPageBuson(driver);
			
			
			ld.ingPortal().sendKeys("lisandro.silva");
			ld.ingPortal1().sendKeys("Diverza1*");
			ld.ingPortal11().click();
			boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
			if(isDisplayed==true) {
			
			LandingPage g = new LandingPage(driver);
			Thread.sleep(2000);
			g.ButtonFunk().click();
			Thread.sleep(1000);
			g.ButtonJes().click();
			}else {
				System.out.println("Continue with operation");
			}
			Thread.sleep(3000);
			ld.BusquedaAvanzada().click();
			ld.SelectBusquedaFormaDPago().click();
			Thread.sleep(2000);
			ld.DineroElectronico().click();
			Thread.sleep(5000);
			ld.SignOut().click();
			Thread.sleep(2000);
			ld.CloseBotton().click();
		   }
	@Test 
	public void facturaBasica() throws IOException, InterruptedException {
		 
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		if(isDisplayed==true) {
		Thread.sleep(2000);
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		}else{
		Thread.sleep(3000);
		ld.SideBar().click();
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingFactura().click();
		FacturaPage fp = new FacturaPage(driver);
		fp.Facturabasica().click();
		Thread.sleep(2000);
	    SearchPage s = new SearchPage(driver);
	    
	    
	    
	    Thread.sleep(1000);
	    
	    s.BasicaSelectFiscal().sendKeys("612");
	    Thread.sleep(2000);
	    s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
	    
	    s.RFC().sendKeys("AAA010101AAA");
	    Thread.sleep(2000);
	   
	    s.SelectCFDI().sendKeys("G03");
	    Thread.sleep(1000);
	    s.SelectCFDI().sendKeys(Keys.ENTER);
	   
	    
	    s.formaPago().sendKeys("1");
	    s.SelectformaPago1().sendKeys("01");
	    s.SelectformaPago1().sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    s.SelectMethodPago().click();
	    Thread.sleep(1000);
	    s.MethodPago1Exhibicion().click();
	    Thread.sleep(2000);
	    
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("4");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura Electronica");
		s.ValorUnitarioConsept().sendKeys("60");
		s.AddConsept().click();
	    
		Thread.sleep(2000);
		s.EmitirFactura().click();
		Thread.sleep(5000);
		ld.SignOut().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ld.CloseBotton().click();
		
		}
	}
	@Test 
	public void facturaBasica2() throws IOException, InterruptedException {
		 
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		if(isDisplayed==true) {
		Thread.sleep(2000);
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		}else{
		Thread.sleep(3000);
		ld.SideBar().click();
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingFactura().click();
		FacturaPage fp = new FacturaPage(driver);
		fp.Facturabasica().click();
		Thread.sleep(2000);
	    SearchPage s = new SearchPage(driver);
	    
	    
	    
	    Thread.sleep(1000);
	    
	    s.BasicaSelectFiscal().sendKeys("612");
	    Thread.sleep(2000);
	    s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
	    
	    s.RFC().sendKeys("AAA010101AAA");
	    Thread.sleep(2000);
	   
	    s.SelectCFDI().sendKeys("G03");
	    Thread.sleep(1000);
	    s.SelectCFDI().sendKeys(Keys.ENTER);
	   
	    
	    s.formaPago().sendKeys("1");
	    s.SelectformaPago1().sendKeys("01");
	    s.SelectformaPago1().sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    s.SelectMethodPago().click();
	    Thread.sleep(1000);
	    s.MethodPago1Exhibicion().click();
	    Thread.sleep(2000);
	    for(int i=0; i<=3; i++) {
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("4");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura Electronica");
		s.ValorUnitarioConsept().sendKeys("60");
		s.AddConsept().click();
	    }
		Thread.sleep(2000);
		s.EmitirFactura().click();
		Thread.sleep(5000);
		ld.SignOut().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ld.CloseBotton().click();
		}
		}
	
	
	
	
	
	
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	
	}
	
}
 


