

import java.util.Scanner;

public class Run {

		
		
			static String cad;
			static Scanner sc = new Scanner (System . in);
			public static void main(String[] args) {
				new Run().load();
				
			}
			private void process (String line) {
				String cad [] = line.split(" ");
				for(int cont=0;cont<cad.length;cont++){
					cad [cont] =cad [cont].toUpperCase();
				}
				
			}
			private void load () {
				
				while(sc.hasNext()) {
					process(sc.nextLine());
					
				}
			}
		}



