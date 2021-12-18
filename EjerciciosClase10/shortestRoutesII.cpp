/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: Dar como respuesta la menor ruta de las consultas ingresadas
*/

#include<iostream>
#include <bits/stdc++.h>
typedef long long ll;
const int maxN = 500;  // dato dado por el ejercicio
ll arr[maxN][maxN]; // declaracion del arreglo
int n, m , q; // variables usadas de ingreso de datos
using namespace std;

int main() {
  // declaracion de variables usadas 
  cin >> n;
  cin >> m;
  cin >> q;
  memset(arr, 0x3f, sizeof(arr)); // llenado del arreglo 
  for(int i = 0; i < m; i++){
    // ingreso de datos
    ll a, b, c;
    cin >> a;
    cin >> b;
    cin >> c;
    --a;
    --b;
    // cambiamos los valores del arreglo por los ingresados, verificando que sean menores al que ya esta 
    arr[a][b] = min(arr[a][b], c);
    arr[b][a] = min(arr[b][a], c);
  }
  // estableciendo la diagonal en 0
  for(int i = 0; i < n ; i++){ 
    arr[i][i] = 0;
  }

  // medinte lo siguiente escogeremos la menor ruta 
  for(int k = 0; k < n; k++){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        arr[i][j] = min(arr[i][j], (arr[i][k] + arr[k][j]));
      }
    }
  }
  
  for(int i = 0; i < q ; i++){
    // ingreso de las consultas
    int a , b;
    cin >> a;
    cin >> b;
    --a;
    --b;
  // impresion de los datos solicitados
    if(arr[a][b] >= 1e18){
      cout << -1<<endl;
    }
    else{
      cout << arr[a][b]<<endl;
    }
  }


  return 0;
}

