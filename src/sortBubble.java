/**
 * 
 */

/**
 * @author adam
 *	
 */
public class sortBubble
{
	/*
	 *	Sortuje tablice uzywajac bubble sorta, czyli porownoje kolejne elementy, az do momentu, kiedy nie zostanie 
	 *	dokonana zadna zmiana przy przejsiu tablicy. 
	 */
	public static void sortuj(int [] dosortu)
	{
		boolean zamienione = true;
		while(zamienione)
		{
			zamienione=false;
			for (int i = 0; i < dosortu.length-1; i++)
			{
				if(dosortu[i]>dosortu[i+1])
				{	
					zamienione=true;
					dosortu[i]^=dosortu[i+1];
					dosortu[i+1]^=dosortu[i];
					dosortu[i]^=dosortu[i+1];
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int [] tablica = {9,8,7,6,5,4,3,2,1};
		sortuj(tablica);
		for (int i = 0; i < tablica.length; i++)
			System.out.println(tablica[i]);
	}
}

