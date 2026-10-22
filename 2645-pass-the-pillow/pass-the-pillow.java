
class Solution {
    public int passThePillow(int n, int time) {
        int currentPosition = 1;
        int direction = 1; // 1 means moving forward, -1 means moving backward

        for (int i = 0; i < time; i++) {
            currentPosition += direction;

            // Reverse direction if we hit the ends of the line
            if (currentPosition == n || currentPosition == 1) {
                direction *= -1;
            }
        }

        return currentPosition;
    }
}