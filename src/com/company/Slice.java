package com.company;

public class Slice {
    int sl,sr,sum,it;
    boolean c ;
    Slice()
    {
        sl=0;
        sr=0;
        sum=0;
        c=true;
        it=0;

    }
    void sum(int a[],int it)
    {


        if(this.c)
        {
            for(int i: a)
            {
                this.sum+=i;
            }
            this.c=false;
        }

        for(int i=0;i<it;i++)
        {
            sl+=a[i];

        }
        sr=sum-sl;


    }

    void sliceArrayt(int a[])
    {
        sum(a,0);
        if(this.sum%2==1)
        {
            System.out.println("Not Possible !");
        }
        else
        {
            sliceArray(a,it);

        }
    }
    private  void sliceArray(int a[],int i)
    {
        sum(a,it);
        if(sl==sr)
        {
            System.out.println("Possible!");
        }
        else
        {
            if(it<a.length)
            {
                sliceArray(a,++it);
            }
        }

    }


}