package com.company.ExArrays;

public class MetodosArrays {
    public float[] crearArray(float [] lista){
        for(int i=0;i<lista.length;i++){
            lista [i]=Float.parseFloat(JOptionPane.showInputDialog("teclea nota"));

        }
        return lista;

    }

    public static void amosar(float []lista){
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("***MENU***  \n1. for \n2 for each \n3 clase Arrays"));

        switch (op){
            case 1: for(int i=0; i<lista.length;i++)
                System.out.println("posicion" + i + "---->" +lista[i]);
                break;
            case 2: for(float elemento : lista)
                System.out.println(elemento);
                break;
            case 3: Arrays.toString(lista);
                break;

            case 4: Arrays.sort(lista);
                break;

            case 5: MetodosArrays.copiarLista(lista);
                break;

            default:
                System.out.println("Opción incorrecta");

        }

    }

    public static int buscarElemento(float[]lista){
        float eleBuscar=Float.parseFloat(JOptionPane.showInputDialog("teclea nota a buscar"));
        int posicion=0;
        int atopado=0;//non está
        for(int i=0;i<lista.length;i++){
            if(eleBuscar == lista[i]){
                System.out.println(eleBuscar + "Está na lista");
                posicion=i;
                atopado=1;
            }

            if(atopado==0){
                System.out.println("Non está");
                posicion = -1;
            }
        }

        return posicion;
    }

/*
        public static int comparar(float){
        float nel=Float.parseFloat(JOptionPane.showInputDialog("Teclea nota a buscar"));
        int i,aux=0,j;
        for(i=0;i<lista.length-1;i++){
        for(j=i+1;j<lista.legth;j++){
        }
        if(lista[i]>lista[j]){
            lista[j]=aux;
        }

    }
        return 0;
}*/

/* Utilizando a clase Arrays:
Arrays.sort(lista);

*/

    public static float[] ordenar(float[]lista){
        float aux;
        for(int i=0; i<lista.length-1; i++){
            for(int j=i+1; j< lista.length; j++){
                if (lista[i]>lista[j]){
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }


        }
        System.out.println("ordenar");

        return lista;

    }



    public static float[]copiarLista(float[]lista){
        lista=Arrays.copyOf(lista, 3);
        return lista;

    }

    public static float[] borrarElemento(float[]lista){

        int pos = MetodosArrays.buscarElemento(lista);
        if(pos<0)
            System.out.println("*** o elemento non está na lista *");
        else{
            for(int i=pos;i<lista.length-1;i++);
            int i = 0;
            lista[i]=lista[i+1];
            lista=Arrays.copyOf(lista, lista.length-1);
            return lista;


        }
        return null;
    }

    public static float[] engadir(float[] lista){
        lista=Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1]=Float.parseFloat(JOptionPane.showInputDialog("Que nota queres engadir"));


        return lista;
    }


    public void sair(){
        System.exit(0);
    }



}
