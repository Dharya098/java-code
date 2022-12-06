
public class Builder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder ("Daripada");
		StringBuilder sb1 = new StringBuilder ("Mahoo");
		System.out.println(sb.charAt(0));
		System.out.println(sb1.charAt(0));
		System.out.println();
		sb.setCharAt(0,'H');
		System.out.println(sb);
		sb1.setCharAt(0,'S');
		System.out.println(sb1);
		System.out.println();
		
	
		sb.insert(0, "MR.");
		sb1.insert(0, "MR.");
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println();
		sb.insert(6, "");
		sb1.insert(6, "");
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println();
		sb.delete(0, 3);
		sb1.delete(0, 3);
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println();
		StringBuilder sp = new StringBuilder("H");
		sp.append("e");
		sp.append("l");
		sp.append("l");
		sp.append("o");
		System.out.println(sp);
		System.out.println("Length of this String is:-"+sp.length());
		System.out.println();
		StringBuilder sq = new StringBuilder("HARIPADA");
		for(int i=0; i<sq.length()/2;i++){
			int front = i;
			int back = sq.length()-1-i;
			
			char frontChar = sq.charAt(front);
			char backChar = sq.charAt(back);
			
			sq.setCharAt(front, backChar);
			sq.setCharAt(back, frontChar);
		}
		System.out.println(sq);
	}
}
