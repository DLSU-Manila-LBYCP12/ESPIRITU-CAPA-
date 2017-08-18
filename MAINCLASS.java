
import acm.graphics.*;
import acm.program.*;
import breakout.BreakOutESPIRITU;
import calculator.CalcuESPIRITU;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import mylist.*;

public class MAINCLASS extends GraphicsProgram {

    int thirdStreet_CHAR_TRUE = 0;
    int locationLabel_TRUE = 0;
    int secondStreet_CHAR_TRUE = 0;
    int theAlleyCHAR_TRUE = 0;
    int theEscapeCHAR_TRUE = 0;
    int YouWon = 0;
    int addToPack_TRUE = 0;
    int shampoo_TRUE = 0;
    int brickGame_TRUE = 0;
    int storyLine1_TRUE = 0;
    
    int secondStreet_TALK1_TRUE = 0;
    int secondStreet_Doctor_TRUE = 0;
    
    int sixthStreet_TALK1_TRUE=0;

            
            
    
    int mainRoad_TALK1_TRUE = 0;
    int mainRoad_POLICE_TRUE = 0;
    int turnonPack = 0;

    int z = 2;
    int c;

     GLabel playBrickGame = new GLabel("Use");

    String shampooSTRING;

    String currentLocation = "Main Road";

    Font titleFONT = new Font("Chiller", Font.PLAIN, 170);
    Font arrowsFONT = new Font("Chiller", Font.PLAIN, 120);
    Font normalFONT = new Font("Chiller", Font.PLAIN, 60);
    Font storyFONT = new Font("Chiller", Font.PLAIN, 40);
    Font locationFONT = new Font("Arial-Bold", Font.BOLD, 28);
    Font locationFONT2 = new Font("Arial-Bold", Font.BOLD, 23);
    Font locationFONT3 = new Font("Arial-Bold", Font.BOLD, 19);
    Font locationFONT4 = new Font("Arial-Bold", Font.BOLD, 15);
    Font currentLocationFONT = new Font("Arial", Font.PLAIN, 15);


    private MyList<String> BACKPACK = new MyList<String>();
    
