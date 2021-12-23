/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: si las coincidencias de los de los sufijos y prefijos es igual, retornar las posiciones donde se da este envento
*/

#include<iostream>
#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

//numeros magicos
const ll mp1 = 31;
const ll mp2 = 37;

// Cantidad maxima a la que puede llegar n
const int maxN = 1e6 + 5; 

// Longitud de la cadena
int n;

// Al ser varios numeros requerimocs de un modulo
const ll mod = 1e9 + 7;

//
ll potencia1[maxN] , potencia2[maxN], ph1, ph2, sh1, sh2;

// Arreglo de char
char S [maxN];

int main() {
  //cin >> s;
  // cadad caracter es ingresado en le array de char
  scanf("%s", S); 
  //n = s.length();  
  /*for(int i = 0; i < s.length(); i++){
    S[i] = (char) s.substr(i,i+1);

  } */
  n = (int) strlen(S);  
  //cout << n <<endl;

  potencia2[0] = potencia1[0] = 1;
  // la cantidad de caracteres 
  for(int i = 1; i < n ; i++){
    potencia1[i] = (potencia1[i - 1] * mp1) % mod;
    potencia2[i] = (potencia2[i - 1] * mp2) % mod;
  }

    // seguimiento
  //cout<< "potencia1" <<endl;
  /*for(int i = 0; i < n; i++){
    cout<< potencia1[i] <<endl;
  }*/

  for(int i = 0; i < n-1; i++){
    // se usa 'a' para obtener el en las letras minusculas
    int left = (S[i] - 'a' + 1); // caracteres de la izquieda
    // como empezamos desde atras usadmos n
    int rigth = (S[n - i - 1] - 'a' + 1); // caracteres de la derecha

    // prefijos
    ph1 = (ph1  + left * potencia1[i]) % mod;
    ph2 = (ph2  + left * potencia2[i]) % mod;
    // sufijos
    sh1 = (sh1 * mp1 + rigth) % mod;
    sh2 = (sh2 * mp2 + rigth) % mod;

    // seguimiento
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

