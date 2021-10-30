// Review of Time Complexity
// Q1: What is the time complexity of
 
for (i = 0; i < n; i++) { 
    statement;            
}



// A1: O(n)
for (i = 0; i < n; i++) {   //max(3n,1) = O(3n) = O(n) 
    statement;               
}


->Resultado Q1 = O(n)


----------------------------------------------------------------


// Q2: What is the time complexity of
for (i = n; i > 0; i--) { 
    statement;
}



// A2: O(n)

for (i = n; i > 0; i--) {  //max(3n,1) = O(3n) = O(n)
    statement;
}


->Resultado Q2 = O(n)


----------------------------------------------------------------

// Q3: What is the time complexity of
for (i = 0; i < n; i=i+2) { //max()
    statement;
}

// como el programa va avanzando de 2 en 2 inciando en 0 tenemos que avanzar en pares 

0 2 4 6 ... n - 2


// A3: O(n)
// It can be 2, 20, etc
for (i = 0; i < n; i=i+2) { // max(1,3(n-2) = O(3n-6) = O(n)
    statement;              
}


->Resultado Q3 = O(n)
 
----------------------------------------------------------------


// Q4: What is the time complexity of
for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
        statement;
    }
}


// entonces n * n = n²
for (i = 0; i < n; i++) { //max(2,n) = n    
    for (j = 0; j < n; j++) { //max(1,3n) = O(n)
        statement;              
        cout << "i" << '\n';
    }
}


->Resultado Q4 = O(n²)

----------------------------------------------------------------

// Q5: What is the time complexity of
for (i = 0; i < n; i++) {
    for (j = 0; j < i; j++) {
        statement;
    }
}

// A5: 
// Tracing the values of the variables
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

En este progrma ma se idnetifica una depencia de la segunda instruccion a la primera
siendo especificamente por la por la condicion de j < i,dado el ejemplo mostrado anteriormente
podemos concluir lo siguiente

// 1 + 2 + 3 + ... + n = n * (n + 1) / 2    
O( (n²+n) / 2 ) sacamos las constantes
O (n²+n) aqui sacamos los los datos menos significativos
obteneiendo O(n²)

->Resultado Q5 = O(n²)

----------------------------------------------------------------

// Q6: What is the time complexity of
p = 0
for (i = 1; p <= n; i++) {
    p = p + i;
}


// A6:
//  i       p
// ------------------------
//  1       0 + 1 = 1
//  2       1 + 2
//  3       1 + 2 + 3
//  4       1 + 2 + 3 + 4
//  .    
//  .    
//  .    
//  k       1 + 2 + 3 + 4 + ... + k

En este caso lo que se hace la condicion "p <= n" y como el resultado de ciclo es
la suma de p más el valor de i, como se vio en la tabbla anterior para cada valor
de i el valor de p es la suma de todos los numeros desde 1 hasta el mismo.

// Assume k > n
// p = k * (k + 1) / 2
//               p > n
// k * (k + 1) / 2 > n
Aqui sacmos los valores menos significativos y las constantes
// k^2 > n
// k > sqrt(n)

->Resultado Q5 = O(n^1/2)

----------------------------------------------------------------

// Q7: What is the time complexity of
for (i = 1; i < n; i = i*2) {
    statement;
}


// A7:
//  i       
// ------------------------
//  1       
//  1 * 2 = 2
//  2 * 2 = 2^2
//  2 * 2^2 = 2^3
//  .    
//  .    
//  .    
//  2^k

En este caso como la valor inicial es i = 1, despues se van adelantando multiplicando 2 veces su valor 
al tener este patron se va acumulando 2^k.

// Assume i >= n
// Therefore i = 2^k
Aplicando logaritmos
//      2^k >= n
//       2^k = n
//         k = log_2(n)

->Resultado Q6 = O(log_2(n))


----------------------------------------------------------------

 En esta parte se hace una compracion de algunos algorimto

// Comparing
for (i = 1; i <= n; i++) {
    statement;
}

// i = 1 + 1 + 1 + ... + 1 = n
//     -------------------
//           k = n

for (i = 1; i < n; i = i*2) {
    statement;
}

// i = 1 * 2 * 2 * ... * 2 = n
//     -------------------
//           2^k = n
//             k = log_2(n)



