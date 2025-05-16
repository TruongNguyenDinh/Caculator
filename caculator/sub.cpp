#include<windows.h>

extern"C" __declspec(dllexport) double sub (double a, double b){
	return a-b;
}