// Review of Time Complexity
// Q1: What is the time complexity of
 
for (i = 0; i < n; i++) { // O(1, 2n) = O(n)
    statement;            //O(n)
}



// A1: O(n)
for (i = 0; i < n; i++) {   // n + 1 
    statement;               // n
}






// Q2: What is the time complexity of
for (i = n; i > 0; i--) {
    statement;
}



// A2: O(n)




// Q3: What is the time complexity of
for (i = 0; i < n; i=i+2) {
    statement;
}

0 2 4 6 ... n - 2




// A3: O(n)
// It can be 2, 20, etc
for (i = 0; i < n; i=i+2) {
    statement;              // n/2
}




// Q4: What is the time complexity of
for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
        statement;
    }
}




// A4: O(n^2)
for (i = 0; i < n; i++) {       // n + 1
    for (j = 0; j < n; j++) {   // n * (n + 1)
        statement;              // n * n
        cout << "i" << '\n';
    }
}




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

// 1 + 2 + 3 + ... + n = n * (n + 1) / 2    
// O(n^2)











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

// Assume k > n
// p = k * (k + 1) / 2
//               p > n
// k * (k + 1) / 2 > n
// k^2 > n
// k > sqrt(n)
// O(n^(1/2))






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

// Assume i >= n
// Therefore i = 2^k
//      2^k >= n
//       2^k = n
//         k = log_2(n)
// O(log_2(n))





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


// Assume that i < 1
// Therefore n / 2^k < 1
//           n / 2^k = 1
//                 n = 2^k
//                 k = log_2(n)
// A8: O(log_2(n))








// Q9: What is the time complexity of
for (i = 0; i * i < n; i++) {
    statement;
}


// Condition       i * i < n
// To finish       i * i >= n
// We assume that     i^2 = n
//                      i = sqrt(n)
// A9: O(sqrt(n))










// Q10: What is the time complexity of
for (i = 0; i < n; i++) {
    statement;
}

for (j = 0; j < n; j++) {
    statement;
}


// A10: O(n)
for (i = 0; i < n; i++) {
    statement;          // n
}

for (j = 0; j < n; j++) {
    statement;          // n
}
                        // 2 * n












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


// So, we have log(p) and p = log(n)
// replacing log log(n)
// O(log log(n))









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


// (1) This repeats n times
// (2) and this inner loop n times * log(n)
// (3) and this statement n times * log(n) 
// Adding them together n + 2 n * log(n)
// O(n log(n))






// Review
for (i = 0; i < n; i++)       // O(n)


for (i = 0; i < n; i=i+2)     // O(n)


for (i = n; i >= 1; i--)      // O(n)


for (i = 1; i < n; i=i*2)     // O(log_2(n))


for (i = 1; i < n; i=i*3)     // O(log_3(n))


for (i = n; i >= 1; i=i/2)    // O(log_2(n))