  public void sixthStreet_METHOD() {
      
      
 
        currentLocation = "6th Street";
        GImage sixthStreet_BG = new GImage("Site.jpg");
       sixthStreet_BG.setSize(1400, 750);
        add(sixthStreet_BG);

        GImage sixthStreet_CHAR = new GImage("Construction-01.png");
        sixthStreet_CHAR.setSize(600, 600);
        sixthStreet_CHAR.setLocation(375, 80);
        add(sixthStreet_CHAR);
        
        GLabel sixthStreet_BACKTO_thirdStreet = new GLabel("<");
        sixthStreet_BACKTO_thirdStreet.setColor(Color.RED);
        sixthStreet_BACKTO_thirdStreet.setLocation(545, 680);
        sixthStreet_BACKTO_thirdStreet.setFont(arrowsFONT);
        add(sixthStreet_BACKTO_thirdStreet);

        GLabel sixthStreet_BACKTO_seventhStreet = new GLabel(">");
        sixthStreet_BACKTO_seventhStreet.setColor(Color.RED);
        sixthStreet_BACKTO_seventhStreet.setLocation(770, 680);
        sixthStreet_BACKTO_seventhStreet.setFont(arrowsFONT);
        add(sixthStreet_BACKTO_seventhStreet);
        
        if(sixthStreet_TALK1_TRUE!=0){
            GImage secondStreet_talk10 = new GImage("doctor_nothing.png");
            secondStreet_talk10.setLocation(270, 455);
            secondStreet_talk10.setSize(800, 175);
            add(secondStreet_talk10);
    }
        else {
            GImage sixthStreet_talk1 = new GImage("me1.png");
            sixthStreet_talk1.setLocation(270, 455);
            sixthStreet_talk1.setSize(800, 175);
            add(sixthStreet_talk1);

            sixthStreet_talk1.addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e) {
                    sixthStreet_talk1.setVisible(false);
                    GImage sixthStreet_talk2 = new GImage("doctor1.png");
                    sixthStreet_talk2.setLocation(270, 455);
                    sixthStreet_talk2.setSize(800, 175);
                    add(sixthStreet_talk2);

                    sixthStreet_talk2.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            sixthStreet_talk2.setVisible(false);
                            GImage sixthStreet_talk3 = new GImage("me2.png");
                            sixthStreet_talk3.setLocation(270, 455);
                            sixthStreet_talk3.setSize(800, 175);
                            add(sixthStreet_talk3);

                            sixthStreet_talk3.addMouseListener(new MouseAdapter() {

                                public void mousePressed(MouseEvent e) {
                                    
                                    sixthStreet_talk3.setVisible(false);
                                    GImage sixthStreet_talk4 = new GImage("doctor2.png");
                                    sixthStreet_talk4.setLocation(270, 455);
                                    sixthStreet_talk4.setSize(800, 175);
                                    add(sixthStreet_talk4);
     
                                        sixthStreet_talk4.addMouseListener(new MouseAdapter() {

                                        public void mousePressed(MouseEvent e) {

                                            sixthStreet_talk4.setVisible(false);
                                            GImage sixthStreet_talk5 = new GImage("me5.png");
                                            sixthStreet_talk5.setLocation(270, 455);
                                            sixthStreet_talk5.setSize(800, 175);
                                            add(sixthStreet_talk5);
                                           
                                                 sixthStreet_talk5.addMouseListener(new MouseAdapter() {

                                                public void mousePressed(MouseEvent e) {

                                                    sixthStreet_talk5.setVisible(false);
                                                    sixthStreet_CHAR.setVisible(false);
                                                    
                                                    GImage secondStreet_smallclue = new GImage("pills.png");
                                                    secondStreet_smallclue.setLocation(170, 520);
                                                    secondStreet_smallclue.setSize(30, 50);
                                                    add(secondStreet_smallclue);

                                                    
                                                            secondStreet_smallclue.addMouseListener(new MouseAdapter() {

                                                        public void mousePressed(MouseEvent e) {

                                                            
                                                            secondStreet_smallclue.setVisible(false);


                                                            GImage secondStreet_MAINclue = new GImage("pills.png");
                                                            secondStreet_MAINclue.setLocation(550, 100);
                                                            secondStreet_MAINclue.setSize(250, 450);
                                                            add(secondStreet_MAINclue);
                                                            
                                                            
                                                            secondStreet_MAINclue.addMouseListener(new MouseAdapter() {

                                                                public void mousePressed(MouseEvent e) {


                                                                    secondStreet_MAINclue.setVisible(false);
                                                                    sixthStreet_CHAR.setVisible(true);
                                                                    secondStreet_MAINclue.sendToBack();

                                                                    GImage secondStreet_talk6 = new GImage("doctor3.png");
                                                                    secondStreet_talk6.setLocation(270, 455);
                                                                    secondStreet_talk6.setSize(800, 175);
                                                                    add(secondStreet_talk6);
                                                                    
                                                                        secondStreet_talk6.addMouseListener(new MouseAdapter() {

                                                                        public void mousePressed(MouseEvent e) {


                                                                            secondStreet_talk6.setVisible(false);
                                                                           
                                                                            GImage secondStreet_talk7 = new GImage("me4.png");
                                                                            secondStreet_talk7.setLocation(270, 455);
                                                                            secondStreet_talk7.setSize(800, 175);
                                                                            add(secondStreet_talk7);

                                                                                secondStreet_talk7.addMouseListener(new MouseAdapter() {

                                                                                public void mousePressed(MouseEvent e) {

                                                                                    secondStreet_talk7.setVisible(false);

                                                                                    GImage secondStreet_talk8 = new GImage("doctor4.png");
                                                                                    secondStreet_talk8.setLocation(270, 455);
                                                                                    secondStreet_talk8.setSize(800, 175);
                                                                                    add(secondStreet_talk8);

                                                                                            secondStreet_talk8.addMouseListener(new MouseAdapter() {

                                                                                            public void mousePressed(MouseEvent e) {

                                                                                                secondStreet_talk8.setVisible(false);

                                                                                                GImage secondStreet_talk9 = new GImage("doctor5.png");
                                                                                                secondStreet_talk9.setLocation(270, 455);
                                                                                                secondStreet_talk9.setSize(800, 175);
                                                                                                add(secondStreet_talk9);

                                                                                            secondStreet_talk9.addMouseListener(new MouseAdapter() {
                                                                                            public void mousePressed(MouseEvent e) {

                                                                                                secondStreet_talk9.setVisible(false);

                                                                                                GImage secondStreet_talk10 = new GImage("doctor_nothing.png");
                                                                                                secondStreet_talk10.setLocation(270, 455);
                                                                                                secondStreet_talk10.setSize(800, 175);
                                                                                                add(secondStreet_talk10);

                                                                                                secondStreet_TALK1_TRUE = 1; 

                                                                                            }
                                                                                        });

                                                                                    }
                                                                                });

                                                                                }
                                                                            });

                                                                        }
                                                                    });

                                                                }
                                                            });

                                                        }
                                                    });

                                                }
                                            });

                                        }
                                    });

                                }
                            });

                        }
                    });

                }
            });

        }

        displayPack();

      /*  if (secondStreet_Doctor_TRUE == 1) {
            secondStreet_CHAR.setVisible(false);
        }

        secondStreet_CHAR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              
                secondStreet_Doctor_TRUE = 1;
                removeAll();
                secondStreet_METHOD();
            }

        }); */

        sixthStreet_BACKTO_seventhStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
                sixthStreet_BACKTO_seventhStreet.setColor(Color.RED);
                removeAll();
                
                seventhStreet_METHOD();

            }

        });

        sixthStreet_BACKTO_thirdStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                sixthStreet_BACKTO_thirdStreet.setColor(Color.WHITE);
                sixthStreet_BACKTO_thirdStreet.setColor(Color.RED);
                removeAll();
                displayPack();
                thirdStreet_METHOD();
            }

        });

    }


    public void startBREAKOUT() {
        JFrame breakoutwindow = new JFrame("BREAKOUT GAME");
        BreakOutESPIRITU B = new BreakOutESPIRITU();
        breakoutwindow.setSize(400, 600);
        breakoutwindow.setVisible(true);
        breakoutwindow.add(B);
        B.addMouseListeners();
        B.start();
    }

    public void startCALCULATOR() {
        JFrame calculatorwindow = new JFrame("CALCULATOR APP");
        CalcuESPIRITU C = new CalcuESPIRITU();
        calculatorwindow.setSize(315, 465);
        calculatorwindow.setVisible(true);
        C.init();
        calculatorwindow.add(C);
        C.addMouseListeners();
        C.start();

    }

    public void init() {
        this.setSize(1400, 750);
        GImage mainMenu_BG = new GImage("mainMenu_BG.jpg");
        mainMenu_BG.setSize(1400, 750);
        add(mainMenu_BG);
       

    }

    public void run() {
        BACKPACK.createList();

        addToPack();
        displayPack();

        startMenuButtons();

    }

   public void currentLocation_METHOD() {
        if (locationLabel_TRUE == 1) {
            GLabel currentLocation_LABEL = new GLabel("Location: ");
            currentLocation_LABEL.setColor(Color.BLACK);
            currentLocation_LABEL.setLocation(1100, 30);
            currentLocation_LABEL.setFont(locationFONT);
            add(currentLocation_LABEL);

            GLabel currentLocation_LABEL2 = new GLabel(currentLocation);
            currentLocation_LABEL2.setColor(Color.ORANGE);
            currentLocation_LABEL2.setLocation(1230, 30);
            currentLocation_LABEL2.setFont(locationFONT2);
            add(currentLocation_LABEL2);
        }

    }
   
   public void currentMap_METHOD()
   {
       GImage currentMap = new GImage("Map.png");
       {
           if (locationLabel_TRUE == 1) {
           currentMap.setSize(200, 200);
           currentMap.setLocation(0, 0);
           add(currentMap);
           }
       }
   }
    public void startMenuButtons() {

        GLabel STARTGAME_BUTTON = new GLabel("DEATH AT DATASAL");
        STARTGAME_BUTTON.setColor(Color.WHITE);
        STARTGAME_BUTTON.setLocation(220, 300);
        STARTGAME_BUTTON.setFont(titleFONT);
        add(STARTGAME_BUTTON);

        GLabel QUITGAME_BUTTON = new GLabel("QUIT");
        QUITGAME_BUTTON.setColor(Color.RED);
        QUITGAME_BUTTON.setLocation(800, 550);
        QUITGAME_BUTTON.setFont(normalFONT);
        add(QUITGAME_BUTTON);

        GLabel CREATORS_BUTTON = new GLabel("CREATORS");
        CREATORS_BUTTON.setColor(Color.RED);
        CREATORS_BUTTON.setLocation(545, 680);
        CREATORS_BUTTON.setFont(normalFONT);
        add(CREATORS_BUTTON);

        STARTGAME_BUTTON.addMouseListener(new MouseAdapter() {

                
                 public void mousePressed(MouseEvent e) {
                     STARTGAME_BUTTON.setColor(Color.YELLOW);
                 }
                      public void mouseReleased(MouseEvent e) {
                          STARTGAME_BUTTON.setColor(Color.WHITE);
                          if (storyLine1_TRUE == 0) {
                    removeAll();
                    GImage storyLine1BG = new GImage("story1.jpg");
                    storyLine1BG.setSize(1400, 750);
                    add(storyLine1BG);
                    storyLine1_TRUE = 1;
                    locationLabel_TRUE = 1;
                }

                GLabel proc1 = new GLabel("PROCEED");
                proc1.setColor(Color.WHITE);
                proc1.setLocation(750, 550);
                proc1.setFont(normalFONT);
                add(proc1);

                proc1.addMouseListener(new MouseAdapter() {
                     
                 public void mousePressed(MouseEvent e) {
                     proc1.setColor(Color.YELLOW);
                 }
                      public void mouseReleased(MouseEvent e) {
                          proc1.setColor(Color.WHITE);
                    
                       
                        removeAll();
                        turnonPack = 1;
                        brickGame_TRUE = 1;
                        mainRoad_METHOD();

                    }

                });
                 }
                
                

            

        });

        QUITGAME_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
             
                removeAll();
                quitGame();
            }

        });

    }

     public void useButtons() {
        if (brickGame_TRUE == 1) {

            playBrickGame.setColor(Color.ORANGE);
            playBrickGame.setLocation(1170, 88);
            playBrickGame.setFont(locationFONT4);
            add(playBrickGame);
        }

        playBrickGame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                startCALCULATOR();
                startBREAKOUT();
            }

        });

    }

     public void displayPack() {
        currentLocation_METHOD();
        currentMap_METHOD();
        if (turnonPack == 1) {
            println("CURRENT PACK SIZE:   " + BACKPACK.size());
            for (int i = 1; i <= BACKPACK.size(); i++) {
                GLabel packTitle = new GLabel("Backpack (" + BACKPACK.size() + ")");
                packTitle.setFont(locationFONT3);
                packTitle.setColor(Color.BLACK);
                add(packTitle, 1225, 60);
                useButtons();

                GLabel item = new GLabel("" + i + ".  " + BACKPACK.get(i));
                item.setFont(locationFONT4);
                item.setColor(Color.BLACK);
                add(item, 1200, 72 + (17 * i));
            }
        }

    }
    public void addToPack() {
        if (BACKPACK.isEmpty()) {
            BACKPACK.add(1, "BrickGame Device");
        }
        if (addToPack_TRUE == 1) {
            if (shampoo_TRUE == 1) {

                BACKPACK.add(z, shampooSTRING);
                z++;

                addToPack_TRUE = 0;
            }
        }

    }

    public void mainRoad_METHOD() {

        currentLocation = "Main Road";

        GImage mainRoad_BG = new GImage("street.jpg");
        mainRoad_BG.setSize(1400, 750);
        add(mainRoad_BG);

        if (mainRoad_POLICE_TRUE == 0) {
            GImage mainRoad_police = new GImage("Police-01.png");
            mainRoad_police.setLocation(375, 80);
            mainRoad_police.setSize(600, 600);
            add(mainRoad_police);

        }

        GImage mainRoad_talk1 = new GImage("police_talk1.png");
        mainRoad_talk1.setLocation(270, 455);
        mainRoad_talk1.setSize(800, 175);

        GLabel fourthStreet_BUTTON = new GLabel("^");
        fourthStreet_BUTTON.setColor(Color.RED);
        fourthStreet_BUTTON.setLocation(630, 720);
        fourthStreet_BUTTON.setFont(arrowsFONT);
        add(fourthStreet_BUTTON);

        GLabel secondStreet_BUTTON = new GLabel(">");
        secondStreet_BUTTON.setColor(Color.RED);
        secondStreet_BUTTON.setLocation(770, 680);
        secondStreet_BUTTON.setFont(arrowsFONT);
        add(secondStreet_BUTTON);

        GLabel thirdStreet_BUTTON = new GLabel("<");
        thirdStreet_BUTTON.setColor(Color.RED);
        thirdStreet_BUTTON.setLocation(545, 680);
        thirdStreet_BUTTON.setFont(arrowsFONT);
        add(thirdStreet_BUTTON);

        GLabel theEscapeButton = new GLabel("v");
        theEscapeButton.setColor(Color.RED);
        theEscapeButton.setLocation(700, 680);
        theEscapeButton.setFont(arrowsFONT);
        add(theEscapeButton);

        displayPack();

        if (mainRoad_TALK1_TRUE == 0) {
            add(mainRoad_talk1);
            mainRoad_talk1.addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e) {
                    GImage mainRoad_talk2 = new GImage("police_talk2.png");
                    mainRoad_talk2.setLocation(270, 455);
                    mainRoad_talk2.setSize(800, 175);
                    add(mainRoad_talk2);

                    mainRoad_talk2.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            mainRoad_talk1.setVisible(false);
                            mainRoad_talk2.setVisible(false);
                            GImage mainRoad_casefile = new GImage("Case_File.png");
                            mainRoad_casefile.setLocation(300, -10);
                            mainRoad_casefile.setSize(700, 700);
                            add(mainRoad_casefile);

                            mainRoad_casefile.addMouseListener(new MouseAdapter() {

                                public void mousePressed(MouseEvent e) {
                                    mainRoad_casefile.setVisible(false);
                                    GImage mainRoad_alibis = new GImage("alibis.png");
                                    mainRoad_alibis.setLocation(300, -10);
                                    mainRoad_alibis.setSize(700, 700);
                                    add(mainRoad_alibis);

                                    mainRoad_alibis.addMouseListener(new MouseAdapter() {

                                        public void mousePressed(MouseEvent e) {
                                            removeAll();
                                            mainRoad_TALK1_TRUE = 1;
                                            mainRoad_POLICE_TRUE = 1;
                                            mainRoad_METHOD();

                                        }
                                    });

                                }
                            });

                        }
                    });

                }

            });
        }

        secondStreet_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
            
                removeAll();

                secondStreet_METHOD();

            }

        });

        secondStreet_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              
                removeAll();

                secondStreet_METHOD();

            }

        });

        theEscapeButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
                removeAll();
                ESCAPE();
            }
        });

        fourthStreet_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
            
                fourthStreet_BUTTON.setColor(Color.RED);

                removeAll();
                fourthStreet_METHOD();

            }

        });

        thirdStreet_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              
                removeAll();
                thirdStreet_METHOD();

            }

        });

    }

    public void secondStreet_METHOD() {
        currentLocation = "2th Street";

        GImage secondStreet_BG = new GImage("Hospital.jpg");
        secondStreet_BG.setSize(1400, 750);
        add(secondStreet_BG);

        GImage secondStreet_CHAR = new GImage("Doctor-01.png");
        secondStreet_CHAR.setLocation(375, 80);
        secondStreet_CHAR.setSize(600, 600);
        add(secondStreet_CHAR);

        GLabel secondStreet_BACKTO_mainRoad = new GLabel("<");
        secondStreet_BACKTO_mainRoad.setColor(Color.RED);
        secondStreet_BACKTO_mainRoad.setLocation(545, 680);
        secondStreet_BACKTO_mainRoad.setFont(arrowsFONT);
        add(secondStreet_BACKTO_mainRoad);

        GLabel secondStreet_BACKTO_fifthStreet = new GLabel(">");
        secondStreet_BACKTO_fifthStreet.setColor(Color.RED);
        secondStreet_BACKTO_fifthStreet.setLocation(770, 680);
        secondStreet_BACKTO_fifthStreet.setFont(arrowsFONT);
        add(secondStreet_BACKTO_fifthStreet);
        
        if(secondStreet_TALK1_TRUE!=0){
            GImage secondStreet_talk10 = new GImage("doctor_nothing.png");
            secondStreet_talk10.setLocation(270, 455);
            secondStreet_talk10.setSize(800, 175);
            add(secondStreet_talk10);
    }
        else {
            GImage secondStreet_talk1 = new GImage("me1.png");
            secondStreet_talk1.setLocation(270, 455);
            secondStreet_talk1.setSize(800, 175);
            add(secondStreet_talk1);

            secondStreet_talk1.addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e) {
                    secondStreet_talk1.setVisible(false);
                    GImage secondStreet_talk2 = new GImage("doctor1.png");
                    secondStreet_talk2.setLocation(270, 455);
                    secondStreet_talk2.setSize(800, 175);
                    add(secondStreet_talk2);

                    secondStreet_talk2.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            secondStreet_talk2.setVisible(false);
                            GImage secondStreet_talk3 = new GImage("me2.png");
                            secondStreet_talk3.setLocation(270, 455);
                            secondStreet_talk3.setSize(800, 175);
                            add(secondStreet_talk3);

                            secondStreet_talk3.addMouseListener(new MouseAdapter() {

                                public void mousePressed(MouseEvent e) {
                                    
                                    secondStreet_talk3.setVisible(false);
                                    GImage secondStreet_talk4 = new GImage("doctor2.png");
                                    secondStreet_talk4.setLocation(270, 455);
                                    secondStreet_talk4.setSize(800, 175);
                                    add(secondStreet_talk4);
     
                                        secondStreet_talk4.addMouseListener(new MouseAdapter() {

                                        public void mousePressed(MouseEvent e) {

                                            secondStreet_talk4.setVisible(false);
                                            GImage secondStreet_talk5 = new GImage("me5.png");
                                            secondStreet_talk5.setLocation(270, 455);
                                            secondStreet_talk5.setSize(800, 175);
                                            add(secondStreet_talk5);
                                           
                                                 secondStreet_talk5.addMouseListener(new MouseAdapter() {

                                                public void mousePressed(MouseEvent e) {

                                                    secondStreet_talk5.setVisible(false);
                                                    secondStreet_CHAR.setVisible(false);
                                                    
                                                    GImage secondStreet_smallclue = new GImage("pills.png");
                                                    secondStreet_smallclue.setLocation(170, 520);
                                                    secondStreet_smallclue.setSize(30, 50);
                                                    add(secondStreet_smallclue);

                                                    
                                                            secondStreet_smallclue.addMouseListener(new MouseAdapter() {

                                                        public void mousePressed(MouseEvent e) {

                                                            
                                                            secondStreet_smallclue.setVisible(false);


                                                            GImage secondStreet_MAINclue = new GImage("pills.png");
                                                            secondStreet_MAINclue.setLocation(550, 100);
                                                            secondStreet_MAINclue.setSize(250, 450);
                                                            add(secondStreet_MAINclue);
                                                            
                                                            
                                                            secondStreet_MAINclue.addMouseListener(new MouseAdapter() {

                                                                public void mousePressed(MouseEvent e) {


                                                                    secondStreet_MAINclue.setVisible(false);
                                                                    secondStreet_CHAR.setVisible(true);
                                                                    secondStreet_MAINclue.sendToBack();

                                                                    GImage secondStreet_talk6 = new GImage("doctor3.png");
                                                                    secondStreet_talk6.setLocation(270, 455);
                                                                    secondStreet_talk6.setSize(800, 175);
                                                                    add(secondStreet_talk6);
                                                                    
                                                                        secondStreet_talk6.addMouseListener(new MouseAdapter() {

                                                                        public void mousePressed(MouseEvent e) {


                                                                            secondStreet_talk6.setVisible(false);
                                                                           
                                                                            GImage secondStreet_talk7 = new GImage("me4.png");
                                                                            secondStreet_talk7.setLocation(270, 455);
                                                                            secondStreet_talk7.setSize(800, 175);
                                                                            add(secondStreet_talk7);

                                                                                secondStreet_talk7.addMouseListener(new MouseAdapter() {

                                                                                public void mousePressed(MouseEvent e) {

                                                                                    secondStreet_talk7.setVisible(false);

                                                                                    GImage secondStreet_talk8 = new GImage("doctor4.png");
                                                                                    secondStreet_talk8.setLocation(270, 455);
                                                                                    secondStreet_talk8.setSize(800, 175);
                                                                                    add(secondStreet_talk8);

                                                                                            secondStreet_talk8.addMouseListener(new MouseAdapter() {

                                                                                            public void mousePressed(MouseEvent e) {

                                                                                                secondStreet_talk8.setVisible(false);

                                                                                                GImage secondStreet_talk9 = new GImage("doctor5.png");
                                                                                                secondStreet_talk9.setLocation(270, 455);
                                                                                                secondStreet_talk9.setSize(800, 175);
                                                                                                add(secondStreet_talk9);

                                                                                            secondStreet_talk9.addMouseListener(new MouseAdapter() {
                                                                                            public void mousePressed(MouseEvent e) {

                                                                                                secondStreet_talk9.setVisible(false);

                                                                                                GImage secondStreet_talk10 = new GImage("doctor_nothing.png");
                                                                                                secondStreet_talk10.setLocation(270, 455);
                                                                                                secondStreet_talk10.setSize(800, 175);
                                                                                                add(secondStreet_talk10);

                                                                                                secondStreet_TALK1_TRUE = 1; 

                                                                                            }
                                                                                        });

                                                                                    }
                                                                                });

                                                                                }
                                                                            });

                                                                        }
                                                                    });

                                                                }
                                                            });

                                                        }
                                                    });

                                                }
                                            });

                                        }
                                    });

                                }
                            });

                        }
                    });

                }
            });

        }

        displayPack();

      /*  if (secondStreet_Doctor_TRUE == 1) {
            secondStreet_CHAR.setVisible(false);
        }

        secondStreet_CHAR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              
                secondStreet_Doctor_TRUE = 1;
                removeAll();
                secondStreet_METHOD();
            }

        }); */

        secondStreet_BACKTO_fifthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
                secondStreet_BACKTO_fifthStreet.setColor(Color.RED);
                removeAll();
                displayPack();
                fifthStreet_METHOD();

            }

        });

        secondStreet_BACKTO_mainRoad.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                secondStreet_BACKTO_mainRoad.setColor(Color.WHITE);
                secondStreet_BACKTO_mainRoad.setColor(Color.RED);
                removeAll();
                displayPack();
                mainRoad_METHOD();
            }

        });

    }

    public void thirdStreet_METHOD() {
        currentLocation = "3rd Street";
        GImage thirdStreet_BG = new GImage("secondStreet_BG.jpg");
        thirdStreet_BG.setSize(1400, 750);
        add(thirdStreet_BG);

        GImage thirdStreet_CHAR = new GImage("secondStreet_CHAR.jpg");
        thirdStreet_CHAR.setSize(300, 300);
        thirdStreet_CHAR.setLocation(260, 300);
        add(thirdStreet_CHAR);
        
        GLabel thirdStreet_BACKTO_sixthStreet = new GLabel("<");
        thirdStreet_BACKTO_sixthStreet.setColor(Color.RED);
        thirdStreet_BACKTO_sixthStreet.setLocation(545, 680);
        thirdStreet_BACKTO_sixthStreet.setFont(arrowsFONT);
        add(thirdStreet_BACKTO_sixthStreet);

        GLabel thirdStreet_BACKTO_mainRoad = new GLabel(">");
        thirdStreet_BACKTO_mainRoad.setColor(Color.RED);
        thirdStreet_BACKTO_mainRoad.setLocation(770, 680);
        thirdStreet_BACKTO_mainRoad.setFont(arrowsFONT);
        add(thirdStreet_BACKTO_mainRoad);

        displayPack();

        if (thirdStreet_CHAR_TRUE == 1) {
            thirdStreet_CHAR.setVisible(false);
        }

        thirdStreet_CHAR.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                thirdStreet_CHAR_TRUE = 1;
                removeAll();
                thirdStreet_METHOD();
            }

        });

        thirdStreet_BACKTO_mainRoad.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                removeAll();
                displayPack();
                mainRoad_METHOD();
            }

        });
                
                 thirdStreet_BACKTO_sixthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                removeAll();
                displayPack();
                sixthStreet_METHOD();
            }

        });

    }

    public void fourthStreet_METHOD() {
        currentLocation = "4th Street";
        GImage fourthStreet_BG = new GImage("secondStreet_BG.jpg");
        fourthStreet_BG.setSize(1400, 750);
        add(fourthStreet_BG);

        GImage fourthStreet_CHAR = new GImage("secondStreet_CHAR.jpg");
        fourthStreet_CHAR.setSize(300, 300);
        fourthStreet_CHAR.setLocation(260, 300);
        add(fourthStreet_CHAR);

        GLabel fourthStreet_BACKTO_mainRoad = new GLabel("v");
        fourthStreet_BACKTO_mainRoad.setColor(Color.RED);
        fourthStreet_BACKTO_mainRoad.setLocation(700, 680);
        fourthStreet_BACKTO_mainRoad.setFont(arrowsFONT);
        add(fourthStreet_BACKTO_mainRoad);

        GLabel fourthStreet_BACKTO_fifthStreet = new GLabel("<");
        fourthStreet_BACKTO_fifthStreet.setColor(Color.RED);
        fourthStreet_BACKTO_fifthStreet.setLocation(545, 680);
        fourthStreet_BACKTO_fifthStreet.setFont(arrowsFONT);
        add(fourthStreet_BACKTO_fifthStreet);

        GLabel fourthStreet_BACKTO_seventhStreet = new GLabel(">");
        fourthStreet_BACKTO_seventhStreet.setColor(Color.RED);
        fourthStreet_BACKTO_seventhStreet.setLocation(770, 680);
        fourthStreet_BACKTO_seventhStreet.setFont(arrowsFONT);
        add(fourthStreet_BACKTO_seventhStreet);

        displayPack();

        if (theAlleyCHAR_TRUE == 1) {
            fourthStreet_CHAR.setVisible(false);
        }

        fourthStreet_CHAR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                fourthStreet_CHAR.setColor(Color.WHITE);
           
                theAlleyCHAR_TRUE = 1;
                removeAll();

                fourthStreet_METHOD();
            }

        });

        fourthStreet_BACKTO_mainRoad.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              
                removeAll();
                displayPack();
                mainRoad_METHOD();
            }

        });

        fourthStreet_BACKTO_fifthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
                removeAll();
                displayPack();
                fifthStreet_METHOD();
            }

        });

        fourthStreet_BACKTO_seventhStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
            
                removeAll();
                displayPack();
                seventhStreet_METHOD();
            }

        });

    }

    public void fifthStreet_METHOD() {
        currentLocation = "5th Street";
        GImage fifthStreet_BG = new GImage("secondStreet_BG.jpg");
        fifthStreet_BG.setSize(1400, 750);
        add(fifthStreet_BG);

        GImage fifthStreet_CHAR = new GImage("secondStreet_CHAR.jpg");
        fifthStreet_CHAR.setSize(300, 300);
        fifthStreet_CHAR.setLocation(260, 300);
        add(fifthStreet_CHAR);

        GLabel fifthStreet_BACKTO_secondStreet = new GLabel(">");
        fifthStreet_BACKTO_secondStreet.setColor(Color.RED);
        fifthStreet_BACKTO_secondStreet.setLocation(770, 680);
        fifthStreet_BACKTO_secondStreet.setFont(arrowsFONT);
        add(fifthStreet_BACKTO_secondStreet);

        displayPack();

        if (thirdStreet_CHAR_TRUE == 1) {
            fifthStreet_CHAR.setVisible(false);
        }

        fifthStreet_CHAR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                
                thirdStreet_CHAR_TRUE = 1;
                removeAll();
                thirdStreet_METHOD();
            }

        });

        fifthStreet_BACKTO_secondStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
                removeAll();
                displayPack();
                secondStreet_METHOD();
            }

        });

    }

    public void seventhStreet_METHOD() {
        currentLocation = "7th Street";
        GImage seventhStreet_BG = new GImage("secondStreet_BG.jpg");
        seventhStreet_BG.setSize(1400, 750);
        add(seventhStreet_BG);

        GImage seventhStreet_CHAR = new GImage("secondStreet_CHAR.jpg");
        seventhStreet_CHAR.setSize(300, 300);
        seventhStreet_CHAR.setLocation(260, 300);
        add(seventhStreet_CHAR);

        GLabel seventhStreet_BACKTO_fifthStreet = new GLabel("v");
        seventhStreet_BACKTO_fifthStreet.setColor(Color.RED);
        seventhStreet_BACKTO_fifthStreet.setLocation(700, 680);
        seventhStreet_BACKTO_fifthStreet.setFont(arrowsFONT);
        add(seventhStreet_BACKTO_fifthStreet);

        GLabel seventhStreet_BACKTO_sixthStreet = new GLabel("<");
        seventhStreet_BACKTO_sixthStreet.setColor(Color.RED);
        seventhStreet_BACKTO_sixthStreet.setLocation(545, 680);
        seventhStreet_BACKTO_sixthStreet.setFont(arrowsFONT);
        add(seventhStreet_BACKTO_sixthStreet);

        GLabel seventhStreet_BACKTO_fourthStreet = new GLabel(">");
        seventhStreet_BACKTO_fourthStreet.setColor(Color.RED);
        seventhStreet_BACKTO_fourthStreet.setLocation(770, 680);
        seventhStreet_BACKTO_fourthStreet.setFont(arrowsFONT);
        add(seventhStreet_BACKTO_fourthStreet);

        displayPack();

        if (theAlleyCHAR_TRUE == 1) {
            seventhStreet_CHAR.setVisible(false);
        }

        seventhStreet_CHAR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
                theAlleyCHAR_TRUE = 1;
                removeAll();

                seventhStreet_METHOD();
            }

        });

        seventhStreet_BACKTO_fifthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
                removeAll();
                displayPack();
                fifthStreet_METHOD();
            }

        });

        seventhStreet_BACKTO_sixthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              
                removeAll();
                displayPack();
                fifthStreet_METHOD();
            }

        });

        seventhStreet_BACKTO_fourthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                
                removeAll();
                displayPack();
                fourthStreet_METHOD();
            }

        });

    }

    public void ESCAPE() {
        currentLocation = "Police HQ";
        GImage theEscapeBG = new GImage("secondStreet_BG.jpg");
        theEscapeBG.setSize(1400, 750);
        add(theEscapeBG);

        GImage theEscapeCHAR = new GImage("secondStreet_CHAR.jpg");
        theEscapeCHAR.setSize(300, 300);
        theEscapeCHAR.setLocation(260, 300);
        add(theEscapeCHAR);

        GLabel theEscape_BACKBUTTON = new GLabel("BACK");
        theEscape_BACKBUTTON.setColor(Color.RED);
        theEscape_BACKBUTTON.setLocation(50, 80);
        theEscape_BACKBUTTON.setFont(normalFONT);
        add(theEscape_BACKBUTTON);
        displayPack();

        displayPack();

        if (theEscapeCHAR_TRUE == 1) {
            theEscapeCHAR.setVisible(false);
        }

        theEscapeCHAR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              
                theAlleyCHAR_TRUE = 1;
                removeAll();

                fourthStreet_METHOD();
            }

        });

        theEscape_BACKBUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               
                removeAll();
                displayPack();
                mainRoad_METHOD();
            }

        });

    }

    public void quitGame() {

        if (YouWon == 0) {
            GLabel quitLabel = new GLabel("QUITTER");
            quitLabel.setColor(Color.RED);
            quitLabel.setLocation(220, 300);
            quitLabel.setFont(arrowsFONT);
            add(quitLabel);

            GLabel quitLabel2 = new GLabel("exit the game manually");
            quitLabel2.setColor(Color.RED);
            quitLabel2.setLocation(220, 400);
            quitLabel2.setFont(normalFONT);
            add(quitLabel2);
        } else {
            GLabel quitLabel = new GLabel("You won the game, close it manually");
            quitLabel.setColor(Color.RED);
            quitLabel.setLocation(220, 300);
            quitLabel.setFont(arrowsFONT);
            add(quitLabel);
        }
    }
}
