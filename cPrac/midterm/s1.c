// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>
// struct Marks {
//     float math;
//     float science;
//     float english;
// };

// struct Student {
//     char name[50];
//     int id;
//     struct Marks marks;
// };


// void display(struct Student s[], int n){
//     for(int i = 0; i < n; i++){
//         printf("Student %d details: \n", i + 1);
//         printf("Name: %s\n", s[i].name);
//         printf("Id no: %d\n",  s[i].id);
//         printf("Math grade: %.2f\n", s[i].marks.math);
//         printf("Science grade: %.2f\n", s[i].marks.science); 
//         printf("English grade: %.2f\n", s[i].marks.english);
//         printf("\n");
//     }
// }
// int main(){
//     int n;
//     printf("Enter number of students: "); 
//     scanf("%d", &n);
//     getchar();
//     struct Student s[n];
//     struct Student *ptr = s;
//     printf("Enter details: \n");
//     for(int i = 0; i < n; i++){
//         printf("Enter student %d details: \n", i + 1);
//         printf("Enter name: ");
//         fgets(s[i].name, sizeof(s[i].name), stdin);
//         s[i].name[strcspn(s[i].name ,"\n")] = '\0';
//         // scanf("% 49[^\n]", s[i].name);
       
//         printf("Enter id no:" ); scanf("%d", &s[i].id); getchar();
//         printf("Enter math grade: "); scanf("%f", &s[i].marks.math); getchar();
//         printf("Enter science grade: "); scanf("%f", &s[i].marks.science); getchar();
//         printf("Enter english grade: "); scanf("%f", &s[i].marks.english); getchar();
//         printf("\n");
//     }

//     display(s, n);
//     return 0;
// }

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct Marks {
    float math;
    float science;
    float english;
};

struct Student {
    char name[50];
    int id;
    struct Marks marks;
};


void display(struct Student *s, int n){
    for(int i = 0; i < n; i++){
        printf("Student %d details: \n", i + 1);
        printf("Name: %s\n", (s + i)->name);
        printf("Id no: %d\n",  (s + i)->id);
        printf("Math grade: %.2f\n", (s + i)->marks.math);
        printf("Science grade: %.2f\n", (s + i)->marks.science); 
        printf("English grade: %.2f\n", (s + i)->marks.english);
        printf("\n");
    }
}
int main(){
    int n;
    printf("Enter number of students: "); 
    scanf("%d", &n);
    getchar();
    struct Student s[n];
    struct Student *ptr = s;
    printf("Enter details: \n");
    for(int i = 0; i < n; i++){
        printf("Enter student %d details: \n", i + 1);
        printf("Enter name: ");
        fgets((ptr + i)->name, sizeof(s[i].name), stdin);
        (ptr + i)->name[strcspn(s[i].name ,"\n")] = '\0';
        // scanf("% 49[^\n]", s[i].name);
       
        printf("Enter id no:" ); scanf("%d", &(ptr + i)->id); getchar();
        printf("Enter math grade: "); scanf("%f", &(ptr + i)->marks.math); getchar();
        printf("Enter science grade: "); scanf("%f", &(ptr + i)->marks.science); getchar();
        printf("Enter english grade: "); scanf("%f", &(ptr + i)->marks.english); getchar();
        printf("\n");
    }

    display(s, n);
    return 0;
}