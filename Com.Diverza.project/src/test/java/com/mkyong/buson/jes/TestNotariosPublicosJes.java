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

import pageObjects.CommonPage;
import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import pageObjects.busonfiscal.CommonInfo;
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

public class TestNotariosPublicosJes extends base{
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
		fact.FacturaNotarioPublico().click();
		Thread.sleep(1000);
		SearchPage ps = new SearchPage(driver);
		ps.BasicaSelectFiscal().sendKeys("603");
		ps.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		ps.RFC().sendKeys("XAXX010101000");
		ps.SelectCFDI().sendKeys("G03");
        ps.SelectCFDI().sendKeys(Keys.ENTER);	
        ps.formaPago().sendKeys("1");
        ps.SelectformaPago1().sendKeys("01");
        ps.SelectformaPago1().sendKeys(Keys.ENTER);
        ps.SelectMethodPago().click();
        Thread.sleep(1000);
        ps.MethodPago1Exhibicion().click();
        ps.AgregarConsept().click();
        ps.ClaveDelProducto().sendKeys("10215612");
        ps.CantidadConsept().sendKeys("80");
        ps.ClaveDeUnidad().sendKeys("H87");
        ps.DescripticionConsept().sendKeys("Factura");
        ps.ValorUnitarioConsept().sendKeys("75");
       
        ps.AddConsept().click();
        ps.NumeroInstNotarial().sendKeys("99999");
        ps.DateNotarial().sendKeys("20-08-2018");
        ps.MontoInstNotarial().sendKeys("8000");
        ps.IvaInstNotarial().sendKeys("80");
        ps.SubTotalInstNotarial().sendKeys("4800");
        ps.CurpInstNotarial().sendKeys("PACG810404HYNTHR04");
        ps.NumeroDelNotario().sendKeys("999");
        ps.EntidadNotarial().sendKeys("01");
        ps.EntidadNotarial().sendKeys(Keys.ENTER);
        ps.IMUEBLENotarial().sendKeys("01");
        ps.IMUEBLENotarial().sendKeys(Keys.ENTER);
        ps.CalleNotarial().sendKeys("Barragan");
        ps.MunicipioNotarial().sendKeys("San Nicolas");
        ps.EstadoNotarial().sendKeys("19");
        ps.EstadoNotarial().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        ps.PaisNotarial().sendKeys("MEX");
        ps.PaisNotarial().sendKeys(Keys.ENTER);
        ps.CodigoPostalNotarial().sendKeys("66457");
        ps.NombreNotarial().sendKeys("Zeferino");
        ps.ApellidoPaternoNotarial().sendKeys("Tiburcio");
        ps.RFCNotarial().sendKeys("AAA010101AAA");
        ps.CurpEnajNotarial().sendKeys("PACG810404HYNTHR04");
        ps.NombreAdquiNotarial().sendKeys("Miguel Delgado");
        ps.RFCAdquiNotarial().sendKeys("AAA010101AAA");
        
        
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
 


