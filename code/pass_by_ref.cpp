#include <iostream>
using namespace std;

void change(int &a)
{
    a ++;
}
int main()
{
    int data = 20;
    change(data);
    cout<<"Hello "<<data<<endl;
    return 0;
}