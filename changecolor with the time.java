   Date date = new Date();
    DateFormat df = new SimpleDateFormat("k");
    String hour = df.format(date);
    String hourString = new SimpleDateFormat("k").format(date);
    int hours = Integer.parseInt(hourString);
   
  if (hours >= 22 || hours < 6) { 
       jPanel1.setBackground(Color.black);
       System.out.println("il fait nuit, le système passe en mode nuit afin d'assurer un meilleur conford d'utilisation, "
               + "faciliter le sommeil et limiter la fatigue des yeux ");
    }
   
    else  {
       jPanel1.setBackground(Color.white);
       System.out.println("il fait jour, le système passe en mode jour afin d'assurer un meilleur conford d'utilisation,"
       + "faciliter les activités et habituer les yeux à la lumière du jour");
    }
  
