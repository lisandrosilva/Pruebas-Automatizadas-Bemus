package com.mkyong.buson.jes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
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

public class TestComercioExteriorJes extends base{
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
		ld.ingFactura().click();
		Thread.sleep(1000);
		FacturaPage fact = new FacturaPage(driver);
		fact.FacturaComercioExterior().click();
		Thread.sleep(1000);
		SearchPage ps = new SearchPage(driver);
		ps.BasicaSelectFiscal().sendKeys("603");
		ps.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		ps.RFC().sendKeys("FUNK671228PH6");
		Thread.sleep(1000);
		ps.CFDIComercioExt().click();
		Thread.sleep(1000);
		ps.AdquiDeMercCFDI().click();	
        ps.formaPago().sendKeys("1");
        ps.SelectformaPago1().sendKeys("01");
        ps.SelectformaPago1().sendKeys(Keys.ENTER);
        ps.SelectMethodPago().click();
        Thread.sleep(1000);
        ps.MethodPago1Exhibicion().click();
        ps.AgregarConsept().click();
        ps.ClaveDelProducto().sendKeys("60121001");
        ps.NumIDComercioExt().sendKeys("999999");
        ps.CantidadConsept().sendKeys("80");
        ps.ClaveDeUnidad().sendKeys("KGM");
        ps.DescripticionConsept().sendKeys("Reparacion De Lavadora");
        ps.ValorUnitarioConsept().sendKeys("1230.00");
        ps.AddConsept().click();
        ps.OperaComerExt().click();
        Thread.sleep(1000);
        ps.ExportOperation().click();
        ps.ClaveDePedimentoComerc().click();
        Thread.sleep(1000);
        ps.ImportDefPedimentoComer().click();
        ps.CertifOrigExport().click();
        Thread.sleep(1000);
        ps.NonCertiExpo().click();
        Thread.sleep(2000);
        ps.ClaveIncoTermExport().sendKeys("CFR");
        ps.ClaveIncoTermExport().sendKeys(Keys.ENTER);
        ps.SubdivisionFacturaExp().click();
        Thread.sleep(1000);
        ps.NonSubdFactExport().click();
        ps.EquiValentExport().sendKeys("20000");
        Thread.sleep(1000);
        ps.AgregarMercancia().click();
        ps.MercanciaIDNumb().sendKeys("999999");
        ps.CurrencyMercancia().sendKeys("1000");
        ps.MercanciaIDNumb().sendKeys(Keys.ENTER);
        ps.MercanciaDescript().sendKeys("AUDI");
        ps.AddDescriptMercancia().click();
        ps.AddMercancia().click();
        ps.EmitirFactura().click();
        Thread.sleep(6000);
        ld.SignOut().click();
        Thread.sleep(3000);
        ld.CloseBotton().click();
        
		
		
		
	    }
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
	
	}
 


