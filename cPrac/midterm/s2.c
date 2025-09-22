#include <stdio.h>

struct Book {
    char title[50];
    float price;
};

void updatePrice(struct Book* b, float newPrice) {
    b->price = newPrice;
}

int main() {
    struct Book b1 = {"DSA Handbook", 499.00};
    float newPrice, oldPrice;
    printf("Enter new price: "); scanf("%f", &newPrice);
    updatePrice(&b1, newPrice);
    printf("Title: %s\nUpdated Price: %.2f\n", b1.title, b1.price);
    return 0;
}
