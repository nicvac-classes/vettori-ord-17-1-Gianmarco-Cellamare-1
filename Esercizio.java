
import java.util.Scanner;

public static void visualizza (int[] V , int N){
    int i;
    i=0;
    while (i<=N-1){
        System.out.println(i+":"+V[i]);
        i++;
    }
}

public static void RicercaBinaria (int[]V, int N, int valore){
    int inzio,fine,medio,indice,numControlli;
    numControlli=0;
    indice=-1;
    inizio=0;
    fine=N-1;
    while ((inizio<=fine) and (indice == -1)){
        medio=inizio + (fine-inizio) /2;
        numControlli++;
        if (valore == V[medio]){
            indice=medio;
        }else{
            numControlli++;
            if(valore > V[medio]){
                inizio=medio+1;
            }else {
                fine=medio-1;
            }
        }
    }
}

public static void BubbleSortOtt (int[] V , int N){
    int i,j,cont,t;
    cont = 0;
    i=0;
    boolean scambio;
    scambio = true;
    while ((i<N-1) && (scambio)){
        scambio=false;
        j=0;
        while (j<=(N-2)-i){
            cont=cont+1;
            if (V[j] > V[j+1]){
                scambio=true;
                t=V[j];
                V[j]=V[j+1];
                V[j+1]=t;
            } 
        }
        i=i+1;
    }

public static void Merge (int[]V1,int[] V2, int d1, int d2 ){
    int d;
    int i1,i2;
    d=0;
    i1=0;
    i2=0;
    while (i1<d1 && i2<d2){
        if(V1[i1] <= V2[i2]){
            V[d] = V1[i1];
            i1++;
        }else{
            V[d] = V2[i2];
            i2++;
        }
        d++;
    }

    if(i1 < d1){
        V[d]=V1[i1];
        d++;

        i1++;
    }

        if(i2 < d2){
        V[d]=V2i2];
        d++;
        i1++;
    }
}


}

// Classe principale, con metodo main
class Esercizio {
    public static void main(String args[])
    {
        int;
        Scanner in = new Scanner( System.in );
        int i,N
        int [N] Vp;
        int [N] Vd;
        int Np,Nd;
        n1=0;
        n2=0;
        i=0;
        while (i<=N-1){
            x=random(x*10)*1;
            if (x%2==0){
                Vp[Np]=x;
                ++Np;
            }else {
                Vd[Nd]=x;
                ++Nd;
            }
        }

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md