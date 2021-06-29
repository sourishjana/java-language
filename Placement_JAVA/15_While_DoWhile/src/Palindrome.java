public class Palindrome {
    public void checkPalindrome(int n){
        int copyN=n;
        int revNumber=0;
        while(copyN!=0){
            int remainder=copyN%10;
            revNumber = revNumber*10 + remainder;
            copyN=copyN/10;
        }
        System.out.println("reversed number = "+ revNumber);
        if(revNumber==n){
            System.out.println("Yes the number is palindrome");
        }else{
            System.out.println("No the number is not palindrome");
        }
    }
}
