import java.util.*;
import java.io.*;
public class Crypt
{
    char f0a[]={'x','b','k','g','v','j','s','f','r','c','q','i','p','a','y','e','o','h','n','d','l','m','z','t','u','w'};
    char f0n[]={'1','9','2','4','8','3','7','0','6','5'};

    char f1a[]={'m','z','n','b','y','l','f','r','o','a','q','e','p','j','x','c','k','s','w','d','v','i','g','t','h','u'};
    char f1n[]={'4','1','8','5','6','2','9','3','7','0'};

    char f2a[]={'g','z','x','h','l','j','a','w','d','s','r','i','u','f','q','t','k','y','m','b','v','n','p','c','o','e'};
    char f2n[]={'1','4','0','3','2','5','7','9','8','6'};

    char f3a[]={'c','e','i','o','t','b','z','d','v','y','j','u','x','f','k','m','s','g','p','w','l','r','a','n','h','q'};
    char f3n[]={'1','4','3','6','8','2','7','0','9','5'};

    char f4a[]={'r','q','i','m','o','n','j','w','t','k','p','a','x','b','s','d','v','c','g','h','e','z','f','y','u','l'};
    char f4n[]={'8','5','1','9','0','3','2','6','4','7'};

    char f5a[]={'z','i','v','s','u','t','w','c','x','k','h','r','j','y','d','l','b','m','o','q','f','e','g','n','p','a'};
    char f5n[]={'3','5','1','9','2','6','4','0','7','8'};

    char f6a[]={'d','f','e','q','w','r','t','v','h','c','i','s','u','b','g','m','x','l','y','j','p','z','a','n','k','o'};
    char f6n[]={'4','7','8','0','5','1','3','6','9','2'};

    char f7a[]={'c','d','z','x','a','w','j','v','u','g','h','i','s','t','b','f','e','y','r','q','p','o','n','m','l','k'};
    char f7n[]={'3','9','6','0','2','8','7','5','4','1'};

    char f8a[]={'m','f','k','y','w','e','x','l','j','c','h','s','b','v','r','z','a','q','i','d','p','u','g','n','o','t'};
    char f8n[]={'5','9','4','6','1','2','8','0','3','7'};

    char f9a[]={'e','i','n','h','s','v','b','w','y','f','l','o','c','q','z','u','p','t','j','x','a','r','k','m','d','g'};
    char f9n[]={'4','2','9','5','7','0','8','3','6','1'};

    char fAa[]={'l','u','w','v','p','a','m','q','o','y','c','h','n','b','i','e','g','s','d','r','x','f','j','t','z','k'};
    char fAn[]={'6','5','8','3','9','1','4','2','0','7'};

    char fBa[]={'v','x','t','a','z','s','w','u','f','j','p','r','y','g','k','q','e','i','n','c','h','l','o','d','m','b'};
    char fBn[]={'4','7','5','1','3','9','2','6','0','8'};

    char fCa[]={'w','r','d','a','g','k','s','x','t','c','i','b','h','j','f','p','m','e','z','y','v','u','q','o','l','n'};
    char fCn[]={'4','2','8','0','5','7','9','1','6','3'};

    char fDa[]={'e','r','k','o','l','s','y','d','j','t','p','b','x','u','f','i','v','a','w','z','h','m','c','q','g','n'};
    char fDn[]={'4','8','1','6','3','7','0','5','2','9'};

    char fEa[]={'d','q','g','l','x','a','o','b','u','k','y','f','w','i','p','c','t','m','z','h','s','v','e','n','j','r'};
    char fEn[]={'9','2','7','3','0','6','5','8','1','4'};

    char fFa[]={'p','c','o','q','d','z','s','a','u','i','b','r','h','y','n','e','j','t','g','v','k','w','f','l','x','m'};
    char fFn[]={'1','0','4','8','2','6','3','9','5','7'};

    char fGa[]={'l','d','k','e','o','b','u','h','j','i','p','a','t','n','r','z','f','v','m','x','s','c','w','g','q','y'};
    char fGn[]={'3','2','6','8','0','5','4','1','9','7'};

    char fHa[]={'r','u','y','w','s','z','t','v','x','a','f','g','b','e','d','c','h','o','l','k','j','i','m','p','n','q'};
    char fHn[]={'9','8','4','3','2','5','1','7','0','6'};

    char fIa[]={'m','s','a','l','d','b','n','x','c','t','o','w','y','h','p','r','u','e','g','i','q','v','j','z','f','k'};
    char fIn[]={'3','7','5','1','8','0','9','2','6','4'};

