package pageObjects.busonfiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonLocal {
	
	public WebDriver driver;
	
	   
        //IMPUESTO LOCAL
        By ImpuestoLocal = By.cssSelector("[data-id='local_tax_description']");
        
        By BottonImpuestosLocales = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
        By BottonRetenidoLocal = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        By SelectLocalTaxes = By.cssSelector("[data-id='retention_tax']");
        
        By AgregarLocalTaxes = By.id("add-local_tax");
        
        By ISR = By.linkText("001 - ISR");
        
        By IVA = By.linkText("002 - IVA");
        
        By IEPS = By.linkText("003 - IEPS");
        
        By SelectFactorTaxes = By.cssSelector("[data-id='retention_factor_type']");
        
        By TasaLocal = By.linkText("Tasa");
        
        By CuotaLocal = By.linkText("Cuota");
        
        By CuotaOtasaLocal = By.id("retention_rate_or_fee");
        // TRANSLADOS
        By BottonTrandoLocal = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div/label");
        
        By SelectTransLocal = By.cssSelector("[data-id='transfer_tax']");
        
        By IVATransfer = By.linkText("002 - IVA");
        
        By IEPSTransfer = By.linkText("003 - IEPS");
        
        By SelectTransferType = By.cssSelector("[data-id='transfer_factor_type']");
        
        By TasaTrasnf = By.linkText("Tasa");
        
        By CuotaTransf = By.linkText("Cuota");
        
        By ExtentoTransf = By.linkText("Exento");
        
        By TasaCuotaTransf = By.id("transfer_rate_or_fee");
        // NUMERO DE PEDIMENTO
        By BottonPedimentoLocal = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By ValidationYearLocalPed = By.id("customs_validation_year");
        
        By AduanaDespLocalPed = By.id("customs_customs_clearance");
        
        By PatentNumberLocalPed = By.id("customs_patent_number");
        
        By YearPlusProgr = By.id("customs_consecutive");
        //DATOS DE PARTES O COMPONENENTES
        By BottonPartesCompLocal = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By ClaveDelPrLocal = By.id("part_prod_serv_id");
        
        By CantidadLocal = By.id("part_quantity");
        
        By DescriptLocal = By.id("part_description");
        //INFORMACION ADICIONAL
        By BottonInfAdicLocal = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[21]/div/label");
        
        By DescriptOtroId = By.id("additional_concept_descripcion_extranjera");
        
        By AdicionalRefByConspt = By.id("additional_concept_mensaje");
        // DATOS PERSONALIZADOS
        By BottonDatosPers = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[24]/div[1]/div[1]/div/label");
        
        By ExtraAtribDatoPers = By.id("additional_concept_extras_atributo");
        
        By ValorExtraDatoPers = By.id("additional_concept_extras_valor");
        //PARTES INFORMACION ADUANERA
        By BottonInfoAduanera = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By AnoDeValidacionLocal = By.id("part_customs_validation_year");
        
        By AduanaDespacho = By.id("part_customs_customs_clearance");
        
        By NumeroPatente = By.id("part_customs_patent_number");
        
        By AnoNumProg = By.id("part_customs_consecutive");
        //FACTURA ADENDA MULTIASISTENCIA
        By ClavePrMultiAsist = By.id("receipt_addendum_multi_add_multi_proveedor");
        
        By OrdenDePagoMultiAsist = By.id("receipt_addendum_multi_add_multi_orden_pago");
        
        By IdentSiniestMultiAsist = By.id("receipt_addendum_multi_add_multi_siniestro");
        
        By PaseMedicoMultiAsist = By.id("receipt_addendum_multi_add_multi_pase_medico");
        
        By CostoMultiAsist = By.id("receipt_addendum_multi_add_multi_costo");
        
        By IVAtransMultiAsist = By.id("receipt_addendum_multi_add_multi_iva");
        
        By AgregarRetenAsist = By.id("add-retention");
        
        By AgregarTransAsist = By.id("add-transfer");
        
        By AgregarPedimentoAsist = By.id("add-customs");
        
        By AgregarParteAsist = By.id("add-part");
        
        By AgregarInfoAduaAsist = By.id("add-part_customs");
        
        By AgregarInfoAdicAsist = By.id("add-additional_concept");
        
        By AgregarDatosPersAsist = By.id("add-additional_concept_extras");
        // INSTITUICIONES EDUCATIVAS
        By AgregarNombreAluno = By.id("iedu_nombre_alumno");
        
        By CurpAluno = By.id("iedu_curp");
        
        By SelectNivelEducativo = By.cssSelector("[data-id='iedu_nivel_educativo']");
        
        By Batchelors = By.linkText("Bachillerato o su equivalente");
        
        By RVOEAluno = By.id("iedu_aut_rvoe");
        
        By AgregarComplInstEdu = By.id("add-iedu");
        // FACTURA INE
        By BottonReteINE = By.xpath("/html/body/section/section/div/div[3]/div/div/div[2]/div[1]/div/label");
        
        By TransladoINE  = By.xpath("/html/body/section/section/div/div[3]/div/div/div[2]/div[5]/div/label");
        
        By NumPedimentoINE = By.xpath("/html/body/section/section/div/div[3]/div/div/div[2]/div[9]/div/label");
        
        By DatosDePartesOCompINE = By.xpath("/html/body/section/section/div/div[3]/div/div/div[2]/div[13]/div/label");
        
        By InfoAdicINE = By.xpath("/html/body/section/section/div/div[3]/div/div/div[2]/div[17]/div/label");
        
        By AddRetenidoINE = By.id("add-retention");
        
        By AddTransladoINE = By.id("add-transfer");
        
        By AddPartOCompINE = By.id("add-part");
        
        By AddNumPedINE = By.id("add-customs");
        
        By DatosPersINE = By.xpath("/html/body/section/section/div/div[3]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By BottonPartsAduanerasINE = By.xpath("/html/body/section/section/div/div[3]/div/div/div[2]/div[16]/div[1]/div[1]/div/label");
        
        By BottonAdenaINE = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
        By BootonCompRelaINE = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        //IMPUESTOS LOCALES GRATUITO
        By SelectLocalImp = By.cssSelector("[data-id='local_tax_description']");
        
        
        
        
        
        
        
        public WebElement SelectLocalImp() {
        	return driver.findElement(SelectLocalImp);
        }
        public WebElement ButtonCompRelaINE() {
        	return driver.findElement(BootonCompRelaINE);
        }
        public WebElement ButtonAdendaINE() {
        	return driver.findElement(BottonAdenaINE);
        }
        public WebElement ButtonPartsAduanerasINE() {
        	return driver.findElement(BottonPartsAduanerasINE);
        }
        public WebElement AddNumPedINE() {
        	return driver.findElement(AddNumPedINE);
        }
        public WebElement ButtonDatosPersINE() {
        	return driver.findElement(DatosPersINE);
        }
        public CommonLocal(WebDriver driver2) {
			
        	this.driver= driver2;
		}
       
        public WebElement ButtonLocalRetention() {
        	return driver.findElement(BottonRetenidoLocal);
        }
        public WebElement ButtonLocalTaxes() {
        	return driver.findElement(BottonImpuestosLocales);
        }
        public WebElement LocalTaxes() {
        	return driver.findElement(ImpuestoLocal);
        }
        public WebElement SelectLocalTaxes() {
        	return driver.findElement(SelectLocalTaxes);
        }
        public WebElement ISRLocalTaxes() {
        	return driver.findElement(ISR);
        }
        public WebElement IVALocalTaxes() {
        	return driver.findElement(IVA);
        }
        public WebElement IEPSLocalTaxes() {
        	return driver.findElement(IEPS);
        }
        public WebElement SelectFactorTaxes() {
        	return driver.findElement(SelectFactorTaxes);
        }
        public WebElement TasaF() {
        	return driver.findElement(TasaLocal);
        }
        public WebElement CuotaF() {
        	return driver.findElement(CuotaLocal);
        }
        public WebElement CuotaOtasaLocal() {
        	return driver.findElement(CuotaOtasaLocal);
        }
        public WebElement ButtonTranLocal() {
        	return driver.findElement(BottonTrandoLocal);
        }
        public WebElement SelectLocalTransf() {
        	return driver.findElement(SelectTransLocal);
        }
        public WebElement IvaTransfer() {
        	return driver.findElement(IVATransfer);
        }
        public WebElement IEPSTransfer() {
        	return driver.findElement(IEPSTransfer);
        }
        public WebElement SelectTransfertype() {
        	return driver.findElement(SelectTransferType);
        }
        public WebElement TasaTransf() {
        	return driver.findElement(TasaTrasnf);
        }
        public WebElement CuotaTransf() {
        	return driver.findElement(CuotaTransf);
        }
        public WebElement ExtentoTranf() {
        	return driver.findElement(ExtentoTransf);
        }
        public WebElement TasaCuotaTransf() {
        	return driver.findElement(TasaCuotaTransf);
        }
        public WebElement ButtonPediLocal() {
        	return driver.findElement(BottonPedimentoLocal);
        }
        public WebElement ButtonPartsCompLocal() {
        	return driver.findElement(BottonPartesCompLocal);
        }
        public WebElement ButtonInfAdLocal() {
        	return driver.findElement(BottonInfAdicLocal);
        }
        public WebElement ValidYearLocalPed() {
        	return driver.findElement(ValidationYearLocalPed);
        }
        public WebElement AduanaDespLocalPed() {
        	return driver.findElement(AduanaDespLocalPed);
        }
        public WebElement PatentNumLocalPed() {
        	return driver.findElement(PatentNumberLocalPed);
        }
        public WebElement YearPlusProgr() {
        	return driver.findElement(YearPlusProgr);
        }
        public WebElement ClaveProdLocal() {
        	return driver.findElement(ClaveDelPrLocal);
        }
        public WebElement CantidadLocal() {
        	return driver.findElement(CantidadLocal);
        }
        public WebElement DescriptLocal() {
        	return driver.findElement(DescriptLocal);
        }
        public WebElement DescriptOtroIdioma() {
        	return driver.findElement(DescriptOtroId);
        }
        public WebElement AdicRefByConsept() {
        	return driver.findElement(AdicionalRefByConspt);
        }
        public WebElement ButtonDatosPerson() {
        	return driver.findElement(BottonDatosPers);
        }
        public WebElement ExtraAtribDatoPers() {
        	return driver.findElement(ExtraAtribDatoPers);
        }
        public WebElement ValorExtraDatoPers() {
        	return driver.findElement(ValorExtraDatoPers);
        }
        public WebElement AnoValidAduanera() {
        	return driver.findElement(AnoDeValidacionLocal);
        }
        public WebElement AduanaDespacho() {
        	return driver.findElement(AduanaDespacho);
        }
        public WebElement NumeroPatente() {
        	return driver.findElement(NumeroPatente);
        }
        public WebElement AnoNumProg() {
        	return driver.findElement(AnoNumProg);
        }
        public WebElement ButtonInfAduanera() {
        	return driver.findElement(BottonInfoAduanera);
        }
        public WebElement ClaveDelProvMultiAsist() {
        	return driver.findElement(ClavePrMultiAsist);
        }
        public WebElement OrdenDePagoMultAsist() {
        	return driver.findElement(OrdenDePagoMultiAsist);
        }
        public WebElement IdentSinestMultAsist() {
        	return driver.findElement(IdentSiniestMultiAsist);
        }
        public WebElement PaseMedicoMultiAsist() {
        	return driver.findElement(PaseMedicoMultiAsist);
        }
        public WebElement CostoMultiAsist() {
        	return driver.findElement(CostoMultiAsist);
        }
        public WebElement IvaMultiAsist() {
        	return driver.findElement(IVAtransMultiAsist);
        }
        public WebElement AgregarLocalTaxes() {
        	return driver.findElement(AgregarLocalTaxes);
        }
        public WebElement RetenidoAsist() {
        	return driver.findElement(AgregarRetenAsist);
        }
        public WebElement AgregarTransAsist() {
        	return driver.findElement(AgregarTransAsist);
        }
        public WebElement AgregarPedAsist() {
        	return driver.findElement(AgregarPedimentoAsist);
        }
        public WebElement AgregarParteAsist() {
        	return driver.findElement(AgregarParteAsist);
        }
        public WebElement AgregarInfoAduanaAsist() {
        	return driver.findElement(AgregarInfoAduaAsist);
        }
        public WebElement AgregarInfoAdicAsist() {
        	return driver.findElement(AgregarInfoAdicAsist);
        }
        public WebElement AgregarDatosPersAsist() {
        	return driver.findElement(AgregarDatosPersAsist);
        }
        public WebElement AddStudentName() {
        	return driver.findElement(AgregarNombreAluno);
        }
        public WebElement CurpStudent() {
        	return driver.findElement(CurpAluno);
        }
        public WebElement SelectEducationLevel() {
        	return driver.findElement(SelectNivelEducativo);
        }
        public WebElement BatchelorsOEquiv() {
        	return driver.findElement(Batchelors);
        }
        public WebElement RVOEAluno() {
        	return driver.findElement(RVOEAluno);
        }
        public WebElement AgregarComplInstEdu() {
        	return driver.findElement(AgregarComplInstEdu);
        }
        public WebElement ButtonRetINE() {
        	return driver.findElement(BottonReteINE);
        }
        public WebElement ButtonTransladoINE() {
        	return driver.findElement(TransladoINE);
        }
        public WebElement ButtonNumPediINE() {
        	return driver.findElement(NumPedimentoINE);
        }
        public WebElement ButtonDatosPartsOCompINE() {
        	return driver.findElement(DatosDePartesOCompINE);
        }
        public WebElement ButtonInfoAdicINE() {
        	return driver.findElement(InfoAdicINE);
        }
        public WebElement AddRetenINE() {
        	return driver.findElement(AddRetenidoINE);
        }
        public WebElement AddTransINE() {
        	return driver.findElement(AddTransladoINE);
        }
        public WebElement AddPartOCompINE() {
        	return driver.findElement(AddPartOCompINE);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}