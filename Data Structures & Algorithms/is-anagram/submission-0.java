
class Solution {
    public boolean isAnagram(String s, String t) {
        
    //     String[] array1 = s.split(" ");
    //     String[] array2 = t.split(" ");
    //     for(int i =0;i<array1.length;i++)
    //     {
    //         char[] ch = array1[i].toCharArray();
    //     }
    //     for(int i = 0;i<array2.length;i++)
    //     {
    //         char[] ch1 = array2[i].toCharArray();
    //     }
    // Arrays.sort(array1);
    // Arrays.sort(array2);
    // if(array1 == array2)
    //     return true;
    // else
    //     return false;

char[] ch = s.toCharArray();
char[] ch1 = t.toCharArray();
Arrays.sort(ch);
Arrays.sort(ch1);
if(Arrays.equals(ch,ch1))
{
    return true;
}
else
{
    return false;
}
    }
}
