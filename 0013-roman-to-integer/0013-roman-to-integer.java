class Solution {
    public int romanToInt(String s) {
        // Roma rakamlarının sembollerini ve değerlerini tutacak bir harita oluşturalım
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int total = 0; // Toplam değeri saklamak için bir değişken oluşturalım
		
		//  Dizi üzerinde bir döngü ile Roma rakamlarını tamsayıya çevirelim.
		for (int i = 0; i < s.length(); i++) {
			int currentVal = map.get(s.charAt(i));  // Mevcut sembolün değerini alalım
			
			// // Eğer bu sembol, bir sonraki sembolden küçükse, çıkarma durumunu işleyelim
			if (i < s.length() - 1 && currentVal < map.get(s.charAt(i + 1))) {
				total -= currentVal;
			}else {
				total += currentVal; // Diğer durumda, sembolün değerini toplam değere ekleyelim.
			}
		}
		
		return total;
    }
}