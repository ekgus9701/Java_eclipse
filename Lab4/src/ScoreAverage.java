
public class ScoreAverage {

	public static void main(String[] args) {
		
		double score[][]= {{3.5,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
		double sum=0.0;
		
		for(int year=0;year<score.length;year++)
			for(int term=0;term<score[year].length;term++)
				sum+=score[year][term]; //��ü ������
		int n=score.length; //�迭�� �� ����:4
		int m=score[0].length; //�迭�� �� ����:2
		System.out.printf("4�� ��ü ���� ��� :%.2f",sum/(n*m));

	}

}