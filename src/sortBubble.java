/**
 * 
 */

/**
 * @author adam
 *	
 */
public class sortBubble
{
	int [] tablica;
	public sortBubble(int [] tablica)
	{
		this.tablica=tablica;
	}
	
	/*
	 *	Sortuje tablice uzywajac bubble sorta, czyli porownoje kolejne elementy, az do momentu, kiedy nie zostanie 
	 *	dokonana zadna zmiana przy przejsiu tablicy. 
	 */
	public void sortuj()
	{
		boolean zamienione = true;
		while(zamienione)
		{
			zamienione=false;
			for (int i = 0; i < tablica.length-1; i++)
			{
				if(tablica[i]>tablica[i+1])
				{	
					zamienione=true;
					tablica[i]^=tablica[i+1];
					tablica[i+1]^=tablica[i];
					tablica[i]^=tablica[i+1];
				}
			}
		}
	}
	
	/*
	 * wypisuje elementy tablicy
	 */
	public void wypisz()
	{
		for(int i=0;i<tablica.length;i++)
			System.out.println(tablica[i]);
	}
	
	public static void main(String[] args)
	{
		int [] tab = new int [10];
		tab[0]=-10;
		tab[1]=3;
		tab[2]=6;
		tab[3]=-7;
		tab[4]=-2;
		tab[5]=123;
		tab[6]=-4;
		tab[7]=5;
		tab[8]=2;
		tab[9]=6;
		sortBubble pierwsza = new sortBubble(tab);
		pierwsza.sortuj();
		pierwsza.wypisz();
	}
}

