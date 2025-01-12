package tools;
// El tipo char es capaz de almacenar un carácter
// internamente almacena un código entero siguiendo una tabla
// que asocia una representación con un valor.
// Para los dígitos '0' a '9' corresponde con los valores que históricamente
// se han usado en tabla ASCII (ver en la wiki) aunque realmente se codifican
// usando UTF8. 
// No debemos tener en cuenta estos códigos internos para hacer nuestro programas
// lo mejor es usar funciones de alto nivel que los realice por nosotros, para ello
// usaremos los wrapper Character y/o Integer
// Veamos varias formas de: Saber si un caracter es dígito y de obtener su valor

public class DeDigitoaEntero {

	public static void main(String[] args) {
		char digito0='0';
		char digito1='1';
		char digito2='2';
		int valor0=digito0; // Se produce un cast implícito
		System.out.println(valor0);
		// MÉTODO 1: 
		// El código de 0 es 48, de 1 49 y así sucesivamente
		// si resto un dígito del código de '0' consigo su valor numérico
		// pero no es muy recomendable (me baso en detalles de su funcionamiento
		// cuando debería usar una función de alto nivel y olvidar esos detalles)
		// - Para obtener su valor
		int valor1='1'-'0';
		System.out.println(valor1);
		// - Para saber si es un dígito
		if (digito0>='0' && digito0<='9') 
			System.out.println("METODO 1: Es un dígito ");
		// MÉTODO 2: Uso un wrapper de char, un wrapper se alimenta de un tipo primitivo 
		// y "digievoluciona" en un objeto.
		// El primer caso es de char a Character
		// - Para obtener su valor
		int valor2=Character.getNumericValue(digito2);
		System.out.println(valor2);
		// - Para saber si es digito (u otro tipo)
		if (Character.isDigit(digito2)) 
			System.out.println("MÉTODO 2: Es un dígito ");
		// MÉTODO 3: Uso de wrapper de int 
		// - Para obtener su valor
		valor2=Integer.parseInt(digito2+""); // Cuidado, me pide un String
		System.out.println(valor2);
	}

}
