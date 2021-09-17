#include <stdio.h>
#include <stdlib.h>

int main()
{
    double input_number;
    printf("Please type the number : \n");
    scanf("%lf", &input_number);
    double res = pow(input_number, 2);
    printf("The res: %lf \n ", res);


    return 0;
}
