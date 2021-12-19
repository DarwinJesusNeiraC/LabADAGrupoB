/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: calcular la ruta más corta las distiintas cuidades
*/

#include<iostream>
#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
const int maxN = 1e5;

// estructuras usadas
struct Arista{
  int conection;
  ll peso;
};

struct Nodo{
  int indice;
  ll distance;
  friend bool operator<(const Nodo &a, const Nodo &b){
    return a.distance > b.distance;
  };
};

// creacion de variables
int n, m;
ll distancias[maxN];
vector<Arista> conectando [maxN];
priority_queue<Nodo> data;

int main() {
  // ingreso de datos inciales
  cin >> n;
  cin >> m;
  for(int i = 0; i < m; i++){
    int a, b;
    ll c;
    cin >> a;
    cin >> b;
    cin >> c;
    --a;
    --b;
    conectando[a].push_back({b, c}); //agregnado los valores al vector, si tiene más de una salida se ordenaran en el orden que se ingresar
  }

  // vertice es como una tabla hash
  memset(distancias, 0x3f, sizeof(distancias)); // llenando el vertice de distancias
  distancias[0] = 0;
  data.push({0,0});

  while(!data.empty()){ // mientras que el nuestra cola de priority_queue no este vacia
    ll d = data.top().distance; // extraeremos la distancia
    int u = data.top().indice; // y su indice
    data.pop(); // y lo removeremos 

    if(d > distancias[u]){ // si el valor de 'd' es mayor al que esta en el vector de distancias[u] lo salteremos
      continue;
    }

    for(Arista a : conectando[u]){ // recorremos cada artista que este en el vector
      ll x = d + a.peso;  // el peso de donde viene más del de la arista
      if(distancias[a.conection] > x){ // el distancia que tiene es mayor al de x
        distancias[a.conection] = x; // lo reemplazaremos 
        data.push({a.conection, x});// agremaos el a la  priority_queue
      }
    }
  }

  // impresion de los valores
  for(int i = 0; i < n; i++){
    cout << distancias[i] <<" ";
  }

  return 0;
}

