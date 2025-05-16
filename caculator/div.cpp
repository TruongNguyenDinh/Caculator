#include<windows.h>

extern"C" __declspec(dllexport) double divi(double a, double b){
	return a/b;
}