//passing an argument in string buffer
class StringBufferA
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer(50);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append("Hey"));
		System.out.println(sb.append("Heyassdasfgdhsdcghcdzsjhnsjzvhnsjhrvwjbvhbnxbccghayfgfxvbsxnnxbx"));
		
		System.out.println(sb.append("Hellohilllyaiiiiiaaabbccchhhhhhdsffgsxhjbxjsnxbcvxbwrtwewryttttttttuyyyyyyyuiiuiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhhhhhggggggg"));
		
	}
}