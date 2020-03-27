package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
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
        
        By Configuration = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/a");
        
        By SignOut = By.cssSelector("[stroke*='#000']");
        
        By LogBotClose = By.xpath("//*[@id=\"header\"]/ul/li[4]/ul/li[3]/form/a");
        
        By DatosFiscales = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[1]/a");
        
        By Sucursales = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[2]/a");
        
        By Certificados = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[3]/a");
        
        By Producto = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[6]/ul/li[2]/a");
        
        By SeriesFolio = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[4]/a");
        
        By Usuarios = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[6]/a");
        
        By Perfiles = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[7]/ul/li[7]/a");
        
        By AddCertificado = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
        
        By AddArchivoCer = By.id("certificate_cer_file");
        
        By AddArchivoKey = By.id("certificate_key_file");
        
        By AddPassword = By.id("certificate_passphrase");
        
        By UploadCertif = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[9]/div/button");
        
        By SucursalCertificado = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[1]/div/div/div/button/span[1]");
        
        By SucursalPrincipalCert = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[1]/div/div/div/div/ul/li[2]/a");
        
        By AddSucursal = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
        
        By SucursalBranch = By.id("branch_name");
        
        By SucursalAlias = By.id("branch_alias");
        
        By SucursalZip = By.id("branch_zip_code");
        
        By SaveSucursal = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[5]/div/button");
        
        By ActivarSucursal = By.id("branch_is_active");
        
        By AddFolios = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
        
        By SerieFolio = By.id("serial_serial_number");
        
        By ValorInicialFolio = By.id("serial_begin");
        
        By ValorFinalFolio = By.cssSelector(".form-control");
        
        By AgregarFolio = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/div[4]/div/button");
        
        By AddProducto = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
        
        By NameProduct = By.id("product_name");
        
        By ClaveDelProducto = By.id("product_key_product_service");
        
        By ClaveDeUnidadPro = By.id("product_key_unit");
        
        By ValorUnitarioProduct = By.id("product_unit_value");
        
        By DescripcionDelPro = By.id("product_description");
        
        By GuardarProduct = By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[4]/div/button");
        
        By Client = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[6]/ul/li[1]/a");
        
        By AddClient = By.xpath("//*[@id=\"content\"]/div/div/div[1]/a");
         
        By RFCClient = By.id("customer_rfc");
        
        By GuardarClient = By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[8]/div/button");
        
        By Emitidos = By.xpath("//*[@id=\"billing-menu\"]/ul[2]/li[1]/a");
        
        By EmitidoRFC = By.id("document_rfc_receiver");
        
        By EmitidoSerie = By.id("document_receipt_serie");
        
        By EmitidoFolio = By.id("document_receipt_folio");
        
        By EmitidoDataInicial = By.id("document_init_date");
        
        By EmitidoDataFinal = By.id("document_end_date");
        
        By CheckBoxEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[1]/div/label/input");
        
        By ExportarEmitido = By.cssSelector(".btn.btn-default.btn-export");
        
        By EnviarEmitido = By.xpath("//*[@id=\"data-table-receipts-header\"]/div/div/div[3]/button[3]");
        
        By DescargarEmitido = By.xpath("//*[@id=\"data-table-receipts-header\"]/div/div/div[3]/button[4]");
        
        By BuscarEmitido = By.xpath("//*[@id=\"content\"]/div/div[1]/div[2]/form/div[1]/div[8]/div/button");
        
        By DescargarEmitidoXML = By.xpath("//*[@id=\"swal2-content\"]/div[1]/div[1]");
        
        By DescargarEmitidoPDF = By.xpath("//*[@id=\"swal2-content\"]/div[1]/div[2]/div");
        
        By DescargarEmitidoBoth = By.xpath("//*[@id=\"swal2-content\"]/div[1]/div[3]/div");
        
        By DescargaFinal = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By EstatusEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[6]/span");
        
        By DuplicarEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[4]/span");
        
        By VistaRapidaEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[1]/span");
        
        By PDFVistaEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[2]/span");
        
        By XMLVistaEmitido = By.xpath("//*[@id=\"data-table-receipts\"]/tbody/tr[1]/td[11]/div/a[3]/span");
        
        By ExportarPaginaActivaEm = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By IdentificarStatusEmit = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
        By AceptarStatusEmit = By.xpath("/html/body/div[7]/div/div[3]/button[1]");
        
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
        
        By BottonFunk = By.xpath("/html/body/header/ul/li[3]/a/div/span/img");
        
        By BottonJes = By.xpath("/html/body/section/aside[1]/div/div/div/div[1]/div/div[2]/form/a/div[1]/span/img");
        
        By RFCSUL = By.xpath("/html/body/section/aside[1]/div/div/div/div[1]/div/div[1]/form/a/div[2]/div[1]");
        
        By SelectRegFiscalGratis = By.cssSelector("[data-id='receipt_emitter_tax_regime']");
        
        By RegimeMoral = By.linkText("603 - Personas Morales con Fines no Lucrativos");
        
        By SelectCFDIGratis = By.cssSelector("[data-id='receipt_receiver_cfdi_usage']");
        
        By CFDIGastosGeneralesGratis = By.linkText("G03 - Gastos en general");
        
        By FacturaBasicaGratis = By.xpath("//a[@href='/receipts/i/new']");
        
        By SucursalGratis = By.cssSelector("[data-id='branch_branch_office_id']");
        
        By FormaDePagoGratis = By.cssSelector("[data-id='receipt_payment_form']");
        
        By PagoEfectivoGratis = By.linkText("01 - Efectivo");
        
        By CodigoPostalGratis = By.id("receipt_expedition_place");
        
        By LogBottonGratis = By.cssSelector("[fill='#ffffff']");
        
        By CloseBottonGratis = By.linkText("Cerrar Sesión");
        
        By AddConseptGratis = By.id("add-concept");
        
        By FormaPagoPGratis = By.cssSelector("[data-id='complement_forma_de_pago_p']");
        
        By BottonCompRelaGratis = By.xpath("/html/body/section/section/div/form/div[5]/div[1]/div[1]/div/div[1]/div/label");
        
        By SelectTipoRelaGratis = By.cssSelector("[data-id='receipt_related_cfdis_type']");
        
        By SustituicionPrevios = By.linkText("04 - Sustitución de los CFDI previos");
        
        By BaseRetenido = By.id("retention_base");
        
        By ImporteRetenido = By.id("retention_amount");
        
        By BaseTranslado = By.id("transfer_base");
        
        By ImporteTranslado = By.id("transfer_amount");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public WebElement ImporteTransladoGratis() {
        	return driver.findElement(ImporteTranslado);
        }
        public WebElement BaseTransladoGratis() {
        	return driver.findElement(BaseTranslado);
        }
        public WebElement ImporteRetenidoGratis() {
        	return driver.findElement(ImporteRetenido);
        }
        public WebElement BaseRetenidoGratis() {
        	return driver.findElement(BaseRetenido);
        }
        public WebElement SustituicionPrevios() {
        	return driver.findElement(SustituicionPrevios);
        }
        public WebElement SelectTipoRelaGratis() {
        	return driver.findElement(SelectTipoRelaGratis);
        }
        public WebElement ButtonCompRelaGratis() {
        	return driver.findElement(BottonCompRelaGratis);
        }
        public WebElement FormaPagoPGR() {
        	return driver.findElement(FormaPagoPGratis);
        }
        public WebElement AddConseptGratis() {
        	return driver.findElement(AddConseptGratis);
        }
        public WebElement ButtonCloseGratis() {
        	return driver.findElement(CloseBottonGratis);
        }
        public WebElement ButtonLogGratis() {
        	return driver.findElement(LogBottonGratis);
        }
        public WebElement CodigoPostalGratis() {
        	return driver.findElement(CodigoPostalGratis);
        }
        public WebElement PagoEfectivoGratis() {
        	return driver.findElement(PagoEfectivoGratis);
        }
        public WebElement FormaDePagoGratis() {
        	return driver.findElement(FormaDePagoGratis);
        }
        public WebElement SucursalGratis() {
        	return driver.findElement(SucursalGratis);
        }
        public WebElement FacturaBasicaGratis() {
        	return driver.findElement(FacturaBasicaGratis);
        }
        public WebElement SelectCFDIGratis() {
        	return driver.findElement(SelectCFDIGratis);
        }
        public WebElement CFDIGastosGeneralesGratis() {
        	return driver.findElement(CFDIGastosGeneralesGratis);
        }
        public WebElement RegimeMoral() {
        	return driver.findElement(RegimeMoral);
        }
        public WebElement SelectRegGratis() {
        	return driver.findElement(SelectRegFiscalGratis);
        }
        public WebElement ButtonSUL() {
        	return driver.findElement(RFCSUL);
        }
        public WebElement ButtonJes() {
        	return driver.findElement(BottonJes);
        }
        public WebElement ButtonFunk() {
        	return driver.findElement(BottonFunk);
        }
        public LandingPage(WebDriver driver2) {
			
        	this.driver= driver2;
		}

		public WebElement ingPortal()
		{
			return driver.findElement(Email);
			 
          }
		public WebElement ExportarPaginaActEm() {
			return driver.findElement(ExportarPaginaActivaEm);
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
       public WebElement UploadCerificate() {
    	   return driver.findElement(UploadCertif);
           }
       public WebElement AddCertificado() {
    	   return driver.findElement(AddCertificado);
           }
       public WebElement SucursalCertif() {
    	   return driver.findElement(SucursalPrincipalCert);
       }
        public WebElement PrincipalSucursalCert() {
        	return driver.findElement(SucursalCertificado);
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
