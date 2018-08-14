package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class GoogleTraductorPage extends PageObject{
	
	public static final Target BOTON_LENGUAJE_ORIGEN  =
			Target.the("BOTON_LENGUAJE_ORIGEN").located(By.id("gt-sl-gms"));
	
	public static final Target BOTON_LENGUAJE_DESTINO =
			Target.the("BOTON_LENGUAJE_DESTINO").located(By.id("gt-tl-gms"));
	
	public static final Target OPCION_ESPANOL = 
			Target.the("OPCION_ESPANOL").located(By.xpath("//*[@id=':3q']/div"));
	
	public static final Target OPCION_INGLES =
			Target.the("OPCION_INGLES").located(By.xpath("//*[@id=\':1e\']/div"));
	
	public static final Target AREA_DE_TRADUCCION =
			Target.the("AREA_DE_TRADUCCION").located(By.id("source"));
	
	public static final Target BOTON_TRADUCIR = 
			Target.the("BOTON_TRADUCIR").located(By.id("gt-lang-submit"));
	
	public static final Target AREA_TRADUCIDA = 
			Target.the("AREA_TRADUCIDA").located(By.id("gt-res-dir-ctr"));

}
