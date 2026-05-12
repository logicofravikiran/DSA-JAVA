#include <iostream>     // For input and output operations
#include <vector>       // For using vector container
#include <cstdlib>      // For rand() and srand()
#include <ctime>        // For time()
#include <omp.h>        // OpenMP library for parallel programming

using namespace std;

// Define size of array
#define SIZE 10000



// ========================================================
// Sequential Bubble Sort
// ========================================================
void bubbleSortSeq(vector<int>& arr) {

    int n = arr.size();   // Get size of array

    // Outer loop for passes
    for (int i = 0; i < n - 1; i++) {

        // Inner loop for comparison
        for (int j = 0; j < n - i - 1; j++) {

            // Compare adjacent elements
            if (arr[j] > arr[j + 1]) {

                // Swap if elements are in wrong order
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// ========================================================
// Parallel Bubble Sort
// ========================================================
void bubbleSortParallel(vector<int>& arr) {

    int n = arr.size();   // Get size of array

    // Run n passes
    for (int i = 0; i < n; i++) {

        // ================= EVEN PHASE =================
        // Compare:
        // (0,1), (2,3), (4,5)

        // Parallel loop
        #pragma omp parallel for
        for (int j = 0; j < n - 1; j += 2) {

            // Compare adjacent elements
            if (arr[j] > arr[j + 1]) {

                // Swap elements
                swap(arr[j], arr[j + 1]);
            }
        }

        // ================= ODD PHASE =================
        // Compare:
        // (1,2), (3,4), (5,6)

        // Parallel loop
        #pragma omp parallel for
        for (int j = 1; j < n - 1; j += 2) {

            // Compare adjacent elements
            if (arr[j] > arr[j + 1]) {

                // Swap elements
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// ========================================================
// Merge Function
// ========================================================
void merge(vector<int>& arr, int l, int m, int r) {

    // Create left subarray
    vector<int> left(arr.begin() + l,
                     arr.begin() + m + 1);

    // Create right subarray
    vector<int> right(arr.begin() + m + 1,
                      arr.begin() + r + 1);

    int i = 0;   // Index for left array
    int j = 0;   // Index for right array
    int k = l;   // Index for merged array

    // Merge smaller elements first
    while (i < left.size() && j < right.size()) {

        // Compare elements
        if (left[i] <= right[j]) {

            // Copy left element
            arr[k++] = left[i++];
        }
        else {

            // Copy right element
            arr[k++] = right[j++];
        }
    }

    // Copy remaining left elements
    while (i < left.size()) {

        arr[k++] = left[i++];
    }

    // Copy remaining right elements
    while (j < right.size()) {

        arr[k++] = right[j++];
    }
}

// ========================================================
// Sequential Merge Sort
// ========================================================
void mergeSortSeq(vector<int>& arr, int l, int r) {

    // Check valid range
    if (l < r) {

        // Find middle index
        int m = (l + r) / 2;

        // Sort left half
        mergeSortSeq(arr, l, m);

        // Sort right half
        mergeSortSeq(arr, m + 1, r);

        // Merge sorted halves
        merge(arr, l, m, r);
    }
}

// ========================================================
// Parallel Merge Sort
// ========================================================
void mergeSortParallel(vector<int>& arr,
                       int l,
                       int r,
                       int depth) {

    // Check valid range
    if (l < r) {

        // Find middle index
        int m = (l + r) / 2;

        // Stop creating more threads
        if (depth <= 0) {

            // Use sequential sorting
            mergeSortSeq(arr, l, m);
            mergeSortSeq(arr, m + 1, r);
        }
        else {

            // Run sections in parallel
            #pragma omp parallel sections
            {

                // First section
                #pragma omp section
                mergeSortParallel(arr,
                                  l,
                                  m,
                                  depth - 1);

                // Second section
                #pragma omp section
                mergeSortParallel(arr,
                                  m + 1,
                                  r,
                                  depth - 1);
            }
        }

        // Merge sorted halves
        merge(arr, l, m, r);
    }
}

// ========================================================
// Generate Random Numbers
// ========================================================
void generateRandom(vector<int>& arr) {

    // Traverse each element
    for (int& x : arr) {

        // Generate random number
        x = rand() % 100000;
    }
}

// ========================================================
// Main Function
// ========================================================
int main() {

    // Create vector of SIZE elements
    vector<int> arr(SIZE), temp;

    // Seed random generator
    srand(time(0));

    // Fill array with random numbers
    generateRandom(arr);

    double start, end;   // Variables for timing

    // ====================================================
    // Sequential Bubble Sort
    // ====================================================

    temp = arr;   // Copy original array

    start = omp_get_wtime();   // Start timer

    bubbleSortSeq(temp);       // Perform sorting

    end = omp_get_wtime();     // End timer

    cout << "Sequential Bubble Sort Time: "
         << (end - start)
         << " sec\n";

    // ====================================================
    // Parallel Bubble Sort
    // ====================================================

    temp = arr;

    start = omp_get_wtime();

    bubbleSortParallel(temp);

    end = omp_get_wtime();

    cout << "Parallel Bubble Sort Time: "
         << (end - start)
         << " sec\n";

    // ====================================================
    // Sequential Merge Sort
    // ====================================================

    temp = arr;

    start = omp_get_wtime();

    mergeSortSeq(temp, 0, SIZE - 1);

    end = omp_get_wtime();

    cout << "Sequential Merge Sort Time: "
         << (end - start)
         << " sec\n";

    // ====================================================
    // Parallel Merge Sort
    // ====================================================

    temp = arr;

    start = omp_get_wtime();

    // Depth = 4 means recursion creates parallel threads
    // up to 4 levels
    mergeSortParallel(temp, 0, SIZE - 1, 4);

    end = omp_get_wtime();

    cout << "Parallel Merge Sort Time: "
         << (end - start)
         << " sec\n";

    return 0;
}



// How to run :
// cd "C:\Users\Admin\OneDrive\Edu_Test\Desktop\LP-V\HPC"

// g++ parallel_bubble_merge.cpp -fopenmp -o parallel_bubble_merge

// .\parallel_bubble_merge.exe






/*

==========================================================
                    SAMPLE OUTPUT
==========================================================

Sequential Bubble Sort Time: 4.25 sec

Parallel Bubble Sort Time: 1.72 sec

Sequential Merge Sort Time: 0.012 sec

Parallel Merge Sort Time: 0.006 sec

==========================================================
NOTE:
- Actual timing may vary depending on CPU cores.
- Merge Sort is much faster than Bubble Sort.
- Parallel execution improves performance.
==========================================================

*/

/*

==========================================================
                THEORY OF SORTING & OPENMP
==========================================================

1) SORTING
----------------------------------------------------------
Sorting means arranging data in:
- Ascending order
- Descending order
Example:
Before Sorting:
5 2 8 1 3
After Sorting:
1 2 3 5 8


2) BUBBLE SORT
----------------------------------------------------------
Bubble Sort repeatedly compares adjacent elements
and swaps them if they are in wrong order.
Largest element moves to end after every pass.
Example:
5 2 8 1
Pass 1:
2 5 1 8
Pass 2:
2 1 5 8
Pass 3:
1 2 5 8

Time Complexity:
Worst Case  : O(n²)
Average Case: O(n²)
Best Case   : O(n)

Space Complexity:
O(1)


3) PARALLEL BUBBLE SORT
----------------------------------------------------------
Parallel Bubble Sort uses:
- Even Phase
- Odd Phase

Even Phase:
Compare:
(0,1), (2,3), (4,5)

Odd Phase:
Compare:
(1,2), (3,4), (5,6)

Multiple comparisons happen simultaneously
using multiple CPU cores.


4) MERGE SORT
----------------------------------------------------------
Merge Sort follows:
DIVIDE AND CONQUER approach.

Steps:
1. Divide array into halves
2. Sort both halves
3. Merge sorted halves

Time Complexity:
O(n log n)

Space Complexity:
O(n)


5) PARALLEL MERGE SORT
----------------------------------------------------------
Different subarrays are sorted simultaneously
using multiple threads.
Advantages:
- Faster for large datasets
- Better CPU utilization


6) OPENMP
----------------------------------------------------------
OpenMP (Open Multi-Processing) is used for
parallel programming in C/C++.

Header:
#include <omp.h>

Compilation:
g++ file.cpp -fopenmp


7) OPENMP DIRECTIVES USED
----------------------------------------------------------

a) #pragma omp parallel for
Runs loop iterations in parallel.

b) #pragma omp parallel sections
Runs different code sections in parallel.

c) #pragma omp section
Defines independent parallel tasks.


8) omp_get_wtime()
----------------------------------------------------------
Used to measure execution time.

Returns wall-clock time in seconds.


9) APPLICATIONS
----------------------------------------------------------
- Data analysis
- Machine learning
- Scientific computing
- Database systems
- Operating systems

==========================================================

*/