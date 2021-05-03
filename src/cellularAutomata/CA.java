package cellularAutomata;

public class CA {

	public static boolean[] automatas = new boolean[240];
	public static boolean[] regla = new boolean[8];

	public CA(int nroRegla) {
		//El constructor de la clase almacena las reglas 
		//correspondientes al número de regla especificado
		if (nroRegla < 256) {
			String bin = Integer.toBinaryString(nroRegla);
			int aux = 0;
			for (int i = 0; i < 8; i++) {
				if (i < 8 - bin.length())
					regla[i] = false;
				else {
					if (bin.charAt(aux) == '0')
						regla[i] = false;
					else
						regla[i] = true;
					aux += 1;
				}
			}
			automatas[automatas.length/2]=true;
		}
	}
	
	public void showAutomata() {
		for(int i=0; i<automatas.length;i++)
			System.out.print(automatas[i]? "1":"0");
	}
	
	public void binarytoChar() {
		//Código para generar ASCII del 32 al 255
		for(int i = 0; i<automatas.length/8;i++) {
			String a = "";
			a = a.concat(automatas[8*i]? "1":"0");
			a = a.concat(automatas[(8*i)+1]? "1":"0");
			if(automatas[8*i] == false && automatas[8*i+1] == false) {
				a = a.concat("1");
			} else {
				a = a.concat(automatas[(8*i)+2]? "1":"0");
			}
			a = a.concat(automatas[(8*i)+3]? "1":"0");
			a = a.concat(automatas[(8*i)+4]? "1":"0");
			a = a.concat(automatas[(8*i)+5]? "1":"0");
			a = a.concat(automatas[(8*i)+6]? "1":"0");
			a = a.concat(automatas[(8*i)+7]? "1":"0");
			System.out.print((char)Integer.parseInt(a, 2)+" ");
		}
	}
	
	public String evolucion() {
		boolean aux = false, aux1 = false, ini = false;
		String bits = "";
		for(int i=0; i<automatas.length;i++) {
			if(i>0 && i<automatas.length-1) {
				aux1 = automatas[i];
				automatas[i] = selecRegla(aux,automatas[i],automatas[i+1]);
				bits = bits.concat(automatas[i]? "1":"0");
				aux = aux1;
			} else {
				if(i==0) {
					ini = aux = automatas[i];
					automatas[i] = selecRegla(automatas[automatas.length-1],automatas[i],automatas[i+1]);
					bits = bits.concat(automatas[i]? "1":"0");
				} else {
					automatas[i] = selecRegla(aux, automatas[i], ini);
					bits = bits.concat(automatas[i]? "1":"0");
				}
			}
		}
		return bits;
	}

	public boolean selecRegla(boolean x, boolean y, boolean z) {
		String aux = x ? Integer.toString(0) : Integer.toString(1);
		aux=aux.concat(y ? Integer.toString(0) : Integer.toString(1));
		aux=aux.concat(z ? Integer.toString(0) : Integer.toString(1));
		return(regla[Integer.parseInt(aux, 2)]);
	}
	
	public String returnBits(int n) {
		int j = (int) (Math.random()*1000);
		String s = "";
		for(int i=0; i<2000+j; i++) {
			s=evolucion();
		}
		int rows = ((n-1)/240)+1;
		for(int i = 0; i<rows; i++) {
			s=s+evolucion();
		}
		return s.substring(0, n);
	}
	
	public void generarCaracteres() {
		for(int i=0; i<30; i++) {
			binarytoChar();
			System.out.println();
			evolucion();
		}
	}
	
	public void generarBits() {
		for(int i=0; i<30; i++) {
			System.out.println(evolucion());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CA cellular = new CA(30);
		cellular.generarBits();
	}
}
