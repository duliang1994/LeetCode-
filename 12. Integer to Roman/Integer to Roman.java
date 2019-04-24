class Solution {

    public String intToRoman(int num) {
        int[] radix= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String roman = "";
        int n = radix.length;
        for(int i = 0; i < n; i++){
            while(num >= radix[i]){
                num -= radix[i];
                roman += symbol[i];
            }
        }
        return roman;
        
    }
}
class Solution {

    public String intToRoman(int num) {
         String res = "";
         String[] v1 = {"", "M", "MM", "MMM"};
         String[] v2 = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
         String[] v3 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
         String[] v4 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return v1[num / 1000] + v2[(num % 1000) / 100] + v3[(num % 100) / 10] + v4[num % 10];
        
    }
}
