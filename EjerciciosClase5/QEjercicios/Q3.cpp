/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descripcion: Complijidad del elemento es de O(n)
*/

#include<iostream>

using namespace std;

int main() {
  int i;
  int n = 10;
  for(i = 0; i < n; i+=2){ 
    cout<<"Ejercicio3"<<endl;
  }
  /*
   * Como en este caso el programa avanza de 2 en 2 y iniciamos en 0 2 4 ...  n-2
   * al final tendriamos O(n/2) = O(n)*/

  return 0;
}

