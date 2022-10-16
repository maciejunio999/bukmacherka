public class Meecz{

    public void setFortuna(double[] fortuna) {this.fortuna = fortuna;}
    public double[] getFortuna() {return fortuna;}

    public double[] getSts() {return sts;}
    public void setSts(double[] sts) {this.sts = sts;}

    public void setSuperbet(double[] superbet) {this.superbet = superbet;}
    public double[] getSuperbet() {return superbet;}

    public void setBetclick(double[] betclic) {this.betclic = betclic;}
    public double[] getBetclick() {return betclic;}

    public void setFanBet(double[] fanBet) {this.fanBet = fanBet;}
    public double[] getFanBet() {return fanBet;}

    public void setLVBet(double[] lvBet) {this.lvBet = lvBet;}
    public double[] getLvBet() {return lvBet;}

    public double[] fortuna = new double[3];
    public double[] sts = new double[3];
    public double[] betclic = new double[3];
    public double[] superbet = new double[3];
    public double[] fanBet = new double[3];
    public double[] lvBet = new double[3];

    public double dzialanie(double[] s){return ((1/s[0]) + (1/s[1]) + 1/s[2]);}

    public double d(double a, double b, double c){return ((1/a) + (1/b) + (1/c));}

    public double pomocPorownianie(double a, double b){
        if (a < b){
            return b;
        }else if (a > b){
            return a;
        }else if (a == b){
            return a;
        }
        return 1.0;
    }

    public double najnizszaKombinacja;
    public double podatek = 0.12;

    public double getNajnizszaKombinacja() {return najnizszaKombinacja;}
    public void setNajnizszaKombinacja(double najnizszaKombinacja) {this.najnizszaKombinacja = najnizszaKombinacja;}

    public void mieszanie(double[][] bukmacherzy, double[] kwota){

        double wygrana1 = 1.0;
        double remis = 1.0;
        double wygrana2 = 1.0;

        for(int i = 0; i <= 3; i++){
            switch (i){
                case 0:
                    for(int j = 0; j < bukmacherzy.length; j++){
                        wygrana1 = pomocPorownianie(wygrana1, bukmacherzy[j][i]);
                    }break;
                case 1:
                    for(int j = 0; j < bukmacherzy.length; j++){
                        remis = pomocPorownianie(remis, bukmacherzy[j][i]);
                    }break;
                case 2:
                    for(int j = 0; j < bukmacherzy.length; j++){
                        wygrana2 = pomocPorownianie(wygrana2, bukmacherzy[j][i]);
                    }break;
            }
        }

        for(int i = 0; i <= 3; i++){
            switch (i){
                case 0:
                    for(int j = 0; j < bukmacherzy.length; j++){
                        if(bukmacherzy[j][i] == wygrana1){

                        }
                    }break;
                case 1:
                    for(int j = 0; j < bukmacherzy.length; j++){
                        remis = pomocPorownianie(remis, bukmacherzy[j][i]);
                    }break;
                case 2:
                    for(int j = 0; j < bukmacherzy.length; j++){
                        wygrana2 = pomocPorownianie(wygrana2, bukmacherzy[j][i]);
                    }break;
            }
        }

        System.out.println(wygrana1 + " " + remis + " " + wygrana2);
        setNajnizszaKombinacja(d(wygrana1, remis, wygrana2));

        for(int i = 0; i < 3; i++){
            switch (i){
                case 0:
                    System.out.println("Wygra 1, to zarabiasz: " + (kwota[0] * wygrana1 * (1 - podatek) - kwota[1] - kwota[2]));
                    break;
                case 1:
                    System.out.println("Remis, to zarabiasz: " + (kwota[1] * remis * (1 - podatek) - kwota[0] - kwota[2]));
                    break;
                case 2:
                    System.out.println("Wygra 2, to zarabiasz: " + (kwota[2] * wygrana2 * (1 - podatek) - kwota[0] - kwota[1]));
                    break;
            }
        }

    }

}