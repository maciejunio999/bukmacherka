public class mecz {

    public static void main(String[] args){

        double[] k1 = new double[] {1.98, 3.95, 3.55};  //Betclic
        double[] k2 = new double[] {2.20, 3.60, 3.25};  //Fortuna
        double[] k3 = new double[] {2.14, 3.60, 3.25};  //Betfan
        double[] k4 = new double[] {1.95, 3.70, 3.75};  //STS
        double[] k5 = new double[] {2.15, 3.70, 3.30};  //Superbet
        double[] k6 = new double[] {2.19, 3.55, 3.35};  //LVBet

        Meecz mecz = new Meecz();
        mecz.setBetclick(k1);
        mecz.setFortuna(k2);
        mecz.setFanBet(k3);
        mecz.setSts(k4);
        mecz.setSuperbet(k5);
        mecz.setLVBet(k6);

        System.out.println("FanBet: " + mecz.dzialanie(mecz.getFanBet()));
        System.out.println("SuperBet: " + mecz.dzialanie(mecz.getSuperbet()));
        System.out.println("Fortuna: " + mecz.dzialanie(mecz.getFortuna()));
        System.out.println("Betclic: " + mecz.dzialanie(mecz.getBetclick()));
        System.out.println("STS: " + mecz.dzialanie(mecz.getSts()));
        System.out.println("LVBet: " + mecz.dzialanie(mecz.getLvBet()));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        double[][] bukmacherzy = new double[][] {mecz.getFortuna(), mecz.getSts(), mecz.getBetclick(), mecz.getSuperbet(), mecz.getFanBet(), mecz.getLvBet()};

        System.out.println("monejmonejmonej");
        mecz.mieszanie(bukmacherzy, new double[] {12,10,10});

//        System.out.println("20zl - ");
//        mecz.mieszanie(bukmacherzy, new double[] {20,20,20});
//        System.out.println("50zl - ");
//        mecz.mieszanie(bukmacherzy, new double[] {50,50,50});
//        System.out.println("100zl - ");
//        mecz.mieszanie(bukmacherzy, new double[] {100,100,100});

        System.out.println(mecz.getNajnizszaKombinacja());

    }

}
