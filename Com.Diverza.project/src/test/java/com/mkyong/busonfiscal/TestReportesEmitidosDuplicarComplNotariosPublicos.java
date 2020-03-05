package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.SearchPage;
import resources.base;

public class TestReportesEmitidosDuplicarComplNotariosPublicos extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		//DUPLICADO DE FACTURA NOTARIO PUBLICO
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		Thread.sleep(2000);
		ld.Emitidos().click();
		ld.EmitidoRFC().sendKeys("CACX7605101P8");
		Thread.sleep(2000);
		ld.BuscarEmitidos().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,300)");
		Thread.sleep(2000);
		ld.EmitidoFirstOpt().click();
		Thread.sleep(2000);
		ld.EstatusEmitido().click();
		Thread.sleep(1000);
		ld.IdentificarStatusEmit().click();
		Thread.sleep(2000);
		ld.AceptarStatus().click();
		Thread.sleep(2000);
		ld.DuplicarEmitido().click();
		ld.DuplicarNotarioPublico().click();
		ld.DuplicacionEmitido().click();
		Thread.sleep(2000);
		ld.EmitirDuplicado().click();
		Thread.sleep(2000);
		ld.SignOut().click();
		ld.CloseBotton().click();
		
		}
	@AfterTest
		public void closeBrowser() {
			driver.close();
			
		}
		
	}
	
	
 


