import java.util.*;
import java.io.*;
public class Decrypt
{
    char f0a[]={'n','b','j','t','p','h','d','r','l','f','c','u','v','s','q','m','k','i','g','x','y','e','z','a','o','w'};
    char f0n[]={'7','0','2','5','3','9','8','6','4','1'};

    char f1a[]={'j','d','p','t','l','g','w','y','v','n','q','f','a','c','i','m','k','h','r','x','z','u','s','o','e','b'};    
    char f1n[]={'9','1','5','7','0','3','4','8','2','6'};

    char f2a[]={'g','t','x','i','z','n','a','d','l','f','q','e','s','v','y','w','o','k','j','p','m','u','h','c','r','b'};
    char f2n[]={'2','0','4','3','1','5','9','6','8','7'};

    char f3a[]={'w','f','a','h','b','n','r','y','c','k','o','u','p','x','d','s','z','v','q','e','l','i','t','m','j','g'};
    char f3n[]={'7','0','5','2','1','9','3','6','4','8'};

    char f4a[]={'l','n','r','p','u','w','s','t','c','g','j','z','d','f','e','k','b','a','o','i','y','q','h','m','x','v'};
    char f4n[]={'4','2','6','5','8','1','7','9','0','3'};

    char f5a[]={'z','q','h','o','v','u','w','k','b','m','j','p','r','x','s','y','t','l','d','f','e','c','g','i','n','a'};
    char f5n[]={'7','2','4','0','6','1','5','8','9','3'};

    char f6a[]={'w','n','j','a','c','b','o','i','k','t','y','r','p','x','z','u','d','f','l','g','m','h','e','q','s','v'};
    char f6n[]={'3','5','9','6','0','4','7','1','2','8'};

    char f7a[]={'e','o','a','b','q','p','j','k','l','g','z','y','x','w','v','u','t','s','m','n','i','h','f','d','r','c'};
    char f7n[]={'3','9','4','0','8','7','2','6','5','1'};

    char f8a[]={'q','m','j','t','f','b','w','k','s','i','c','h','a','x','y','u','r','o','l','z','v','n','e','g','d','p'};
    char f8n[]={'7','4','5','8','2','0','3','9','6','1'};

    char f9a[]={'u','g','m','y','a','j','z','d','b','s','w','k','x','c','l','q','n','v','e','r','p','f','h','t','i','o'};
    char f9n[]={'5','9','1','7','0','3','8','4','6','2'};

    char fAa[]={'f','n','k','s','p','v','q','l','o','w','z','a','g','m','i','e','h','t','r','x','b','d','c','u','j','y'};
    char fAn[]={'8','5','7','3','6','1','0','9','2','4'};

    char fBa[]={'d','z','t','x','q','i','n','u','r','j','o','v','y','s','w','k','p','l','f','c','h','a','g','b','m','e'};
    char fBn[]={'8','3','6','4','0','2','7','1','9','5'};

