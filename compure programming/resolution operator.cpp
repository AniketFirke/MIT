//3.3   :: scope resolution operator

#include<iostream.h>

int a=10;

int main()

{
    int a=15;
    cout<<"\n local a="<<a<<"global a="<<::a;

    ::a=20;
    cout<<"\n local a="<<a<<"global a="<<::a;
    return 0;
    
}