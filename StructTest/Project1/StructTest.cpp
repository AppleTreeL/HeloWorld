#include <stdio.h>
#include <time.h>
#include <iostream>
#include <Windows.h>

struct MyStruct
{
	int data[1000];
	int num;
};

MyStruct S = { {1,2,3,4},1000 };

void print1(MyStruct S)
{
	printf("%d\n", S.num);
}

void print2(MyStruct * p)
{
	printf("%d\n", p->num);
}

int main()
{
	clock_t start,start2;

	clock_t end, end2;

	start = clock();

	print1(S);

	end = clock();

	std::cout << "method1 :" << start - end << std::endl;

	start2 = clock();

	print2(&S);

	end2 = clock();

	std::cout << "method2 :" << start2 - end2 << std::endl;

	system("pause");
	return 0;
}