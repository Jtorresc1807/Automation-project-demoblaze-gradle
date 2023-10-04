package co.com.auto.project.demoblaze.gradle.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class PaginaDemoblaze extends PageObject {
    public static final Target BTN_SIGNUP = Target.the("Boton Registro").located(By.xpath("//a[@id='signin2']"));
    public static final Target TXT_USUARIO = Target.the("Ingresar Usuario").located(By.xpath("//input[@id='sign-username']"));
    public static final Target TXT_CLAVE = Target.the("Ingresar clave").located(By.xpath("//input[@id='sign-password']"));
    public static final Target BTN_SIGN_UP = Target.the("Boton Registrar").located(By.xpath("//button[contains(text(), 'Sign up')]"));
    public static final Target BTN_LOGIN1 = Target.the("Boton Login").located(By.xpath("//a[@id='login2']"));
    public static final Target TXT_USUARIO_ING = Target.the("Ingresar Usuario Login").located(By.xpath("//input[@id='loginusername']"));
    public static final Target TXT_CLAVE_ING = Target.the("Ingresar Clave Login").located(By.xpath("//input[@id='loginpassword']"));
    public static final Target BTN_LOGIN = Target.the("Boton Login2").located(By.xpath("//button[contains(text(), 'Log in')]"));
    public static final Target LBL_WELCOME = Target.the("Verificar Ingreso").located(By.xpath("//a[contains(text(), 'Welcome Userr4')]"));
    public static final Target BTN_CELLPHONE = Target.the("Escoger Phone").located(By.xpath("//a[contains(text(), 'Samsung galaxy s7')]"));
    public static final Target BTN_ADDTOCART = Target.the("Agregar Phone al carrito").located(By.xpath("//a[@onclick='addToCart(4)']"));
    public static final Target BTN_HOME = Target.the("Ir a home").located(By.xpath("//a[contains(text(), 'Home ')]"));
    public static final Target BTN_LAPTOPS = Target.the("Ir a Laptops").located(By.xpath("//a[contains(text(), 'Laptops')]"));
    public static final Target BTN_MACBOOK = Target.the("Escoge Laptop").located(By.xpath("//a[contains(text(), 'MacBook Pro')]"));
    public static final Target BTN_ADDTOCART2 = Target.the("Agregar Macbook al carrito").located(By.xpath("//a[contains(text(), 'Add to cart')]"));
    public static final Target BTN_MONITORS = Target.the("Ir a Monitors").located(By.xpath("//a[contains(text(), 'Monitors')]"));
    public static final Target BTN_MONITOR = Target.the("Escoge Monitor").located(By.xpath("//a[contains(text(), 'Apple monitor 24')]"));
    public static final Target BTN_ADDTOCART3 = Target.the("Agregar Monitor al carrito").located(By.xpath("//a[contains(text(), 'Add to cart')]"));
    public static final Target BTN_CART = Target.the("Ir al carrito").located(By.xpath("//a[@id='cartur']"));
    public static final Target BTN_PLACEORDER = Target.the("Realizar pedido").located(By.xpath("//button[@class='btn btn-success']"));
    public static final Target TXT_NAME = Target.the("Digitar Nombre").located(By.xpath("//input[@id='name']"));
    public static final Target TXT_COUNTRY = Target.the("Digitar pais").located(By.xpath("//input[@id='country']"));
    public static final Target TXT_CITY = Target.the("Digitar Ciudad").located(By.xpath("//input[@id='city']"));
    public static final Target TXT_NUM_CREDIT_CARD = Target.the("Digitar numero de Tarjeta").located(By.xpath("//input[@id='card']"));
    public static final Target TXT_MONTH = Target.the("Digitar mes de la Tarjeta").located(By.xpath("//input[@id='month']"));
    public static final Target TXT_YEAR = Target.the("Digitar año de la Tarjeta").located(By.xpath("//input[@id='year']"));
    public static final Target BTN_PURCHAASE = Target.the("Realizar Compra").located(By.xpath("//button[contains(text(), 'Purchase')]"));

}