    char fJa[]={'g','t','h','s','f','u','i','r','v','e','w','j','p','q','x','d','o','k','y','c','n','z','l','b','m','a'};
    char fJn[]={'9','3','6','4','2','7','5','1','8','0'};

    char fKa[]={'v','e','u','w','f','k','x','t','g','l','a','j','h','y','s','b','i','m','o','c','r','n','z','p','d','q'};
    char fKn[]={'9','2','6','4','3','7','8','1','5','0'};

    char fLa[]={'b','a','m','z','v','c','d','n','w','u','f','e','o','x','t','g','h','p','y','s','i','j','q','r','l','k'};
    char fLn[]={'3','8','2','4','7','1','5','6','9','0'};

    char fMa[]={'l','o','q','e','g','v','w','c','j','p','x','r','a','n','z','f','m','b','i','t','k','s','u','d','y','h'};
    char fMn[]={'9','5','6','8','3','7','4','1','0','2'};

    char fNa[]={'h','o','u','w','a','j','x','b','y','k','f','r','s','t','d','l','v','z','c','m','e','n','p','g','i','q'};
    char fNn[]={'3','1','5','2','9','4','7','8','6','0'};

    char fOa[]={'f','a','k','p','b','w','h','l','t','q','d','g','m','x','z','c','n','i','r','u','j','o','s','e','v','y'};
    char fOn[]={'1','4','3','7','9','6','0','5','2','8'};

    char fPa[]={'f','o','e','s','p','w','b','r','n','u','q','a','y','d','c','j','t','g','v','i','l','h','k','z','x','m'};
    char fPn[]={'9','4','7','1','6','0','8','2','5','3'};

    char fQa[]={'i','w','f','o','x','j','l','p','b','e','q','a','y','d','s','z','c','v','r','h','u','g','n','t','k','m'};
    char fQn[]={'3','6','0','7','1','8','5','9','2','4'};

    char fRa[]={'n','l','h','t','m','s','c','d','w','a','x','f','i','y','b','z','k','v','e','j','o','q','g','p','r','u'};
    char fRn[]={'8','5','0','2','7','1','3','4','9','6'};

    char fSa[]={'d','r','t','j','q','o','p','f','u','i','m','n','b','v','h','a','l','g','k','c','w','e','s','z','y','x'};
    char fSn[]={'4','9','1','2','7','6','8','0','5','3'};

    char fTa[]={'s','q','v','x','t','e','r','j','z','c','u','b','i','a','l','k','h','o','d','m','y','f','n','g','w','p'};
    char fTn[]={'6','8','5','2','0','7','3','1','9','4'};

    char fUa[]={'z','f','m','p','t','x','q','c','g','b','r','a','h','i','l','s','d','y','j','u','k','w','e','o','v','n'};
    char fUn[]={'1','2','6','9','0','4','8','3','7','5'};

    char fVa[]={'o','t','u','g','y','n','i','q','c','l','d','a','p','h','j','e','r','b','x','f','v','w','k','z','s','m'};
    char fVn[]={'6','8','4','5','3','0','2','1','9','7'};

    char fWa[]={'w','z','h','p','g','o','f','y','t','b','x','v','i','l','r','a','u','s','c','q','e','n','d','k','j','m'};
    char fWn[]={'3','7','1','9','6','0','4','8','2','5'};

    char fXa[]={'k','l','o','t','u','z','j','n','m','a','d','i','w','v','c','b','h','g','y','x','e','q','f','s','r','p'};
    char fXn[]={'2','6','5','8','4','9','7','3','0','1'};

    char fYa[]={'q','a','p','b','r','d','c','v','s','i','g','t','e','l','w','z','f','m','u','h','n','x','j','o','y','k'};
    char fYn[]={'5','0','7','8','1','6','3','9','2','4'};

    char fZa[]={'d','p','r','b','u','e','q','s','a','v','o','t','y','w','f','m','g','c','h','i','l','x','j','z','k','n'};
    char fZn[]={'6','8','5','4','0','2','9','7','3','1'};

    char faa[]={'j','l','c','o','y','k','p','b','i','m','r','t','v','d','q','n','e','a','s','u','f','z','x','g','w','h'};
    char fan[]={'5','6','1','3','7','2','0','9','4','8'};

