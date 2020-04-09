import java.util.ArrayList;
import java.util.List;

public class Player implements Runnable{
    public String name;
    private Board board;
    private List<Token> playerTokens=new ArrayList<>();

    public String getTokens()
    {   String str="";
        for (Token token:playerTokens) {
            str=str+String.valueOf(token.getTokenValue()) + " ";

        }
        return str;
    }


    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    @Override
    public void run() {
        boolean flag=true;
        while(flag){
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException ignored){}
            Token token=board.getToken();
            if (token==null){
                flag=false;
                break;
            }
            playerTokens.add(token);
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints(){
        int difference;
        if (playerTokens.size()>2)
            difference=playerTokens.get(1).getTokenValue()-playerTokens.get(0).getTokenValue();
        else
            return playerTokens.size();
        boolean flag=true;
        for (int i=1; i<playerTokens.size(); i++){
            if (playerTokens.get(i).getTokenValue()-playerTokens.get(i-1).getTokenValue()!=difference)
            {
                flag=false;
                break;
            }
        }
        if (flag==true)
            return -1;
        int lg=playerTokens.size();
        int[] best=new int[lg];
        int[] poz=new int[lg];
        int[] diff=new int[lg];
        best[lg-1]=1;
        poz[lg-1]=-1;
        int max=1;
        int p=lg-1;
        diff[lg-1]=playerTokens.get(lg-1).getTokenValue()-playerTokens.get(lg-2).getTokenValue();
        for (int i=lg-2; i>=1; i--){
            best[i]=1;
            poz[i]=-1;
            for (int j=i+1; j<lg; j++){
                if (playerTokens.get(i).getTokenValue()==playerTokens.get(j).getTokenValue()-diff[j] && best[i]<best[j]+1){
                    best[i]=best[j]+1;
                    poz[i]=j;
                    if(best[i]>max) {
                        max=best[i];p=i;

                    }
                }else if (best[i]<best[j]+1){
                    diff[j]=playerTokens.get(j).getTokenValue()-playerTokens.get(i).getTokenValue();
                }
            }
        }
        int i=p;
        int val=0;
        while (i!=-1){
            i=poz[i];
            val++;
        }
        return val;
    }


}
