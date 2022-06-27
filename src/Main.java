/*
Crie um programa que recebe duas listas de números separadas por vírgula.
Criar uma terceira lista para unir as duas listas recebidas, eliminando os
itens repetidos. Imprimir a lista final em ordem decrescente.

Entrada:

    Lista 1 => 1,2,3,4
    Lista 2 => 2,5
    Saida: 5,4,3,2,1
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> conjuntoNumeros = new TreeSet<Integer>();

        System.out.println(" * Operação entre conjuntos\n * Digite os valores separados por vírgulas");
        System.out.print("Digite o conjunto A: ");
        String entrada1 = sc.nextLine();
        String[] entrada1Separada = entrada1.split(",");

        System.out.print("Digite o conjunto B: ");
        String entrada2 = sc.nextLine();
        String[] entrada2Separada = entrada2.split(",");

        for(String elemento : entrada1Separada){
            conjuntoNumeros.add(Integer.parseInt(elemento));
        }
        for(String elemento : entrada2Separada){
            conjuntoNumeros.add(Integer.parseInt(elemento));
        }

        TreeSet<Integer> inverso = (TreeSet<Integer>)conjuntoNumeros.descendingSet();

        StringJoiner saida = new StringJoiner(",");

        for(Integer numero : inverso){
            saida.add(Integer.toString(numero));
        }

        System.out.println("A ordem inversa do conjunto é C = {" + saida + "}");
    }
}