    char fba[]={'n','g','o','x','f','p','m','w','b','q','r','h','s','c','v','y','a','j','t','e','z','d','u','i','l','k'};
    char fbn[]={'1','5','7','3','9','8','6','2','4','0'};

    char fca[]={'z','o','n','y','x','g','m','w','c','v','f','q','l','r','b','p','e','k','a','s','i','u','d','t','h','j'};
    char fcn[]={'9','8','3','6','2','0','7','4','5','1'};

    char fda[]={'t','s','z','u','r','v','a','w','q','p','x','e','y','o','b','i','n','m','c','l','d','f','j','k','g','h'};
    char fdn[]={'3','7','8','2','5','1','9','6','4','0'};

    char fea[]={'k','r','m','i','q','u','x','d','v','b','l','t','g','p','j','a','z','f','c','w','y','e','o','s','h','n'};
    char fen[]={'5','7','4','9','8','0','2','1','6','3'};

    char ffa[]={'z','s','r','e','m','n','c','q','l','d','y','b','p','g','o','i','f','x','j','t','a','w','h','u','k','v'};
    char ffn[]={'7','5','9','2','4','6','0','1','3','8'};

    char fga[]={'y','w','i','v','n','s','h','u','m','z','b','x','g','r','l','a','q','f','k','p','e','t','j','d','o','c'};
    char fgn[]={'1','5','4','8','3','9','0','6','7','2'};

    char fha[]={'g','p','s','f','o','k','y','j','b','v','n','u','c','h','q','a','m','w','i','r','d','x','l','z','e','t'};
    char fhn[]={'5','7','2','0','4','9','6','1','8','3'};

    char fia[]={'z','v','x','w','p','t','y','f','o','e','h','r','u','b','g','s','d','i','l','a','k','j','c','m','q','n'};
    char fin[]={'6','5','7','0','4','9','8','1','3','2'};

    char fja[]={'i','n','h','y','o','a','z','p','j','x','c','q','b','w','k','e','r','d','s','l','v','f','t','m','u','g'};
    char fjn[]={'1','4','6','2','5','0','8','3','9','7'};

    char fka[]={'t','u','f','q','g','r','e','s','p','z','d','y','j','m','v','a','k','b','n','l','i','x','c','o','w','h'};
    char fkn[]={'4','5','8','1','9','3','7','0','6','2'};

    char fla[]={'b','l','x','y','u','k','v','w','a','s','j','t','m','g','i','n','f','h','o','r','e','p','q','d','z','c'};
    char fln[]={'7','2','4','8','9','1','5','3','6','0'};

    char fma[]={'p','h','u','w','g','o','v','f','n','t','e','m','s','d','l','z','r','a','k','x','b','j','y','c','q','i'};
    char fmn[]={'1','7','0','5','8','9','2','6','3','4'};

    char fna[]={'l','z','y','k','m','w','f','j','t','x','v','e','n','s','u','a','g','o','q','b','h','p','r','c','i','d'};
    char fnn[]={'9','2','7','0','5','1','8','4','6','3'};

    char foa[]={'b','c','i','e','j','h','x','z','d','y','p','o','t','s','g','l','w','a','n','v','f','k','m','q','r','u'};
    char fon[]={'9','0','8','2','1','7','4','3','6','5'};

    char fpa[]={'g','i','o','r','u','m','p','b','j','w','d','f','v','s','a','k','n','c','x','y','z','e','q','h','t','l'};
    char fpn[]={'3','8','5','1','6','9','7','2','0','4',};

    char fqa[]={'v','e','l','g','j','r','b','u','w','d','n','t','a','q','z','f','k','s','h','m','x','c','y','o','i','p'};
    char fqn[]={'4','6','8','2','9','7','0','3','5','1'};

    char fra[]={'o','f','q','j','m','b','p','s','g','u','n','h','w','y','a','k','x','d','z','i','r','l','c','v','t','e'};
    char frn[]={'3','6','1','5','7','9','4','0','8','2'};

    char fsa[]={'p','o','x','n','y','i','u','d','q','f','v','g','r','w','a','l','b','t','e','j','m','c','s','h','z','k'};
    char fsn[]={'1','5','4','7','2','6','3','9','0','8'};

    char fta[]={'s','t','l','u','m','r','a','q','d','z','e','y','g','h','b','v','p','n','o','c','w','f','x','k','i','j'};
    char ftn[]={'6','9','1','4','5','2','8','3','7','0'};

