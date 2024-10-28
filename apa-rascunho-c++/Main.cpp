#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> v1(5); // Create a vector of size 5
    v1 = {1, 2, 3, 4, 5, 6, 7}; // Initialize the vector with the specified elements

    cout << v1.size() << endl;     // Access the size of the vector
    cout << v1.capacity() << endl; // Access the capacity of the vector

    return 0;
}