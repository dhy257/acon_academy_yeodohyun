
public class 배열3차원2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] 조명단 = {
				{
					{"손영석","황스일","장해든","이현겸"},
					{"이용찬","박세인","김태준","고지연"},
					{"정철진","엄진희","김민경","여도현"},
					{"이정하","나해수","조아진","장윤성"},
					{"송주창","김민정","김재민","김건희"}
				},
				{
					{"손영석","황스일","장해든","이현겸"},
					{"이용찬","박세인","김태준","고지연"},
					{"정철진","엄진희","김민경","여도현"},
					{"이정하","나해수","조아진","장윤성"},
					{"송주창","김민정","김재민","김건희"}
				}
		};
		
		for (int i = 0; i < 조명단.length; i++) {
			for (int j = 0; j < 조명단[i].length; j++) {
				for (int k = 0; k < 조명단[i][j].length; k++) {
					System.out.print(조명단[i][j][k]);
					System.out.print(" ");
				}
				System.out.println("");
			}
		}
		
	}

}
