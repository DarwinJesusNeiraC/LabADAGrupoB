/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descripcion: Complijidad del elemento es de O(n²)
*/

#include<iostream>

using namespace std;

int main() {
  int i;
  int j;
  for(i = 0; i < 4; i++){ // max(n,2) = n  entonces n * n = O(n²)
    for(j = 0; j< 4; j++){// max(1, 3n) = O(n)
      cout<< i << "-" <<j <<endl;
    }
  }

  return 0;
}

