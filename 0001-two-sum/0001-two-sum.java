import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Sayıları ve indeksleri saklayacağımız bir HashMap oluşturuyoruz.
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Dizi üzerinde gezinmek için bir döngü oluşturuyoruz.
        for (int i = 0; i < nums.length; i++) {
            // Hedef değere ulaşmak için gereken tamamlayıcı değeri hesaplıyoruz.
            int complement = target - nums[i];
            // Eğer tamamlayıcı değer daha önce gördüğümüz sayılar arasında varsa, çözümü bulduk demektir.
            if (numToIndex.containsKey(complement)) {
                // Tamamlayıcı değerin indeksini ve şu anki değerin indeksini döndürüyoruz.
                return new int[] {numToIndex.get(complement), i};
            }
            // Tamamlayıcı değeri bulamazsak, şu anki sayıyı ve indeksini HashMap'e ekliyoruz.
            numToIndex.put(nums[i],i);
        }
        // Eğer çözüm bulunamazsa, bir istisna fırlatıyoruz.
        throw new IllegalArgumentException("Çözüm yok");
    }
}