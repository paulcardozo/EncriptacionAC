package cellularAutomata;

import java.util.Scanner;

public class Prototipo {

	public static void main(String[] args) {
		Boolean run =  true;
		CA cellular = new CA(30);
		Cryptography otp = new Cryptography();
		String mensajeEncriptado = "";
		do {
			Scanner sc = new Scanner(System.in);
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("********************************");
			System.out.println("1. Autómata Celular Generar Bits");
			System.out.println("2. Autómata Celular Generar Chars");
			System.out.println("3. Encriptación");
			System.out.println("4. Decriptación");
			System.out.println("5. Prueba de encriptación");
			System.out.println("6. Generador de datos Celular Autómata vs Java Math.Random()");
			System.out.println("********************************");
			System.out.println();
			int instruccion = sc.nextInt();
			if(instruccion == 1)
				cellular.generarBits();
			else if(instruccion == 2)
				cellular.generarCaracteres();
			else if(instruccion == 3) {				
				System.out.println("Número de regla: ");
				int regla = sc.nextInt();
				System.out.println("Insertar Mensaje: ");
				String mensaje = scan.nextLine();
				mensajeEncriptado = otp.encriptar(mensaje,regla);
			} else if(instruccion == 4) {
				System.out.println("Mensaje encriptado: "+mensajeEncriptado);
				otp.decrypt(mensajeEncriptado);
			} else if(instruccion == 5) {
				otp.pruebaDeEncriptación(1000);
			} else if(instruccion == 6) {
				String str = new String(
						"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed in faucibus enim, ac semper libero. Donec ut lorem quis ex porttitor pellentesque vitae non purus. Ut porttitor, nisl sed imperdiet ullamcorper, justo nisi faucibus quam, id suscipit odio sapien quis nisi. In nisi nisi, consectetur et tempus eu, sollicitudin maximus leo. Vestibulum dui ex, bibendum non euismod ac, posuere ut felis. Vivamus lobortis, erat in faucibus sodales, nisi dui elementum libero, vitae facilisis lacus erat ut velit. Quisque eget diam odio. Phasellus odio purus, venenatis at dui blandit, interdum eleifend sem."
								+ "Sed commodo dignissim faucibus. Nam eget vehicula lectus. Quisque et felis sem. Integer sagittis tempus faucibus. Proin fringilla maximus velit, quis rutrum dui cursus id. Nullam auctor augue non lobortis dignissim. Nullam iaculis mauris ultrices nisi iaculis vulputate. Aliquam lobortis quam sed ultricies ornare. Nulla et varius nisl, at tincidunt mi. Integer sodales sem in nibh efficitur, et mattis enim iaculis. Suspendisse ut magna faucibus, fermentum justo aliquam, feugiat turpis. Integer ac eros facilisis lectus tristique iaculis sed id felis. Curabitur tempus suscipit mi, et hendrerit lacus posuere eget. Sed convallis, libero sit amet rhoncus semper, dolor magna ultricies libero, in ornare tortor purus consectetur elit."
								+ "Aenean at urna erat. Donec nec quam sit amet mauris cursus auctor in in metus. Maecenas quis nisi turpis. Nulla facilisi. Pellentesque vehicula consectetur facilisis. Nam viverra tristique molestie. Fusce quis posuere tortor, pellentesque vehicula urna. Morbi congue nisi ut semper rutrum. Pellentesque eget mattis justo."
								+ "Vestibulum id sapien nisi. Aenean a odio tempor, molestie sapien nec, euismod tortor. Donec nibh erat, venenatis eu ornare quis, tristique hendrerit diam. Phasellus ornare, dui eget luctus efficitur, erat urna tempor ex, et suscipit risus dolor vel arcu. Praesent laoreet, est id rhoncus molestie, dolor nulla molestie dolor, eget dictum neque justo ut sapien. Ut viverra, massa ac vehicula tempor, mi est porta velit, quis gravida velit lorem ut nisl. Sed id rhoncus ante. Donec ac tincidunt massa."
								+ "Morbi et sem lacus. Ut tincidunt tortor eget turpis egestas vehicula. In hac habitasse platea dictumst. Praesent suscipit malesuada libero, in tincidunt lacus tristique aliquam. Phasellus efficitur sem vel bibendum sodales. Mauris imperdiet mauris eu mauris rutrum dignissim. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Quisque varius nulla ac rutrum finibus. Nullam ornare et diam sit amet vulputate. Donec consectetur volutpat rutrum. Pellentesque mauris dui, aliquet non egestas vitae, varius ac orci. Integer eget ante cursus, pharetra erat eu, condimentum quam. In hac habitasse platea dictumst. In quis porttitor nulla."
								+ "In varius vestibulum suscipit. Nam et rutrum orci. Nulla vehicula finibus sem, vel facilisis erat ullamcorper et. Suspendisse vitae lectus eu libero luctus pulvinar eu eget sapien. Praesent et sem ullamcorper, congue nulla nec, feugiat sem. Morbi sed lectus a ligula maximus hendrerit nec quis ipsum. Maecenas laoreet commodo sapien, rhoncus luctus sapien suscipit at. Fusce massa augue, congue eget interdum quis, rutrum vitae ipsum. Ut at purus odio."
								+ "Praesent accumsan varius urna at lacinia. Nunc urna lectus, vestibulum vel placerat quis, feugiat sed dui. Duis mattis diam eget rhoncus pretium. Curabitur vulputate sapien et pellentesque venenatis. Ut quis leo justo. Suspendisse potenti. Pellentesque ac leo et libero pretium dignissim quis eu lectus. Donec pulvinar nunc non blandit dictum. Integer ac aliquam nunc. Duis sed maximus magna, vulputate finibus sem. Quisque faucibus erat lectus. Donec eget felis non ipsum malesuada pharetra."
								+ "Quisque vel dui nisi. Donec ultricies pulvinar congue. Suspendisse egestas euismod tincidunt. Morbi laoreet, felis id fringilla suscipit, purus est malesuada turpis, ut ullamcorper dolor ex vitae orci. Sed cursus justo vitae leo dictum tempus. Donec ipsum urna, vestibulum a turpis sit amet, faucibus ultrices tortor. In eleifend euismod arcu ut cursus. Curabitur id urna eu elit ultrices mollis at non mi. Nulla turpis nunc, imperdiet non egestas rutrum, vehicula quis mauris. Curabitur at nulla eget mauris sollicitudin maximus."
								+ "Proin fermentum pharetra felis, ut fringilla dolor facilisis et. Aenean lectus neque, mattis quis tempus at, consectetur id nisl. Quisque a lacus id ipsum rhoncus ornare. Vivamus sapien dolor, suscipit vel aliquam ac, pellentesque nec turpis. Quisque sed accumsan mauris. Maecenas bibendum tempor turpis nec placerat. Fusce commodo justo quis diam gravida, id faucibus ante euismod. Nam ultricies felis fermentum orci fringilla elementum. Cras eu magna in dui blandit gravida et eu diam. Vivamus ultricies sit amet felis id tincidunt. Sed quis ultrices est, vitae congue lectus. Sed hendrerit, turpis nec blandit feugiat, mauris risus porttitor orci, eu congue neque neque in odio. Nullam nisl dui, blandit et consequat id, vulputate quis augue. Donec at bibendum ex, ut pharetra eros. Fusce hendrerit ex a nisi pellentesque, eget gravida sem iaculis."
								+ "Aenean ac orci mi. In id vehicula mi. Maecenas felis ante, condimentum pretium pharetra at, pellentesque eu lectus. Quisque pellentesque sagittis leo non maximus. Sed sagittis neque sed ante sodales aliquet. Quisque vel porta diam. Aenean euismod efficitur urna sed finibus. Vivamus semper leo diam, pulvinar pharetra lectus elementum at. Nunc a justo laoreet, mattis enim et, porttitor dolor."
								+ "Donec cursus erat congue eros tristique tempus. Donec a nulla eu sem pharetra scelerisque a vel neque. Nunc id risus ac risus feugiat congue. Duis vitae nunc nec erat tempor condimentum et eu nibh. Fusce gravida urna et interdum condimentum. Aliquam gravida accumsan orci, ac dapibus nibh porttitor ut. Nam venenatis, quam ac consectetur viverra, nibh felis laoreet nisi, sit amet aliquam ex lectus nec nibh. Quisque vitae quam sit amet dui ultricies malesuada nec eget nisi. Ut sed libero metus. Donec convallis feugiat vulputate."
								+ "Ut aliquam, ante consequat bibendum fringilla, lorem ligula pharetra nisl, in tristique sapien ligula ut lectus. Quisque ultricies bibendum nisl ut pharetra. Mauris eu sapien aliquet, tristique dolor in, rutrum felis. Sed rhoncus ex orci, ac iaculis neque maximus sed. Maecenas ac est ac neque porttitor iaculis. Nunc metus risus, volutpat a libero sit amet, tristique maximus erat. Integer volutpat, velit sit amet sodales commodo, erat elit tristique mi, sit amet congue leo purus quis tellus. Fusce convallis turpis quis sagittis imperdiet."
								+ "Donec egestas auctor lectus, quis accumsan orci volutpat eget. Curabitur ornare arcu vel dictum mollis. Proin rhoncus eget diam id consequat. In nec congue enim, ac tincidunt neque. Pellentesque eget justo tortor. Nulla interdum malesuada blandit. Nullam commodo non metus dictum tempus. Nam porttitor id tellus non mattis. Nunc ut condimentum nisl, nec fringilla tortor. Aliquam neque massa, convallis pellentesque nibh ut, accumsan commodo sem. Phasellus dictum lacinia sollicitudin. Curabitur lacinia dictum quam, et laoreet mi rhoncus et. Etiam auctor volutpat nibh, vel aliquam nisl. Ut congue id nunc eu placerat. In arcu augue, aliquam at lacinia ut, semper at justo."
								+ "Sed quis accumsan risus. Phasellus hendrerit velit eu tellus suscipit lacinia. Aenean laoreet posuere tellus id cursus. Nam volutpat lacus justo, eget tincidunt magna porttitor at. Suspendisse lobortis ut eros id rutrum. Morbi semper rhoncus eleifend. Donec consectetur dignissim purus, nec maximus dolor laoreet nec. Mauris tempor rutrum fringilla. Donec et orci quis augue sodales porta ut eget enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin rhoncus nulla ac eros fermentum egestas. Nam sodales eget purus id ornare. Praesent non erat ipsum. Suspendisse et risus et turpis condimentum auctor ut a ipsum. Integer tempor justo mauris, eget aliquet egestas.");
				otp.dataGenerator(str);
			}
		} while (run);
	}

}
