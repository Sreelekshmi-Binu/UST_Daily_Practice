
public class Music {
public static void main(String[] args) {
	Playable[] p = new Playable[2];
	p[0]=new Guitar();
	p[1]=new Piano();
	for(int i=0;i<2;i++)
	{
		p[i].play();
	}
}
}