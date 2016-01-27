
public class Principal {

	public static void main(String[] args) {
		int numeros[]={1,4-5,3,0,5};
		float media=0;
		
		for(int i=0;i<numeros.length;i++){
			media=media+numeros[i];
			System.out.println(media);
		}
		
		System.out.println(media/numeros.length);
	}

}
