/**
 * 
 */
 
import java.util.Random;

/**
 * @author adam
 *	
 */
public class Sort
{
	private int [] tab;
	private Random rand;
	
	public Sort(int [] tab)
	{
		this.tab=tab;
		this.rand = new Random();
	}
	
	/**
	 * Zamienia dwa elementy tablicy
	 */
	private void swap(int a,int b)
	{
		int temp = tab[a];
		tab[a] = tab[b];
		tab[b] = temp;
	}
		
	
	/**
	 *	Sortuje tablice uzywajac bubble sorta, czyli porownoje kolejne elementy, az do momentu, kiedy nie zostanie 
	 *	dokonana zadna zmiana przy przejsiu tablicy. 
	 */
	public void bubblesort()
	{
		boolean zamienione = true;
		while(zamienione)
		{
			zamienione=false;
			for (int i = 0; i < tab.length-1; i++)
				if(tab[i]>tab[i+1])
					swap(i,i+1);
			
		}
	}
	
	/**
	 * Metoda sortujaca tablice za pomoca algorytmu quicksort.
	 */
	
	public void quicksort(int b, int e)
	{
		if(b==e)
			return;
		int b1  = b;
		int e1 = e;
		int i = tab[b];	//jak sie w Javie losuje jakas wartosc?
		while(b < e)
		{
			while(tab[b]<=i)
				b++;
			while(tab[e]>i)
				e--;
			tab[b]^=tab[e];
			tab[e]^=tab[b];
			tab[b]^=tab[e];
		}
		if(b==e)
			{quicksort(b1,b-1); quicksort(e,e1);}
		if(b > e)
			{quicksort(b1,b-1); quicksort(e+1,e1);}
	}
	
	/**
	 * wypisuje elementy tablicy
	 */
	public void wypisz()
	{
		for(int i=0;i<tab.length;i++)
			{System.out.print(tab[i]); System.out.print(" ");}
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
		int [] tab1 = tab;
		
		Sort bubblesort = new Sort(tab);
		bubblesort.bubblesort();
		bubblesort.wypisz();
		Sort quicksort = new Sort(tab1);
		quicksort.quicksort(0,tab1.length-1);
		System.out.println();
		quicksort.wypisz();
	}
}