    char fua[]={'u','t','s','v','q','r','w','c','d','x','e','p','f','a','y','b','m','o','g','n','h','z','l','i','j','k'};
    char fun[]={'2','8','1','9','3','0','4','7','5','6'};

    char fva[]={'i','j','w','x','h','v','a','f','e','g','b','r','c','y','d','s','t','u','k','l','z','n','m','q','p','o'};
    char fvn[]={'5','8','4','7','2','1','3','9','6','0'};

    char fwa[]={'f','j','i','m','r','b','c','l','a','k','s','e','w','x','d','o','t','u','n','v','y','p','g','z','q','h'};
    char fwn[]={'5','2','4','7','8','1','3','6','9','0'};

    char fxxa[]={'b','i','j','a','y','k','p','e','h','v','l','o','u','d','x','z','f','g','t','w','m','r','n','s','q','c'};
    char fxxn[]={'4','7','3','0','6','1','8','9','2','5'};

    char fya[]={'e','h','j','r','f','t','g','i','w','z','s','l','k','m','q','b','p','d','x','c','n','u','v','a','y','o'};
    char fyn[]={'3','5','8','1','6','7','2','9','4','0'};

    char fza[]={'d','i','j','e','q','f','a','h','c','v','k','b','p','z','r','g','w','x','l','s','y','n','t','u','o','m'};
    char fzn[]={'6','9','1','7','3','4','0','8','2','5'};

    static void keyGen(int n)
    {
        int x;
        String M="";
        char alph1[]={'0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char alph2[]={'0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i=1;i<=n;i++)
        {
            x=(int)(Math.random()*3);
            if(x==1) M+=(int)(Math.random()*9);
            else if(x==2) M+=alph1[(int)(Math.random()*26)];
            else M+=alph2[(int)(Math.random()*26)];
        }
        System.out.println(M);
    }

    static void assist()
    {
        for(int j=1;j<=26;j++)
        {
            String x="";
            x+=(char)(j+96);
            String a="char f"+x+"a[]={",n="char f"+x+"n[]={";
            int i;
            Scanner sc=new Scanner(System.in);
            System.out.print("Please enter alphabet : ");
            String S=sc.nextLine();
            for(i=0;i<S.length();i++)
            {
                a+="'"+S.charAt(i)+"'";
                if(i<25) a+=",";
            }
            a+="};";
            System.out.print("Please enter number : ");
            S=sc.nextLine();
            for(i=0;i<S.length();i++)
            {
                n+="'"+S.charAt(i)+"'";
                if(i<9) n+=",";
            }
            n+="};";

            System.out.println(a+"\n"+n);
        }
    }

    static void assist2()
    {
        int count=1;
        for(char c='a';c<='z';c++) System.out.println("case "+(count++)+" : fxa=f"+c+"a;fxn=f"+c+"n;break;");
    }

    void assist3()
    {
        String a;
        for(char alph='a';alph<='z';alph++)
        {
            a="char f"+alph+"a[]={";
            for(char c='a';c<='z';c++)
            {
                a+="'"+(char)(find(alph-96,c)+97)+"',";
            }
            a+="};";
            System.out.println(a);
        }
    }

    int find(int ref,char c)
    {
        char fxa[]=new char[1],fxn[]=new char[1];
        switch(ref)
        {
            case 1 : fxa=faa;fxn=fan;break;
            case 2 : fxa=fba;fxn=fbn;break;
            case 3 : fxa=fca;fxn=fcn;break;
            case 4 : fxa=fda;fxn=fdn;break;
            case 5 : fxa=fea;fxn=fen;break;
            case 6 : fxa=ffa;fxn=ffn;break;
            case 7 : fxa=fga;fxn=fgn;break;
            case 8 : fxa=fha;fxn=fhn;break;
            case 9 : fxa=fia;fxn=fin;break;
            case 10 : fxa=fja;fxn=fjn;break;
            case 11 : fxa=fka;fxn=fkn;break;
            case 12 : fxa=fla;fxn=fln;break;
            case 13 : fxa=fma;fxn=fmn;break;
            case 14 : fxa=fna;fxn=fnn;break;
            case 15 : fxa=foa;fxn=fon;break;
            case 16 : fxa=fpa;fxn=fpn;break;
            case 17 : fxa=fqa;fxn=fqn;break;
            case 18 : fxa=fra;fxn=frn;break;
            case 19 : fxa=fsa;fxn=fsn;break;
            case 20 : fxa=fta;fxn=ftn;break;
            case 21 : fxa=fua;fxn=fun;break;
            case 22 : fxa=fva;fxn=fvn;break;
            case 23 : fxa=fwa;fxn=fwn;break;
            case 24 : fxa=fxxa;fxn=fxxn;break;
            case 25 : fxa=fya;fxn=fyn;break;
            case 26 : fxa=fza;fxn=fzn;break;
            default:break;
        }
        for(int i=0;i<fxa.length;i++) if(fxa[i]==c) return i;
        return 0;
    }

