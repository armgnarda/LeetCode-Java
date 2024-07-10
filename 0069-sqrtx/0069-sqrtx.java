class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
		
		int sol = 1, sağ = x, sonuc = 0;
		
		while (sol <= sağ) {
			int orta = sol + (sağ-sol) / 2;
			
			if(orta <= x / orta) {
				sonuc = orta;
				sol = orta + 1;
			} else {
				sağ = orta - 1;
			}
		}
		return sonuc;
    }
}