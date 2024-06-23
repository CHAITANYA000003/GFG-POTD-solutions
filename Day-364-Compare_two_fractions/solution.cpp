class Solution {
  public:
    string compareFrac(string str) {
        // Code here
        int arr[4];
        string s ="";
        int k=0;
        int num = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str[i] >= '0' && str[i] <= '9')
            {
                num = num*10 + (str[i] - '0');
            }
            else if(str[i] == '/' || str[i] == ',')
            {
                arr[k++] = num;
                num = 0;
            }
        }
        arr[k] = num;
        
        string ans;
        float val1, val2;
        val1 = float(arr[0])/arr[1];
        val2 = float(arr[2])/arr[3];
        if(val1 > val2)
        {
            ans = to_string(arr[0]) + "/" + to_string(arr[1]);
        }
        else if(val1 < val2)
        {
            ans = to_string(arr[2]) + "/" + to_string(arr[3]);
        }
        else
        {
            ans = "equal";
        }
        
        return ans;
    }
};