

public class Ejercicio2 {

	public static void main(String[] args) {
	
			int arreglo[]= {5,10,20,30,43,20,12,12,120,102};
	
		
	
		System.out.println("El numeor mayor es:"+susecionmenor(arreglo, 0));
		
	}	public static int susecionmenor(int arr[], int indice) {
		
		int m=arr.length-1;
		int men;
		int temp;
		if (indice==m) {
			return men=arr[indice];
			
		}else {
			men=susecionmenor(arr, indice+1);
			if(arr[indice]<men) {
				temp=arr[indice];
			}else {
				temp=men;
			}
		}
		return temp;
	}

}