    String _n(String S)
    {
        String x="";
        int i;
        for(i=0;i<S.length();i=i+2) x+=S.charAt(i);
        for(i=1;i<S.length();i=i+2) x+=S.charAt(i);
        return x;
    }

    String _N(String S)
    {
        String x="";
        int left=0,right=S.length()-1;
        while(left<right)
        {
            x+=S.charAt(left++);
            x+=S.charAt(right--);
        }
        if(S.length()%2!=0) x+=S.charAt(left);
        return x;
    }

    String _x(String S,int ref)
    {
        int i;
        char c,fxa[]=new char[1],fxn[]=new char[1];
        switch(ref)
        {
            case 0 : fxa=f0a;fxn=f0n;break;
            case 1 : fxa=f1a;fxn=f1n;break;
            case 2 : fxa=f2a;fxn=f2n;break;
            case 3 : fxa=f3a;fxn=f3n;break;
            case 4 : fxa=f4a;fxn=f4n;break;
            case 5 : fxa=f5a;fxn=f5n;break;
            case 6 : fxa=f6a;fxn=f6n;break;
            case 7 : fxa=f7a;fxn=f7n;break;
            case 8 : fxa=f8a;fxn=f8n;break;
            case 9 : fxa=f9a;fxn=f9n;break;     
            default:break;
        }
        String x="";

        for(i=0;i<S.length();i++)
        {
            c=S.charAt(i);
            if(c>='a' && c<='z') x+=fxa[c-97];
            else if(c>='A' && c<='Z') x+=(char)((int)fxa[c-65]-32);
            else if(c>='0' && c<='9') x+=fxn[c-48];
            else x+=c;
        }
        return x;
    }

    void testPrab()
    {
        String c="g";
        System.out.println(c);
        for(int i=1;i<=26;i++) 
        {
            c=_alpha2(c,i);
            System.out.println(c);
        }
    }

    String _alpha(String S,int ref)
    {
        int i;

        char c,fxa[]=new char[1],fxn[]=new char[1];
        switch(ref)
        {
            case 1 : fxa=fAa;fxn=fAn;break;
            case 2 : fxa=fBa;fxn=fBn;break;
            case 3 : fxa=fCa;fxn=fCn;break;
            case 4 : fxa=fDa;fxn=fDn;break;
            case 5 : fxa=fEa;fxn=fEn;break;
            case 6 : fxa=fFa;fxn=fFn;break;
            case 7 : fxa=fGa;fxn=fGn;break;
            case 8 : fxa=fHa;fxn=fHn;break;
            case 9 : fxa=fIa;fxn=fIn;break;
            case 10 : fxa=fJa;fxn=fJn;break;
            case 11 : fxa=fKa;fxn=fKn;break;
            case 12 : fxa=fLa;fxn=fLn;break;
            case 13 : fxa=fMa;fxn=fMn;break;
            case 14 : fxa=fNa;fxn=fNn;break;
            case 15 : fxa=fOa;fxn=fOn;break;
            case 16 : fxa=fPa;fxn=fPn;break;
            case 17 : fxa=fQa;fxn=fQn;break;
            case 18 : fxa=fRa;fxn=fRn;break;
            case 19 : fxa=fSa;fxn=fSn;break;
            case 20 : fxa=fTa;fxn=fTn;break;
            case 21 : fxa=fUa;fxn=fUn;break;
            case 22 : fxa=fVa;fxn=fVn;break;
            case 23 : fxa=fWa;fxn=fWn;break;
            case 24 : fxa=fXa;fxn=fXn;break;
            case 25 : fxa=fYa;fxn=fYn;break;
            case 26 : fxa=fZa;fxn=fZn;break;
            default:break;
        }
        String x="";
        for(i=0;i<S.length();i++)
        {
            c=S.charAt(i);
            if(c>='a' && c<='z') x+=fxa[c-97];
            else if(c>='A' && c<='Z') x+=(char)((int)fxa[c-65]-32);
            else if(c>='0' && c<='9') x+=fxn[c-48];
            else x+=c;
        }
        return x;
    }

