/**
 * 
 * @author <b>Bocco Jacopo</b>
 *
 * <U>4ªBI</U>
 * <i>13/5/2022</i>
 */
public class BoccoJacopoClass 
{
	/**
	 * 
	 * @param s indice iniziale: numero intero 
	 * @param f indice finale: numero intero
	 * @return r: numero intero, si trova moltiplicando i valori compresi tra l'indice s ed f
	 */
	public int boccoMet(int s,int f)
	{
		int r=1;//r parte da 1
		//i deve partire da s e deve essere minore di f
		for(int i=s;i<f;i++) //i incrementa
		{
			r =(r*i);	//r deve essere moltiplicato per il valore di i
		}
		return r;			
	}
	
	
	public static void main(String[] args) 
	{
		BoccoJacopoClass b = new BoccoJacopoClass();
		BoccoJacopoClass b1 = new BoccoJacopoClass();
		BoccoJacopoClass b2 = new BoccoJacopoClass();
		
		System.out.println(b.boccoMet(6, 9));
		System.out.println(b1.boccoMet(2,5));
		System.out.println(b2.boccoMet(3,7));
		
		
	}

}
