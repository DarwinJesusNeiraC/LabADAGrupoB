/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: calcular el costo que nesesario , para reparar del so caminos de cirto numero de cuidades relacionadas
*/

#include<iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

// estructura Arista
struct Arista{
  // atributos de llegada , salida, y peso
  int inicio;
  int llegada;
  ll peso;
};

const int maxM = 2e5;
vector<Arista> data;
// el arreglo de parnert se usa para saber que aristas ya estan relacionadas
int parnert[maxM];
int n, m;

// el metodo comparar es util para ordenar el vector
bool comp(Arista a, Arista b){
  return a.peso < b.peso;
}

// mediante find encontraremos, al valor al que ya esta relacionado
int find (int i){
  if(parnert[i] == -1){
    return i;
  }

  parnert[i] = find(parnert[i]);
  return parnert[i];
}


// merge relaciona a las cuidades
bool merge(int a, int b){
  a = find(a);
  b = find(b);

  // si se obtiene que ya estna relacionados con anterioridad
  if(a == b){
    return false; // entonces retornaremos false
  } 

  // coso contrario , los relaiconamos y debolvemos true
  parnert[a] = b;
  return true;
}


int main() {
  ll count = 0; // cuenta la cantidad de peso usados
  int numsAristas = 0; // cuenta la cantidad de aristas usadas
  // ingreso de datos
  cin >> n;
  cin >> m;

  // llenado de datos de parnert
  for(int i = 0; i < n; i++) parnert[i] = -1;
  // ingreso de la relacion delas cuidades, y sus pesos
  for(int i = 0; i < m; i++){
    int a , b;
    ll c;
    cin >> a;
    cin >> b;
    cin >> c;
    data.push_back({a,b,c});
  }
  // ordenamientod del vector, para poder trabajarlo de mejor manera , haremos uso de comp ya que es la funcion mediante la que se ordena
  sort(data.begin(), data.end(), comp);
  
  // para cada aritsta haremos lo siguiente
  for(Arista a : data){
    if(merge(a.inicio, a.llegada)){ // evaluamos que no esten conectadas 
      count += a.peso; // agregamos su peso a count
      numsAristas++; //y aumentaremos el valor de numsAristas
    }
  }

  // el objetivo de numsAristas, es ssaber si se uso un total de n-1 aristas, ya que esta en la cantidad requerida para que todos este 
  // conectados
  if(numsAristas == (n - 1)){
    cout << count;
  }
  // si no estan todas conectadas entonces devolveremos imposible
  else {
    cout << "IMPOSSIBLE";
  }

  return 0;
}

