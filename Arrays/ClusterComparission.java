// Question :
// Define a cluster in an integer array to be a maximum sequence of elements that are all the same value. For example, in the array {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4} there are 5 clusters, {3, 3, 3}, {4, 4}, {3}, {2, 2, 2, 2} and {4}. A cluster-compression of an array replaces each cluster with the number that is repeated in the cluster. So, the cluster compression of the previous array would be {3, 4, 3, 2, 4}. The first cluster {3, 3, 3} is replaced by a single 3, and so on.

// Write a function named clusterCompression with the following signature

// If you are programming in Java or C#, the function signature is
// int[ ] clusterCompression(int[ ] a)

// If you are programming in C++ or C, the function signature is
// int *clusterCompression(int a[ ], int len) where len is the length of the array.

// The function returns the cluster compression of the array a. The length of the returned array must be equal to the number of clusters in the original array! This means that someplace in your answer you must dynamically allocate the returned array.

// In Java or C# you can use
// int[ ] result = new int[numClusters];

// In C or C++ you can use
// int *result = (int *)calloc(numClusters, sizeof(int));

// Examples
// a is
// then function returns
// {0, 0, 0, 2, 0, 2, 0, 2, 0, 0}
// {0, 2, 0, 2, 0, 2, 0}
// {18}
// {18}
// {}
// {}
// {-5, -5, -5, -5, -5}
// {-5}
// {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1}
// {1, 2, 1}
// {8, 8, 6, 6, -2, -2, -2}
// {8, 6, -2}


public class ClusterComparission {
    
}
