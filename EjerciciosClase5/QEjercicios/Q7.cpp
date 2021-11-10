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
  for(i = 1; i < n ; i=i*2){
    cout<< "Ejercicio7"<<endl;

  }
  /*
     i       
     ------------------------
     1       
     1 * 2 = 2
     2 * 2 = 2^2
     2 * 2^2 = 2^3
     .    
     .    
     .    
     2^k
    Donde i >= n, por lo tanto i = 2^k
    2^k >= n
    2^k = n
    k = log_2(n)
  */
  return 0;
}

