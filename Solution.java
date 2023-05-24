import java.util.HashMap;

public class Solution
{
    public static String firstNonRepeated(String arg)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        // add chars and corresponding occurrences to map
        for(int i = 0; i < arg.length(); i++)
        {
            if(map.get(arg.charAt(i)) == null)
            {
                map.put(arg.charAt(i), 1);
            }
            else
            {
                int occurrences = map.get(arg.charAt(i));
                occurrences += 1;
                map.put(arg.charAt(i), occurrences);
            }
        }

        // check for first char with 1 occurrence and return it
        for(int j = 0; j < arg.length(); j++)
        {
            if(map.get(arg.charAt(j)) == 1)
                return String.valueOf(arg.charAt(j));
        }

        // else return empty string
        return "";
    }
    public static void main(String[] args)
    {
        System.out.println(firstNonRepeated("hello"));
        System.out.println(firstNonRepeated("aabcc"));
        System.out.println(firstNonRepeated("aabbcc"));
        System.out.println(firstNonRepeated("aabbkcc"));
        System.out.println(firstNonRepeated("aabbkkccz"));
    }
}
