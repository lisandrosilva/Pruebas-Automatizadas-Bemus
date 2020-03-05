package com.mkyong.busonfiscal;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.SearchPage;
import resources.base;

public class HomePageBuson extends base{
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
		Thread.sleep(2000);
		ld.ConfigBotton().click();
		ld.FolioSeries().click();
		Thread.sleep(2000);
		ld.AddFolio().click();
		ld.SerieFolio().sendKeys("LG");
		ld.ValorInicialFolio().sendKeys("0");
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('serial_end').value='9999999';");
		Thread.sleep(1000);
		ld.AgregarFolio().click();
		Thread.sleep(2000);
		ld.Sucursales().click();
		Thread.sleep(1000);
		ld.AddSucursal().click();
		ld.SucursalBranch().sendKeys("San Nicolas");
		ld.SucursalAlias().sendKeys("SN");
		ld.SucursalZip().sendKeys("66457");
		Thread.sleep(1000);
		ld.ActivarSucursal().click();
		ld.GuardarSucursal().click();
		Thread.sleep(1000);
		ld.Certificados().click();
		Thread.sleep(1000);
		ld.AddCertificado().click();
		Thread.sleep(2000);
		ld.SelectSucursalCertificado().sendKeys("Principal");
		ld.SelectSucursalCertificado().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		String file_input = new String();
		WebElement uploadElement = driver.findElement(By.id("certificate_cer_file"));
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('form-control')", uploadElement);
		uploadElement.sendKeys("//Users//lisandrosilva//Desktop//funk671228ph6.cer");
		WebElement uplodElement = driver.findElement(By.id("certificate_key_file"));
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('form-control')", uploadElement);
		uploadElement.sendKeys("//Users//lisandrosilva//Desktop//Claveprivada_FIEL_FUNK671228PH6_20190528_164238 copy.key");
	
		ld.AddPassword().sendKeys("12345678a");
		Thread.sleep(1000);
		ld.UploadCerificate().click();
		Thread.sleep(1000);
		ld.SignOut().click();
		ld.CloseBotton().click();
		
		}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
 
}

