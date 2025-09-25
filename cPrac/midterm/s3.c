#include <stdio.h>

struct Person {
    char name[50];
    char role[50];
};

struct Team {
    char teamName[50];
    struct Person members[3];
};

void displayTeam(struct Team t) {
    printf("Team: %s\n", t.teamName);
    for (int i = 0; i < 3; i++) {
        printf("Member %d: %s - %s\n", i + 1, t.members[i].name, t.members[i].role);
    }
}

int main() {
    struct Team t1 = {
        "CodeStorm",
        {
            {"Cayl", "Leader"},
            {"Jude", "Debugger"},
            {"Mira", "Tester"}
        }
    };
    displayTeam(t1);
    return 0;
}