    char fCa[]={'d','l','j','c','r','o','e','m','k','n','f','y','q','z','x','p','w','b','g','i','v','u','a','h','t','s',};
    char fDa[]={'r','l','w','h','a','o','y','u','p','i','c','e','v','z','d','k','x','b','f','j','n','q','s','m','g','t',};
    char fEa[]={'f','h','p','a','w','l','c','t','n','y','j','d','r','x','g','o','b','z','u','q','i','v','m','e','k','s',};
    char fFa[]={'h','k','b','e','p','w','s','m','j','q','u','x','z','o','c','a','d','l','g','r','i','t','v','y','n','f',};
    char fGa[]={'l','f','v','b','d','q','x','h','j','i','c','a','s','n','e','k','y','o','u','m','g','r','w','t','z','p',};
    char fHa[]={'j','m','p','o','n','k','l','q','v','u','t','s','w','y','r','x','z','a','e','g','b','h','d','i','c','f',};
    char fIa[]={'c','f','i','e','r','y','s','n','t','w','z','d','a','g','k','o','u','p','b','j','q','v','l','h','m','x',};
    char fJa[]={'z','x','t','p','j','e','a','c','g','l','r','w','y','u','q','m','n','h','d','b','f','i','k','o','s','v',};
    char fKa[]={'k','p','t','y','b','e','i','m','q','l','f','j','r','v','s','x','z','u','o','h','c','a','d','g','n','w',};
    char fLa[]={'b','a','f','g','l','k','p','q','u','v','z','y','c','h','m','r','w','x','t','o','j','e','i','n','s','d',};
    char fMa[]={'m','r','h','x','d','p','e','z','s','i','u','a','q','n','b','j','c','l','v','t','w','f','g','k','y','o',};
    char fNa[]={'e','h','s','o','u','k','x','a','y','f','j','p','t','v','b','w','z','l','m','n','c','q','d','g','i','r',};
    char fOa[]={'b','e','p','k','x','a','l','g','r','u','c','h','m','q','v','d','j','s','w','i','t','y','f','n','z','o',};
    char fPa[]={'l','g','o','n','c','a','r','v','t','p','w','u','z','i','b','e','k','h','d','q','j','s','f','y','m','x',};
    char fQa[]={'l','i','q','n','j','c','v','t','a','f','y','g','z','w','d','h','k','s','o','x','u','r','b','e','m','p',};
    char fRa[]={'j','o','g','h','s','l','w','c','m','t','q','b','e','a','u','x','v','y','f','d','z','r','i','k','n','p',};
    char fSa[]={'p','m','t','a','v','h','r','o','j','d','s','q','k','l','f','g','e','b','w','c','i','n','u','z','y','x',};
    char fTa[]={'n','l','j','s','f','v','x','q','m','h','p','o','t','w','r','z','b','g','a','e','k','c','y','d','u','i',};
    char fUa[]={'l','j','h','q','w','b','i','m','n','s','u','o','c','z','x','d','g','k','p','e','t','y','v','f','r','a',};
    char fVa[]={'l','r','i','k','p','t','d','n','g','o','w','j','z','f','a','m','h','q','y','b','c','u','v','s','e','x',};
    char fWa[]={'p','j','s','w','u','g','e','c','m','y','x','n','z','v','f','d','t','o','r','i','q','l','a','k','h','b',};
    char fXa[]={'j','p','o','k','u','w','r','q','l','g','a','b','i','h','c','z','v','y','x','d','e','n','m','t','s','f',};
    char fYa[]={'b','d','g','f','m','q','k','t','j','w','z','n','r','u','x','c','a','e','i','l','s','h','o','v','y','p',};
    char fZa[]={'i','d','r','a','f','o','q','s','t','w','y','u','p','z','k','b','g','c','h','l','e','j','n','v','m','x',};

    char fCn[]={'3','7','1','9','0','4','8','5','2','6',};
    char fDn[]={'6','2','8','4','0','7','3','5','1','9',};
    char fEn[]={'4','8','1','3','9','6','5','2','7','0',};
    char fFn[]={'1','0','4','6','2','8','5','9','3','7',};
    char fGn[]={'4','7','1','0','6','5','2','9','3','8',};
    char fHn[]={'8','6','4','3','2','5','9','7','1','0',};
    char fIn[]={'5','3','7','0','9','2','8','1','4','6',};
    char fJn[]={'9','7','4','1','3','6','2','5','8','0',};
    char fKn[]={'9','7','1','4','3','8','2','5','6','0',};
    char fLn[]={'9','5','2','0','3','6','7','4','1','8',};
    char fMn[]={'8','7','9','4','6','1','2','5','3','0',};
    char fNn[]={'9','1','3','0','5','2','8','6','7','4',};
    char fOn[]={'6','0','8','2','1','7','5','3','9','4',};
    char fPn[]={'5','3','7','9','1','8','4','2','6','0',};
    char fQn[]={'2','4','8','0','9','6','1','3','5','7',};
    char fRn[]={'2','5','3','6','7','1','9','4','0','8',};
    char fSn[]={'7','2','3','9','0','8','5','4','6','1',};
    char fTn[]={'4','7','3','6','9','2','0','5','1','8',};
    char fUn[]={'4','0','1','7','5','9','2','8','6','3',};
    char fVn[]={'5','7','6','4','2','3','0','9','1','8',};
    char fWn[]={'5','2','8','0','6','9','4','1','7','3',};
    char fXn[]={'8','9','0','7','4','2','1','6','3','5',};
    char fYn[]={'1','4','8','6','9','0','5','2','3','7',};
    char fZn[]={'4','9','5','8','3','2','0','7','1','6',};