for (i = 1; i < n; i = i*2) {
    statement;          // log(n)
}

//  n = 8       
//  i       
// ------------------------
//  1
//  2
//  4
//  8 ❌ 
// It is repeated 3 times



//  n = 10
//  i       
// ------------------------
//   1
//   2
//   4
//   8 
//  16 ❌ 
// It is repeated 4 times


// log_2(8) = 3
// log_2(10) = 3.322
// So we must apply the ceil to log_2(n)

----------------------------------------------------------------

// Q8: What is the time complexity of
for (i = n; i >= 1; i = i/2) {
    statement;
}


//  i       
// ------------------------
//  n
//  n / 2
//  n / 2^2
//  n / 2^3
//  .
//  .
//  .
//  n / 2^k

En este caso al igual que en la parte Q6, y se realiza una multiplicacion sucesiva solo que enste caso se iniciliza con
el valor maximo es decir "n" y se va diviendo entre este valor hasta que sea menor a 1

// Assume that i < 1
// Therefore n / 2^k < 1
//           n / 2^k = 1
//                 n = 2^k
//                 k = log_2(n)

Obteniendo como resultado

// A8: O(log_2(n))

----------------------------------------------------------------

// Q9: What is the time complexity of
for (i = 0; i * i < n; i++) {
    statement;
}

Como se esta dando a conocer debido a la siguiente condicion
// Condition       i * i < n
entonces para que la finalize este programa se requiere que se cumpla 
// To finish       i * i >= n
// We assume that     i^2 = n
//                      i = sqrt(n)
Oteniendo como resultado
// A9: O(sqrt(n))


----------------------------------------------------------------

// Q10: What is the time complexity of
for (i = 0; i < n; i++) {
    statement;
}

for (j = 0; j < n; j++) {
    statement;
}



for (i = 0; i < n; i++) {
    statement;          // n
}

for (j = 0; j < n; j++) {
    statement;          // n
}
                        // 2 * n

En este caso son 2 for independientes unos del otro por lo que el timpo de cada uno es de O(n)
obtenido como resultaod final O( 2 * n )  es decir O(n)

-> Resultado =  A10: O(n)

----------------------------------------------------------------

// Q11: What is the time complexity of
p = 0
for (i = 1; i < n; i = i * 2) {
    p++;
}

for (j = 1; j < p; j = j * 2) {
    statement;
}


// A11:
p = 0
// (2)
for (i = 1; i < n; i = i * 2) {
    p++;                    // p = log(n)
}

// (1)
for (j = 1; j < p; j = j * 2) {
    statement;              // log(p)
}

Primero se resolvemos (1) el este for dado que este es el valor dependiente del anterior
y como vimos en ocasiones pasadas el tiempo de este tipo de for es log(p)

Posteriormente resolvemos (2) donde tenemos que el valor de p sera igual al resultado del tiempo
de esta recurrencia es decir log(n)

// So, we have log(p) and p = log(n)
// replacing log log(n)

Entonces tendriamos log(p) = log(log(n))
-> Resultado: O(log log(n))


----------------------------------------------------------------

// Q12: What is the time complexity of
for (i = 0; i < n; i++) {
    for (j = 1; j < n; j = j * 2) {
        statement;
    }
}


// A12: 
for (i = 0; i < n; i++) {            // (1)
    for (j = 1; j < n; j = j * 2) {  // (2)
        statement;                   // (3)
    }
}

Sacamos el valor el valor del for aninado que no tiene dependencia del de afuera por lo tanto su valor 
sera igual al que ya conocemos es decir log(n) mientas que el de afuera tendra un valor lineal
multiplicando su tiempos obtendremos O( n * log(n))

// (1) This repeats n times
// (2) and this inner loop n times * log(n)
// (3) and this statement n times * log(n) 
// Adding them together n + 2 n * log(n)


->  Resultado: O(n log(n))

----------------------------------------------------------------


// Review
for (i = 0; i < n; i++)       // O(n)


for (i = 0; i < n; i=i+2)     // O(n)


for (i = n; i >= 1; i--)      // O(n)


for (i = 1; i < n; i=i*2)     // O(log_2(n))


for (i = 1; i < n; i=i*3)     // O(log_3(n))


for (i = n; i >= 1; i=i/2)    // O(log_2(n))

