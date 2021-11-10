/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descripcion: Complijidad del elemento es de O(log_2(n))
*/

#include<iostream>

using namespace std;

int main() {
  int n, i;
  cout<< "Ingresa el valor de n: ";cin>> n;
  for(i = n; i >= 1 ; i=i/2){ //max(1, 3(2^n)) = O(3*2^n) = O(2^n)
    cout<< "Ejercicio8"<<endl;
  }
  /*
    i       
    ------------------------
    n
    n / 2
    n / 2^2
    n / 2^3
    .
    .
    .
    n / 2^k

    Como i < 1
    por lo tanto n / 2^k < 1
    n / 2^k = 1
    n = 2^k
    k = log_2(n)
  */
  return 0;
}

