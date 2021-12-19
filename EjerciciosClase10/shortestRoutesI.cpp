//comentarios

#include<iostream>
#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
const int maxN = 1e5;

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

int n, m;
ll distancias[maxN];
vector<Arista> conectando [maxN];
priority_queue<Nodo> data;

int main() {
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
    conectando[a].push_back({b, c});
  }

  memset(distancias, 0x3f, sizeof(distancias));
  distancias[0] = 0;
  data.push({0,0});
  while(!data.empty()){
    ll d = data.top().distance;
    int u = data.top().indice;
    data.pop();

    if(d > distancias[u]){
      continue;
    }

    for(Arista a : conectando[u]){
      ll x = d + a.peso; 
      if(distancias[a.conection] > x){
        distancias[a.conection] = x;
        data.push({a.conection, x});
      }
    }
  }

  for(int i = 0; i < n; i++){
    cout << distancias[i] <<" ";
  }

  return 0;
}

