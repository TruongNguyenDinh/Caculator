#include<windows.h>

extern"C" __declspec(dllexport) double mul(double a, double b){
	return a*b;
}