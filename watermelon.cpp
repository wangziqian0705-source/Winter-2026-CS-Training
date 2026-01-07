#include <iostream>

bool isweight(int n){
    if(n > 2 && n % 2 == 0){
        return true;
    }else {
        return false;
    }
}

int main(){
    int n;
    if(std::cin >> n){
        if(isweight(n)){
            std::cout << "YES" << std::endl;
        } else {
            std::cout << "NO" << std::endl;
        }
    }
    return 0;
}