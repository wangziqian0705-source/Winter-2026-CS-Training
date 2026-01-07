#include <iostream>
#include <string>

int main(){
    int n;
    if(std::cin >> n){
        while(n--){
            std::string word;
            std::cin >> word;
            if(word.length() <= 10){
                std::cout << word << std::endl;
            } else {
                int st = word.length();
                std::cout << word.at(0) << word.length() - 2 << word.back() << std::endl;
            }
        }
    }
    return 0;
}