    char fan[]={'6','2','5','3','8','0','1','4','9','7',};
    char fbn[]={'9','0','7','3','8','1','6','2','5','4',};
    char fcn[]={'5','9','4','2','7','8','3','6','1','0',};
    char fdn[]={'9','5','3','0','8','4','7','1','2','6',};
    char fen[]={'5','7','6','9','2','0','8','1','4','3',};
    char ffn[]={'6','7','3','8','4','1','5','0','9','2',};
    char fgn[]={'6','0','9','4','2','1','7','8','3','5',};
    char fhn[]={'3','7','2','9','4','0','6','1','8','5',};
    char fin[]={'3','7','9','8','4','1','0','2','6','5',};
    char fjn[]={'5','0','3','7','1','4','2','9','6','8',};
    char fkn[]={'7','3','9','5','0','1','8','6','2','4',};
    char fln[]={'9','5','1','7','2','6','8','0','3','4',};
    char fmn[]={'2','0','6','8','9','3','7','1','4','5',};
    char fnn[]={'3','5','1','9','7','4','8','2','6','0',};
    char fon[]={'1','4','3','7','6','9','8','5','2','0',};
    char fpn[]={'8','3','7','0','9','2','4','6','1','5',};
    char fqn[]={'6','9','3','7','0','8','1','5','2','4',};
    char frn[]={'7','2','9','0','6','3','1','4','8','5',};
    char fsn[]={'8','0','4','6','2','1','5','3','9','7',};
    char ftn[]={'9','2','5','7','3','4','0','8','6','1',};
    char fun[]={'5','2','0','4','6','8','9','7','1','3',};
    char fvn[]={'9','5','4','6','2','0','8','3','1','7',};
    char fwn[]={'9','5','1','6','2','0','7','3','4','8',};
    char fxxn[]={'3','5','8','2','0','9','4','1','6','7',};
    char fyn[]={'9','3','6','0','8','1','4','5','2','7',};
    char fzn[]={'6','2','8','4','5','9','0','3','7','1',};

