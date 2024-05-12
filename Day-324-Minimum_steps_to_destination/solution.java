class Solution {
    static int minSteps(int d) {
        // code here
        int i;
        for(i=1; i<(2*d); i++)
        {
            if(((i*(i+1))/2 + d)%2==0 && ((i*(i+1))/2)>=d)
            {
                break;
            }
        }
        return i;
    }
}