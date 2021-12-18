//comentarios

#include<iostream>
#include <bits/stdc++.h>
typedef long long ll;
const int maxN = 500; 
ll arr[maxN][maxN];
int n, m , q;
using namespace std;

int main() {
  cin >> n;
  cin >> m;
  cin >> q;
  memset(arr, 0x3f, sizeof(arr));
  for(int i = 0; i < m; i++){
    ll a, b, c;
    cin >> a;
    cin >> b;
    cin >> c;
    --a;
    --b;
    //cout << a;
    //cout << b;
    arr[a][b] = min(arr[a][b], c);
    arr[b][a] = min(arr[b][a], c);
  }
  for(int i = 0; i < n ; i++){
    arr[i][i] = 0;
  }

  for(int k = 0; k < n; k++){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        arr[i][j] = min(arr[i][j], (arr[i][k] + arr[k][j]));
      }
    }
  }
  
  for(int i = 0; i < q ; i++){
    int a , b;
    cin >> a;
    cin >> b;
    --a;
    --b;
   // cout << a;
    //cout << b;
    if(arr[a][b] >= 1e18){
      cout << -1<<endl;
    }
    else{
      cout << arr[a][b]<<endl;
    }
  }


  return 0;
}

