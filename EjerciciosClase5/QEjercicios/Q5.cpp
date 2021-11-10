/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descripcion: Complijidad del elemento es de O(n²)
*/

#include<iostream>

using namespace std;

int main() {
  int i, j, n;
  cout << "Ingrese el valor de n: ";cin>>n;
  for(i = 0; i < n; i++){ // n * n = O(n²)
    for(j = 0; j< i; j++){// max(1, (n+1)/2) = O(n)
      cout<< i << "-" <<j <<endl;
    }
  }
  /*
  //  i   j      no of times
  // ------------------------
  //  0   0 ❌     0
  // ------------------------
  //  1   0 ✔️     1
  //      1 ❌     
  // ------------------------
  //  2   0 ✔️     2
  //      1 ✔️  
  //      2 ❌ 
  // ------------------------
  //  .    
  //  .    
  //  .    
  // ------------------------
  //  n             n
  * 
  * // 1 + 2 + 3 + ... + n = n * (n + 1) / 2    
  */
  
  return 0;
}

