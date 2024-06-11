
public class Pattern {
	public void uniquePattern(int n) {
		for(int i=n;i>=n/2;i--) {
			for(int index=1;index<=i;index++) {
				System.out.print('*');
			}
			System.out.println(" ");
		}
		for(int  i=n/2+1;i<=n;i++) {
			for(int index=1;index<=i;index++) {
				System.out.print('*');
			}
			System.out.println(" ");
		}
	}
}
