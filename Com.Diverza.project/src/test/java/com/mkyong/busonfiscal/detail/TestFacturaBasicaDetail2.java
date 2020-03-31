package com.mkyong.busonfiscal.detail;

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
import pageObjects.SearchPage;
import resources.base;

public class TestFacturaBasicaDetail2 extends base{
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
	    CommonPage c = new CommonPage(driver);
	    Thread.sleep(2000);
	    for(int i=0; i<3; i++) {
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("4");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura Electronica");
		s.ValorUnitarioConsept().sendKeys("60");
		Thread.sleep(2000);
		
		c.BottonImpuestosRet().click();
		Thread.sleep(1000);
		c.ImpuestRetenido().click();
		Thread.sleep(1000);
		c.IVARetenido().click();
		Thread.sleep(1000);
		c.FactorRetenido().click();
		Thread.sleep(1000);
		c.TasaRetenido().click();
		Thread.sleep(1000);
		c.TasaOcutaRetenido().clear();
		c.TasaOcutaRetenido().sendKeys("16.0000");
		Thread.sleep(1000);
		c.ButtonImpTranslados().click();
		Thread.sleep(1000);
		c.TaxTranslado().click();
		Thread.sleep(1000);
		c.IVATranslado().click();
		Thread.sleep(1000);
		c.TypeFactorTranslado().click();
		Thread.sleep(1000);
		c.TasaTranslado().click();
		Thread.sleep(1000);
		c.TasaOcuTaTranslado().clear();
		c.TasaOcuTaTranslado().sendKeys("16.0000");
		Thread.sleep(1000);
		c.ButtonPedimento().click();
		Thread.sleep(1000);
		c.AnoValidacionPedimento().sendKeys("18");
		c.AduanaPedimento().sendKeys("24");
		c.PatentePedimento().sendKeys("1487");
		c.ProgressionPedimento().sendKeys("8022338");
		Thread.sleep(1000);
		c.ButtonDatosDPartesOComp().click();
		c.ClaveDelProductCompr().sendKeys("10101507");
		c.CantidadComponente().sendKeys("999999");
		c.DescriptComponente().sendKeys("Ovejas");
		Thread.sleep(2000);
		c.ButtonPartesAduaneras().click();
		c.AnoAduanera().sendKeys("18");
		c.AduanaDespacho().sendKeys("24");
		c.NumeroAduanaPatente().sendKeys("1487");
		c.AnoProgressAduana().sendKeys("8015956");
		Thread.sleep(1000);
		c.ButtonAdicionalInfo().click();
		c.DescriptInformacion().sendKeys("Great");
		c.RefAdicInfo().sendKeys("abcdef");
		Thread.sleep(1000);
		c.ButtonDatosPersonalizados().click();
		c.ExtraDatoNombre().sendKeys("Caducidad");
		c.ExtraValorDato().sendKeys("31-Diciembre-2019");
		Thread.sleep(1000);
		s.AddConsept().click();
	    }
		Thread.sleep(1000);
		c.ButtonAdendaDiverza().click();
		c.DatosGeneralesAdenda().click();
		c.ImportLetraGeneral().sendKeys("abcde");
		c.NumeroDeOrdenGeneral().sendKeys("12345");
		c.ObservacionesGeneral().sendKeys("LookingGood");
		Thread.sleep(1000);
		c.DatosTranpAdenda().click();
		Thread.sleep(1000);
		c.NumeroEntregaTransporte().sendKeys("12345");
		c.DateEntregaTransporte().sendKeys("15 de Julio");
		c.DriverName().sendKeys("Julio");
		c.LugarDestino().sendKeys("Nuevo Laredo");
		c.StreetTransport().sendKeys("GarzaSada");
		c.InteriorOrExteriorNum().sendKeys("12345");
		c.ColoniaTransp().sendKeys("Residencias");
		c.CidadTransp().sendKeys("Apodaca");
		c.Estado().sendKeys("Nuevo Leon");
		c.Pais().sendKeys("Mexico");
		c.CodigoPost().sendKeys("23345");
		Thread.sleep(1000);
		c.DatosClientAdenda().click();
		c.NumeroDelClient().sendKeys("12345");
		c.NumeroOrClaveDelComp().sendKeys("123456");
		c.TelefComprador().sendKeys("123456");
		c.EmailContacto().sendKeys("xxxx@hotmail.com");
		c.StreetClient().sendKeys("Punto Valle");
		c.InteriorOrExteriorNum().sendKeys("123456");
		c.ColoniaClient().sendKeys("Garcia");
		c.MunicipioClient().sendKeys("Garcia");
		c.EstadoClient().sendKeys("Cuidad Mexico");
		Thread.sleep(1000);
		c.PaisClient().sendKeys("Mexico");
		c.CodigoPostalClient().sendKeys("44467");
		Thread.sleep(1000);
		c.DatosPersAdenda().click();
		Thread.sleep(1000);
		c.AgregarPersonalAdenda().click();
		c.NombreDelDato().sendKeys("Adenda");
		c.ValorDelDato().sendKeys("60");
		Thread.sleep(1000);
		c.AddDatosExtras().click();
		c.ButtonComprRelacionado().click();
		Thread.sleep(1000);
		c.SelectTipoDRelacionado().sendKeys("02");
		c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();
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
 


