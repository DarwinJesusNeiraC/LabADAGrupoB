/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descripcion: Complijidad del elemento es de O(sqrt(n))
*/
 
#include<iostream>

using namespace std;

int main() {
  int n, i;
  cout<< "Ingresa el valor de n: ";cin>> n;
  for(i = 0; i * i < n; i++){ //max(1, 3*(sqrt(n))) = O(3*sqrt(n)) = O(sqrt(n))
    cout<< "Ejercicio9"<<endl;
  }
  /*
   * i² < n
   * i² >= n
   * i² = n
   * i = sqrt(n)
  */

  return 0;
}

