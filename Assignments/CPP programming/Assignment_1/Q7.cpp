#include <iostream>
using namespace std;

    struct point {
        int x,y;
    };

    int main() {
        point p = {50,100};
        cout << "Point: (" << p.x << ", " << p.y << ")" << endl;
        return 0;
}


