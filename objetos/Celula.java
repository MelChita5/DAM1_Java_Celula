package objetos;

public class Celula {
	
	public String nombreReino;
	public int tamano; 
	public int reservaATP;
	public boolean estado; 
    public String hebraADN1;
    public String hebraADN2;
    
	public Celula(String nombreReino, int tamano, int reservaATP, boolean estado, String hebra1, String hebra2) {
		this.nombreReino = nombreReino;
		this.tamano = tamano;
		this.reservaATP = reservaATP;
		this.estado = estado;
		this.hebraADN1 = hebra1;
		this.hebraADN2 = hebra2;
	}
    
	//instancia de la clase celula1 para no proporcionar valores iniciales para sus atributos.
	
	public Celula() {
		
	}
	
	
	public void recibirMoleculasATP(int reservaTotal) {
		// reserva = reserva + reservaTotal
		this.reservaATP += reservaTotal;
	}
	
	public void crecer(int consumoATP) {
		// reserva = reserva - consumido{
		this.reservaATP -= consumoATP;
		
		//2 micrómetros por cada molécula.
		this.tamano += (2 * consumoATP);
		
	}
	
	public void dividirse() {
		
		//consume 10 moléculas de ATP y su tamaño se reduce a la mitad
		this.reservaATP -= 10;
		this.tamano /= 2;
		
		// se llevará la mitad del ATP de su madre
		int reservaATPhija = this.reservaATP / 2;
		
		
		
	}
	
	
	public boolean verificacionDaños() {
		// false = dañada
		//  "ATTC" y "TAAG" son correctas  
		//  A | T , T | A |                    | G | C , C | G
		
		char hebra1, hebra2;
		
		if(hebraADN1.length() > 0 && hebraADN2.length() > 0 && hebraADN1.length() == hebraADN2.length()) {
			 
			for(int i = 0; i < hebraADN1.length(); i++) {
				
				//comparaciones
				hebra1 = hebraADN1.charAt(i);
				
				hebra2 = hebraADN2.charAt(i);
				
				if (	
						(hebra1 == 'A' && hebra2 != 'T')||
						(hebra1 == 'T' && hebra2 != 'A')||
						(hebra1 == 'C' && hebra2 != 'G')||
						(hebra1 == 'G' && hebra2 != 'C')
						) {
					return false;
				}
				
			}
				
			return true;
		} 
		
		return false;
	
	
	}
}
