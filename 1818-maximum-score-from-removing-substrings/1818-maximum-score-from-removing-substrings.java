class Solution {
    public int maximumGain(String s, int x, int y) {
        int totalScore = 0;
    char first, second;
    int firstPoints, secondPoints;

    if (x >= y) {
        first = 'a';
        second = 'b';
        firstPoints = x;
        secondPoints = y;
    } else {
        first = 'b';
        second = 'a';
        firstPoints = y;
        secondPoints = x;
    }

    // Birinci öncelikli substringi kaldırma
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == first && c == second) {
            sb.deleteCharAt(sb.length() - 1);
            totalScore += firstPoints;
        } else {
            sb.append(c);
        }
    }

    // İkinci öncelikli substringi kaldırma
    s = sb.toString();
    sb.setLength(0); // StringBuilder'ı temizle ve tekrar kullan
    for (char c : s.toCharArray()) {
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == second && c == first) {
            sb.deleteCharAt(sb.length() - 1);
            totalScore += secondPoints;
        } else {
            sb.append(c);
        }
    }

    return totalScore;
    }
}