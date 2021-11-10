//comentarios

#include<iostream>

using namespace std;

int main() {
  int i, j, n;
  cout<<"Ingresa el valor de n: ";cin>>n;
  for (i = 0; i < n; i++) {   // O(n)    
    for (j = 1; j < n; j = j * 2) { //n *log(n)
      cout<<"Ejercicio12"<<endl;
    }
  }
  // En total se tendria O(n * log(n))
  return 0;
}

