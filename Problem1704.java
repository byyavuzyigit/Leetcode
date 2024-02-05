public class Problem1704 {
    public boolean halvesAreAlike(String s) {
        int vowelCount1 = 0;
        int vowelCount2 = 0;

        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2);

        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'A' || a.charAt(i) == 'e'
                    || a.charAt(i) == 'E' || a.charAt(i) == 'i' || a.charAt(i) == 'I'
                    || a.charAt(i) == 'o' || a.charAt(i) == 'O' || a.charAt(i) == 'u'
                    || a.charAt(i) == 'U'){
                vowelCount1++;
            }

            if(b.charAt(i) == 'a' || b.charAt(i) == 'A' || b.charAt(i) == 'e'
                    || b.charAt(i) == 'E' || b.charAt(i) == 'i' || b.charAt(i) == 'I'
                    || b.charAt(i) == 'o' || b.charAt(i) == 'O' || b.charAt(i) == 'u'
                    || b.charAt(i) == 'U'){
                vowelCount2++;
            }
        }

        return (vowelCount1 == vowelCount2);
    }
}
