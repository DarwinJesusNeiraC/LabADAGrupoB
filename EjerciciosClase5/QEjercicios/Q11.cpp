/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descripcion: Complijidad del elemento es de O(log(log(p)))
*/

#include<iostream>

using namespace std;

int main() {
  int p = 0, n, i, j;

  cout<< "Ingresa el valor de n: ";cin>> n;
  for(i = 1; i < n; i = i * 2){
    p++; // p = log(n)
  }

  for(j = 1; j < p ; j = j * 2){ // O(log(p))
    cout<< "Ejercicio 11"<<endl;
  }

  // En total seria O(log(log(p)))

  return 0;
}

