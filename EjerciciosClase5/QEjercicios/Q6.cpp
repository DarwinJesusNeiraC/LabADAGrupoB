/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descripcion: Complijidad del elemento es de O(n^1/2)
*/

#include<iostream>

using namespace std;

int main() {
  int p = 0, i, n;
  cout<< "Ingresa el valor de n: ";cin>> n;
  for (i = 1; p <= n; i++) {
    cout<< "valor de p: " <<p<<endl;
    p = p + i;
  }

  /*
  // A6:
  //  i       p
  // ------------------------
  //  1       0 + 1 = 1
  //  2       1 + 2
  //  3       1 + 2 + 3
  //  4       1 + 2 + 3 + 4
  //  .    
  //  .    
  //  .    
  //  k       1 + 2 + 3 + 4 + ... + k

  Donde k > n & p > n
  p = k (k +1)/2
  k (k +1)/2 > n
  k² > n
  k > sqrt(n)
  O(n^1/2)
   * */
  return 0;
}

