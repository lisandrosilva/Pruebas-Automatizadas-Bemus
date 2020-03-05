package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public WebDriver driver;
	
        By SelectRegimeFiscal= By.cssSelector("[title*='Selecciona el regimen fiscal...']");
        
        By PersonasMorales = By.cssSelector("[class='text']");
        
        By RFC = By.id("receipt_receiver_rfc");
        
        By SelectCFDI = By.cssSelector("[title*='Selecciona el uso del CFDI...']") ;
        
        By CFDIGastosGenerales = By.xpath("//*[@id=\"content\"]/div/form/div[2]/div[2]/div[1]/div[3]/div/div/div/ul/li[4]/a/span[1]");
        
        By formaPago = By.id("receipt_exchange_rate");
        
        By SelectformaPago1 = By.cssSelector("[title*='Selecciona la Forma de pago...']");
        
        By SelectFormaPago2 = By.xpath("//*[@id=\"content\"]/div/form/div[3]/div[2]/div[1]/div[3]/div/div/div/ul/li[5]/a/span[1]");
        
        By SelectMethodPago = By.xpath("//button[@title='Selecciona el Método de pago...']");
        
        By MethodPago1Exhibicion = By.linkText("PUE - Pago en una sola exhibición");
        
        By PAGOparcialidades = By.linkText("PPD - Pago en parcialidades o diferido");
        
        By AgregarComplPago = By.cssSelector("[href='#modal-add-complement']");
        
        By FechaDePago = By.id("complement_fecha_pago");
        
        By SelectFormaPagoP = By.cssSelector("[title='Selecciona la forma de pago...']");
        
        By MontoDePago = By.id("complement_monto");
        
        By TipoDeCambioPago = By.id("complement_tipo_cambio_p");
        
        By PagoSwitch = By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div[2]/div[1]/div");
        
        By MethodPagoPago = By.cssSelector("[title='Selecciona el método de pago...']");
        
        By PPDPago = By.linkText("PPD - Pago en parcialidades o diferido");
        
        By DocRelaPago = By.id("related_cfdi_complement_id_documento");
        
        By ImportePago = By.id("related_cfdi_complement_imp_pagado");
        
        By ParcialidPagos = By.id("related_cfdi_complement_num_parcialidad");
        
        By ImpSaldAntPago = By.id("related_cfdi_complement_imp_saldo_ant");
        
        By CambioPago = By.id("related_cfdi_complement_tipo_cambio_dr");
        
        By ImporteSaldoInsoPago = By.id("related_cfdi_complement_imp_saldo_insoluto");
        
        By AddPagoCompl = By.id("add-complement");
        
        By agregarConsept = By.xpath("//*[@id=\"content\"]/div/form/div[4]/div[4]/button");
        
        By claveDelProducto = By.id("concept_prod_serv_id");
        
        By cantidadConsept = By.id("concept_quantity");
        
        By claveDeUnidad = By.id("concept_unit_id");
        
        By descriptConsept = By.id("concept_description");
        
        By valorUnitConsept = By.id("concept_unit_value");
        
        By importConsept = By.id("concept_amount");
        
        By addConsept = By.id("add-concept");
        
        By Emitir = By.cssSelector("[type='submit']");
        
        
        By ImpuestosRetenidosBotton = By.xpath("//*[@id=\"modal-add-concept\"]/div/div/div[2]/div[1]/div/label");
        
        By ImpuestosDeTranslados = By.xpath("//*[@id=\"modal-add-concept\"]/div/div/div[2]/div[5]/div/label");
        
        By ImpRetBase = By.id("retention_base");
        
        By SelectImpuestRet = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[2]/div/div/button/span[1]");
        
        By ISRRetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[2]/div/div/div/ul/li[2]/a");
        
        By IVARetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[2]/div/div/div/ul/li[3]/a");
        
        By IEPSRetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[2]/div/div/div/ul/li[4]/a");
        
        By SelectFactor = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[3]/div/div/button/span[1]");
        
        By TasaRetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[3]/div/div/div/ul/li[2]/a");
        
        By CuotaRetenido = By.xpath("//*[@id=\"section-add-retention\"]/form/div/div[1]/div[3]/div/div/div/ul/li[3]/a");
        
        By CampoTasaOCuota = By.id("retention_rate_or_fee");
        
        By ImporteRetenido = By.id("retention_amount");
        
        By AgregarRetenido = By.id("add-retention");
        
        By TransladoButton = By.xpath("//*[@id=\"modal-add-concept\"]/div/div/div[2]/div[5]/div/label");
        
        By TransladosBase = By.id("transfer_base");
        
        By SelectImpuestoTransla = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[2]/div/div/button/span[1]");
        
        By IVATranslado = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[2]/div/div/div/ul/li[2]/a");
        
        By IEPSTranslado = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[2]/div/div/div/ul/li[3]/a");
        
        By SelectFactorTranslado = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[3]/div/div/div/button/span[1]");
        
        By TasaTransladoFact = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[3]/div/div/div/div/ul/li[2]/a");
        
        By CuotaTransladoFact = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[3]/div/div/div/div/ul/li[3]/a");
        
        By ExtentoTransladoFact = By.xpath("//*[@id=\"section-add-transfer\"]/form/div/div[1]/div[3]/div/div/div/div/ul/li[4]/a");
        
        By TasaOCuotaTranslado = By.id("transfer_rate_or_fee");
        
        By AgregarTranslado = By.id("add-transfer");
        
        By CartaPorteBasica = By.cssSelector("[href*='/receipts/t/new']");
        
        By FuncionDeMensagenDeta = By.cssSelector("[title='Selecciona la función del mensaje...']");
        
        By TipoDeTransDetallista = By.cssSelector("[title='Selecciona el tipo de transacción...']");
        
        By NumeroPedidoDetallista = By.id("[order_identification][reference_identification][0]");
        
        By CloneButtonDetallista = By.cssSelector("[.btn.btn-default.btn-add-clone]");
        
        By GNLDetallista = By.id("[buyer][gln]");
        
        By CodigoDeRefAdDetallista = By.cssSelector("[title='Selecciona el código de referencia adicional...']");
        
        By NumeroDetallista = By.id("[additional_information][0][reference_identification]");
        
        By OriginalDetallista = By.linkText("ORIGINAL");
        
        By CopyDetallista = By.linkText("COPY");
        
        By ReemplazaDetallista = By.linkText("REEMPLAZA");
        
        By DeleteDetallista = By.linkText("DELETE");
        
        By Numerodonativo = By.id("receipt_donation_no_authorization");
        
        By FechaAuthoDonativo = By.id("receipt_donation_authorization_date");
        
        By TipoDeProcesoINE = By.cssSelector("[title='Selecciona el Tipo de Proceso...']");
        
        By TipoDeComiteINE = By.cssSelector("[title='Selecciona el Tipo de Comité...']");
        
        By ProcesoOrdinario = By.linkText("Ordinario");
        
        By ProcesoPreCampana = By.linkText("Precampaña");
        
        By ProcesoCampana = By.linkText("Campaña");
        
        By EjecutivoNacionalComit = By.linkText("Ejecutivo Nacional");
        
        By EjecutivoEstatal = By.linkText("Ejecutivo Estatal");
        
        By DirectivoEstatal = By.linkText("Directivo Estatal");
        
        By ClaveVehiPersFisicas = By.id("receipt_pfic_pfic_clave_vehicular");
        
        By PlacaPersonasFisicas = By.id("receipt_pfic_pfic_placa");
        
        By ClaveVehicular = By.id("vehicle_clave_vehicular");
        
        By NIVVehicular = By.id("vehicle_niv");
        
        By AgregarVentaVehic = By.id("add-vehicle");
        
        By AgreComplVehiUsado = By.cssSelector("[href*='#modal-add-used_vehicle']");
        
        By AddUsedVehicle = By.id("add-used_vehicle");
        
        By MontoAdqVehUsado = By.id("used_vehicle_monto_adquisicion");
        
        By MontoEnajecVehiUsado = By.id("used_vehicle_monto_enajenacion");
        
        By ClaveVehiUsado = By.id("used_vehicle_uv_clave_vehicular");
        
        By MarcaVehiculoUsado = By.id("used_vehicle_uv_marca");
        
        By TipoVehicUsado = By.id("used_vehicle_uv_tipo");
        
        By ModeloVehicUsado = By.id("used_vehicle_uv_modelo");
        
        By ValorVehicUsado = By.id("used_vehicle_uv_valor");
        
        // NOTARIOS PUBLICOS
        
        By NumeroInstrNotarial = By.id("[operation_data][notary_instrument_number]");
        
        By FechaInstNotarial = By.id("[operation_data][notary_instrument_date]");
        
        By MontoInstNotarial = By.id("[operation_data][notary_amount]");
        
        By IvaInstNotarial = By.id("[operation_data][notary_iva]");
        
        By SubTotalInstNotarial = By.id("[operation_data][notary_subtotal]");
        
        By CurpInstNotarial = By.id("[notary_data][notary_curp]");
        
        By NumeroNotaria = By.id("[notary_data][notary_number]");
        
        By EntidadNotarial = By.cssSelector("[title='Selecciona la Entidad Federativa...']");
        
        By TipoDeImuebleNotarial = By.cssSelector("[title='Selecciona el tipo de inmueble...']");
        
        By CalleNotarial = By.id("[property_description][0][notary_calle]");
        
        By MunicipioNotarial = By.id("[property_description][0][notary_municipio]");
        
        By EstadoNotarial = By.cssSelector("[title='Selecciona el Estado...']");
        
        By PaisNotarial = By.cssSelector("[data-id='[property_description][0][notary_pais]']");
        
        By CodigoPostalNotarial = By.id("[property_description][0][notary_codigo_postal]");
        
        // DATOS ENAJENANTES
        
        By NombreNotarial = By.id("[property_seller][0][notary_nombre]");
        
        By ApellidoPaternNotarial = By.id("[property_seller][0][apellido_paterno]");
        
        By RFCNotarial = By.id("[property_seller][0][notary_sb_rfc]");
        
        By CurpEnajeNotarial = By.id("[property_seller][0][notary_sb_curp]");
        
        // DATOS ADUIRIENTE
        
        By NombreAdqNotarial = By.id("[property_buyer][0][notary_nombre]");
        
        By RFCAdquiriente = By.id("[property_buyer][0][notary_sb_rfc]");
        
        // SERVICIOS PARCEALES DE CONSTRUCCION
        
        By AuthorizcionConstruccion = By.id("construction_num_perlicoaut");
        
        By CalleContruccion = By.id("construction_construction_calle");
        
        By MunicipioConstruccion = By.id("construction_construction_municipio");
        
        By EstadoConstruccion = By.cssSelector("[data-id='construction_construction_estado']");
        
        By CodigoPostalConstruccion = By.id("construction_construction_codigo_postal");
        
        By AddContrucion = By.id("add-construction");
        
        By AgregarComplConstruccion = By.cssSelector("[href='#modal-add-construction']");
        
        //CFDI COMERCIO EXTERIOR
        
        By CFDIComercioExt = By.cssSelector("[data-id='receipt_receiver_cfdi_usage']");
        
        By NumeroDeIDComercio = By.id("concept_identification_num");
        
        By OperaComercioExt = By.cssSelector("[data-id='receipt_external_commerce_ce_tipo_operacion']");
        
        By ExportOperation = By.linkText("2 - Exportación");
        
        By ClavePedimentoExport = By.cssSelector("[data-id='receipt_external_commerce_ce_clave_de_pedimento']");
        
        By ImpDefinitPedimento = By.linkText("A1 - IMPORTACION O EXPORTACION DEFINITIVA");
        
        By CertiOrigenExport = By.cssSelector("[data-id='receipt_external_commerce_ce_certificado_origen']");
        
        By NonCertExp = By.linkText("0 - No Funge como certificado de origen");
        
        By CertExp = By.linkText("1 - Funge como certificado de origen");
        
        By ClaveIncoTermExpo = By.cssSelector("[data-id='receipt_external_commerce_ce_incoterm']");
        
        By SubdFactExp = By.cssSelector("[data-id='receipt_external_commerce_ce_subdivision']");
        
        By NonSubdFactExp = By.linkText("0 - No tiene subdivisión");
        
        By WithSubFactExp = By.linkText("1 - Si tiene subdivisión");
        
        By EquiValeXport = By.id("receipt_external_commerce_ce_tipo_cambio_usd");
        
        By MercanciaIDNumber = By.cssSelector("[data-id='external_commerce_item_ce_no_identificacion']");
        
        By DescriptMercancia = By.id("external_commerce_item_description_ce_marca");
        
        By AgregarDescrMercancia = By.id("add-external_commerce_item_description");
        
        By AddMercancia = By.id("add-external_commerce_item");
        
        By AgregarMercancia = By.cssSelector("[href='#modal-add-external_commerce_item']");
        
        By MercanciaDolares = By.id("external_commerce_item_ce_valor_dolares");
        
        By CFDIAdquisicDeMerc = By.linkText("G01 - Adquisición de mercancias");
        
        // OBRAS ARTES DE ANTEGUEDAD
        By TipoDeBienObras = By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div/div[1]/div/div/button");
        
        By TituloAdObras = By.cssSelector("[data-id='receipt_workart_workart_title']");
        
        By CaracteristicaObras = By.cssSelector("[data-id='receipt_workart_workart_description']");
        
        By DateObrasYArtes = By.id("receipt_workart_acquisition_date");
        // PAGO EN ESPECIES
        By ClaveDeInscriptEspec = By.id("receipt_kind_payment_kp_picture_key");
        
        By NumeroFolioEspec = By.id("receipt_kind_payment_kp_donation_request_folio");
        
        By NombreDePiezaEspec = By.id("receipt_kind_payment_kp_piece_art_name");
        
        By TecnicaDeProdEspec = By.id("receipt_kind_payment_kp_production_technique");
        
        By AnoDeProdPiezEspec = By.id("receipt_kind_payment_kp_production_year");
        
        By DimensionsPiezEspec = By.id("receipt_kind_payment_kp_art_piece_dimentions");
        
        // TURISTA PASAGERO
        By TipoDeTransito = By.cssSelector("[data-id='[tpe][tpe_tipo_transito]']");
        
        By FechaDeTransito = By.id("[tpe][tpe_fecha_transito]");
        
        By ViaDeTransito = By.cssSelector("[data-id='[transit_data][tpe_via]']");
        
        By IdentifTransport = By.id("[transit_data][tpe_tipo_id]");
        
        By NumeroIdentTransp = By.id("[transit_data][tpe_numero_id]");
        
        By NacionalidadTransp = By.id("[transit_data][tpe_nacionalidad]");
        
        By TranspCompany = By.id("[transit_data][tpe_empresa_transporte]");
        
        // LEYENDAS FISCALES
        By AgregarLeyenda = By.cssSelector("[href='#modal-add-lf']");
        
        By TextoLeyenda = By.id("lf_lf_legend_text");
        
        By AddLeyenda = By.id("add-lf");
        
        By SelectPaisComercioExt = By.cssSelector("[data-id='receipt_receiver_tax_residence']");
        
        By NumeroComercioExt = By.id("receipt_receiver_tax_identity_number");
        
        By ClaveFraccionAncel = By.id("external_commerce_item_ce_fraccion_arancelaria");
        
        By PrecioUnitaroExt = By.id("external_commerce_item_ce_valor_unitario_aduana");
        
        By CurrencyComericoExt = By.cssSelector("[data-id='receipt_currency']");
        
        By TipoDeCambioExt = By.id("receipt_exchange_rate");
        
        By RazonSocial = By.id("receipt_receiver_name");
        
        By CantidadBienesAduana = By.id("external_commerce_item_ce_cantidad_aduana");
        
        By ClaveDeUnidadMerc = By.cssSelector("[data-id='external_commerce_item_ce_unidad_aduana']");
        
        
        
        
        
        
        
        
        
        
        public WebElement ClaveUnidadMerca() {
        	return driver.findElement(ClaveDeUnidadMerc);
        }
        public WebElement CantidadBienesAduana() {
        	return driver.findElement(CantidadBienesAduana);
        }
        public WebElement RazonSocialExt() {
        	return driver.findElement(RazonSocial);
        }
        public WebElement TipoDeCambioExt() {
        	return driver.findElement(TipoDeCambioExt);
        }
        public WebElement CurrencyComercioExt() {
        	return driver.findElement(CurrencyComericoExt);
        }
        public WebElement PrecoUnitarioExterior() {
        	return driver.findElement(PrecioUnitaroExt);
        }
        public WebElement ClaveFraccionAncel() {
        	return driver.findElement(ClaveFraccionAncel);
        }
        public WebElement NumeroComercioExt() {
        	return driver.findElement(NumeroComercioExt);
        }
        public WebElement SelectPaisComercioExterior() {
        	return driver.findElement(SelectPaisComercioExt);
        }
        public SearchPage(WebDriver driver2) {
			
        	this.driver= driver2;
		}
        public WebElement AgregarLeyenda() {
        	return driver.findElement(AgregarLeyenda);
        }
        public WebElement TextLeyenda() {
        	return driver.findElement(TextoLeyenda);
        }
        public WebElement AddLeyenda() {
        	return driver.findElement(AddLeyenda);
        }
        public WebElement TipoDeTransito() {
        	return driver.findElement(TipoDeTransito);
        }
        public WebElement DateTransit() {
        	return driver.findElement(FechaDeTransito);
        }
        public WebElement ViaDeTransito() {
        	return driver.findElement(ViaDeTransito);
        }
        public WebElement TransportIdentication() {
        	return driver.findElement(IdentifTransport);
        }
        public WebElement TransportIdentificationNumber() {
        	return driver.findElement(NumeroIdentTransp);
        }
        public WebElement PassenegerNacionality() {
        	return driver.findElement(NacionalidadTransp);
        }
        public WebElement TransportCompany() {
        	return driver.findElement(TranspCompany);
        }
        public WebElement ClaveDeInscrEspec() {
        	return driver.findElement(ClaveDeInscriptEspec);
        }
        public WebElement FolioNumberEspec() {
        	return driver.findElement(NumeroFolioEspec);
        }
        public WebElement NamePieceEspecie() {
        	return driver.findElement(NombreDePiezaEspec);
        }
        public WebElement TechProdEspecie() {
        	return driver.findElement(TecnicaDeProdEspec);
        }
        public WebElement AnoDeProdPiezaEspec() {
        	return driver.findElement(AnoDeProdPiezEspec);
        }
        public WebElement DimensPiezaEspec() {
        	return driver.findElement(DimensionsPiezEspec);
        }
        public WebElement TipoDeBienObrasArtes() {
        	return driver.findElement(TipoDeBienObras);
        }
        public WebElement TituloObrasArtes() {
        	return driver.findElement(TituloAdObras);
        }
        public WebElement CaractObrasArtes() {
        	return driver.findElement(CaracteristicaObras);
        }
        public WebElement DateObrasArtes() {
        	return driver.findElement(DateObrasYArtes);
        }
        public WebElement AddDescriptMercancia() {
        	return driver.findElement(AgregarDescrMercancia);
        }
        public WebElement CurrencyMercancia() {
        	return driver.findElement(MercanciaDolares);
        }
        public WebElement AdquiDeMercCFDI() {
        	return driver.findElement(CFDIAdquisicDeMerc);
        }
        public WebElement AddMercancia() {
        	return driver.findElement(AddMercancia);
        }
        public WebElement AgregarMercancia() {
        	return driver.findElement(AgregarMercancia);
        }
        public WebElement MercanciaIDNumb() {
        	return driver.findElement(MercanciaIDNumber);
        }
        public WebElement MercanciaDescript() {
        	return driver.findElement(DescriptMercancia);
        }
        public WebElement ClaveDePedimentoComerc() {
        	return driver.findElement(ClavePedimentoExport);
        }
        public WebElement ClaveIncoTermExport() {
        	return driver.findElement(ClaveIncoTermExpo);
        }
        public WebElement ExportOperation() {
        	return driver.findElement(ExportOperation);
        }
        public WebElement SubdivisionFacturaExp() {
        	return driver.findElement(SubdFactExp);
        }
        public WebElement EquiValentExport() {
        	return driver.findElement(EquiValeXport);
        }
        public WebElement WithSubdFactExpo() {
        	return driver.findElement(WithSubFactExp);
        }
        public WebElement NonSubdFactExport() {
        	return driver.findElement(NonSubdFactExp);
        }
        public WebElement CertExpot() {
        	return driver.findElement(CertExp);
        }
        public WebElement NonCertiExpo() {
        	return driver.findElement(NonCertExp);
        }
        public WebElement ImportDefPedimentoComer() {
        	return driver.findElement(ImpDefinitPedimento);
        }
        public WebElement CertifOrigExport() {
        	return driver.findElement(CertiOrigenExport);
        }
        public WebElement OperaComerExt() {
        	return driver.findElement(OperaComercioExt);
        }
        public WebElement NumIDComercioExt() {
        	return driver.findElement(NumeroDeIDComercio);
        }
        public WebElement CFDIComercioExt() {
        	return driver.findElement(CFDIComercioExt);
        }
        public WebElement AuthoConstruccion() {
        	return driver.findElement(AuthorizcionConstruccion);
        }
        public WebElement CalleConstruccion() {
        	return driver.findElement(CalleContruccion);
        }
        public WebElement MunicipioCostruccion() {
        	return driver.findElement(MunicipioConstruccion);
        }
        public WebElement EstadoConstruccion() {
        	return driver.findElement(EstadoConstruccion);
        }
        public WebElement CodigoPostalConstr() {
        	return driver.findElement(CodigoPostalConstruccion);
        }
        public WebElement AddContruccion() {
        	return driver.findElement(AddContrucion);
        }
        public WebElement AgregCompleConstruccion() {
        	return driver.findElement(AgregarComplConstruccion);
        }
        public WebElement DocRelacPago() {
        	return driver.findElement(DocRelaPago);
        }
        public WebElement MethodPagoPago() {
        	return driver.findElement(MethodPagoPago);
        }
        public WebElement PPDPago() {
        	return driver.findElement(PPDPago);
        }
        public WebElement CambioPago() {
        	return driver.findElement(CambioPago);
        }
        public WebElement ImportePago() {
        	return driver.findElement(ImportePago);
        }
        public WebElement ImporteSaldoInsolutPago() {
        	return driver.findElement(ImporteSaldoInsoPago);
        }
        public WebElement ImpSaldoAntePago() {
        	return driver.findElement(ImpSaldAntPago);
        }
        public WebElement ParcialidadesPago() {
        	return driver.findElement(ParcialidPagos);
        }
        public WebElement TaggleSwitchPago() {
        	return driver.findElement(PagoSwitch);
        }
        public WebElement NumeroInstNotarial() {
        	return driver.findElement(NumeroInstrNotarial);
        }
        public WebElement DateNotarial() {
        	return driver.findElement(FechaInstNotarial);
        }
        public WebElement MontoInstNotarial() {
        	return driver.findElement(MontoInstNotarial);
        }
        public WebElement IvaInstNotarial() {
        	return driver.findElement(IvaInstNotarial);
        }
        public WebElement SubTotalInstNotarial() {
        	return driver.findElement(SubTotalInstNotarial);
        }
        public WebElement CurpInstNotarial() {
        	return driver.findElement(CurpInstNotarial);
        }
        public WebElement NumeroDelNotario() {
        	return driver.findElement(NumeroNotaria);
        }
        public WebElement EntidadNotarial() {
        	return driver.findElement(EntidadNotarial);
        }
        public WebElement IMUEBLENotarial() {
        	return driver.findElement(TipoDeImuebleNotarial);
        }
        public WebElement CalleNotarial() {
        	return driver.findElement(CalleNotarial);
        }
        public WebElement MunicipioNotarial() {
        	return driver.findElement(MunicipioNotarial);
        }
        public WebElement EstadoNotarial() {
        	return driver.findElement(EstadoNotarial);
        }
        public WebElement PaisNotarial() {
        	return driver.findElement(PaisNotarial);
        }
        public WebElement CodigoPostalNotarial() {
        	return driver.findElement(CodigoPostalNotarial);
        }
        public WebElement NombreNotarial() {
        	return driver.findElement(NombreNotarial);
        }
        public WebElement ApellidoPaternoNotarial() {
        	return driver.findElement(ApellidoPaternNotarial);
        }
        public WebElement RFCNotarial() {
        	return driver.findElement(RFCNotarial);
        }
        public WebElement CurpEnajNotarial() {
        	return driver.findElement(CurpEnajeNotarial);
        }
        public WebElement NombreAdquiNotarial() {
        	return driver.findElement(NombreAdqNotarial);
        }
        public WebElement RFCAdquiNotarial() {
        	return driver.findElement(RFCAdquiriente);
        }
        public WebElement CartaPorteBasica() {
        	return driver.findElement(CartaPorteBasica);
        }
        public WebElement ClavePersonasFisicas() {
        	return driver.findElement(ClaveVehiPersFisicas);
        }
        public WebElement PlacaPersonasFisicas() {
        	return driver.findElement(PlacaPersonasFisicas);
        }
        public WebElement ModeloVehicUsado() {
        	return driver.findElement(ModeloVehicUsado);
        }
        public WebElement ValorVehicUsado() {
        	return driver.findElement(ValorVehicUsado);
        }
        public WebElement TipoVehicUsado() {
        	return driver.findElement(TipoVehicUsado);
        }
        public WebElement MarcaVehicUsado () {
        	return driver.findElement(MarcaVehiculoUsado);
        }
        public WebElement ClaveVehiUsado() {
        	return driver.findElement(ClaveVehiUsado);
        }
        public WebElement MontoEnajVehicUsado() {
        	return driver.findElement(MontoEnajecVehiUsado);
        }
        public WebElement MontoAquiVehiUsado() {
        	return driver.findElement(MontoAdqVehUsado);
        }
        public WebElement AddUsedVehicle() {
        	return driver.findElement(AddUsedVehicle);
        }
        public WebElement AgregarComplVehiUsado() {
        	return driver.findElement(AgreComplVehiUsado);
        }
        public WebElement AgregarVentaVehicular() {
        	return driver.findElement(AgregarVentaVehic);
        }
        public WebElement NIVVehicular() {
        	return driver.findElement(NIVVehicular);
        }
        public WebElement ClaveVehicular() {
        	return driver.findElement(ClaveVehicular);
        }
        public WebElement FuncOriginalDeta() {
        	return driver.findElement(OriginalDetallista);
        }
        public WebElement FuncCopyDetallista() {
        	return driver.findElement(CopyDetallista);
        }
        public WebElement FuncDeleteDetallista() {
        	return driver.findElement(DeleteDetallista);
        }
        public WebElement FuncReemplazaDetallista() {
        	return driver.findElement(ReemplazaDetallista);
        }
        public WebElement PrecampanaINE() {
        	return driver.findElement(ProcesoPreCampana);
        }
        public WebElement EjecutivoEstatalINE() {
        	return driver.findElement(EjecutivoEstatal);
        }
        public WebElement DirectivoEstatalINE() {
        	return driver.findElement(DirectivoEstatal);
        }
        public WebElement EjecutivoNacionalINE() {
        	return driver.findElement(EjecutivoNacionalComit);
        }
        public WebElement CampanaINE() {
        	return driver.findElement(ProcesoCampana);
        }
        public WebElement OrdinarioINE() {
        	return driver.findElement(ProcesoOrdinario);
        }
        public WebElement PagoParcialidades() {
        	return driver.findElement(PAGOparcialidades);
        }
        public WebElement TipoDeProcesoINE() {
        	return driver.findElement(TipoDeProcesoINE);
        }
        public WebElement TipoDeComiteINE() {
        	return driver.findElement(TipoDeComiteINE);
        }
        public WebElement DonationDate() {
        	return driver.findElement(FechaAuthoDonativo);
        }
        public WebElement NumeroDeDonativo() {
        	return driver.findElement(Numerodonativo);
        }
        public WebElement NumeroDetallista() {
        	return driver.findElement(NumeroDetallista);
        }
        public WebElement CodigoRefAdDetallista() {
        	return driver.findElement(CodigoDeRefAdDetallista);
        }
        public WebElement GNLDetallista() {
        	return driver.findElement(GNLDetallista);
        }
        public WebElement CloneButtonDetallista() {
        	return driver.findElement(CloneButtonDetallista);
        }
        public WebElement NumeroDePedidoDetallista() {
        	return driver.findElement(NumeroPedidoDetallista);
        }
        public WebElement TipoTransactionDetallista() {
        	return driver.findElement(TipoDeTransDetallista);
        }
        public WebElement FuncionMSNDetallista() {
        	return driver.findElement(FuncionDeMensagenDeta);
        }
		public WebElement BasicaSelectFiscal()
		{
			return driver.findElement(SelectRegimeFiscal);
		}
		public WebElement FormaPagoP() {
			return driver.findElement(SelectFormaPagoP);
		}
		public WebElement TipoDeCambioPago(){
			return driver.findElement(TipoDeCambioPago);
		}
		public WebElement FechaDePago() {
			return driver.findElement(FechaDePago);
		}
		public WebElement MontoDePago() {
			return driver.findElement(MontoDePago);
		}
		public WebElement AddPagoComplement() {
			return driver.findElement(AddPagoCompl);
		}
		public WebElement AgregarCompPago() {
			return driver.findElement(AgregarComplPago);
		}
		public WebElement CuotaTransladoFact() {
			return driver.findElement(CuotaTransladoFact);
		}	
		public WebElement TransladoButton() {
			return driver.findElement(TransladoButton);
		}
        public WebElement BaseTranslado() {
        	return driver.findElement(TransladosBase);
        } 
		public WebElement SelectImpTranslado() {
			return driver.findElement(SelectImpuestoTransla);
		}
		public WebElement SelectTipoFactorTransla() {
			return driver.findElement(SelectFactorTranslado);
		}
		public WebElement TasaoCuotaTranslado() {
			return driver.findElement(TasaOCuotaTranslado);
		}
		public WebElement AgregarTranslado() {
			return driver.findElement(AgregarTranslado);
		}	
		public WebElement IvaTranslado() {
			return driver.findElement(IVATranslado);
		}
        public WebElement TasaTranslado() {
        	return driver.findElement(IEPSTranslado);
        }
		public WebElement PersonasMorales()
		{
			return driver.findElement(PersonasMorales);
		}
		public WebElement RFC()
		{
			return driver.findElement(RFC);
		}	 
		public WebElement SelectCFDI()
		{
			return driver.findElement(SelectCFDI);
		}	 
		public WebElement formaPago()
		{
			return driver.findElement(formaPago);
		}	
		public WebElement SelectformaPago1()
		{
			return driver.findElement(SelectformaPago1);
		}	
		public WebElement SelectFormaPago2()
		{
			return driver.findElement(SelectFormaPago2);
		}
		public WebElement SelectMethodPago()
		{
			return driver.findElement(SelectMethodPago);
		}
		public WebElement MethodPago1Exhibicion()
		{
			return driver.findElement(MethodPago1Exhibicion);
		}	
       public WebElement AgregarConsept()
{
	    return driver.findElement(agregarConsept);
}	
       public WebElement ClaveDelProducto()
		{
			return driver.findElement(claveDelProducto);
		}	
       public WebElement CantidadConsept()
		{
			return driver.findElement(cantidadConsept);
		}	
       public WebElement DescripticionConsept()
		{
			return driver.findElement(descriptConsept);
		}
       public WebElement ValorUnitarioConsept()
		{
			return driver.findElement(valorUnitConsept);
		}	
       public WebElement ImportConsept()
		{
			return driver.findElement(importConsept);
		}	
       public WebElement AddConsept()
		{
			return driver.findElement(addConsept);
		}	
       public WebElement EmitirFactura()
		{
			return driver.findElement(Emitir);
		}	
       public WebElement CfdiGastosGenerales()
		{
			return driver.findElement(CFDIGastosGenerales);
		}	
       public WebElement ClaveDeUnidad()
		{
			return driver.findElement(claveDeUnidad);
		}	
      
       
}