    String _alpha2(String S,int ref)
    {
        int i;
        char c,fxa[]=new char[1],fxn[]=new char[1];
        switch(ref)
        {
            case 1 : fxa=faa;fxn=fan;break;
            case 2 : fxa=fba;fxn=fbn;break;
            case 3 : fxa=fca;fxn=fcn;break;
            case 4 : fxa=fda;fxn=fdn;break;
            case 5 : fxa=fea;fxn=fen;break;
            case 6 : fxa=ffa;fxn=ffn;break;
            case 7 : fxa=fga;fxn=fgn;break;
            case 8 : fxa=fha;fxn=fhn;break;
            case 9 : fxa=fia;fxn=fin;break;
            case 10 : fxa=fja;fxn=fjn;break;
            case 11 : fxa=fka;fxn=fkn;break;
            case 12 : fxa=fla;fxn=fln;break;
            case 13 : fxa=fma;fxn=fmn;break;
            case 14 : fxa=fna;fxn=fnn;break;
            case 15 : fxa=foa;fxn=fon;break;
            case 16 : fxa=fpa;fxn=fpn;break;
            case 17 : fxa=fqa;fxn=fqn;break;
            case 18 : fxa=fra;fxn=frn;break;
            case 19 : fxa=fsa;fxn=fsn;break;
            case 20 : fxa=fta;fxn=ftn;break;
            case 21 : fxa=fua;fxn=fun;break;
            case 22 : fxa=fva;fxn=fvn;break;
            case 23 : fxa=fwa;fxn=fwn;break;
            case 24 : fxa=fxxa;fxn=fxxn;break;
            case 25 : fxa=fya;fxn=fyn;break;
            case 26 : fxa=fza;fxn=fzn;break;
            default:break;
        }
        String x="";

        for(i=0;i<S.length();i++)
        {
            c=S.charAt(i);
            if(c>='a' && c<='z') x+=fxa[c-97];
            else if(c>='A' && c<='Z') x+=(char)((int)fxa[c-65]-32);
            else if(c>='0' && c<='9') x+=fxn[c-48];
            else x+=c;
        }
        return x;
    }

    void create()throws IOException
    {
        PrintWriter ofile=new PrintWriter(new FileWriter("Encrypted.txt"));
        Scanner sc=new Scanner(System.in);
        Scanner delta=new Scanner(System.in);
        System.out.print("Please Create a Key : ");
        String code=sc.nextLine();
        System.out.print("Please Enter ID : ");
        int x=delta.nextInt();
        String N="";
        int n,i,j;
        char c;
        while(true)
        {
            System.out.print("Please Enter : ");
            N=sc.nextLine();
            if(N.equals("0")) break;
            for(i=1;i<=x;i++)
            {
                for(j=0;j<code.length();j++)
                {
                    c=code.charAt(j);
                    if(c>='0' && c<='9')
                    {
                        n=c-48;
                        if(n%2==0) N=_n(N);
                        else N=_N(N);
                        N=_x(N,n);
                    }
                    else if(c>='a' && c<='z')
                    {
                        n=c-96;
                        if(n%2==0) N=_n(N);
                        else N=_N(N);
                        N=_alpha(N,n);
                    }
                    else if(c>='A' && c<='Z')
                    {
                        n=c-64;
                        if(n%2==0) N=_n(N);
                        else N=_N(N);
                        N=_alpha2(N,n);
                    }
                }
            }
            ofile.println(N);
        }
        System.out.println("\n\n∆ Encrypted!");
        ofile.close();
    }

    
    String encrypt(String N,String code,int id)
    {
        char c;
        int j,n,i;
        for(i=1;i<=id;i++)
        {
            for(j=0;j<code.length();j++)
            {
                c=code.charAt(j);
                if(c>='0' && c<='9')
                {
                    n=c-48;
                    if(n%2==0) N=_n(N);
                    else N=_N(N);
                    N=_x(N,n);
                }
                else if(c>='a' && c<='z')
                {
                    n=c-96;
                    if(n%2==0) N=_n(N);
                    else N=_N(N);
                    N=_alpha(N,n);
                }
                else if(c>='A' && c<='Z')
                {
                    n=c-64;
                    if(n%2==0) N=_n(N);
                    else N=_N(N);
                    N=_alpha2(N,n);
                }
            }
        }
        return N;
    }

    static String text4(char c)
    {
        String u="";
        u+=c;
        return u.toUpperCase();
    }
}

