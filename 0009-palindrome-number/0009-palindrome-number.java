class Solution {
    public boolean isPalindrome(int x) {
        // Negatif sayılar palindrom olamaz
        if (x < 0) {
            return false;
        }

        // Orijinal sayıyı sakla
        int original = x;
        int reversed = 0;

        // Sayıyı ters çevir
        while (x != 0) {
            int digit = x % 10; // Son basamağı al
            reversed = reversed * 10 + digit; // Tersine ekle
            x /= 10; // Son basamağı çıkar
        }

        // Ters çevrilmiş sayı orijinal sayıya eşitse palindromdur
        return original == reversed;
    }
}