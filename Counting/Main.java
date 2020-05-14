#include <iostream>
using namespace std;
int main() {
    char line[250];
    int vowels, consonant, digit, space,sym;
    vowels = consonant = digit = space = sym = 0;
    fgets(line, sizeof(line), stdin);

    for (int i = 0; line[i] != '\0'; ++i) {
        if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||
            line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||
            line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||
            line[i] == 'U') {
            ++vowels;
        } else if ((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z')) {
            ++consonant;
        } else if (line[i] >= '0' && line[i] <= '9') {
            ++digit;
        } else if (line[i] == ' ') {
            ++space;
        }
      else
        ++sym;
    }

    cout<<"Vowels:"<<vowels<<"\nConsonants:"<<consonant<<"\nWhite Spaces:"<<space<<"\nDigits:"<<digit<<"\nSymbols:"<<sym;
  return 0;
}