    char faa[]={'r','h','c','n','q','u','x','z','i','a','f','b','j','p','d','g','o','k','s','l','t','m','y','w','e','v',};
    char fba[]={'q','i','n','v','t','e','b','l','x','r','z','y','g','a','c','f','j','k','m','s','w','o','h','d','p','u',};
    char fca[]={'s','o','i','w','q','k','f','y','u','z','r','m','g','c','b','p','l','n','t','x','v','j','h','e','d','a',};
    char fda[]={'g','o','s','u','l','v','y','z','p','w','x','t','r','q','n','j','i','e','b','a','d','f','h','k','m','c',};
    char fea[]={'p','j','s','h','v','r','m','y','d','o','a','k','c','z','w','n','e','b','x','l','f','i','t','g','u','q',};
    char ffa[]={'u','l','g','j','d','q','n','w','p','s','y','i','e','f','o','m','h','c','b','t','x','z','v','r','k','a',};
    char fga[]={'p','k','z','x','u','r','m','g','c','w','s','o','i','e','y','t','q','n','f','v','h','d','b','l','a','j',};
    char fha[]={'p','i','m','u','y','d','a','n','s','h','f','w','q','k','e','b','o','t','c','z','l','j','r','v','g','x',};
    char fia[]={'t','n','w','q','j','h','o','k','r','v','u','s','x','z','i','e','y','l','p','f','m','b','d','c','g','a',};
    char fja[]={'f','m','k','r','p','v','z','c','a','i','o','t','x','b','e','h','l','q','s','w','y','u','n','j','d','g',};
    char fka[]={'p','r','w','k','g','c','e','z','u','m','q','t','n','s','x','i','d','f','h','a','b','o','y','v','l','j',};
    char fla[]={'i','a','z','x','u','q','n','r','o','k','f','b','m','p','s','v','w','t','j','l','e','g','h','c','d','y',};
    char fma[]={'r','u','x','n','k','h','e','b','z','v','s','o','l','i','f','a','y','q','m','j','c','g','d','t','w','p',};
    char fna[]={'p','t','x','z','l','g','q','u','y','h','d','a','e','m','r','v','s','w','n','i','o','k','f','j','c','b',};
    char foa[]={'r','a','b','i','d','u','o','f','c','e','v','p','w','s','l','k','x','y','n','m','z','t','q','g','j','h',};
    char fpa[]={'o','h','r','k','v','l','a','x','b','i','p','z','f','q','c','g','w','d','n','y','e','m','j','s','t','u',};
    char fqa[]={'m','g','v','j','b','p','d','s','y','e','q','c','t','k','x','z','n','f','r','l','h','a','i','u','w','o',};
    char fra[]={'o','f','w','r','z','b','i','l','t','d','p','v','e','k','a','g','c','u','h','y','j','x','m','q','n','s',};
    char fsa[]={'o','q','v','h','s','j','l','x','f','t','z','p','u','d','b','a','i','m','w','r','g','k','n','c','e','y',};
    char fta[]={'g','o','t','i','k','v','m','n','y','z','x','c','e','r','s','q','h','f','a','b','d','p','u','w','l','j',};
    char fua[]={'n','p','h','i','k','m','s','u','x','y','z','w','q','t','r','l','e','f','c','b','a','d','g','j','o','v',};
    char fva[]={'g','k','m','o','i','h','j','e','a','b','s','t','w','v','z','y','x','l','p','q','r','f','c','d','n','u',};
    char fwa[]={'i','f','g','o','l','a','w','z','c','b','j','h','d','s','p','v','y','e','k','q','r','t','m','n','u','x',};
    char fxxa[]={'d','a','z','n','h','q','r','i','b','c','f','k','u','w','l','g','y','v','x','s','m','j','t','o','e','p',};
    char fya[]={'x','p','t','r','a','e','g','b','h','c','m','l','n','u','z','q','o','d','k','f','v','w','i','s','y','j',};
    char fza[]={'g','l','i','a','d','f','p','h','b','c','k','s','z','v','y','m','e','o','t','w','x','j','q','r','u','n',};

    String _n(String S)
    {
        int n=S.length(),m=(n/2)+(n%2),a=0,b=m;
        String x="";
        while(b<n || a<m)
        {
            x+=S.charAt(a);
            if(b<n) x+=S.charAt(b);
            a++;
            b++;
        }
        return x;
    }

    static String _N(String S)
    {
        int i;
        String x="",y="";
        for(i=0;i<S.length();i=i+2) x+=S.charAt(i);
        for(i=1;i<S.length();i=i+2) y+=S.charAt(i);
        for(i=y.length()-1;i>=0;i--) x+=y.charAt(i);
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

    void read()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        Scanner delta=new Scanner(System.in);
        System.out.print("Please Enter Code : ");
        String code=sc.nextLine();
        System.out.print("Please Enter ID : ");
        int a=delta.nextInt();
        BufferedReader ifile = new BufferedReader(new FileReader("Encrypted.txt"));
        PrintWriter ofile=new PrintWriter(new FileWriter("Decrypted.txt"));
        String N;
        int n,i,j;
        char c;
        String x="";
        System.out.println("\n\n");
        for(i=code.length()-1;i>=0;i--) x+=code.charAt(i);
        code=x;
        while(true)
        {
            N=ifile.readLine();
            if(N==null) break;
            for(j=1;j<=a;j++)
            {
                for(i=0;i<code.length();i++)
                {
                    c=code.charAt(i);
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
            System.out.println(N);
            ofile.println(N);
        }
        ifile.close();
        ofile.close();
        System.out.print("∆ Decrypted!\n");
    }

    String decrypt(String N,String code,int id)
    {
        int i,n,j;
        char c;
        for(j=1;j<=id;j++)
        {
            for(i=code.length()-1;i>=0;i--)
            {
                c=code.charAt(i);
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
}

