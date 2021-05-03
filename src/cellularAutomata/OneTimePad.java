package cellularAutomata;

public class OneTimePad {
	
	public int[] longCharsBinario;
	public int length;
	public int lengthCA;
	public String binaryResult;
	
	public OneTimePad() {
		longCharsBinario = new int [10000];
		length = 0;
	}
	
	private String stringToBoolean(String mensaje) {
		char[] array = mensaje.toCharArray();
		binaryResult="";
		length = array.length;
		for(int i = 0; i<length;i++) {
			binaryResult += Integer.toBinaryString(array[i]);
			longCharsBinario[i] = Integer.toBinaryString(array[i]).length();
			lengthCA+=longCharsBinario[i]-1;
			//System.out.println(array[i]+" "+longCharsBinario[i]);
		}
		//System.out.println("Cant. caracteres: "+length);
		int tamBinario = lengthCA+length;
	//	System.out.println("Tamaño vector: "+tamBinario);
		return binaryResult;
	}
	
	private String xorChar(String message, String key) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<key.length(); i++) {
			sb.append(charOf(bitOf(message.charAt(i)) ^ bitOf(key.charAt(i))));
		}
		String result = sb.toString();
		return result;
	}
	
	private String xorMessage(String ca) {
		int cont = 0, contCA = 0;
		String resultado = "";
		String aux="";
		String auxCA = "";
		for(int i = 0; i<length; i++) {
			aux = binaryResult.substring(cont+1, cont+longCharsBinario[i]);
			auxCA = ca.substring(contCA, contCA+longCharsBinario[i]-1);
			cont+=longCharsBinario[i];
			contCA+=longCharsBinario[i]-1;
			resultado+=("1"+xorChar(aux, auxCA));
		}
		return resultado;
	}
	
	private boolean bitOf(char in) {
		return (in == '1');
	}
	
	private char charOf(boolean in) {
		return (in) ? '1':'0';
	}
	
	public void encrypt(String message){
		CA cellular = new CA(30);
	    stringToBoolean(message);
	    String resC = cellular.returnBits(lengthCA);
	    String encrypted = xorMessage(resC);
	    String result="";
	    int cont = 0;
	    for(int i = 0; i<length; i++) {
			String aux = encrypted.substring(cont, cont+longCharsBinario[i]);
			int parseInt = Integer.parseInt(aux, 2);
			result+=(char)parseInt;
			cont+=longCharsBinario[i];
		}
	    System.out.println("Mensaje encriptado: "+result);
	    System.out.println("parranda");
	}
	/*
	public static void main(String args[]){
	       String str = new String("Este es un mensaje de prueba");
	       System.out.println("Mensaje origninal: "+str);
	       OneTimePad otp = new OneTimePad();
	       otp.encrypt(str);
	   }
	   */
}
