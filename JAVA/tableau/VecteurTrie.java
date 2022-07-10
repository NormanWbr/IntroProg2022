package tableau;

public class VecteurTrie {


	public static void main(String[] args) {
		int tab[]={1,0,45, -3, 34, -34,-340};
		int tab2[]={1,0,45, -3, 34, -34,-340};
		int tab3[]={1,0,45, -3, 34, -34,-340};
		affiche(tab);
		System.out.println("--------tri par insertion -----------");
		tri_insertion(tab);
		System.out.println("--------fin tri par insertion -----------");
		affiche(tab);
		System.out.println("******************************************");
		affiche(tab2);
		System.out.println("--------tri bulle -----------");
		triBulle(tab2);
		System.out.println("--------fin tri bulle -----------");
		affiche(tab2);
		System.out.println("******************************************");
		affiche(tab3);
		System.out.println("--------tri extraction -----------");
		triExtraction(tab3);
		System.out.println("--------fin tri extraction -----------");
		affiche(tab3);
		

	}
	public static void affiche(int toto[]){
		for(int i=0;i<toto.length;i++){
			System.out.print(toto[i]+"\t");
		}
		System.out.println("");
	}
	public static void tri_insertion(int[] t){
		int k, source, l;
		boolean trouve=false;
		for(k=1; k<t.length; k++){
			source=t[k];
			l=k-1;
			trouve=false;
			while (l>=0 && trouve==false){
				if(t[l]<source){ // je cherche le minimum
					trouve=true;
				}
				else{
					t[l+1]=t[l];
					l=l-1;
				}
			}
			t[l+1]=source;
				//affiche(t);
		}
	}
	public static void triBulle(int[] t){
		int inter, i,j;
		boolean echange;
		j=t.length -1;
		do{
			echange=false;
			for(i=0; i<=j-1; i++){
				if(t[i]>t[i+1]){ // si le suivant est plus petit on permute
					inter=t[i];
					t[i]=t[i+1];
					t[i+1]= inter;
					echange=true;
				}
			}
			j=j-1;
			//affiche	(t);
		} while(j>=0 && echange==true); // tant qu'on a permuté on recommence


	}

	public static void triExtraction(int[] t){
		int i, j, max, iMax;
		for(i=t.length-1;i>0; i--){ // on commence par le dernier
			iMax=0;
			max=t[0];
			for(j=1;j<=i;j++){
				if(t[j]>max){  // on recherhce le max
					iMax=j;
					max=t[j];
				}
			}
			t[iMax]=t[i]; 
			t[i]=max; // on place le max dans le dernier, puis l'avant dernier...
			//affiche(t);
		}
		
	}
}