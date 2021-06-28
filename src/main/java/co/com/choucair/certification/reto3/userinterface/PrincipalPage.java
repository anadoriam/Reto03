package co.com.choucair.certification.reto3.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrincipalPage extends PageObject {




    public static final Target Menu_Producto = Target.the("seleccionar el menu producto")
            .located(By.id("menu-productos"));
    public static final Target Producto_Leasing = Target.the("elejir producto leasing")
            .located(By.xpath("//A[@id='header-productos-leasing']"));
    public static final Target Leasing_Habitacional = Target.the("seleccionar la opcion Leasing Habitacional")
            .located(By.xpath("//A[@href='/personas/productos-servicios/leasing/habitacional/'][text()='Leasing Habitacional']"));
    public static final Target Simular = Target.the("Seleccione en la barra Simula")
            .located(By.xpath("//A[@href='/personas/creditos/vivienda/simulador-credito-vivienda'][text()='\n" +
                    "                IR AL SIMULADOR\n" +
                    "            ']"));
    public static final Target Segun_Vivienda = Target.the("seleccionar segun el valor de la vivienda")
            .located(By.xpath("//DIV[@id='calcular-cuotas']"));
    public static final Target Valor_vivienda = Target.the("digite el valor de la vivienda")
            .located(By.xpath("//INPUT[@id='valor-simulacion']"));
    public static final Target Button_Porcentaje = Target.the("click para ver los porcentajes sujeridos")
            .located(By.xpath("//DIV[@class='mat-select-arrow-wrapper']"));
    public static final Target Porcentaje = Target.the("seleccione el porcentaje que necesita (Mnor a 80% y mayor al 1%)")
            .located(By.xpath("//SPAN[@class='mat-option-text'][text()=' 10% ']"));
    public static final Target Tiempo = Target.the("tiempo para pagar la cuota (Mayor a 5 años y menor a 20 años)")
            .located(By.xpath("//INPUT[@id='valor-year']"));
    public static final Target Fecha = Target.the("Click en el campo Fecha")
            .located(By.xpath("//INPUT[@id='campo-fecha']"));
    public static final Target Fecha_Año = Target.the(" click en el año de naciemiento")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 1996 ']"));
    public static final Target Fecha_Mes = Target.the(" click en el mes de nacimiento")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' FEB ']"));
    public static final Target Fecha_Dia = Target.the(" Click en el dia de nacimiento")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 9 ']"));
    public static final Target Button_simular = Target.the("Seleccione el boton simular")
            .located(By.xpath("//BUTTON[@id='boton-simular']"));
    public static final Target indicado_datos = Target.the("click para verificar los datos")
            .located(By.xpath("//SPAN[@class='mat-expansion-indicator ng-tns-c18-13 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']"));




}
