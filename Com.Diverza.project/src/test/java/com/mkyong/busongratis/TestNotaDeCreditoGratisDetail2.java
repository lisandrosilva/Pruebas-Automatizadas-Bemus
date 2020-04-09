package com.mkyong.busongratis;

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

import pageObjects.CommonPage;
import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import pageObjects.busonfiscal.CommonInfo;
import resources.base;

public class TestNotaDeCreditoGratisDetail2<WebElement> extends base{
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
		g.ButtonSUL().click();
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingNotadeCredito().click();
		SearchPage s = new SearchPage(driver);
		Thread.sleep(2000);
		g.SelectRegGratis().click();
		Thread.sleep(2000);
		g.RegimeMoral().click();
		g.SucursalGratis().sendKeys("alias");
		g.SucursalGratis().sendKeys(Keys.ENTER);
		g.CodigoPostalGratis().sendKeys("66457");
		s.RFC().sendKeys("FUNK671228PH6");
		Thread.sleep(2000);
		g.SelectCFDIGratis().click();
		Thread.sleep(2000);
	    g.CFDIGastosGeneralesGratis().click();
		s.formaPago().sendKeys("1");
		Thread.sleep(1000);
		g.FormaDePagoGratis().click();
		g.PagoEfectivoGratis().click();
		Thread.sleep(1000);
		s.SelectMethodPago().click();
		Thread.sleep(1000);
		s.MethodPago1Exhibicion().click();
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("200");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura");
		s.ValorUnitarioConsept().sendKeys("80");
		Thread.sleep(1000);
		CommonInfo n = new CommonInfo(driver);
		CommonPage c = new CommonPage(driver);
		n.ButtonRetNotaDeCredito().click();
		//g.BaseRetenidoGratis().sendKeys("16000");
		c.ImpuestRetenido().click();
		Thread.sleep(1000);
		c.IVARetenido().click();
		Thread.sleep(1000);
		c.FactorRetenido().click();
		Thread.sleep(1000);
		c.TasaRetenido().click();
		Thread.sleep(1000);
		c.TasaOcutaRetenido().clear();
		c.TasaOcutaRetenido().sendKeys("0.160000");
		g.ImporteRetenidoGratis().sendKeys("32");
		n.RetenidoAsist().click();
		Thread.sleep(1000);
		n.ButtonTransNotaDeCredito().click();
		//ESTE VALOR NO SE PUEDE ADICIONAR A UNA NOTA DE CREDITO
		//g.BaseTransladoGratis().sendKeys("16000");
		c.TaxTranslado().click();
		Thread.sleep(1000);
		c.IVATranslado().click();
		Thread.sleep(1000);
		c.TypeFactorTranslado().click();
		Thread.sleep(1000);
		c.TasaTranslado().click();
		Thread.sleep(1000);
		c.TasaOcuTaTranslado().clear();
		c.TasaOcuTaTranslado().sendKeys("0.160000");
		g.ImporteTransladoGratis().sendKeys("32");
		n.AgregarTransAsist().click();
		Thread.sleep(1000);
		n.ButtonNumPediNotaDeCredito().click();
		c.AnoValidacionPedimento().sendKeys("18");
		c.AduanaPedimento().sendKeys("24");
		c.PatentePedimento().sendKeys("1487");
		c.ProgressionPedimento().sendKeys("8022338");
		n.AgregarPedAsist().click();
		Thread.sleep(1000);
		n.ButtonDatosPartsOCompNotaDeCredito().click();
		c.ClaveDelProductCompr().sendKeys("10101507");
		c.CantidadComponente().sendKeys("999999");
		c.DescriptComponente().sendKeys("Ovejas");
		s.AddConsept().click();
		Thread.sleep(5000);
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("200");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura");
		s.ValorUnitarioConsept().sendKeys("80");
		Thread.sleep(1000);
		n.ButtonRetNotaDeCredito().click();
		//g.BaseRetenidoGratis().sendKeys("16000");
		c.ImpuestRetenido().click();
		Thread.sleep(1000);
		c.IVARetenido().click();
		Thread.sleep(1000);
		c.FactorRetenido().click();
		Thread.sleep(1000);
		c.TasaRetenido().click();
		Thread.sleep(1000);
		c.TasaOcutaRetenido().clear();
		c.TasaOcutaRetenido().sendKeys("0.160000");
		g.ImporteRetenidoGratis().sendKeys("32");
		n.RetenidoAsist().click();
		Thread.sleep(1000);
		n.ButtonTransNotaDeCredito().click();
		//ESTE VALOR NO SE PUEDE ADICIONAR A UNA NOTA DE CREDITO
		//g.BaseTransladoGratis().sendKeys("16000");
		c.TaxTranslado().click();
		Thread.sleep(1000);
		c.IVATranslado().click();
		Thread.sleep(1000);
		c.TypeFactorTranslado().click();
		Thread.sleep(1000);
		c.TasaTranslado().click();
		Thread.sleep(1000);
		c.TasaOcuTaTranslado().clear();
		c.TasaOcuTaTranslado().sendKeys("0.160000");
		g.ImporteTransladoGratis().sendKeys("32");
		n.AgregarTransAsist().click();
		Thread.sleep(1000);
		n.ButtonNumPediNotaDeCredito().click();
		c.AnoValidacionPedimento().sendKeys("18");
		c.AduanaPedimento().sendKeys("24");
		c.PatentePedimento().sendKeys("1487");
		c.ProgressionPedimento().sendKeys("8022338");
		n.AgregarPedAsist().click();
		Thread.sleep(1000);
		n.ButtonDatosPartsOCompNotaDeCredito().click();
		c.ClaveDelProductCompr().sendKeys("10101507");
		c.CantidadComponente().sendKeys("999999");
		c.DescriptComponente().sendKeys("Ovejas");
		s.AddConsept().click();
		g.ButtonCompRelaGratis().click();
		g.SelectTipoRelaGratis().click();
		g.SustituicionPrevios().click();
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();
		Thread.sleep(3000);
		s.EmitirFactura().click();
		
		}
	@AfterTest
	    public void closeBrowser() {
		   driver.close();
	
	}
 }
 


