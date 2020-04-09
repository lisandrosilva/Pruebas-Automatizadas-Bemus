package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class TestBusquedaReportes4 extends base{
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
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		if(isDisplayed==true) {
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		}else{
			System.out.println("Continue with Operation");
		}
		Thread.sleep(3000);
		ld.SelectTipoDeCFDI().click();
		ld.CFDIT().click();
		ld.BuscarEmitidos().click();
		Thread.sleep(2000);
		ld.EmitidoFirstOpt().click();
		Thread.sleep(3000);
		ld.VistaRapiraEmitido().click();
		Thread.sleep(3000);
		ld.SalirVistaEmitido().click();
		Thread.sleep(2000);
		ld.EnviarEmitido().click();
		ld.SendEmail().sendKeys("lisandro.silva@diverza.com");
		Thread.sleep(2000);
		ld.Enviar().click();
		Thread.sleep(3000);
		ld.SignOut().click();
		Thread.sleep(2000);
		ld.CloseBotton().click();
	}

		
	@AfterTest
	   public void closeBrowser() {
		  driver.close();
		
	
 
   }
}
	
   

