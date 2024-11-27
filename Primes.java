public class Primes {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[number+1];
        primes[0]=false;
        primes[1]=false;
        for(int i=2;i<number;i++)
        {
        primes[i]=true;
        }

        int p=2;
        while(p<Math.sqrt(number)){
        if (primes[p]==true){
        for(int i=p+1;i<primes.length;i++)
        {
        if (i%p ==0)primes[i]=false;
        }  
        }
        p++;
        }
       
        int c=0;    
        System.out.println("Prime numbers up to " + number + ":");
        for (int i = 2; i <= number; i++) {
            if (primes[i]==true) {
                System.out.println("" + i);
                c++;
            }
        }
        double x = ((double) c / (double) number) * 100;
        System.out.println("There are " + c + " primes between 2 and " + number + " (" + (int) x + "% are primes)");
    }
}