/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion:
*/

#include<iostream>
#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

//numeros magicos
const ll mp1 = 31;
const ll mp2 = 37;

// Cantidad maxima a la que puede llegar n
const int maxN = 1e6; 

// Longitud de la cadena
int n;

// Al ser varios numeros requerimocs de un modulo
const ll mod = 1e9;

//
ll potencia1[maxN] , potencia2[maxN], ph1, ph2, sh1, sh2;

// Arreglo de char
char S [maxN];

int main() {
  //cin >> s;
  scanf("%s", S); 
  //n = s.length();  
  /*for(int i = 0; i < s.length(); i++){
    S[i] = (char) s.substr(i,i+1);

  } */
  n = (int) strlen(S);  
  //cout << n <<endl;

  potencia2[0] = potencia1[0] = 1;
  for(int i = 1; i < n ; i++){
    potencia1[i] = (potencia1[i - 1] * mp1) % mod;
    potencia2[i] = (potencia2[i - 1] * mp2) % mod;
  }

  //cout<< "potencia1" <<endl;
  /*for(int i = 0; i < n; i++){
    cout<< potencia1[i] <<endl;
  }*/

  for(int i = 0; i < n-1; i++){
    int left = (S[i] - 'a' + 1);
    int rigth = (S[n - i - 1] - 'a' + 1);

    ph1 = (ph1  + left * potencia1[i]) % mod;
    ph2 = (ph2  + left * potencia2[i]) % mod;
    sh1 = (sh1 * mp1 + rigth) % mod;
    sh2 = (sh2 * mp2 + rigth) % mod;

    //cout << ph1 <<endl;
    //cout << ph2 <<endl;
    //cout << sh1 <<endl;
    //cout << sh2 <<endl;
    if(ph1 == sh1 && ph2 == sh2){
      printf("%d ", i + 1);
    }
  }

  return 0;
}

