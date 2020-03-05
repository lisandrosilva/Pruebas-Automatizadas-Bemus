package pageObjects.busonfiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonInfo {
	
	public WebDriver driver;
	
	   
        //NOTARIOS PUBLICOS 
        By ImpuestoLocal = By.cssSelector("[data-id='local_tax_description']");
        
        By BottonImpuestosReteNotarioPublicos = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
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
        By BottonTrandoNotarioPublico = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        By SelectTransLocal = By.cssSelector("[data-id='transfer_tax']");
        
        By IVATransfer = By.linkText("002 - IVA");
        
        By IEPSTransfer = By.linkText("003 - IEPS");
        
        By SelectTransferType = By.cssSelector("[data-id='transfer_factor_type']");
        
        By TasaTrasnf = By.linkText("Tasa");
        
        By CuotaTransf = By.linkText("Cuota");
        
        By ExtentoTransf = By.linkText("Exento");
        
        By TasaCuotaTransf = By.id("transfer_rate_or_fee");
        // NUMERO DE PEDIMENTO
        By BottonPedimentoNotarioPublico = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div/label");
        
        By ValidationYearLocalPed = By.id("customs_validation_year");
        
        By AduanaDespLocalPed = By.id("customs_customs_clearance");
        
        By PatentNumberLocalPed = By.id("customs_patent_number");
        
        By YearPlusProgr = By.id("customs_consecutive");
        //DATOS DE PARTES O COMPONENENTES
        By BottonPartesComprNotarioPublico = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By ClaveDelPrLocal = By.id("part_prod_serv_id");
        
        By CantidadLocal = By.id("part_quantity");
        
        By DescriptLocal = By.id("part_description");
        //INFORMACION ADICIONAL
        By BottonInfAdicNotario = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By DescriptOtroId = By.id("additional_concept_descripcion_extranjera");
        
        By AdicionalRefByConspt = By.id("additional_concept_mensaje");
        // DATOS PERSONALIZADOS
        By BottonDatosPersNotario = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By ExtraAtribDatoPers = By.id("additional_concept_extras_atributo");
        
        By ValorExtraDatoPers = By.id("additional_concept_extras_valor");
        //PARTES INFORMACION ADUANERA
        By BottonInfoAduaneraNotario = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[16]/div[1]/div[1]/div/label");
        
        By AnoDeValidacionLocal = By.id("part_customs_validation_year");
        
        By AduanaDespacho = By.id("part_customs_customs_clearance");
        
        By NumeroPatente = By.id("part_customs_patent_number");
        
        By AnoNumProg = By.id("part_customs_consecutive");
        //FACTURA ADENDA INFOADICIONAL
        By BottonInfoAdenadaNotaDeCredito = By.xpath("/html/body/section/section/div/form/div[5]/div/div/div/div[2]/label");
        
        By BottonAdendaInfoAdicNotario = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
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
        // PAGOS
        By BottonInfoAdendaPago = By.xpath("/html/body/section/section/div/form/div[5]/div/div/div/div[2]/label");
        
        By BottonComprRelaPago = By.xpath("/html/body/section/section/div/form/div[6]/div[1]/div[1]/div/div[1]/div/label");
        
        By AgregarNombreAluno = By.id("iedu_nombre_alumno");
        
        By CurpAluno = By.id("iedu_curp");
        
        By SelectNivelEducativo = By.cssSelector("[data-id='iedu_nivel_educativo']");
        
        By Batchelors = By.linkText("Bachillerato o su equivalente");
        
        By RVOEAluno = By.id("iedu_aut_rvoe");
        
        By AgregarComplInstEdu = By.id("add-iedu");
        // FACTURA NOTA DE CREDITO
        By BottonReteNotaDeCredito = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
        By BottonTransNotaDeCredito  = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        By NumPedimentoNotaDeCredito = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div/label");
        
        By DatosDePartesOCompNotaDeCredito = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By PartesInfoAduanaNotaDeCredito = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[16]/div[1]/div[1]/div/label");
        
        By InfoAdicNotaDeCredito = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By AddRetenidoNotario = By.id("add-retention");
        
        By AddTransladoNotario = By.id("add-transfer");
        
        By AddPartOCompNotario = By.id("add-part");
        
        By AddNumPedNotario = By.id("add-customs");
        
        By DatosPersoNotaDeCredito = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By BottonComprRelaNotaDeCredito = By.xpath("/html/body/section/section/div/form/div[6]/div[1]/div[1]/div/div[1]/div/label");
        
        By BottonAdenaNotaDeCredito = By.xpath("/html/body/section/section/div/form/div[5]/div/div/div/div[2]/label");
        
        By BootonCompRelaNotario = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        // PERSONAS FISICAS INTEGRANTE DE COORDINADO
        By BottonRetePersonas = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
        By BottonTrasPersonas = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        By BottonNumPedPersonas = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div/label");
        
        By BottonDatosDePartesOComprPersonas = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By BottonInfoPartesAduanerasPersonas = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[16]/div[1]/div[1]/div/label");
        
        By BottonAdicInfoPersonas = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By BottonDatosPerPersonas  = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By BottonInfAdicAdendaPersonas = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
        By BottonComprRelaPersonas = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        // SERVICIOS PARCEALES DE CONSTRUCCION
        By BottonReteConstr = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
        By BottonTransConstr = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        By BottonPediConstruc = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div/label");
        
        By BottonDatosPartesOcompConstr = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By BottonInfoAduanaContr = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[16]/div[1]/div[1]/div/label");
        
        By BottonInfoAdcContr = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By BottonDatosPesContr = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By BottonInfoAdicAdenda = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
        By BottonComprRelaContr = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        // VEHICULOS
        By BottonInfoAduanereV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[4]/div[1]/div[1]/div/label");
        
        By NumerV = By.id("vehicle_customs_info_numero");
        
        By DateV = By.id("vehicle_customs_info_fecha");
        
        By AgregarInfoV = By.id("add-vehicle_customs_info");
        
        By BottonParteV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[4]/div[2]/div[1]/div/label");
        
        By CantidadV = By.id("vehicle_part_cantidad");
        
        By DescriptV = By.id("vehicle_part_descripcion");
        
        By BottonInfoAduanaParteV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[4]/div[2]/div[4]/div[1]/div[1]/div/label");
        
        By NumeroPartesV = By.id("vehicle_part_customs_info_numero");
        
        By DatePartsV = By.id("vehicle_part_customs_info_fecha");
        
        By AgregarInfoAduaneraV = By.id("add-vehicle_part_customs_info");
        
        By AgregarParteV = By.id("add-vehicle_part");
        
        By AgregarVentaV = By.id("add-vehicle");
        
        By BottonRetenidoV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        By BottonImpTransV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div/label");
        
        By BottonNumeroPedimentoV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By BottonDatosPartesOcomponentV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By BottonInfoAduanaDatosPartsOcompV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By BottonInfoAdicV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[21]/div/label");
        
        By BottonDatosPersonalizadosV = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[24]/div[1]/div[1]/div/label");
        
        By AddRetendidoG = By.id("add-retention");
        
        By AddTransladoG = By.id("add-transfer");
        
        By AddNumeroDePedimentoG = By.id("add-customs");
        
        By AddPedimentoG = By.id("add-part_customs");
        
        By AddParteG = By.id("add-part");
        
        By AddInfoAdicG = By.id("add-additional_concept");
        
        By AddExtraDataG = By.id("add-additional_concept_extras");
        
        By BottonAdendaInfoAdicionalV = By.xpath("/html/body/section/section/div/form/div[5]/div/div/div/div[2]/label");
        
        By BottonCompRelaV = By.xpath("/html/body/section/section/div/form/div[6]/div[1]/div[1]/div/div[1]/div/label");
        // VEHICULOS USADOS
        By BottonRetendioVs = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
        By BottonTranslVs = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        By BottonNumeroPedVs = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div/label");
        
        By BottonDatsPartsCompVs = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By BottonPartsAduanerasVs = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[16]/div[1]/div[1]/div/label");
        
        By BottonInfoAdicVs = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By BottonDatsPersoVs = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By BottonInfoAdicioAdendaVs = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
        By BottonComprRelaVs = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        //PAGO EN ESPECIES
        By BottonRetenidoEspc = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[1]/div/label");
        
        By BottonTransEspc = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[5]/div/label");
        
        By BottonNumerPedEspc = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[9]/div/label");
        
        By BottonDatosPartsOcompEspc = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[13]/div/label");
        
        By BottonInfoAduaneraPartsEspc = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[16]/div[1]/div[1]/div/label");
        
        By BottonAdicionalEsp = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[17]/div/label");
        
        By BottonDatosPersEspec = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[20]/div[1]/div[1]/div/label");
        
        By BottonAdendaInfoEspec = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
        By BottonCompRelaEspec = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        //CARTA PORTE
        By BottonInfoAdendaCarta = By.xpath("/html/body/section/section/div/form/div[5]/div/div/div/div[2]/label");
        
        By BottonCompRelaCarta = By.xpath("/html/body/section/section/div/form/div[6]/div[1]/div[1]/div/div[1]/div/label");
        // COMERCIO EXTERIOR INGRESO
        By BottonTransComercioExte = By.xpath("/html/body/section/section/div/div[5]/div/div/div[2]/div[4]/div/label");
        
        By BottonDatosDPartesOcomExt = By.xpath("/html/body/section/section/div/div[5]/div/div/div[2]/div[11]/div/label");
        
        By BottonInfoAdicionalExt = By.xpath("/html/body/section/section/div/div[5]/div/div/div[2]/div[15]/div/label");
        
        By BottonDatosPersExt = By.xpath("/html/body/section/section/div/div[5]/div/div/div[2]/div[18]/div[1]/div[1]/div/label");
        
        By BottonEmisorExt = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div[2]/div/label");
        
        By SelectClaveEstadoEmisor = By.cssSelector("[data-id='receipt_external_commerce_ce_estado']");
        
        By PaisEmisor = By.cssSelector("[data-id='receipt_external_commerce_ce_pais']");
        
        By CodigoPostEmisor = By.id("receipt_external_commerce_ce_codigo_postal");
        
        By CalleEmisor = By.id("receipt_external_commerce_ce_calle");
        
        By LocalidadEmisor = By.id("receipt_external_commerce_ce_localidad");
        
        By ColoniaEmisor = By.id("receipt_external_commerce_ce_colonia");
        
        By NumeroExteriorEmisor = By.id("receipt_external_commerce_ce_numero_exterior");
        
        By NumeroIntEmisor = By.id("receipt_external_commerce_ce_numero_interior");
        
        By ReferenciaEmisor = By.id("receipt_external_commerce_ce_referencia");
        
        By BottonReceptorExt = By.xpath("//label[@class='ts-helper'][2])");
        
        By SelectPaisReceptor = By.cssSelector("[data-id='receipt_external_commerce_ce_r_pais']");
        
        By EstadoReceptor = By.id("receipt_external_commerce_ce_r_estado");
        
        By CodigoPostalReceptor = By.id("receipt_external_commerce_ce_r_codigo_postal");
        
        By CalleReceptor = By.id("receipt_external_commerce_ce_r_calle");
        
        By BottonDestiExt = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div[6]/div/label");
        
        By AddDestinatario = By.cssSelector("[href='#modal-add-external_commerce_destiny']");
        
        By SelectPaisDestinatario = By.cssSelector("[data-id='external_commerce_destiny_location_ce_pais']");
        
        By EstadoDestinatario = By.cssSelector("[data-id='external_commerce_destiny_location_ce_estado']");
        
        By CodigoPosDestinatario = By.id("external_commerce_destiny_location_ce_codigo_postal");
        
        By CalleDestinatario = By.id("external_commerce_destiny_location_ce_calle");
        
        By AgregarDestinatario = By.id("add-external_commerce_destiny_location");
        
        By AddDestiny = By.id("add-external_commerce_destiny");
        
        By BottonAdendaInfoExt = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
        By BottonCompRelaExt = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        //CARTA PORTE COMERCIO EXTERIOR TRANSLADO
        By BottonReceptComeTransl = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div[5]/div/label");
        
        By BottonDestiComeTransl = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div[7]/div/label");
        
        By BottonInfoAdicTransl = By.xpath("/html/body/section/section/div/form/div[6]/div/div/div/div[2]/label");
        
        By BottonCompRelaTransl = By.xpath("/html/body/section/section/div/form/div[7]/div[1]/div[1]/div/div[1]/div/label");
        
        By SelectMotivoTranslado = By.cssSelector("[data-id='receipt_external_commerce_ce_motivo_traslado']");
        
        By CurpComercioExt = By.id("receipt_external_commerce_ce_curp");
        
        By MunicipioEmisor = By.id("receipt_external_commerce_ce_municipio");
        
        By MunicipioReceptor = By.id("receipt_external_commerce_ce_r_municipio");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public WebElement ReferenciaEmisor() {
        	return driver.findElement(ReferenciaEmisor);
        }
        public WebElement NumeroIntEmisor() {
        	return driver.findElement(NumeroIntEmisor);
        }
        public WebElement NumeroExtEmisor() {
        	return driver.findElement(NumeroExteriorEmisor);
        }
        public WebElement ColoniaEmisor() {
        	return driver.findElement(ColoniaEmisor);
        }
        public WebElement LocalidadEmisor() {
        	return driver.findElement(LocalidadEmisor);
        }
        public WebElement MunicipioReceptor() {
        	return driver.findElement(MunicipioReceptor);
        }
        public WebElement MunicipioEmsor() {
        	return driver.findElement(MunicipioEmisor);
        }
        public WebElement CurpComercioExt() {
        	return driver.findElement(CurpComercioExt);
        }
        public WebElement PaisEmisor() {
        	return driver.findElement(PaisEmisor);
        }
        public WebElement ButtonSelectMotivoTranslado() {
        	return driver.findElement(SelectMotivoTranslado);
        }
        public WebElement ButtonCompRelaTranslado() {
        	return driver.findElement(BottonCompRelaTransl);
        }
        public WebElement ButtonInfoAdendaTranslado() {
        	return driver.findElement(BottonInfoAdicTransl);
        }
        public WebElement ButtonDestinaComeTransl() {
        	return driver.findElement(BottonDestiComeTransl);
        }
        public WebElement ButtonReceptTranslado() {
        	return driver.findElement(BottonReceptComeTransl);
        }
        public WebElement ButtonCompRelaExterior() {
        	return driver.findElement(BottonCompRelaExt);
        }
        public WebElement ButtonAdendaExtInfo() {
        	return driver.findElement(BottonAdendaInfoExt);
        }
        public WebElement AddDestiny() {
        	return driver.findElement(AddDestiny);
        }
        public WebElement AgregarDestinatario() {
        	return driver.findElement(AgregarDestinatario);
        }
        public WebElement CalleDestinatario() {
        	return driver.findElement(CalleDestinatario);
        }
        public WebElement CodigoPostDestinatario() {
        	return driver.findElement(CodigoPosDestinatario);
        }
        public WebElement EstadoDestinatario() {
        	return driver.findElement(EstadoDestinatario);
        }
        public WebElement SelectPaisDestinatario() {
        	return driver.findElement(SelectPaisDestinatario);
        }
        public WebElement AddDestinatario() {
        	return driver.findElement(AddDestinatario);
        }
        public WebElement ButtonDestinoExterior() {
        	return driver.findElement(BottonDestiExt);
        }
        public WebElement CalleReceptor() {
        	return driver.findElement(CalleReceptor);
        }
        public WebElement CodigoPostReceptor() {
        	return driver.findElement(CodigoPostalReceptor);
        }
        public WebElement EstadoReceptor() {
        	return driver.findElement(EstadoReceptor);
        }
        public WebElement SelectPaisReceptor() {
        	return driver.findElement(SelectPaisReceptor);
        }
        public WebElement ButtonReceptorExtensor() {
        	return driver.findElement(BottonReceptorExt);
        }
        public WebElement CalleEmisor() {
        	return driver.findElement(CalleEmisor);
        }
        public WebElement CodiPEmisor() {
        	return driver.findElement(CodigoPostEmisor);
        }
        public WebElement SelectClaveEstadoEmisor() {
        	return driver.findElement(SelectClaveEstadoEmisor);
        }
        public WebElement ButtonEmisorComExterior() {
        	return driver.findElement(BottonEmisorExt);
        }
        public WebElement ButtonDatosPersoComExterior() {
        	return driver.findElement(BottonDatosPersExt);
        }
        public WebElement ButtonInfoAdicComExterior() {
        	return driver.findElement(BottonInfoAdicionalExt);
        }
        public WebElement ButtonDatosDePartesOcompComExt() {
        	return driver.findElement(BottonDatosDPartesOcomExt);
        }
        public WebElement ButtonTransComerExterior() {
        	return driver.findElement(BottonTransComercioExte);
        }
        public WebElement ButtonCompRelaCarta() {
        	return driver.findElement(BottonCompRelaCarta);
        }
        public WebElement ButtonInfoAdendaCarta() {
        	return driver.findElement(BottonInfoAdendaCarta);
        }
        public WebElement ButtonCompRelaEspec() {
        	return driver.findElement(BottonCompRelaEspec);
        }
        public WebElement ButtonInfoAdendaEspec() {
        	return driver.findElement(BottonAdendaInfoEspec);
        }
        public WebElement ButtonDatosPersEspec() {
        	return driver.findElement(BottonDatosPersEspec);
        }
        public WebElement ButtonInfoAdicionalEspc() {
        	return driver.findElement(BottonAdicionalEsp);
        }
        public WebElement ButtonInfoAduaneraPartsEspc() {
        	return driver.findElement(BottonInfoAduaneraPartsEspc);
        }
        public WebElement ButtonDatsPartsOcomEspc() {
        	return driver.findElement(BottonDatosPartsOcompEspc);
        }
        public WebElement ButtonNumePediEspec() {
        	return driver.findElement(BottonNumerPedEspc);
        }
        public WebElement ButtonTransEspec() {
        	return driver.findElement(BottonTransEspc);
        }
        public WebElement ButtonRetenidoEspec() {
        	return driver.findElement(BottonRetenidoEspc);
        }
        public WebElement ButtonCompRelaVs() {
        	return driver.findElement(BottonComprRelaVs);
        }
        public WebElement ButtonInfoAdendaVs() {
        	return driver.findElement(BottonInfoAdicioAdendaVs);
        }
        public WebElement ButtonDatosPersonVs() {
        	return driver.findElement(BottonDatsPersoVs);
        }
        public WebElement ButtonInfoAdcVs() {
        	return driver.findElement(BottonInfoAdicVs);
        }
        public WebElement ButtonPartsAduaneraVs() {
        	return driver.findElement(BottonPartsAduanerasVs);
        }
        public WebElement ButtonDatsPartsCompVs() {
        	return driver.findElement(BottonDatsPartsCompVs);
        }
        public WebElement ButtonNumeroPediVs() {
        	return driver.findElement(BottonNumeroPedVs);
        }
        public WebElement ButtonTransVs() {
        	return driver.findElement(BottonTranslVs);
        }
        public WebElement ButtonRetenidoVs() {
        	return driver.findElement(BottonRetendioVs);
        }
        public WebElement ButtonCompRelav() {
        	return driver.findElement(BottonCompRelaV);
        }
        public WebElement ButtonAdendaInfoAdicionalV() {
        	return driver.findElement(BottonAdendaInfoAdicionalV);
        }
        public WebElement AddExtraDtaG() {
        	return driver.findElement(AddExtraDataG);
        }
        public WebElement AddInfoAdicG() {
        	return driver.findElement(AddInfoAdicG);
        }
        public WebElement AddParteG() {
        	return driver.findElement(AddParteG);
        }
        public WebElement AddNumeroPedG() {
        	return driver.findElement(AddNumeroDePedimentoG);
        }
        public WebElement AddTransladoG() {
        	return driver.findElement(AddTransladoG);
        }
        public WebElement AddRetendidoG() {
        	return driver.findElement(AddRetendidoG);
        }
        public WebElement ButtonDatsPersoV() {
        	return driver.findElement(BottonDatosPersonalizadosV);
        }
        public WebElement ButtonInfoAdcV() {
        	return driver.findElement(BottonInfoAdicV);
        }
        public WebElement ButtonInfoAduaDatsPartsV() {
        	return driver.findElement(BottonInfoAduanaDatosPartsOcompV);
        }
        public WebElement ButtonDatosPartesOcompV() {
        	return driver.findElement(BottonDatosPartesOcomponentV);
        }
        public WebElement ButtonNumeroPedimentoV() {
        	return driver.findElement(BottonNumeroPedimentoV);
        }
        public WebElement ButtonTransladoV() {
        	return driver.findElement(BottonImpTransV);
        }
        public WebElement ButtonRetenidoV() {
        	return driver.findElement(BottonRetenidoV);
        }
        public WebElement AddVentaV() {
        	return driver.findElement(AgregarVentaV);
        }
        public WebElement AddPartV() {
        	return driver.findElement(AgregarParteV);
        }
        public WebElement AddInfoAduaneraV() {
        	return driver.findElement(AgregarInfoAduaneraV);
        }
        public WebElement DatePartsV() {
        	return driver.findElement(DatePartsV);
        }
        public WebElement NumeroDePartsV() {
        	return driver.findElement(NumeroPartesV);
        }
        public WebElement ButtonInfoAduanaParteV() {
        	return driver.findElement(BottonInfoAduanaParteV);
        }
        public WebElement DescriptV() {
        	return driver.findElement(DescriptV);
        }
        public WebElement CantidadV() {
        	return driver.findElement(CantidadV);
        }
        public WebElement ButtonParteV() {
        	return driver.findElement(BottonParteV);
        }
        public WebElement AgregarInfoV() {
        	return driver.findElement(AgregarInfoV);
        }
        public WebElement DateV() {
        	return driver.findElement(DateV);
        }
        public WebElement NumeroV() {
        	return driver.findElement(NumerV);
        }
        public WebElement ButtonInfoAduaneraV() {
        	return driver.findElement(BottonInfoAduanereV);
        }
        public WebElement ButtonComprRelaConstruc() {
        	return driver.findElement(BottonComprRelaContr);
        }
        public WebElement ButtonInfoAdendaConstru() {
        	return driver.findElement(BottonInfoAdicAdenda);
        }
        public WebElement ButtonDatsPersConstruct() {
        	return driver.findElement(BottonDatosPesContr);
        }
        public WebElement ButtonAdicInfoConstruct() {
        	return driver.findElement(BottonInfoAdcContr);
        }
        public WebElement ButtonInfoAduanaContr() {
        	return driver.findElement(BottonInfoAduanaContr);
        }
        public WebElement ButtonDatosPrtsOComprConstr() {
        	return driver.findElement(BottonDatosPartesOcompConstr);
        }
        public WebElement ButtonPediConstr() {
        	return driver.findElement(BottonPediConstruc);
        }
        public WebElement ButtonTransConstr() {
        	return driver.findElement(BottonTransConstr);
        }
        public WebElement ButtonReteConstr() {
        	return driver.findElement(BottonReteConstr);
        }
        public WebElement ButtonComprRelaPersonas() {
        	return driver.findElement(BottonComprRelaPersonas);
        }
        public WebElement ButtonInfAdcAdendaPersonas() {
        	return driver.findElement(BottonInfAdicAdendaPersonas);
        }
        public WebElement ButtonDatsPersnPersonas() {
        	return driver.findElement(BottonDatosPerPersonas);
        }
        public WebElement ButtonAdcInfoPersonas() {
        	return driver.findElement(BottonAdicInfoPersonas);
        }
        public WebElement ButtonInfoPartesAduanPersonas() {
        	return driver.findElement(BottonInfoPartesAduanerasPersonas);
        }
        public WebElement ButtonDatsDePartesOcompPersonas() {
        	return driver.findElement(BottonDatosDePartesOComprPersonas);
        }
        public WebElement ButtonNumePedPersonas() {
        	return driver.findElement(BottonNumPedPersonas);
        }
        public WebElement ButtonTransPersonas() {
        	return driver.findElement(BottonTrasPersonas);
        }
        public WebElement ButtonRetePersonas() {
        	return driver.findElement(BottonRetePersonas);
        }
        public WebElement ButtonComprRelaPago() {
        	return driver.findElement(BottonComprRelaPago);
        }
        public WebElement ButtonInfoAdendaPago() {
        	return driver.findElement(BottonInfoAdendaPago);
        }
        public WebElement ButtonPartsInfoAduanaNotaDeCredito() {
        	return driver.findElement(PartesInfoAduanaNotaDeCredito);
        }
        public WebElement ButtonAdendaInfoAdic() {
        	return driver.findElement(BottonAdendaInfoAdicNotario);
        }
        public WebElement ButtonCompRelaNOTARIO() {
        	return driver.findElement(BootonCompRelaNotario);
        }
        public WebElement ButtonInfAdendaNotaDeCrdito() {
        	return driver.findElement(BottonAdenaNotaDeCredito);
        }
        public WebElement ButtonComprRelacNotaDeCredito() {
        	return driver.findElement(BottonComprRelaNotaDeCredito);
        }
        public WebElement AddNumPedNotario() {
        	return driver.findElement(AddNumPedNotario);
        }
        public WebElement ButtonDatosPersoNotaDeCredito() {
        	return driver.findElement(DatosPersoNotaDeCredito);
        }
        public CommonInfo(WebDriver driver2) {
			
        	this.driver= driver2;
		}
       
        public WebElement ButtonLocalRetention() {
        	return driver.findElement(BottonRetenidoLocal);
        }
        public WebElement ButtonRetNotarioPublico() {
        	return driver.findElement(BottonImpuestosReteNotarioPublicos);
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
        public WebElement ButtonTransladoNotarioPublico() {
        	return driver.findElement(BottonTrandoNotarioPublico);
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
        public WebElement ButtonPedimentoNotarioPublico() {
        	return driver.findElement(BottonPedimentoNotarioPublico);
        }
        public WebElement ButtonPartsComprNotarioPublico() {
        	return driver.findElement(BottonPartesComprNotarioPublico);
        }
        public WebElement ButtonInfAdNotario() {
        	return driver.findElement(BottonInfAdicNotario);
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
        public WebElement ButtonDatosPersonNotario() {
        	return driver.findElement(BottonDatosPersNotario);
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
        public WebElement ButtonInfAduaneraNotario() {
        	return driver.findElement(BottonInfoAduaneraNotario);
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
        public WebElement ButtonRetNotaDeCredito() {
        	return driver.findElement(BottonReteNotaDeCredito);
        }
        public WebElement ButtonTransNotaDeCredito() {
        	return driver.findElement(BottonTransNotaDeCredito);
        }
        public WebElement ButtonNumPediNotaDeCredito() {
        	return driver.findElement(NumPedimentoNotaDeCredito);
        }
        public WebElement ButtonDatosPartsOCompNotaDeCredito() {
        	return driver.findElement(DatosDePartesOCompNotaDeCredito);
        }
        public WebElement ButtonInfoAdicNotaDeCredito() {
        	return driver.findElement(InfoAdicNotaDeCredito);
        }
        public WebElement AddRetenNotario() {
        	return driver.findElement(AddRetenidoNotario);
        }
        public WebElement AddTransNotario() {
        	return driver.findElement(AddTransladoNotario);
        }
        public WebElement AddPartOCompNotario() {
        	return driver.findElement(AddPartOCompNotario);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}