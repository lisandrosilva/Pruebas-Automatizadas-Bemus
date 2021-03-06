package com.mkyong.hashing.busonfiscal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageBuson {
	
	public WebDriver driver;
	
        By Email = By.id("session_username");
        By Password = By.id("session_password");
        By Ingresar = By.cssSelector("[type='submit']");
        By Advanced = By.id("details-button");
        By Proceed = By.id("proceed-link");
        By DropFistP = By.cssSelector("div[class*=mc-wrap]");
        By CrearCompr = By.xpath("//*[@id=\"billing-menu\"]/ul[1]/li[2]/a");
        By Factura = By.xpath("//*[@id=\"new_receipt_list\"]/li[1]/div/a");
        By NotadeCredito = By.xpath("//*[@id=\"new_receipt_list\"]/li[2]/div/a");
        By CartaPorte = By.xpath("//*[@id=\"new_receipt_list\"]/li[3]/div/a");
        By Pagos = By.xpath("//*[@id=\"new_receipt_list\"]/li[4]/div/a");
        
        By ValidacionOK = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By ListaRFC = By.id("rfc_list");
        
        By CloseSearch = By.xpath("/html/body/header/div[2]/div/form/i[1]");
        
        By Search = By.xpath("/html/body/header/ul/li[1]/a/i");
        
        By ImpresionFiscal = By.linkText("Impresión Fiscal");
        
        By PlantillasImpresion = By.xpath("/html/body/section/section/div/div/div[1]/a/i");
        
        By ImpresionBasica = By.cssSelector("[href='/templates/1_invoice']");
        
        By FormatoCartaImprBasic = By.cssSelector("[title='Formato - Carta']");
        
        By FormatoCartaHorizBasic = By.linkText("Formato - Carta horizontal");
        
        By TemplateName = By.id("template_name");
        
        By TemplateNote = By.id("template_note");
        
        By NominaImpresionFiscal = By.cssSelector("[href='#tab-2']");
        
        By PagoImprFiscal = By.cssSelector("[href='#tab-3']");
        
        By TemplatePagoImpr = By.cssSelector("[href='/templates/3_payment']");
        
        By TemplateNominaImpr = By.cssSelector("[href='/templates/5_payroll']");
        
        By CrearTemplate = By.xpath("/html/body/section/section/div/form/div[2]/div/div/div[2]/button");
        
        By SearchRFC = By.xpath("/html/body/header/div[2]/div/form/i[2]");
        
        By MenuDropDown = By.xpath("/html/body/section/aside[2]/ul/li/div/button/span[1]");
        
        By NominaFiscal = By.linkText("Nómina Fiscal");
        
        By DescargaNomina = By.cssSelector("[href='/files/nominafiscal-template_1_2_cfdi33_v1.32.xlsx']");
        
        By ImportarNomina = By.xpath("/html/body/section/aside[2]/div[2]/ul[2]/li[2]/a");
        
        By ListaDeProcessoNomina = By.cssSelector("[href='/paysheets']");
        
        By CargarNomina = By.cssSelector("[href='/paysheets/new']");
        
        By ContinuarNomina = By.xpath("/html/body/section/section/div/div/div[2]/div/div/form/div[4]/div/button");
        
        By EmitirNomina  = By.xpath("/html/body/section/section/div/div/div[2]/div[2]/form/div/div/button");
        
        By Servicios = By.cssSelector("[data-ma-action*='submenu-toggle']");
        
        By Configuration = By.xpath("/html/body/section/aside[2]/div[2]/ul[2]/li[6]/a");
        
        By SignOut = By.cssSelector("[stroke*='#000']");
        
        By LogBotClose = By.xpath("//*[@id=\"header\"]/ul/li[4]/ul/li[3]/form/a");
        
        By DatosFiscales = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[1]/a");
        
        By Sucursales = By.cssSelector("[href*='/branches']");
        
        By Certificados = By.cssSelector("[href*='/certificates']");
        
        By SelectSucCert = By.cssSelector("[data-id='certificate_branch_office_id']");
        
        By Producto = By.cssSelector("[href*='/products']");
        
        By SeriesFolio = By.cssSelector("[href*='/serials']");
        
        By Usuarios = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[6]/a");
        
        By Perfiles = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[7]/a");
        
        By AddCertificado = By.cssSelector("[href*='/certificates/new']");
        
        By AddArchivoCer = By.xpath("//*[@id=\"certificate_cer_file\"]");
        
        By AddArchivoKey = By.xpath("//*[@id=\"certificate_key_file\"]");
        
        By AddPassword = By.id("certificate_passphrase");
        
        By UploadCertificate = By.xpath("/html/body/section/section/div/div/div[2]/div/form/div[9]/div/button");
        
        
        By AddSucursal = By.cssSelector("[href*='/branches/new']");
        
        By SucursalBranch = By.id("branch_name");
        
        By SucursalAlias = By.id("branch_alias");
        
        By SucursalZip = By.id("branch_zip_code");
        
        By SaveSucursal = By.xpath("/html/body/section/section/div/div/div[2]/div/form/div[5]/div/button");
        
        By ActivarSucursal = By.id("branch_is_active");
        
        By PrincipalSucursal = By.id("branch_is_main");
        
        By AddFolios = By.cssSelector(".btn-float");
        
        By SerieFolio = By.id("serial_serial_number");
        
        By ValorInicialFolio = By.id("serial_begin");
        
        By ValorFinalFolio = By.name("serial[end]");
        
        By AgregarFolio = By.cssSelector("[type*='submit']");
        
        By AddProducto = By.cssSelector("[href*='/products/new?page=']");
        
        By NameProduct = By.id("product_name");
        
        By ClaveDelProducto = By.id("product_key_product_service");
        
        By ClaveDeUnidadPro = By.id("product_key_unit");
        
        By ValorUnitarioProduct = By.id("product_unit_value");
        
        By DescripcionDelPro = By.id("product_description");
        
        By GuardarProduct = By.cssSelector("button.pull-right");
        
        By Client = By.cssSelector("[href*='/customers']");
        
        By AddClient = By.cssSelector("[href*='/customers/new?page=']");
         
        By RFCClient = By.id("customer_rfc");
        
        By GuardarClient = By.cssSelector("button.pull-right");
        
        By Emitidos = By.cssSelector("#billing-menu > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
        
        By EmitidoRFC = By.id("document_rfc_receiver");
        
        By EmitidoSerie = By.id("document_receipt_serie");
        
        By EmitidoFolio = By.id("document_receipt_folio");
        
        By EmitidoDataInicial = By.id("document_init_date");
        
        By EmitidoDataFinal = By.id("document_end_date");
        
        By CheckBoxEmitido = By.cssSelector("[type*='checkbox']");
        
        By CheckFistOpEmi = By.cssSelector(".select-box");
        
        By ExportarEmitido = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By EnviarEmitido = By.xpath("//button[@class='btn btn-default btn-anyrfc btn-sent']");
        
        By DescargarEmitido = By.cssSelector("button.btn:nth-child(4)");
        
        By BuscarEmitido = By.cssSelector("button.btn-primary:nth-child(1)");
        
        By DescargarEmitidoXML = By.cssSelector("[data-value*='xml']");
        
        By DescargarEmitidoPDF = By.cssSelector("[data-value*='pdf']");
        
        By DescargarEmitidoBoth = By.cssSelector("[data-value*='zip']");
        
        By DescargaFinal = By.cssSelector(".swal2-confirm");
        
        By EstatusEmitido = By.cssSelector("tr.active > td:nth-child(12) > div:nth-child(1) > a:nth-child(6)");
        
        By DuplicarEmitido = By.cssSelector("[data-original-title*='Duplicar']");
        
        By DuplicacionEmitido = By.id("duplicate_receipt");
        
        By EmitirDuplicado = By.cssSelector("button.btn-lg");
        
        By VistaRapidaEmitido = By.cssSelector("tr.active > td:nth-child(12) > div:nth-child(1) > a:nth-child(1)");
        
        By SalirVistaEmitido = By.cssSelector(".btn-link");
        
        By PDFVistaEmitido = By.cssSelector("[data-original-title*='Ver PDF']");
        
        By XMLVistaEmitido = By.cssSelector("[data-original-title*='Descargar XML']");
        
        By ExportarPaginaActivaEm = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By IdentificarStatusEmit = By.cssSelector(".swal2-confirm");
        
        By AceptarStatusEmit = By.xpath("//*[@class='swal2-confirm swal2-styled']");
        
        By ExportarCFDI = By.xpath("//*[@class='btn btn-default btn-export']");
        
        By ClientName = By.id("customer_business_name");
        
        By PhoneClient = By.id("customer_telefono");
        
        By EmailClient = By.id("customer_email");
        
        By ClientCountry = By.id("customer_pais");
        
        By ClientState = By.id("customer_estado");
        
        By ClientMunicipio = By.id("customer_municipio");
        
        By ClientColonia = By.id("customer_colonia");
        
        By ClientCalle = By.id("customer_calle");
        
        By ClientActivo = By.id("customer_active");
        
        By ActivateProduct = By.id("product_is_active");
        
        By BusonFiscal = By.xpath("/html/body/header/ul/li[2]/ul/li[1]/form/a");
        
        By CrearComprobanteBuson = By.cssSelector("[href*='/receipts/new']");
        
        By BottonSendXMLPDF = By.cssSelector("[title='XML - PDF']");
        
        By SendEmail = By.name("data[emails][0]");
        
        By Enviar = By.id("send-receipt");
        
        By SaveDraft = By.id("save_draft");
        
        By DraftBox = By.xpath("//input[@class='swal2-input']");
        
        By SaveText = By.cssSelector("button.swal2-confirm.swal2-styled");
        
        By OkBotton = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By Borradores = By.xpath("/html/body/section/aside[2]/div[2]/ul[2]/li[2]/a");
        
        By CancelarComprobante = By.cssSelector("[data-original-title='Cancelar']");
        
        By IdentificarStatusCancelacion = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By AceptarCancelacion = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By SolicitarCancelacion = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By DuplicadoComercioExtIngreso = By.cssSelector("[data-href='/i/ce']");
        
        By DuplicadoComercioExtTranslado = By.cssSelector("[data-href='/t/ce']");
        
        By DuplicarInstituicionesEdu = By.cssSelector("[data-href='/i/iedu']");
        
        By DuplicarLeyendasFiscales = By.cssSelector("[data-href='/i/lf']");
        
        By DuplicarNotariosPublicos = By.cssSelector("[data-href='/i/np']");
        
        By DuplicarDonatarios = By.cssSelector("[data-href='/i/d']");
        
        By DuplicarPagoEnEspecies = By.cssSelector("[data-href='/i/kp']");
        
        By DuplicarPersonasFisicas = By.cssSelector("[data-href='/i/pfic']");
        
        By DuplicarServiciosParceales = By.cssSelector("[data-href='/i/cp']");
        
        By DuplicarTuristasYPassageros = By.cssSelector("[data-href='/i/tpe']");
        
        By DuplicarFacturaSimples = By.cssSelector("[data-href='/i']");
        
        By CloneEmail = By.xpath("/html/body/section/section/div/div[2]/form[1]/div[3]/div/div/div[2]/div/div/button/i");
        
        By DuplicarINE = By.cssSelector("[data-href='/i/ine']");
        
        By DuplicarNotaDeCredito = By.cssSelector("[data-href='/e']");
        
        By DuplicarVehiculoUsado = By.cssSelector("[data-href='/i/v']");
        
        By DuplicadoCartaPorte = By.cssSelector("[data-href='/t']");
        
        By SelectTipoDeCFDI = By.xpath("//div[@class='btn-group bootstrap-select billing_receipt_type_select']");
        
        By CFDII = By.linkText("Ingreso");
        
        By CFDIE = By.linkText("Egreso");
        
        By CFDIT = By.linkText("Traslado");
        
        By CFDIP = By.linkText("Pago");
        
        By BusquedaAvanzada = By.id("show-search-receipt-advanced");
        
        // BUSQUEDA FORMA DE PAGO
        By SelectBusquedaFormaDPago = By.cssSelector("[data-id='document_payment_way_id']");
        
        By DacionEnPago = By.linkText("Dación en pago");
        
        By ValesDeDespensa = By.linkText("Vales de despensa");
        
        By DineroElectronico = By.linkText("Dinero electrónico");
        
        By MonederoElectronico = By.linkText("Monedero electrónico");
        
        By TarjetaDeCredito = By.linkText("Tarjeta de crédito");
        
        By TransferenciaElectronica = By.linkText("Transferencia electrónica");
        
        By ChequeNominativo = By.linkText("Cheque nominativo");
        
        By Efectivo = By.linkText("Efectivo");
        // ESTATUS
        By SelectStatus = By.cssSelector("[data-id='document_status']");
        
        By StatusCancelado = By.linkText("Cancelado");
        
        By StatusPendientesDeAprov = By.linkText("Pendientes de aprobación");
        
        By StatusEntregadoSat = By.linkText("Entregado SAT");
        
        By StatusEmitido = By.linkText("Emitido");
        // REGISTROS
        By Registros = By.cssSelector("[data-id='document_total_page']");
        
        By Registro5000 = By.linkText("5000");
        
        By Registro2000 = By.linkText("2000");
        
        By Registro1000 = By.linkText("1000");
        
        By Registro500 = By.linkText("500");
        //BUSQUEDA POR METHODO DE PAGO
        By BusquedaMethodDPago = By.cssSelector("[data-id='document_payment_method_id']");
        
        By PagoUnaSolaExib = By.linkText("PUE - Pago en una sola exhibición");
        
        By PagoEnParcealidades = By.linkText("PPD - Pago en parcialidades o diferido");
        
        By CodigoDeConfirm = By.id("document_confirm_code");
        
        By FolioFiscal = By.id("document_uuid");
        
        By Ticket = By.id("document_ref_id");
        
        By Serie = By.id("document_receipt_serie");
        
        By Folio = By.id("document_receipt_folio");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public WebElement UploadCertificate() {
        	return driver.findElement(UploadCertificate);
        }
        public WebElement FormatoCartaHorizBasic() {
        	return driver.findElement(FormatoCartaHorizBasic);
        }
        public WebElement FormatoCartaImpBasic() {
        	return driver.findElement(FormatoCartaImprBasic);
        }
        public WebElement TemplatePagoImprFiscal() {
        	return driver.findElement(TemplatePagoImpr);
        }
        public WebElement PagoImprFiscal() {
        	return driver.findElement(PagoImprFiscal);
        }
        public WebElement NominaImpresionFiscal() {
        	return driver.findElement(NominaImpresionFiscal);
        }
        public WebElement CrearTemplate() {
        	return driver.findElement(CrearTemplate);
        }
        public WebElement TemplateNominaImpr() {
        	return driver.findElement(TemplateNominaImpr);
        }
        public WebElement TemplateNote() {
        	return driver.findElement(TemplateNote);
        }
        public WebElement TemplateName() {
        	return driver.findElement(TemplateName);
        }
        public WebElement ImpresionBasica() {
        	return driver.findElement(ImpresionBasica);
        }
        public WebElement Plantillas() {
        	return driver.findElement(PlantillasImpresion);
        }
        public WebElement ImpresionFiscal() {
        	return driver.findElement(ImpresionFiscal);
        }
        public WebElement DescargaNomina() {
        	return driver.findElement(DescargaNomina);
        }
        public WebElement ListaProceNomina() {
        	return driver.findElement(ListaDeProcessoNomina);
        }
        public WebElement CloseSearch() {
        	return driver.findElement(CloseSearch);
        }
        public WebElement SearchRFC() {
        	return driver.findElement(SearchRFC);
        }
        public WebElement ValidacionOK() {
        	return driver.findElement(ValidacionOK);
        }
        public WebElement ListaRFC() {
        	return driver.findElement(ListaRFC);
        }
        public WebElement Search() {
        	return driver.findElement(Search);
        }
        public WebElement EmitirNomina() {
        	return driver.findElement(EmitirNomina);
        }
        public WebElement ContinuarNomina() {
        	return driver.findElement(ContinuarNomina);
        }
        public WebElement cargarNomina() {
        	return driver.findElement(CargarNomina);
        }
        public WebElement ImportarNomina() {
        	return driver.findElement(ImportarNomina);
        }
        public WebElement NominaFiscal() {
        	return driver.findElement(NominaFiscal);
        }
        public WebElement MenuDropDown() {
        	return driver.findElement(MenuDropDown);
        }
        public WebElement ChequeNominativo() {
        	return driver.findElement(ChequeNominativo);
        }
        public WebElement Folio() {
        	return driver.findElement(Folio);
        }
        public WebElement Serie() {
        	return driver.findElement(Serie);
        }
        public WebElement Ticket() {
        	return driver.findElement(Ticket);
        }
        public WebElement FolioFiscal() {
        	return driver.findElement(FolioFiscal);
        }
        public WebElement CodigoDeConfirmacion() {
        	return driver.findElement(CodigoDeConfirm);
        }
        public WebElement PagoEnParcealedades() {
        	return driver.findElement(PagoEnParcealidades);
        }
        public WebElement PagoEnUnaSolaExib() {
        	return driver.findElement(PagoUnaSolaExib);
        }
        public WebElement BusquedaMethodPago() {
        	return driver.findElement(BusquedaMethodDPago);
        }
        public WebElement Registro500() {
        	return driver.findElement(Registro500);
        }
        public WebElement Registro1000() {
        	return driver.findElement(Registro1000);
        }
        public WebElement Registro2000() {
        	return driver.findElement(Registro2000);
        }
        public WebElement Registro5000() {
        	return driver.findElement(Registro5000);
        }
        public WebElement Registros() {
        	return driver.findElement(Registros);
        }
        public WebElement StatusEmitido() {
        	return driver.findElement(StatusEmitido);
        }
        public WebElement StatusEntregadoSat() {
        	return driver.findElement(StatusEntregadoSat);
        }
        public WebElement StatusPendientesDeApr() {
        	return driver.findElement(StatusPendientesDeAprov);
        }
        public WebElement StatusCancelado() {
        	return driver.findElement(StatusCancelado);
        }
        public WebElement SelectStatus() {
        	return driver.findElement(SelectStatus);
        }
        public WebElement Efectivo() {
        	return driver.findElement(Efectivo);
        }
        public WebElement TransferenciaElectronica() {
        	return driver.findElement(TransferenciaElectronica);
        }
        public WebElement TarjetaDeCredito() {
        	return driver.findElement(TarjetaDeCredito);
        }
        public WebElement MonederoElectronico() {
        	return driver.findElement(MonederoElectronico);
        }
        public WebElement DineroElectronico() {
        	return driver.findElement(DineroElectronico);
        }
        public WebElement ValesDeDespensa() {
        	return driver.findElement(ValesDeDespensa);
        }
        public WebElement DacionEnPago() {
        	return driver.findElement(DacionEnPago);
        }
        public WebElement SelectBusquedaFormaDPago() {
        	return driver.findElement(SelectBusquedaFormaDPago);
        }
        public WebElement BusquedaAvanzada() {
        	return driver.findElement(BusquedaAvanzada);
        }
        public WebElement ExportarCFDI() {
        	return driver.findElement(ExportarCFDI);
        }
        public WebElement CFDIP() {
        	return driver.findElement(CFDIP);
        }
        public WebElement CFDIT() {
        	return driver.findElement(CFDIT);
        }
        public WebElement CFDIE() {
        	return driver.findElement(CFDIE);
        }
        public WebElement CFDII() {
        	return driver.findElement(CFDII);
        }
        public WebElement SelectTipoDeCFDI() {
        	return driver.findElement(SelectTipoDeCFDI);
        }
        public WebElement DuplicarCartaPorte() {
        	return driver.findElement(DuplicadoCartaPorte);
        }
        public WebElement DuplicarFacturaSimples() {
        	return driver.findElement(DuplicarFacturaSimples);
        }
        public WebElement DuplicarVehiculoUsado() {
        	return driver.findElement(DuplicarVehiculoUsado);
        }
        public WebElement DuplicarNotaDeCredito() {
        	return driver.findElement(DuplicarNotaDeCredito);
        }
        public WebElement DuplicarINE() {
        	return driver.findElement(DuplicarINE);
        }
        public WebElement CloneEmail() {
        	return driver.findElement(CloneEmail);
        }
        public WebElement DuplicarTuristasYpassageros() {
        	return driver.findElement(DuplicarTuristasYPassageros);
        }
        public WebElement DuplicarServiciosParcelConst() {
        	return driver.findElement(DuplicarServiciosParceales);
        }
        public WebElement DuplicarPersonasFisicas() {
        	return driver.findElement(DuplicarPersonasFisicas);
        }
        public WebElement DuplicarPagoEnEspecie() {
        	return driver.findElement(DuplicarPagoEnEspecies);
        }
        public WebElement DuplicarDonatarios() {
        	return driver.findElement(DuplicarDonatarios);
        }
        public WebElement DuplicarNotarioPublico() {
        	return driver.findElement(DuplicarNotariosPublicos);
        }
        public WebElement DuplicarLeyendasFiscales() {
        	return driver.findElement(DuplicarLeyendasFiscales);
        }
        public WebElement DuplicarInstEducativas() {
        	return driver.findElement(DuplicarInstituicionesEdu);
        }
        public WebElement DuplicadoComercioTranslado() {
        	return driver.findElement(DuplicadoComercioExtTranslado);
        }
        public WebElement DuplicadoComercioIngreso() {
        	return driver.findElement(DuplicadoComercioExtIngreso);
        }
        public WebElement SolicitarCancelacion() {
        	return driver.findElement(SolicitarCancelacion);
        }
        public WebElement AceptarCancelacion() {
        	return driver.findElement(AceptarCancelacion);
        }
        public WebElement IdentificarStatusCancelacion() {
        	return driver.findElement(IdentificarStatusCancelacion);
        }
        public WebElement CancelarComprobante() {
        	return driver.findElement(CancelarComprobante);
        }
        public WebElement SelectSucursalCertificado() {
        	return driver.findElement(SelectSucCert);
        }
        public WebElement Borradores() {
        	return driver.findElement(Borradores);
        }
        public WebElement OkButton() {
        	return driver.findElement(OkBotton);
        }
        public WebElement SaveText() {
        	return driver.findElement(SaveText);
        }
        public WebElement DraftBox() {
        	return driver.findElement(DraftBox);
        }
        public WebElement SaveDraft() {
        	return driver.findElement(SaveDraft);
        }
        public WebElement Enviar() {
        	return driver.findElement(Enviar);
        }
        public WebElement SendEmail() {
        	return driver.findElement(SendEmail);
        }
        public WebElement SendXMLPDF() {
        	return driver.findElement(BottonSendXMLPDF);
        }
        public LandingPageBuson(WebDriver driver2) {
			
        	this.driver= driver2;
		}

		public WebElement ingPortal()
		{
			return driver.findElement(Email);
			 
          }
		public WebElement DuplicacionEmitido() {
			return driver.findElement(DuplicacionEmitido);
		}
		public WebElement EmitirDuplicado() {
			return driver.findElement(EmitirDuplicado);
		}
		public WebElement SalirVistaEmitido() {
			return driver.findElement(SalirVistaEmitido);
		}
		public WebElement EmitidoFirstOpt() {
			return driver.findElement(CheckFistOpEmi);
		}
		public WebElement CertificadoSucursal() {
			return driver.findElement(SelectSucCert);
		}
		public WebElement ExportarPaginaActEm() {
			return driver.findElement(ExportarPaginaActivaEm);
		}
		public WebElement BusonFiscal() {
			return driver.findElement(BusonFiscal);
		}
		public WebElement Servicios() {
			return driver.findElement(Servicios);
		} 
		public WebElement EmitidoRFC() {
			return driver.findElement(EmitidoRFC);
		}
		public WebElement IdentificarStatusEmit() {
			return driver.findElement(IdentificarStatusEmit);
		}
		public WebElement AceptarStatus() {
			return driver.findElement(AceptarStatusEmit);
		}
		public WebElement CheckBoxComprobanteEmitido() {
			return driver.findElement(CheckBoxEmitido);
		}
		public WebElement ExportarEmitido() {
			return driver.findElement(ExportarEmitido);
		}
		public WebElement EnviarEmitido() {
			return driver.findElement(EnviarEmitido);
		}
		public WebElement DescargarEmitido() {
			return driver.findElement(DescargarEmitido);
		}
		public WebElement DescargarEmitidoXML() {
			return driver.findElement(DescargarEmitidoXML);
		}
		public WebElement DescargarEmitidoPDF() {
			return driver.findElement(DescargarEmitidoPDF);
		}
		public WebElement DescargarBoth() {
			return driver.findElement(DescargarEmitidoBoth);
		}
		public WebElement BottonDescarga() {
			return driver.findElement(DescargaFinal);
		}
		public WebElement EstatusEmitido() {
			return driver.findElement(EstatusEmitido);
		}
		public WebElement DuplicarEmitido() {
			return driver.findElement(DuplicarEmitido);
		}
		public WebElement VistaRapiraEmitido() {
			return driver.findElement(VistaRapidaEmitido);
			
		}
		public WebElement PDFVistaRapidaEmitido() {
			return driver.findElement(PDFVistaEmitido);
		}
		public WebElement XMLVistaRapidaEmitido() {
			return driver.findElement(XMLVistaEmitido);
		}
		public WebElement EmitidoDataInicial() {
			return driver.findElement(EmitidoDataInicial);
		}
		public WebElement EmitidoDataFinal() {
			return driver.findElement(EmitidoDataFinal);
		}
		public WebElement BuscarEmitidos() {
			return driver.findElement(BuscarEmitido);
		}
		public WebElement EmitidoSerie() {
			return driver.findElement(EmitidoSerie);
		}
		public WebElement EmitidoFolio() {
			return driver.findElement(EmitidoFolio);
		}
		public WebElement ComprobanteEmitido() {
			return driver.findElement(Emitidos);
		}
		public WebElement ActivateClient() {
			return driver.findElement(ClientActivo);
		}
		 public WebElement Emitidos() {
			 return driver.findElement(Emitidos);
		 }
		 public WebElement ActivateProducto() {
			 return driver.findElement(ActivateProduct);
		 }
		 public WebElement ClientName() {
			 return driver.findElement(ClientName);
		 }
		 public WebElement ClientPhone(){
			 return driver.findElement(PhoneClient);
		 }
		 public WebElement EmailClient() {
			 return driver.findElement(EmailClient);
		 }
		 public WebElement ClintCountry() {
			 return driver.findElement(ClientCountry);
		 }
		 public WebElement ClientState() {
			 return driver.findElement(ClientState);
		 }
		 public WebElement ClientMunicipio() {
			 return driver.findElement(ClientMunicipio);
		 }
		 public WebElement ClientColonia() {
			 return driver.findElement(ClientColonia);
		 }
		 public WebElement ClientCalle() {
			 return driver.findElement(ClientCalle);
		 }
		 public WebElement RFCClient() {
			 return driver.findElement(RFCClient);
		 }
		 
		public WebElement Cliente() {
			return driver.findElement(Client);
		}
		public WebElement AgregarClient() {
			return driver.findElement(AddClient);
		}
		public WebElement GuardarClient() {
			return driver.findElement(GuardarClient);
		}
		public WebElement ClaveUnidadProducto() {
			return driver.findElement(ClaveDeUnidadPro);
		}
		public WebElement AddProducto() {
			return driver.findElement(AddProducto);
		}
		public WebElement ProductName() {
			return driver.findElement(NameProduct);
		}
		public WebElement ClaveDelProducto() {
			return driver.findElement(ClaveDelProducto);
		}
		public WebElement ValorUnitarioProd() {
			return driver.findElement(ValorUnitarioProduct);
		}
		public WebElement DescripcionProduct() {
			return driver.findElement(DescripcionDelPro);
		}
		public WebElement GuardarProduct() {
			return driver.findElement(GuardarProduct);
		}
		public WebElement ingPortal1()
		{
			return driver.findElement(Password);
		}
		public WebElement ingPortal11()
		{
			return driver.findElement(Ingresar);
		}	 
		public WebElement ingPortalAdv()
		{
			return driver.findElement(Advanced);
		}	 
		public WebElement ingPortalProc()
		{
			return driver.findElement(Proceed);
		}	
		public WebElement ingdropPortal()
		{
			return driver.findElement(DropFistP);
		}
		
		public WebElement ingCrearCopr()
		{
			return driver.findElement(CrearCompr);
		}
		public WebElement ingFactura() {
			return driver.findElement(Factura);
		}
		public WebElement ingNotadeCredito() {
			return driver.findElement(NotadeCredito);
		}
		public WebElement ingCartaPorte() {
			return driver.findElement(CartaPorte);
			
		}
      public WebElement ingPagos() {
	       return driver.findElement(Pagos);
       }
      public WebElement ConfigBotton() {
   	   return driver.findElement(Configuration);
       }
      public WebElement SignOut() {
   	   return driver.findElement(SignOut);
      }
      public WebElement DatosFiscales() {
   	   return driver.findElement(DatosFiscales);
      }
      public WebElement Sucursales() {
      	   return driver.findElement(Sucursales);
         }
      public WebElement Certificados() {
      	   return driver.findElement(Certificados);
         }
      
         
      public WebElement FolioSeries() {
      	   return driver.findElement(SeriesFolio);
         }
      public WebElement Usuarios() {
      	   return driver.findElement(Usuarios);
         }
      public WebElement Perfiles() {
      	   return driver.findElement(Perfiles);
         }
      public WebElement CloseBotton() {
     	   return driver.findElement(LogBotClose);
        }

       public WebElement AddArchivoCer() {
	   return driver.findElement(AddArchivoCer);
       }
       public WebElement AddArchivoKey() {
    	   return driver.findElement(AddArchivoKey);
           }
       public WebElement AddPassword() {
    	   return driver.findElement(AddPassword);
           }
       
       public WebElement AddCertificado() {
    	   return driver.findElement(AddCertificado);
           }
      
        public WebElement AddSucursal() {
        	return driver.findElement(AddSucursal);
        }
       public WebElement SucursalBranch() {
	        return driver.findElement(SucursalBranch);
}
       public WebElement SucursalAlias() {
    	   return driver.findElement(SucursalAlias);
       }
      public WebElement SucursalZip() {
    	  return driver.findElement(SucursalZip);
     }
	public WebElement GuardarSucursal() {
		return driver.findElement(SaveSucursal);
	}
	public WebElement ActivarSucursal() {
		return driver.findElement(ActivarSucursal);
	}
	public WebElement AddFolio() {
		return driver.findElement(AddFolios);
	}
	public WebElement SerieFolio() {
		return driver.findElement(SerieFolio);
	}
	public WebElement ValorInicialFolio() {
		return driver.findElement(ValorInicialFolio);
	}
	public WebElement ValorFinalFolio() {
		return driver.findElement(ValorInicialFolio);
	}
	public WebElement AgregarFolio() {
		return driver.findElement(AgregarFolio);
	}
	public WebElement Producto() {
		return driver.findElement(Producto);
	}
}
