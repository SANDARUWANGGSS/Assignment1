object Assignment1_Scala extends App
{
    def convert(x:Double)=x*1.8+32;
      println(convert(35));


        def volume(y:Double):Double=22*y*y*y*4/(3*7);
          println(volume(5)+" m^2");


            def cost(z:Int):Double=
                {
                      if(z<=50)
                            {
                                    (24.95*z)*60/100+3;
                                        }                                                                                                                                                             else
                                              {
                                                      (24.95*z)*60/100+3+0.75*(z-50);
                                                          }
                                                            }
              println("Rs. "+cost(60));

}
