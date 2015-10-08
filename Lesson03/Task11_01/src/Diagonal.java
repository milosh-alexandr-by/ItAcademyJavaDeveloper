import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������� n: ");
		Integer n = sc.nextInt();
		
		// �������� ������� � ������� Math.random
		int myMatrix[][] = new int[n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				myMatrix[i][j] = (int)(Math.random()*10); 				
			}
		}
		
//		��� �������, ����� ��������, ��� �������� ��������
//		int myMatrix[][] = {{1,1,0,0,7,1,9,1}, {2,2,2,4,2,2,1,1}, {3,3,3,5,1,3,2,3}, {4,4,2,3,4,3,4,4}, {3,3,5,6,5,5,8,5}, {1,8,6,6,6,8,6,4}, {0,8,9,7,7,9,7,3}, {9,9,0,8,5,8,8,8}}; 
		
		// ������� ������� �� �����
//		n = 8;
		for (int i=0; i<n; i++) {
			if (i>0) {
				System.out.println();
			}	
			for (int j=0; j<n; j++) {
				System.out.print(myMatrix[i][j] + "  ");				
			}
		}
		
		System.out.println();
		
		// ������� �������� ������� ���������
		System.out.print("�������� ������� ���������: ");
		for (int r=0; r<n; r++) {
			if (r==(n-1)) {
				System.out.println(myMatrix[r][r] + "."); break;
			}
			System.out.print(myMatrix[r][r] + ", ");
		}

		// ����������, ��� ������ �������� - ��� ����� �� 1 �� n: 1, 2, 3, 4, 5...
		// ������ ���������� ��� ��������, ��� ����� ������ �������: 12345; 12354; 12435...
		// �����, ��� ��� ���������� �����
		// ���������� ������� ����� ������������ �������� � �������
		// �������� ��� ����� n - ������� 
		// �� ������� ��� �������: ����� ��� ����� ���� ������
		// � ����� ��� ����� ���� �� 1 �� n
		
		// ������� n - ������� � n+1 ������� �����
		
		int maxCharacter = (int)Math.pow(10, n);
		int minCharacter = (int)Math.pow(10, n-1);

		
		// � ���� ���������� �� ����� ������������� �������
		for (int i=minCharacter; i<(maxCharacter-1); i++) {
			
			// ������ �� ����� ������ massiv[]
			// �������� ����� 23541 ����� �������� {2, 3, 5, 4, 1}
			int t = i;
			Integer massiv[] = new Integer[n];
			for (int i1=(n-1); i1>=0; i1--) {
				int q = (int)t%10;
				massiv[i1] = q;
				t = t/10;
			}
			
			// ��������� ������� �� ������ �� ������ ����
			// ���� ������ ����� � ��������� �������� � ���������� � �������
			// ���� ���� ���������� ������ sum = sum +1;
			int sum = 0;
			int chislo = 0;
			for (int i2=0; i2<n; i2++) {
				for (int j2=(i2+1); j2<n; j2++) {
					if (massiv[i2]==massiv[j2]) {
						sum = sum +1;
					} 
				}
			}
			if (sum==0) {
				
				chislo = i;
				
				// �������� �� �������, ����� ����� �������� � ��� ��������
				// �� ����, ����� ����� ���� �� 1 �� n
				
				// ������ �� ����� �������
				int t1 = chislo;
				Integer massiv1[] = new Integer[n];
				for (int i1=n-1; i1>=0; i1--) {
					int q = (int)t1%10;
					massiv1[i1] = q;
					t1 = t1/10;
				}
				
				// ��������� ������ �����, ����� ��� ���� ����� 1 � n ������������
				int prov = 0;
				for (int i5=0; i5<n; i5++) {
					if ((massiv1[i5]>=1) & (massiv1[i5]<=n)) {
						prov = prov + 0;
					}
					else {
						prov = prov + 1;
					}
				}		
				if (prov==0) {

					
				// ����������� ����� chislo � ������
					int tt = i;
					Integer chislo1[] = new Integer[n];
					for (int i6=(n-1); i6>=0; i6--) {
						int q6 = (int)tt%10;
						chislo1[i6] = (q6-1);
						tt = tt/10;
					}

				
				// �������� ����� ������� �������� �����
					Integer newMatrix[][] = new Integer[n][n];
					for (int ds=0; ds<=(n-1); ds++) {
						for (int jr=0; jr<=(n-1); jr++) {
							newMatrix[ds][jr] = myMatrix[ds][chislo1[jr]];
						}
						
					}

							// ������� �������� ��������� � ������
						int masel[] = new int[n];
						for (int or=0; or<n; or++) {							
							masel[or] = newMatrix[or][or]; 
								
						}

						// ��������, ���� �� �������� �������, �� ���� ������� ��������� �� �����������
						int sok = 0;
						for (int sk = 0; sk<(n-1); sk++) {
							if (masel[sk]>=masel[sk+1]) {
								sok = sok+1;
							}
						}
						if (sok==0) { 
							System.out.println();
							System.out.println("����� �������:");
							for (int i11=0; i11<n; i11++) {
								if (i11>0) {
									System.out.println();
								}	
								for (int j11=0; j11<n; j11++) {
									System.out.print(newMatrix[i11][j11] + "  ");				
								}
							}
							System.out.println();
							System.out.print("�������� ������� ���������: ");
							for (int r=0; r<n; r++) {
								if (r==(n-1)) {
									System.out.println(newMatrix[r][r] + "."); break;
								}
								System.out.print(newMatrix[r][r] + ", ");
							}

						}
		

						}
	
	
				}

				
			}

		sc.close();
		}
		
	
		
		
	
	
}
	
	

