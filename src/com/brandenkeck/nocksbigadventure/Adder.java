package com.brandenkeck.nocksbigadventure;
import java.awt.image.BufferedImage;


public class Adder {

private Environment environment = new Environment();
private Enemies enemies = new Enemies();
private Bosses bosses = new Bosses();
	
public Adder(){
	switch(MainGame.nextState){
		case LEVEL1:
			environment.removeAll();
			environment.addFloor(ResourceManager.floorWood, (int) (MainGame.xScalingFactor*32), 26, 1, 0);
			environment.addFloor(ResourceManager.floorRoad, (int) (MainGame.xScalingFactor*864), 5000, 2, 1);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*2000), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 0);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*3000), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 2, 2, 1);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*3500), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 2);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*4500), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 3);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*5100), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 4);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*6100), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 5, 2, 5);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*8000), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 6);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*8900), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 7);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*10000), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 2, 2, 8);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*11100), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 9);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*11900), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 10);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*12500), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 11);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*13000), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 5, 2, 12);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*13800), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 1, 2, 13);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*14700), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 1, 2, 14);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*15700), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 2, 2, 15);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*16500), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 16);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*17400), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 17);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*18200), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 18);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*19100), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 19);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*22100), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 20);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*25300), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 21);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*27200), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 1, 2, 22);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*28100), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 2, 2, 23);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*29000), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 24);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*30200), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 25);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*31000), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 2, 2, 26);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*32100), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 3, 2, 27);
			environment.addDamage(ResourceManager.DRed, (int) (MainGame.xScalingFactor*34100), (int) (MainGame.ySize-56*MainGame.yScalingFactor), 4, 2, 28);
			environment.addSword((int) (MainGame.xScalingFactor*700), (int) (MainGame.yScalingFactor*900));
			environment.addFlame((int) (MainGame.xScalingFactor*1000), (int) (MainGame.xScalingFactor*900));

			for(int h=2000; h<50000; h+=500){
				environment.addHealth((int) (MainGame.xScalingFactor*h), (int) (MainGame.yScalingFactor*900), h/500-4);
			}
			environment.addGoal((int) (MainGame.xScalingFactor*31000), (int) (MainGame.yScalingFactor*200));
			break;
			
		case BOSS1:
			environment.removeAll();
			environment.addFloor(ResourceManager.floorRoad, 0, 100, 2, 0);
			bosses.spawnGG((int) (MainGame.xScalingFactor*1500), (int) (MainGame.yScalingFactor*500), 500);
			for(int h=0; h<20; h++){
				environment.addHealth((int) (MainGame.xScalingFactor*500), (int) (MainGame.yScalingFactor*900), h);
			}
			break;
		case LEVEL2:
			environment.removeAll();
			environment.addLightning((int) (500*MainGame.xScalingFactor), (int) (500*MainGame.yScalingFactor));
			environment.addPlatform(ResourceManager.floorBrick, 0, 0, 790, 1, 2, 0);
			environment.addDamage(ResourceManager.DBlue, (int) (23008*MainGame.xScalingFactor), (int) (568*MainGame.yScalingFactor), 4, 500, 450);
			environment.addPlatform(ResourceManager.floorBrick, 0, (int) (700*MainGame.xScalingFactor), 20, 2, 2, 0);

			for(int i=0; i<50; i++){
				for(int j=0; j<4; j++){
				environment.addPlatform(ResourceManager.floorBrick, (int) ((500*i)*MainGame.xScalingFactor), (int) ((568+800*j)*MainGame.yScalingFactor), 6, 2, 2, 7+4*i+j);
				}
			}
			
			for(int i=50; i<100; i++){
				for(int j=0; j<4; j++){
				environment.addPlatform(ResourceManager.floorBrick, (int) ((250+500*(i-50))*MainGame.xScalingFactor), (int) ((968+800*j)*MainGame.yScalingFactor), 6, 2, 2, 7+4*i+j);
				}
			}
			
			Environment.rplatform[7]=false;
			Environment.rplatform[8]=false;
			Environment.rplatform[9]=false;
			Environment.rplatform[10]=false;
			Environment.rplatform[11]=false;
			Environment.rplatform[12]=false;
			Environment.rplatform[13]=false;
			Environment.rplatform[14]=false;
			Environment.rplatform[15]=false;
			Environment.rplatform[16]=false;
			Environment.rplatform[17]=false;
			Environment.rplatform[18]=false;
			Environment.rplatform[19]=false;
			
			environment.addGoal((int) (23500*MainGame.xScalingFactor), (int) (200*MainGame.yScalingFactor));
			break;
		case BOSS2:
			environment.removeAll();
			environment.addPlatform(ResourceManager.floorBrick, (int) (-2000*MainGame.xScalingFactor), (int) (2800*MainGame.yScalingFactor), 500, 20, 2, 0);

			for(int i=0; i<50; i++){
				for(int j=0; j<3; j++){
				environment.addPlatform(ResourceManager.floorBrick, (int) ((500*i)*MainGame.xScalingFactor), (int) ((568+800*j)*MainGame.yScalingFactor), 2, 1, 2, 7+4*i+j);
				}
			}
			
			for(int i=50; i<100; i++){
				for(int j=0; j<3; j++){
				environment.addPlatform(ResourceManager.floorBrick, (int) ((250+500*(i-50))*MainGame.xScalingFactor), (int) ((968+800*j)*MainGame.yScalingFactor), 2, 1, 2, 7+4*i+j);
				}
			}
			bosses.spawnSkull((int) (800*MainGame.xScalingFactor), (int) (-400*MainGame.yScalingFactor), 3000);
			break;
		case LEVEL3:
			environment.removeAll();
			environment.addStar((int) (500*MainGame.xScalingFactor), (int) (700*MainGame.yScalingFactor));
			environment.addFloor(ResourceManager.floorPlain, 0, 5000, 2, 0);
			environment.addGoal((int) (34000*MainGame.xScalingFactor), (int) (200*MainGame.yScalingFactor));
			break;
		case BOSS3:
			environment.removeAll();
			bosses.spawnOrb((int) (250*MainGame.xScalingFactor), (int) (50*MainGame.yScalingFactor), 20);
			environment.addPlatform(ResourceManager.floorPlain, (int) (0*MainGame.xScalingFactor), (int) (3000*MainGame.yScalingFactor), 500, 20, 2, 33);
			
			environment.addPlatform(ResourceManager.dataBlock, (int) (200*MainGame.xScalingFactor), (int) (440*MainGame.yScalingFactor), 10, 2, 1, 1);
			environment.addPlatform(ResourceManager.dataBlock, (int) (200*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 10, 2, 1, 2);
			environment.addPlatform(ResourceManager.dataBlock, (int) (200*MainGame.xScalingFactor), (int) (2200*MainGame.yScalingFactor), 10, 2, 1, 3);
			environment.addPlatform(ResourceManager.dataBlock, (int) (200*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 10, 2, 1, 4);
			
			environment.addPlatform(ResourceManager.dataBlock, (int) (720*MainGame.xScalingFactor), (int) (440*MainGame.yScalingFactor), 10, 2, 1, 5);
			environment.addPlatform(ResourceManager.dataBlock, (int) (720*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 10, 2, 1, 6);
			environment.addPlatform(ResourceManager.dataBlock, (int) (720*MainGame.xScalingFactor), (int) (2200*MainGame.yScalingFactor), 10, 2, 1, 7);
			environment.addPlatform(ResourceManager.dataBlock, (int) (720*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 10, 2, 1, 8);
			
			environment.addPlatform(ResourceManager.dataBlock, (int) (1240*MainGame.xScalingFactor), (int) (440*MainGame.yScalingFactor), 10, 2, 1, 9);
			environment.addPlatform(ResourceManager.dataBlock, (int) (1240*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 10, 2, 1, 10);
			environment.addPlatform(ResourceManager.dataBlock, (int) (1240*MainGame.xScalingFactor), (int) (2200*MainGame.yScalingFactor), 10, 2, 1, 11);
			environment.addPlatform(ResourceManager.dataBlock, (int) (1240*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 10, 2, 1, 12);
			
			environment.addPlatform(ResourceManager.dataBlock, (int) (1760*MainGame.xScalingFactor), (int) (440*MainGame.yScalingFactor), 10, 2, 1, 13);
			environment.addPlatform(ResourceManager.dataBlock, (int) (1760*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 10, 2, 1, 14);
			environment.addPlatform(ResourceManager.dataBlock, (int) (1760*MainGame.xScalingFactor), (int) (2200*MainGame.yScalingFactor), 10, 2, 1, 15);
			environment.addPlatform(ResourceManager.dataBlock, (int) (1760*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 10, 2, 1, 16);
			
			environment.addPlatform(ResourceManager.dataBlock, (int) (2280*MainGame.xScalingFactor), (int) (440*MainGame.yScalingFactor), 10, 2, 1, 17);
			environment.addPlatform(ResourceManager.dataBlock, (int) (2280*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 10, 2, 1, 18);
			environment.addPlatform(ResourceManager.dataBlock, (int) (2280*MainGame.xScalingFactor), (int) (2200*MainGame.yScalingFactor), 10, 2, 1, 19);
			environment.addPlatform(ResourceManager.dataBlock, (int) (2280*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 10, 2, 1, 20);
			
			environment.addPlatform(ResourceManager.dataBlock, (int) (2800*MainGame.xScalingFactor), (int) (440*MainGame.yScalingFactor), 10, 2, 1, 21);
			environment.addPlatform(ResourceManager.dataBlock, (int) (2800*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 10, 2, 1, 22);
			environment.addPlatform(ResourceManager.dataBlock, (int) (2800*MainGame.xScalingFactor), (int) (2200*MainGame.yScalingFactor), 10, 2, 1, 23);
			environment.addPlatform(ResourceManager.dataBlock, (int) (2800*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 10, 2, 1, 24);
			
			environment.addPlatform(ResourceManager.dataBlock, (int) (3320*MainGame.xScalingFactor), (int) (440*MainGame.yScalingFactor), 10, 2, 1, 25);
			environment.addPlatform(ResourceManager.dataBlock, (int) (3320*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 10, 2, 1, 26);
			environment.addPlatform(ResourceManager.dataBlock, (int) (3320*MainGame.xScalingFactor), (int) (2200*MainGame.yScalingFactor), 10, 2, 1, 27);
			environment.addPlatform(ResourceManager.dataBlock, (int) (3320*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 10, 2, 1, 28);
			
			environment.addPlatform(ResourceManager.dataBlock, (int) (3840*MainGame.xScalingFactor), (int) (440*MainGame.yScalingFactor), 10, 2, 1, 29);
			environment.addPlatform(ResourceManager.dataBlock, (int) (3840*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 10, 2, 1, 30);
			environment.addPlatform(ResourceManager.dataBlock, (int) (3840*MainGame.xScalingFactor), (int) (2200*MainGame.yScalingFactor), 10, 2, 1, 31);
			environment.addPlatform(ResourceManager.dataBlock, (int) (3840*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 10, 2, 1, 32);
			
			break;
		case LEVEL4:
			environment.removeAll();
			environment.addTime(700, 4200);
			environment.addPlatform(ResourceManager.floorL6, (int) (0*MainGame.xScalingFactor), (int) (5000*MainGame.yScalingFactor), 10, 1, 1, 0);
			environment.addPlatform(ResourceManager.floorL6, (int) (320*MainGame.xScalingFactor), (int) (4968*MainGame.yScalingFactor), 1, 1, 1, 1);
			environment.addPlatform(ResourceManager.floorL6, (int) (352*MainGame.xScalingFactor), (int) (4936*MainGame.yScalingFactor), 1, 1, 1, 2);
			environment.addPlatform(ResourceManager.floorL6, (int) (384*MainGame.xScalingFactor), (int) (4904*MainGame.yScalingFactor), 2, 1, 1, 3);
			environment.addPlatform(ResourceManager.floorL6, (int) (448*MainGame.xScalingFactor), (int) (4872*MainGame.yScalingFactor), 1, 1, 1, 4);
			environment.addPlatform(ResourceManager.floorL6, (int) (480*MainGame.xScalingFactor), (int) (4840*MainGame.yScalingFactor), 1, 1, 1, 5);
			environment.addPlatform(ResourceManager.floorL6, (int) (512*MainGame.xScalingFactor), (int) (4808*MainGame.yScalingFactor), 2, 1, 1, 6);
			environment.addPlatform(ResourceManager.floorL6, (int) (576*MainGame.xScalingFactor), (int) (4776*MainGame.yScalingFactor), 2, 1, 1, 7);
			environment.addPlatform(ResourceManager.floorL6, (int) (640*MainGame.xScalingFactor), (int) (4744*MainGame.yScalingFactor), 1, 1, 1, 8);
			environment.addPlatform(ResourceManager.floorL6, (int) (672*MainGame.xScalingFactor), (int) (4712*MainGame.yScalingFactor), 2, 1, 1, 9);
			environment.addPlatform(ResourceManager.floorL6, (int) (736*MainGame.xScalingFactor), (int) (4680*MainGame.yScalingFactor), 2, 1, 1, 10);
			environment.addPlatform(ResourceManager.floorL6, (int) (800*MainGame.xScalingFactor), (int) (4648*MainGame.yScalingFactor), 1, 1, 1, 11);
			environment.addPlatform(ResourceManager.floorL6, (int) (832*MainGame.xScalingFactor), (int) (4616*MainGame.yScalingFactor), 1, 1, 1, 12);
			environment.addPlatform(ResourceManager.floorL6, (int) (864*MainGame.xScalingFactor), (int) (4584*MainGame.yScalingFactor), 1, 1, 1, 13);
			environment.addPlatform(ResourceManager.floorL6, (int) (896*MainGame.xScalingFactor), (int) (4552*MainGame.yScalingFactor), 2, 1, 1, 14);
			environment.addPlatform(ResourceManager.floorL6, (int) (960*MainGame.xScalingFactor), (int) (4520*MainGame.yScalingFactor), 1, 1, 1, 15);
			environment.addPlatform(ResourceManager.floorL6, (int) (992*MainGame.xScalingFactor), (int) (4488*MainGame.yScalingFactor), 2, 1, 1, 16);
			environment.addPlatform(ResourceManager.floorL6, (int) (1056*MainGame.xScalingFactor), (int) (4456*MainGame.yScalingFactor), 1, 1, 1, 17);
			environment.addPlatform(ResourceManager.floorL6, (int) (1088*MainGame.xScalingFactor), (int) (4424*MainGame.yScalingFactor), 1, 1, 1, 18);
			environment.addPlatform(ResourceManager.floorL6, (int) (1120*MainGame.xScalingFactor), (int) (4392*MainGame.yScalingFactor), 1, 1, 1, 19);
			environment.addPlatform(ResourceManager.floorL6, (int) (1152*MainGame.xScalingFactor), (int) (4360*MainGame.yScalingFactor), 1, 1, 1, 20);
			environment.addPlatform(ResourceManager.floorL6, (int) (1184*MainGame.xScalingFactor), (int) (4328*MainGame.yScalingFactor), 1, 1, 1, 21);
			environment.addPlatform(ResourceManager.floorL6, (int) (1216*MainGame.xScalingFactor), (int) (4296*MainGame.yScalingFactor), 2, 1, 1, 22);
			environment.addPlatform(ResourceManager.floorL6, (int) (1280*MainGame.xScalingFactor), (int) (4264*MainGame.yScalingFactor), 2, 1, 1, 23);
			environment.addPlatform(ResourceManager.floorL6, (int) (1344*MainGame.xScalingFactor), (int) (4232*MainGame.yScalingFactor), 1, 1, 1, 24);
			environment.addPlatform(ResourceManager.floorL6, (int) (1376*MainGame.xScalingFactor), (int) (4200*MainGame.yScalingFactor), 1, 1, 1, 25);
			environment.addPlatform(ResourceManager.floorL6, (int) (1408*MainGame.xScalingFactor), (int) (4168*MainGame.yScalingFactor), 2, 1, 1, 26);
			environment.addPlatform(ResourceManager.floorL6, (int) (1472*MainGame.xScalingFactor), (int) (4136*MainGame.yScalingFactor), 1, 1, 1, 27);
			environment.addPlatform(ResourceManager.floorL6, (int) (1504*MainGame.xScalingFactor), (int) (4104*MainGame.yScalingFactor), 1, 1, 1, 28);
			environment.addPlatform(ResourceManager.floorL6, (int) (1536*MainGame.xScalingFactor), (int) (4072*MainGame.yScalingFactor), 1, 1, 1, 29);
			environment.addPlatform(ResourceManager.floorL6, (int) (1568*MainGame.xScalingFactor), (int) (4040*MainGame.yScalingFactor), 2, 1, 1, 30);
			environment.addPlatform(ResourceManager.floorL6, (int) (1632*MainGame.xScalingFactor), (int) (4008*MainGame.yScalingFactor), 1, 1, 1, 31);
			environment.addPlatform(ResourceManager.floorL6, (int) (1664*MainGame.xScalingFactor), (int) (3976*MainGame.yScalingFactor), 1, 1, 1, 32);
			environment.addPlatform(ResourceManager.floorL6, (int) (1696*MainGame.xScalingFactor), (int) (3944*MainGame.yScalingFactor), 10, 1, 1, 33);
			environment.addPlatform(ResourceManager.floorL6, (int) (2016*MainGame.xScalingFactor), (int) (3912*MainGame.yScalingFactor), 1, 1, 1, 34);
			environment.addPlatform(ResourceManager.floorL6, (int) (2048*MainGame.xScalingFactor), (int) (3880*MainGame.yScalingFactor), 1, 1, 1, 35);
			environment.addPlatform(ResourceManager.floorL6, (int) (2080*MainGame.xScalingFactor), (int) (3848*MainGame.yScalingFactor), 1, 1, 1, 36);
			environment.addPlatform(ResourceManager.floorL6, (int) (2112*MainGame.xScalingFactor), (int) (3816*MainGame.yScalingFactor), 1, 1, 1, 37);
			environment.addPlatform(ResourceManager.floorL6, (int) (2144*MainGame.xScalingFactor), (int) (3784*MainGame.yScalingFactor), 2, 1, 1, 38);
			environment.addPlatform(ResourceManager.floorL6, (int) (2208*MainGame.xScalingFactor), (int) (3752*MainGame.yScalingFactor), 1, 1, 1, 39);
			environment.addPlatform(ResourceManager.floorL6, (int) (2240*MainGame.xScalingFactor), (int) (3720*MainGame.yScalingFactor), 1, 1, 1, 40);
			environment.addPlatform(ResourceManager.floorL6, (int) (2272*MainGame.xScalingFactor), (int) (3688*MainGame.yScalingFactor), 1, 1, 1, 41);
			environment.addPlatform(ResourceManager.floorL6, (int) (2304*MainGame.xScalingFactor), (int) (3656*MainGame.yScalingFactor), 1, 1, 1, 42);
			environment.addPlatform(ResourceManager.floorL6, (int) (2336*MainGame.xScalingFactor), (int) (3624*MainGame.yScalingFactor), 2, 1, 1, 43);
			environment.addPlatform(ResourceManager.floorL6, (int) (2400*MainGame.xScalingFactor), (int) (3592*MainGame.yScalingFactor), 1, 1, 1, 44);
			environment.addPlatform(ResourceManager.floorL6, (int) (2432*MainGame.xScalingFactor), (int) (3560*MainGame.yScalingFactor), 1, 1, 1, 45);
			environment.addPlatform(ResourceManager.floorL6, (int) (2464*MainGame.xScalingFactor), (int) (3528*MainGame.yScalingFactor), 1, 1, 1, 46);
			environment.addPlatform(ResourceManager.floorL6, (int) (2496*MainGame.xScalingFactor), (int) (3496*MainGame.yScalingFactor), 2, 1, 1, 47);
			environment.addPlatform(ResourceManager.floorL6, (int) (2560*MainGame.xScalingFactor), (int) (3464*MainGame.yScalingFactor), 2, 1, 1, 48);
			environment.addPlatform(ResourceManager.floorL6, (int) (2624*MainGame.xScalingFactor), (int) (3432*MainGame.yScalingFactor), 1, 1, 1, 49);
			environment.addPlatform(ResourceManager.floorL6, (int) (2656*MainGame.xScalingFactor), (int) (3400*MainGame.yScalingFactor), 1, 1, 1, 50);
			environment.addPlatform(ResourceManager.floorL6, (int) (2688*MainGame.xScalingFactor), (int) (3368*MainGame.yScalingFactor), 1, 1, 1, 51);
			environment.addPlatform(ResourceManager.floorL6, (int) (2720*MainGame.xScalingFactor), (int) (3336*MainGame.yScalingFactor), 1, 1, 1, 52);
			environment.addPlatform(ResourceManager.floorL6, (int) (2752*MainGame.xScalingFactor), (int) (3304*MainGame.yScalingFactor), 2, 1, 1, 53);
			environment.addPlatform(ResourceManager.floorL6, (int) (2816*MainGame.xScalingFactor), (int) (3272*MainGame.yScalingFactor), 1, 1, 1, 54);
			environment.addPlatform(ResourceManager.floorL6, (int) (2848*MainGame.xScalingFactor), (int) (3240*MainGame.yScalingFactor), 1, 1, 1, 55);
			environment.addPlatform(ResourceManager.floorL6, (int) (2880*MainGame.xScalingFactor), (int) (3208*MainGame.yScalingFactor), 10, 1, 1, 56);
			environment.addPlatform(ResourceManager.floorL6, (int) (3200*MainGame.xScalingFactor), (int) (3176*MainGame.yScalingFactor), 1, 1, 1, 57);
			environment.addPlatform(ResourceManager.floorL6, (int) (3232*MainGame.xScalingFactor), (int) (3144*MainGame.yScalingFactor), 1, 1, 1, 58);
			environment.addPlatform(ResourceManager.floorL6, (int) (3264*MainGame.xScalingFactor), (int) (3112*MainGame.yScalingFactor), 1, 1, 1, 59);
			environment.addPlatform(ResourceManager.floorL6, (int) (3296*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 1, 1, 1, 60);
			environment.addPlatform(ResourceManager.floorL6, (int) (3328*MainGame.xScalingFactor), (int) (3048*MainGame.yScalingFactor), 1, 1, 1, 61);
			environment.addPlatform(ResourceManager.floorL6, (int) (3360*MainGame.xScalingFactor), (int) (3016*MainGame.yScalingFactor), 1, 1, 1, 62);
			environment.addPlatform(ResourceManager.floorL6, (int) (3392*MainGame.xScalingFactor), (int) (2984*MainGame.yScalingFactor), 1, 1, 1, 63);
			environment.addPlatform(ResourceManager.floorL6, (int) (3424*MainGame.xScalingFactor), (int) (2952*MainGame.yScalingFactor), 2, 1, 1, 64);
			environment.addPlatform(ResourceManager.floorL6, (int) (3488*MainGame.xScalingFactor), (int) (2920*MainGame.yScalingFactor), 1, 1, 1, 65);
			environment.addPlatform(ResourceManager.floorL6, (int) (3520*MainGame.xScalingFactor), (int) (2888*MainGame.yScalingFactor), 1, 1, 1, 66);
			environment.addPlatform(ResourceManager.floorL6, (int) (3552*MainGame.xScalingFactor), (int) (2856*MainGame.yScalingFactor), 1, 1, 1, 67);
			environment.addPlatform(ResourceManager.floorL6, (int) (3584*MainGame.xScalingFactor), (int) (2824*MainGame.yScalingFactor), 2, 1, 1, 68);
			environment.addPlatform(ResourceManager.floorL6, (int) (3648*MainGame.xScalingFactor), (int) (2792*MainGame.yScalingFactor), 2, 1, 1, 69);
			environment.addPlatform(ResourceManager.floorL6, (int) (3712*MainGame.xScalingFactor), (int) (2760*MainGame.yScalingFactor), 20, 1, 1, 70);
			environment.addPlatform(ResourceManager.floorL6, (int) (4352*MainGame.xScalingFactor), (int) (2728*MainGame.yScalingFactor), 1, 1, 1, 71);
			environment.addPlatform(ResourceManager.floorL6, (int) (4384*MainGame.xScalingFactor), (int) (2696*MainGame.yScalingFactor), 1, 1, 1, 72);
			environment.addPlatform(ResourceManager.floorL6, (int) (4416*MainGame.xScalingFactor), (int) (2664*MainGame.yScalingFactor), 1, 1, 1, 73);
			environment.addPlatform(ResourceManager.floorL6, (int) (4448*MainGame.xScalingFactor), (int) (2632*MainGame.yScalingFactor), 1, 1, 1, 74);
			environment.addPlatform(ResourceManager.floorL6, (int) (4480*MainGame.xScalingFactor), (int) (2600*MainGame.yScalingFactor), 1, 1, 1, 75);
			environment.addPlatform(ResourceManager.floorL6, (int) (4512*MainGame.xScalingFactor), (int) (2568*MainGame.yScalingFactor), 2, 1, 1, 76);
			environment.addPlatform(ResourceManager.floorL6, (int) (4576*MainGame.xScalingFactor), (int) (2536*MainGame.yScalingFactor), 2, 1, 1, 77);
			environment.addPlatform(ResourceManager.floorL6, (int) (4640*MainGame.xScalingFactor), (int) (2504*MainGame.yScalingFactor), 1, 1, 1, 78);
			environment.addPlatform(ResourceManager.floorL6, (int) (4672*MainGame.xScalingFactor), (int) (2472*MainGame.yScalingFactor), 1, 1, 1, 79);
			environment.addPlatform(ResourceManager.floorL6, (int) (4704*MainGame.xScalingFactor), (int) (2440*MainGame.yScalingFactor), 1, 1, 1, 80);
			environment.addPlatform(ResourceManager.floorL6, (int) (4736*MainGame.xScalingFactor), (int) (2408*MainGame.yScalingFactor), 45, 1, 1, 81);
			environment.addPlatform(ResourceManager.floorL6, (int) (6176*MainGame.xScalingFactor), (int) (2376*MainGame.yScalingFactor), 1, 1, 1, 82);
			environment.addPlatform(ResourceManager.floorL6, (int) (6208*MainGame.xScalingFactor), (int) (2408*MainGame.yScalingFactor), 1, 1, 1, 83);
			environment.addPlatform(ResourceManager.floorL6, (int) (6240*MainGame.xScalingFactor), (int) (2440*MainGame.yScalingFactor), 1, 1, 1, 84);
			environment.addPlatform(ResourceManager.floorL6, (int) (6272*MainGame.xScalingFactor), (int) (2472*MainGame.yScalingFactor), 2, 1, 1, 85);
			environment.addPlatform(ResourceManager.floorL6, (int) (6336*MainGame.xScalingFactor), (int) (2504*MainGame.yScalingFactor), 1, 1, 1, 86);
			environment.addPlatform(ResourceManager.floorL6, (int) (6368*MainGame.xScalingFactor), (int) (2536*MainGame.yScalingFactor), 1, 1, 1, 87);
			environment.addPlatform(ResourceManager.floorL6, (int) (6400*MainGame.xScalingFactor), (int) (2568*MainGame.yScalingFactor), 1, 1, 1, 88);
			environment.addPlatform(ResourceManager.floorL6, (int) (6432*MainGame.xScalingFactor), (int) (2600*MainGame.yScalingFactor), 1, 1, 1, 89);
			environment.addPlatform(ResourceManager.floorL6, (int) (6464*MainGame.xScalingFactor), (int) (2632*MainGame.yScalingFactor), 2, 1, 1, 90);
			environment.addPlatform(ResourceManager.floorL6, (int) (6528*MainGame.xScalingFactor), (int) (2664*MainGame.yScalingFactor), 2, 1, 1, 91);
			environment.addPlatform(ResourceManager.floorL6, (int) (6592*MainGame.xScalingFactor), (int) (2696*MainGame.yScalingFactor), 1, 1, 1, 92);
			environment.addPlatform(ResourceManager.floorL6, (int) (6624*MainGame.xScalingFactor), (int) (2728*MainGame.yScalingFactor), 1, 1, 1, 93);
			environment.addPlatform(ResourceManager.floorL6, (int) (6656*MainGame.xScalingFactor), (int) (2760*MainGame.yScalingFactor), 1, 1, 1, 94);
			environment.addPlatform(ResourceManager.floorL6, (int) (6688*MainGame.xScalingFactor), (int) (2792*MainGame.yScalingFactor), 1, 1, 1, 95);
			environment.addPlatform(ResourceManager.floorL6, (int) (6720*MainGame.xScalingFactor), (int) (2824*MainGame.yScalingFactor), 2, 1, 1, 96);
			environment.addPlatform(ResourceManager.floorL6, (int) (6784*MainGame.xScalingFactor), (int) (2856*MainGame.yScalingFactor), 1, 1, 1, 97);
			environment.addPlatform(ResourceManager.floorL6, (int) (6816*MainGame.xScalingFactor), (int) (2888*MainGame.yScalingFactor), 1, 1, 1, 98);
			environment.addPlatform(ResourceManager.floorL6, (int) (6848*MainGame.xScalingFactor), (int) (2920*MainGame.yScalingFactor), 1, 1, 1, 99);
			environment.addPlatform(ResourceManager.floorL6, (int) (6880*MainGame.xScalingFactor), (int) (2952*MainGame.yScalingFactor), 1, 1, 1, 100);
			environment.addPlatform(ResourceManager.floorL6, (int) (6912*MainGame.xScalingFactor), (int) (2984*MainGame.yScalingFactor), 2, 1, 1, 101);
			environment.addPlatform(ResourceManager.floorL6, (int) (6976*MainGame.xScalingFactor), (int) (3016*MainGame.yScalingFactor), 1, 1, 1, 102);
			environment.addPlatform(ResourceManager.floorL6, (int) (7008*MainGame.xScalingFactor), (int) (3048*MainGame.yScalingFactor), 1, 1, 1, 103);
			environment.addPlatform(ResourceManager.floorL6, (int) (7040*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 1, 1, 1, 104);
			environment.addPlatform(ResourceManager.floorL6, (int) (7072*MainGame.xScalingFactor), (int) (3112*MainGame.yScalingFactor), 1, 1, 1, 105);
			environment.addPlatform(ResourceManager.floorL6, (int) (7104*MainGame.xScalingFactor), (int) (3144*MainGame.yScalingFactor), 2, 1, 1, 106);
			environment.addPlatform(ResourceManager.floorL6, (int) (7168*MainGame.xScalingFactor), (int) (3176*MainGame.yScalingFactor), 1, 1, 1, 107);
			environment.addPlatform(ResourceManager.floorL6, (int) (7200*MainGame.xScalingFactor), (int) (3208*MainGame.yScalingFactor), 1, 1, 1, 108);
			environment.addPlatform(ResourceManager.floorL6, (int) (7232*MainGame.xScalingFactor), (int) (3240*MainGame.yScalingFactor), 1, 1, 1, 109);
			environment.addPlatform(ResourceManager.floorL6, (int) (7264*MainGame.xScalingFactor), (int) (3272*MainGame.yScalingFactor), 2, 1, 1, 110);
			environment.addPlatform(ResourceManager.floorL6, (int) (7328*MainGame.xScalingFactor), (int) (3304*MainGame.yScalingFactor), 1, 1, 1, 111);
			environment.addPlatform(ResourceManager.floorL6, (int) (7360*MainGame.xScalingFactor), (int) (3336*MainGame.yScalingFactor), 1, 1, 1, 112);
			environment.addPlatform(ResourceManager.floorL6, (int) (7392*MainGame.xScalingFactor), (int) (3368*MainGame.yScalingFactor), 1, 1, 1, 113);
			environment.addPlatform(ResourceManager.floorL6, (int) (7424*MainGame.xScalingFactor), (int) (3400*MainGame.yScalingFactor), 1, 1, 1, 114);
			environment.addPlatform(ResourceManager.floorL6, (int) (7456*MainGame.xScalingFactor), (int) (3432*MainGame.yScalingFactor), 1, 1, 1, 115);
			environment.addPlatform(ResourceManager.floorL6, (int) (7488*MainGame.xScalingFactor), (int) (3464*MainGame.yScalingFactor), 2, 1, 1, 116);
			environment.addPlatform(ResourceManager.floorL6, (int) (7552*MainGame.xScalingFactor), (int) (3496*MainGame.yScalingFactor), 2, 1, 1, 117);
			environment.addPlatform(ResourceManager.floorL6, (int) (7616*MainGame.xScalingFactor), (int) (3528*MainGame.yScalingFactor), 2, 1, 1, 118);
			environment.addPlatform(ResourceManager.floorL6, (int) (7680*MainGame.xScalingFactor), (int) (3560*MainGame.yScalingFactor), 1, 1, 1, 119);
			environment.addPlatform(ResourceManager.floorL6, (int) (7712*MainGame.xScalingFactor), (int) (3592*MainGame.yScalingFactor), 1, 1, 1, 120);
			environment.addPlatform(ResourceManager.floorL6, (int) (7744*MainGame.xScalingFactor), (int) (3624*MainGame.yScalingFactor), 1, 1, 1, 121);
			environment.addPlatform(ResourceManager.floorL6, (int) (7776*MainGame.xScalingFactor), (int) (3656*MainGame.yScalingFactor), 45, 1, 1, 122);
			environment.addPlatform(ResourceManager.floorL6, (int) (9216*MainGame.xScalingFactor), (int) (3624*MainGame.yScalingFactor), 1, 1, 1, 123);
			environment.addPlatform(ResourceManager.floorL6, (int) (9248*MainGame.xScalingFactor), (int) (3592*MainGame.yScalingFactor), 1, 1, 1, 124);
			environment.addPlatform(ResourceManager.floorL6, (int) (9280*MainGame.xScalingFactor), (int) (3560*MainGame.yScalingFactor), 1, 1, 1, 125);
			environment.addPlatform(ResourceManager.floorL6, (int) (9312*MainGame.xScalingFactor), (int) (3528*MainGame.yScalingFactor), 1, 1, 1, 126);
			environment.addPlatform(ResourceManager.floorL6, (int) (9344*MainGame.xScalingFactor), (int) (3496*MainGame.yScalingFactor), 1, 1, 1, 127);
			environment.addPlatform(ResourceManager.floorL6, (int) (9376*MainGame.xScalingFactor), (int) (3464*MainGame.yScalingFactor), 1, 1, 1, 128);
			environment.addPlatform(ResourceManager.floorL6, (int) (9408*MainGame.xScalingFactor), (int) (3432*MainGame.yScalingFactor), 2, 1, 1, 129);
			environment.addPlatform(ResourceManager.floorL6, (int) (9472*MainGame.xScalingFactor), (int) (3400*MainGame.yScalingFactor), 1, 1, 1, 130);
			environment.addPlatform(ResourceManager.floorL6, (int) (9504*MainGame.xScalingFactor), (int) (3368*MainGame.yScalingFactor), 1, 1, 1, 131);
			environment.addPlatform(ResourceManager.floorL6, (int) (9536*MainGame.xScalingFactor), (int) (3336*MainGame.yScalingFactor), 2, 1, 1, 132);
			environment.addPlatform(ResourceManager.floorL6, (int) (9600*MainGame.xScalingFactor), (int) (3304*MainGame.yScalingFactor), 2, 1, 1, 133);
			environment.addPlatform(ResourceManager.floorL6, (int) (9664*MainGame.xScalingFactor), (int) (3272*MainGame.yScalingFactor), 2, 1, 1, 134);
			environment.addPlatform(ResourceManager.floorL6, (int) (9728*MainGame.xScalingFactor), (int) (3240*MainGame.yScalingFactor), 1, 1, 1, 135);
			environment.addPlatform(ResourceManager.floorL6, (int) (9760*MainGame.xScalingFactor), (int) (3208*MainGame.yScalingFactor), 1, 1, 1, 136);
			environment.addPlatform(ResourceManager.floorL6, (int) (9792*MainGame.xScalingFactor), (int) (3176*MainGame.yScalingFactor), 1, 1, 1, 137);
			environment.addPlatform(ResourceManager.floorL6, (int) (9824*MainGame.xScalingFactor), (int) (3144*MainGame.yScalingFactor), 1, 1, 1, 138);
			environment.addPlatform(ResourceManager.floorL6, (int) (9856*MainGame.xScalingFactor), (int) (3112*MainGame.yScalingFactor), 1, 1, 1, 139);
			environment.addPlatform(ResourceManager.floorL6, (int) (9888*MainGame.xScalingFactor), (int) (3080*MainGame.yScalingFactor), 2, 1, 1, 140);
			environment.addPlatform(ResourceManager.floorL6, (int) (9952*MainGame.xScalingFactor), (int) (3048*MainGame.yScalingFactor), 1, 1, 1, 141);
			environment.addPlatform(ResourceManager.floorL6, (int) (9984*MainGame.xScalingFactor), (int) (3016*MainGame.yScalingFactor), 1, 1, 1, 142);
			environment.addPlatform(ResourceManager.floorL6, (int) (10016*MainGame.xScalingFactor), (int) (2984*MainGame.yScalingFactor), 1, 1, 1, 143);
			environment.addPlatform(ResourceManager.floorL6, (int) (10048*MainGame.xScalingFactor), (int) (2952*MainGame.yScalingFactor), 2, 1, 1, 144);
			environment.addPlatform(ResourceManager.floorL6, (int) (10112*MainGame.xScalingFactor), (int) (2920*MainGame.yScalingFactor), 1, 1, 1, 145);
			environment.addPlatform(ResourceManager.floorL6, (int) (10144*MainGame.xScalingFactor), (int) (2888*MainGame.yScalingFactor), 1, 1, 1, 146);
			environment.addPlatform(ResourceManager.floorL6, (int) (10176*MainGame.xScalingFactor), (int) (2856*MainGame.yScalingFactor), 1, 1, 1, 147);
			environment.addPlatform(ResourceManager.floorL6, (int) (10208*MainGame.xScalingFactor), (int) (2824*MainGame.yScalingFactor), 1, 1, 1, 148);
			environment.addPlatform(ResourceManager.floorL6, (int) (10240*MainGame.xScalingFactor), (int) (2792*MainGame.yScalingFactor), 2, 1, 1, 149);
			environment.addPlatform(ResourceManager.floorL6, (int) (10304*MainGame.xScalingFactor), (int) (2760*MainGame.yScalingFactor), 1, 1, 1, 150);
			environment.addPlatform(ResourceManager.floorL6, (int) (10336*MainGame.xScalingFactor), (int) (2728*MainGame.yScalingFactor), 2, 1, 1, 151);
			environment.addPlatform(ResourceManager.floorL6, (int) (10400*MainGame.xScalingFactor), (int) (2696*MainGame.yScalingFactor), 1, 1, 1, 152);
			environment.addPlatform(ResourceManager.floorL6, (int) (10432*MainGame.xScalingFactor), (int) (2664*MainGame.yScalingFactor), 10, 1, 1, 153);
			environment.addPlatform(ResourceManager.floorL6, (int) (10752*MainGame.xScalingFactor), (int) (2632*MainGame.yScalingFactor), 1, 1, 1, 154);
			environment.addPlatform(ResourceManager.floorL6, (int) (10784*MainGame.xScalingFactor), (int) (2600*MainGame.yScalingFactor), 1, 1, 1, 155);
			environment.addPlatform(ResourceManager.floorL6, (int) (10816*MainGame.xScalingFactor), (int) (2568*MainGame.yScalingFactor), 1, 1, 1, 156);
			environment.addPlatform(ResourceManager.floorL6, (int) (10848*MainGame.xScalingFactor), (int) (2536*MainGame.yScalingFactor), 1, 1, 1, 157);
			environment.addPlatform(ResourceManager.floorL6, (int) (10880*MainGame.xScalingFactor), (int) (2504*MainGame.yScalingFactor), 1, 1, 1, 158);
			environment.addPlatform(ResourceManager.floorL6, (int) (10912*MainGame.xScalingFactor), (int) (2472*MainGame.yScalingFactor), 1, 1, 1, 159);
			environment.addPlatform(ResourceManager.floorL6, (int) (10944*MainGame.xScalingFactor), (int) (2440*MainGame.yScalingFactor), 2, 1, 1, 160);
			environment.addPlatform(ResourceManager.floorL6, (int) (11008*MainGame.xScalingFactor), (int) (2408*MainGame.yScalingFactor), 1, 1, 1, 161);
			environment.addPlatform(ResourceManager.floorL6, (int) (11040*MainGame.xScalingFactor), (int) (2376*MainGame.yScalingFactor), 1, 1, 1, 162);
			environment.addPlatform(ResourceManager.floorL6, (int) (11072*MainGame.xScalingFactor), (int) (2344*MainGame.yScalingFactor), 1, 1, 1, 163);
			environment.addPlatform(ResourceManager.floorL6, (int) (11104*MainGame.xScalingFactor), (int) (2312*MainGame.yScalingFactor), 2, 1, 1, 164);
			environment.addPlatform(ResourceManager.floorL6, (int) (11168*MainGame.xScalingFactor), (int) (2280*MainGame.yScalingFactor), 2, 1, 1, 165);
			environment.addPlatform(ResourceManager.floorL6, (int) (11232*MainGame.xScalingFactor), (int) (2248*MainGame.yScalingFactor), 1, 1, 1, 166);
			environment.addPlatform(ResourceManager.floorL6, (int) (11264*MainGame.xScalingFactor), (int) (2216*MainGame.yScalingFactor), 1, 1, 1, 167);
			environment.addPlatform(ResourceManager.floorL6, (int) (11296*MainGame.xScalingFactor), (int) (2184*MainGame.yScalingFactor), 1, 1, 1, 168);
			environment.addPlatform(ResourceManager.floorL6, (int) (11328*MainGame.xScalingFactor), (int) (2152*MainGame.yScalingFactor), 1, 1, 1, 169);
			environment.addPlatform(ResourceManager.floorL6, (int) (11360*MainGame.xScalingFactor), (int) (2120*MainGame.yScalingFactor), 2, 1, 1, 170);
			environment.addPlatform(ResourceManager.floorL6, (int) (11424*MainGame.xScalingFactor), (int) (2088*MainGame.yScalingFactor), 1, 1, 1, 171);
			environment.addPlatform(ResourceManager.floorL6, (int) (11456*MainGame.xScalingFactor), (int) (2056*MainGame.yScalingFactor), 1, 1, 1, 172);
			environment.addPlatform(ResourceManager.floorL6, (int) (11488*MainGame.xScalingFactor), (int) (2024*MainGame.yScalingFactor), 1, 1, 1, 173);
			environment.addPlatform(ResourceManager.floorL6, (int) (11520*MainGame.xScalingFactor), (int) (1992*MainGame.yScalingFactor), 1, 1, 1, 174);
			environment.addPlatform(ResourceManager.floorL6, (int) (11552*MainGame.xScalingFactor), (int) (1960*MainGame.yScalingFactor), 1, 1, 1, 175);
			environment.addPlatform(ResourceManager.floorL6, (int) (11584*MainGame.xScalingFactor), (int) (1928*MainGame.yScalingFactor), 2, 1, 1, 176);
			environment.addPlatform(ResourceManager.floorL6, (int) (11648*MainGame.xScalingFactor), (int) (1896*MainGame.yScalingFactor), 2, 1, 1, 177);
			environment.addPlatform(ResourceManager.floorL6, (int) (11712*MainGame.xScalingFactor), (int) (1864*MainGame.yScalingFactor), 1, 1, 1, 178);
			environment.addPlatform(ResourceManager.floorL6, (int) (11744*MainGame.xScalingFactor), (int) (1832*MainGame.yScalingFactor), 1, 1, 1, 179);
			environment.addPlatform(ResourceManager.floorL6, (int) (11776*MainGame.xScalingFactor), (int) (1800*MainGame.yScalingFactor), 1, 1, 1, 180);
			environment.addPlatform(ResourceManager.floorL6, (int) (11808*MainGame.xScalingFactor), (int) (1768*MainGame.yScalingFactor), 1, 1, 1, 181);
			environment.addPlatform(ResourceManager.floorL6, (int) (11840*MainGame.xScalingFactor), (int) (1736*MainGame.yScalingFactor), 1, 1, 1, 182);
			environment.addPlatform(ResourceManager.floorL6, (int) (11872*MainGame.xScalingFactor), (int) (1704*MainGame.yScalingFactor), 1, 1, 1, 183);
			environment.addPlatform(ResourceManager.floorL6, (int) (11904*MainGame.xScalingFactor), (int) (1672*MainGame.yScalingFactor), 10, 1, 1, 184);
			environment.addPlatform(ResourceManager.floorL6, (int) (12224*MainGame.xScalingFactor), (int) (1640*MainGame.yScalingFactor), 1, 1, 1, 185);
			environment.addPlatform(ResourceManager.floorL6, (int) (12256*MainGame.xScalingFactor), (int) (1608*MainGame.yScalingFactor), 1, 1, 1, 186);
			environment.addPlatform(ResourceManager.floorL6, (int) (12288*MainGame.xScalingFactor), (int) (1576*MainGame.yScalingFactor), 1, 1, 1, 187);
			environment.addPlatform(ResourceManager.floorL6, (int) (12320*MainGame.xScalingFactor), (int) (1544*MainGame.yScalingFactor), 1, 1, 1, 188);
			environment.addPlatform(ResourceManager.floorL6, (int) (12352*MainGame.xScalingFactor), (int) (1512*MainGame.yScalingFactor), 1, 1, 1, 189);
			environment.addPlatform(ResourceManager.floorL6, (int) (12384*MainGame.xScalingFactor), (int) (1480*MainGame.yScalingFactor), 1, 1, 1, 190);
			environment.addPlatform(ResourceManager.floorL6, (int) (12416*MainGame.xScalingFactor), (int) (1448*MainGame.yScalingFactor), 1, 1, 1, 191);
			environment.addPlatform(ResourceManager.floorL6, (int) (12448*MainGame.xScalingFactor), (int) (1416*MainGame.yScalingFactor), 1, 1, 1, 192);
			environment.addPlatform(ResourceManager.floorL6, (int) (12480*MainGame.xScalingFactor), (int) (1384*MainGame.yScalingFactor), 1, 1, 1, 193);
			environment.addPlatform(ResourceManager.floorL6, (int) (12512*MainGame.xScalingFactor), (int) (1352*MainGame.yScalingFactor), 1, 1, 1, 194);
			environment.addPlatform(ResourceManager.floorL6, (int) (12544*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 1, 1, 1, 195);
			environment.addPlatform(ResourceManager.floorL6, (int) (12576*MainGame.xScalingFactor), (int) (1288*MainGame.yScalingFactor), 1, 1, 1, 196);
			environment.addPlatform(ResourceManager.floorL6, (int) (12608*MainGame.xScalingFactor), (int) (1256*MainGame.yScalingFactor), 1, 1, 1, 197);
			environment.addPlatform(ResourceManager.floorL6, (int) (12640*MainGame.xScalingFactor), (int) (1224*MainGame.yScalingFactor), 1, 1, 1, 198);
			environment.addPlatform(ResourceManager.floorL6, (int) (12672*MainGame.xScalingFactor), (int) (1192*MainGame.yScalingFactor), 1, 1, 1, 199);
			environment.addPlatform(ResourceManager.floorL6, (int) (12704*MainGame.xScalingFactor), (int) (1160*MainGame.yScalingFactor), 1, 1, 1, 200);
			environment.addPlatform(ResourceManager.floorL6, (int) (12736*MainGame.xScalingFactor), (int) (1128*MainGame.yScalingFactor), 1, 1, 1, 201);
			environment.addPlatform(ResourceManager.floorL6, (int) (12768*MainGame.xScalingFactor), (int) (1096*MainGame.yScalingFactor), 1, 1, 1, 202);
			environment.addPlatform(ResourceManager.floorL6, (int) (12800*MainGame.xScalingFactor), (int) (1064*MainGame.yScalingFactor), 1, 1, 1, 203);
			environment.addPlatform(ResourceManager.floorL6, (int) (12832*MainGame.xScalingFactor), (int) (1032*MainGame.yScalingFactor), 1, 1, 1, 204);
			environment.addPlatform(ResourceManager.floorL6, (int) (12864*MainGame.xScalingFactor), (int) (1000*MainGame.yScalingFactor), 1, 1, 1, 205);
			environment.addPlatform(ResourceManager.floorL6, (int) (12896*MainGame.xScalingFactor), (int) (968*MainGame.yScalingFactor), 1, 1, 1, 206);
			environment.addPlatform(ResourceManager.floorL6, (int) (12928*MainGame.xScalingFactor), (int) (936*MainGame.yScalingFactor), 1, 1, 1, 207);
			environment.addPlatform(ResourceManager.floorL6, (int) (12960*MainGame.xScalingFactor), (int) (904*MainGame.yScalingFactor), 1, 1, 1, 208);
			environment.addPlatform(ResourceManager.floorL6, (int) (12992*MainGame.xScalingFactor), (int) (872*MainGame.yScalingFactor), 1, 1, 1, 209);
			environment.addPlatform(ResourceManager.floorL6, (int) (13024*MainGame.xScalingFactor), (int) (840*MainGame.yScalingFactor), 1, 1, 1, 210);
			environment.addPlatform(ResourceManager.floorL6, (int) (13056*MainGame.xScalingFactor), (int) (808*MainGame.yScalingFactor), 45, 1, 1, 211);
			environment.addPlatform(ResourceManager.floorL6, (int) (14496*MainGame.xScalingFactor), (int) (776*MainGame.yScalingFactor), 1, 1, 1, 212);
			environment.addPlatform(ResourceManager.floorL6, (int) (14528*MainGame.xScalingFactor), (int) (808*MainGame.yScalingFactor), 1, 1, 1, 213);
			environment.addPlatform(ResourceManager.floorL6, (int) (14560*MainGame.xScalingFactor), (int) (840*MainGame.yScalingFactor), 2, 1, 1, 214);
			environment.addPlatform(ResourceManager.floorL6, (int) (14624*MainGame.xScalingFactor), (int) (872*MainGame.yScalingFactor), 2, 1, 1, 215);
			environment.addPlatform(ResourceManager.floorL6, (int) (14688*MainGame.xScalingFactor), (int) (904*MainGame.yScalingFactor), 1, 1, 1, 216);
			environment.addPlatform(ResourceManager.floorL6, (int) (14720*MainGame.xScalingFactor), (int) (936*MainGame.yScalingFactor), 1, 1, 1, 217);
			environment.addPlatform(ResourceManager.floorL6, (int) (14752*MainGame.xScalingFactor), (int) (968*MainGame.yScalingFactor), 1, 1, 1, 218);
			environment.addPlatform(ResourceManager.floorL6, (int) (14784*MainGame.xScalingFactor), (int) (1000*MainGame.yScalingFactor), 1, 1, 1, 219);
			environment.addPlatform(ResourceManager.floorL6, (int) (14816*MainGame.xScalingFactor), (int) (1032*MainGame.yScalingFactor), 1, 1, 1, 220);
			environment.addPlatform(ResourceManager.floorL6, (int) (14848*MainGame.xScalingFactor), (int) (1064*MainGame.yScalingFactor), 2, 1, 1, 221);
			environment.addPlatform(ResourceManager.floorL6, (int) (14912*MainGame.xScalingFactor), (int) (1096*MainGame.yScalingFactor), 1, 1, 1, 222);
			environment.addPlatform(ResourceManager.floorL6, (int) (14944*MainGame.xScalingFactor), (int) (1128*MainGame.yScalingFactor), 1, 1, 1, 223);
			environment.addPlatform(ResourceManager.floorL6, (int) (14976*MainGame.xScalingFactor), (int) (1160*MainGame.yScalingFactor), 1, 1, 1, 224);
			environment.addPlatform(ResourceManager.floorL6, (int) (15008*MainGame.xScalingFactor), (int) (1192*MainGame.yScalingFactor), 2, 1, 1, 225);
			environment.addPlatform(ResourceManager.floorL6, (int) (15072*MainGame.xScalingFactor), (int) (1224*MainGame.yScalingFactor), 2, 1, 1, 226);
			environment.addPlatform(ResourceManager.floorL6, (int) (15136*MainGame.xScalingFactor), (int) (1256*MainGame.yScalingFactor), 2, 1, 1, 227);
			environment.addPlatform(ResourceManager.floorL6, (int) (15200*MainGame.xScalingFactor), (int) (1288*MainGame.yScalingFactor), 1, 1, 1, 228);
			environment.addPlatform(ResourceManager.floorL6, (int) (15232*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 1, 1, 1, 229);
			environment.addPlatform(ResourceManager.floorL6, (int) (15264*MainGame.xScalingFactor), (int) (1352*MainGame.yScalingFactor), 2, 1, 1, 230);
			environment.addPlatform(ResourceManager.floorL6, (int) (15328*MainGame.xScalingFactor), (int) (1384*MainGame.yScalingFactor), 1, 1, 1, 231);
			environment.addPlatform(ResourceManager.floorL6, (int) (15360*MainGame.xScalingFactor), (int) (1416*MainGame.yScalingFactor), 2, 1, 1, 232);
			environment.addPlatform(ResourceManager.floorL6, (int) (15424*MainGame.xScalingFactor), (int) (1448*MainGame.yScalingFactor), 1, 1, 1, 233);
			environment.addPlatform(ResourceManager.floorL6, (int) (15456*MainGame.xScalingFactor), (int) (1480*MainGame.yScalingFactor), 1, 1, 1, 234);
			environment.addPlatform(ResourceManager.floorL6, (int) (15488*MainGame.xScalingFactor), (int) (1512*MainGame.yScalingFactor), 1, 1, 1, 235);
			environment.addPlatform(ResourceManager.floorL6, (int) (15520*MainGame.xScalingFactor), (int) (1544*MainGame.yScalingFactor), 1, 1, 1, 236);
			environment.addPlatform(ResourceManager.floorL6, (int) (15552*MainGame.xScalingFactor), (int) (1576*MainGame.yScalingFactor), 1, 1, 1, 237);
			environment.addPlatform(ResourceManager.floorL6, (int) (15584*MainGame.xScalingFactor), (int) (1608*MainGame.yScalingFactor), 2, 1, 1, 238);
			environment.addPlatform(ResourceManager.floorL6, (int) (15648*MainGame.xScalingFactor), (int) (1640*MainGame.yScalingFactor), 2, 1, 1, 239);
			environment.addPlatform(ResourceManager.floorL6, (int) (15712*MainGame.xScalingFactor), (int) (1672*MainGame.yScalingFactor), 2, 1, 1, 240);
			environment.addPlatform(ResourceManager.floorL6, (int) (15776*MainGame.xScalingFactor), (int) (1704*MainGame.yScalingFactor), 1, 1, 1, 241);
			environment.addPlatform(ResourceManager.floorL6, (int) (15808*MainGame.xScalingFactor), (int) (1736*MainGame.yScalingFactor), 1, 1, 1, 242);
			environment.addPlatform(ResourceManager.floorL6, (int) (15840*MainGame.xScalingFactor), (int) (1768*MainGame.yScalingFactor), 1, 1, 1, 243);
			environment.addPlatform(ResourceManager.floorL6, (int) (15872*MainGame.xScalingFactor), (int) (1800*MainGame.yScalingFactor), 1, 1, 1, 244);
			environment.addPlatform(ResourceManager.floorL6, (int) (15904*MainGame.xScalingFactor), (int) (1832*MainGame.yScalingFactor), 2, 1, 1, 245);
			environment.addPlatform(ResourceManager.floorL6, (int) (15968*MainGame.xScalingFactor), (int) (1864*MainGame.yScalingFactor), 1, 1, 1, 246);
			environment.addPlatform(ResourceManager.floorL6, (int) (16000*MainGame.xScalingFactor), (int) (1896*MainGame.yScalingFactor), 1, 1, 1, 247);
			environment.addPlatform(ResourceManager.floorL6, (int) (16032*MainGame.xScalingFactor), (int) (1928*MainGame.yScalingFactor), 1, 1, 1, 248);
			environment.addPlatform(ResourceManager.floorL6, (int) (16064*MainGame.xScalingFactor), (int) (1960*MainGame.yScalingFactor), 2, 1, 1, 249);
			environment.addPlatform(ResourceManager.floorL6, (int) (16128*MainGame.xScalingFactor), (int) (1992*MainGame.yScalingFactor), 2, 1, 1, 250);
			environment.addPlatform(ResourceManager.floorL6, (int) (16192*MainGame.xScalingFactor), (int) (2024*MainGame.yScalingFactor), 1, 1, 1, 251);
			environment.addPlatform(ResourceManager.floorL6, (int) (16224*MainGame.xScalingFactor), (int) (2056*MainGame.yScalingFactor), 1, 1, 1, 252);
			environment.addPlatform(ResourceManager.floorL6, (int) (16256*MainGame.xScalingFactor), (int) (2088*MainGame.yScalingFactor), 1, 1, 1, 253);
			environment.addPlatform(ResourceManager.floorL6, (int) (16288*MainGame.xScalingFactor), (int) (2120*MainGame.yScalingFactor), 1, 1, 1, 254);
			environment.addPlatform(ResourceManager.floorL6, (int) (16320*MainGame.xScalingFactor), (int) (2152*MainGame.yScalingFactor), 2, 1, 1, 255);
			environment.addPlatform(ResourceManager.floorL6, (int) (16384*MainGame.xScalingFactor), (int) (2184*MainGame.yScalingFactor), 1, 1, 1, 256);
			environment.addPlatform(ResourceManager.floorL6, (int) (16416*MainGame.xScalingFactor), (int) (2216*MainGame.yScalingFactor), 1, 1, 1, 257);
			environment.addPlatform(ResourceManager.floorL6, (int) (16448*MainGame.xScalingFactor), (int) (2248*MainGame.yScalingFactor), 45, 1, 1, 258);
			environment.addPlatform(ResourceManager.floorL6, (int) (17888*MainGame.xScalingFactor), (int) (2216*MainGame.yScalingFactor), 1, 1, 1, 259);
			environment.addPlatform(ResourceManager.floorL6, (int) (17920*MainGame.xScalingFactor), (int) (2184*MainGame.yScalingFactor), 1, 1, 1, 260);
			environment.addPlatform(ResourceManager.floorL6, (int) (17952*MainGame.xScalingFactor), (int) (2152*MainGame.yScalingFactor), 1, 1, 1, 261);
			environment.addPlatform(ResourceManager.floorL6, (int) (17984*MainGame.xScalingFactor), (int) (2120*MainGame.yScalingFactor), 2, 1, 1, 262);
			environment.addPlatform(ResourceManager.floorL6, (int) (18048*MainGame.xScalingFactor), (int) (2088*MainGame.yScalingFactor), 1, 1, 1, 263);
			environment.addPlatform(ResourceManager.floorL6, (int) (18080*MainGame.xScalingFactor), (int) (2056*MainGame.yScalingFactor), 1, 1, 1, 264);
			environment.addPlatform(ResourceManager.floorL6, (int) (18112*MainGame.xScalingFactor), (int) (2024*MainGame.yScalingFactor), 2, 1, 1, 265);
			environment.addPlatform(ResourceManager.floorL6, (int) (18176*MainGame.xScalingFactor), (int) (1992*MainGame.yScalingFactor), 2, 1, 1, 266);
			environment.addPlatform(ResourceManager.floorL6, (int) (18240*MainGame.xScalingFactor), (int) (1960*MainGame.yScalingFactor), 1, 1, 1, 267);
			environment.addPlatform(ResourceManager.floorL6, (int) (18272*MainGame.xScalingFactor), (int) (1928*MainGame.yScalingFactor), 1, 1, 1, 268);
			environment.addPlatform(ResourceManager.floorL6, (int) (18304*MainGame.xScalingFactor), (int) (1896*MainGame.yScalingFactor), 1, 1, 1, 269);
			environment.addPlatform(ResourceManager.floorL6, (int) (18336*MainGame.xScalingFactor), (int) (1864*MainGame.yScalingFactor), 2, 1, 1, 270);
			environment.addPlatform(ResourceManager.floorL6, (int) (18400*MainGame.xScalingFactor), (int) (1832*MainGame.yScalingFactor), 1, 1, 1, 271);
			environment.addPlatform(ResourceManager.floorL6, (int) (18432*MainGame.xScalingFactor), (int) (1800*MainGame.yScalingFactor), 1, 1, 1, 272);
			environment.addPlatform(ResourceManager.floorL6, (int) (18464*MainGame.xScalingFactor), (int) (1768*MainGame.yScalingFactor), 2, 1, 1, 273);
			environment.addPlatform(ResourceManager.floorL6, (int) (18528*MainGame.xScalingFactor), (int) (1736*MainGame.yScalingFactor), 2, 1, 1, 274);
			environment.addPlatform(ResourceManager.floorL6, (int) (18592*MainGame.xScalingFactor), (int) (1704*MainGame.yScalingFactor), 1, 1, 1, 275);
			environment.addPlatform(ResourceManager.floorL6, (int) (18624*MainGame.xScalingFactor), (int) (1672*MainGame.yScalingFactor), 1, 1, 1, 276);
			environment.addPlatform(ResourceManager.floorL6, (int) (18656*MainGame.xScalingFactor), (int) (1640*MainGame.yScalingFactor), 1, 1, 1, 277);
			environment.addPlatform(ResourceManager.floorL6, (int) (18688*MainGame.xScalingFactor), (int) (1608*MainGame.yScalingFactor), 2, 1, 1, 278);
			environment.addPlatform(ResourceManager.floorL6, (int) (18752*MainGame.xScalingFactor), (int) (1576*MainGame.yScalingFactor), 1, 1, 1, 279);
			environment.addPlatform(ResourceManager.floorL6, (int) (18784*MainGame.xScalingFactor), (int) (1544*MainGame.yScalingFactor), 1, 1, 1, 280);
			environment.addPlatform(ResourceManager.floorL6, (int) (18816*MainGame.xScalingFactor), (int) (1512*MainGame.yScalingFactor), 2, 1, 1, 281);
			environment.addPlatform(ResourceManager.floorL6, (int) (18880*MainGame.xScalingFactor), (int) (1480*MainGame.yScalingFactor), 1, 1, 1, 282);
			environment.addPlatform(ResourceManager.floorL6, (int) (18912*MainGame.xScalingFactor), (int) (1448*MainGame.yScalingFactor), 2, 1, 1, 283);
			environment.addPlatform(ResourceManager.floorL6, (int) (18976*MainGame.xScalingFactor), (int) (1416*MainGame.yScalingFactor), 2, 1, 1, 284);
			environment.addPlatform(ResourceManager.floorL6, (int) (19040*MainGame.xScalingFactor), (int) (1384*MainGame.yScalingFactor), 1, 1, 1, 285);
			environment.addPlatform(ResourceManager.floorL6, (int) (19072*MainGame.xScalingFactor), (int) (1352*MainGame.yScalingFactor), 1, 1, 1, 286);
			environment.addPlatform(ResourceManager.floorL6, (int) (19104*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 1, 1, 1, 287);
			environment.addPlatform(ResourceManager.floorL6, (int) (19136*MainGame.xScalingFactor), (int) (1288*MainGame.yScalingFactor), 1, 1, 1, 288);
			environment.addPlatform(ResourceManager.floorL6, (int) (19168*MainGame.xScalingFactor), (int) (1256*MainGame.yScalingFactor), 2, 1, 1, 289);
			environment.addPlatform(ResourceManager.floorL6, (int) (19232*MainGame.xScalingFactor), (int) (1224*MainGame.yScalingFactor), 1, 1, 1, 290);
			environment.addPlatform(ResourceManager.floorL6, (int) (19264*MainGame.xScalingFactor), (int) (1192*MainGame.yScalingFactor), 1, 1, 1, 291);
			environment.addPlatform(ResourceManager.floorL6, (int) (19296*MainGame.xScalingFactor), (int) (1160*MainGame.yScalingFactor), 2, 1, 1, 292);
			environment.addPlatform(ResourceManager.floorL6, (int) (19360*MainGame.xScalingFactor), (int) (1128*MainGame.yScalingFactor), 1, 1, 1, 293);
			environment.addPlatform(ResourceManager.floorL6, (int) (19392*MainGame.xScalingFactor), (int) (1096*MainGame.yScalingFactor), 1, 1, 1, 294);
			environment.addPlatform(ResourceManager.floorL6, (int) (19424*MainGame.xScalingFactor), (int) (1064*MainGame.yScalingFactor), 1, 1, 1, 295);
			environment.addPlatform(ResourceManager.floorL6, (int) (19456*MainGame.xScalingFactor), (int) (1032*MainGame.yScalingFactor), 2, 1, 1, 296);
			environment.addPlatform(ResourceManager.floorL6, (int) (19520*MainGame.xScalingFactor), (int) (1000*MainGame.yScalingFactor), 2, 1, 1, 297);
			environment.addPlatform(ResourceManager.floorL6, (int) (19584*MainGame.xScalingFactor), (int) (968*MainGame.yScalingFactor), 1, 1, 1, 298);
			environment.addPlatform(ResourceManager.floorL6, (int) (19616*MainGame.xScalingFactor), (int) (936*MainGame.yScalingFactor), 1, 1, 1, 299);
			environment.addPlatform(ResourceManager.floorL6, (int) (19648*MainGame.xScalingFactor), (int) (904*MainGame.yScalingFactor), 1, 1, 1, 300);
			environment.addPlatform(ResourceManager.floorL6, (int) (19680*MainGame.xScalingFactor), (int) (872*MainGame.yScalingFactor), 1, 1, 1, 301);
			environment.addPlatform(ResourceManager.floorL6, (int) (19712*MainGame.xScalingFactor), (int) (840*MainGame.yScalingFactor), 1, 1, 1, 302);
			environment.addPlatform(ResourceManager.floorL6, (int) (19744*MainGame.xScalingFactor), (int) (808*MainGame.yScalingFactor), 1, 1, 1, 303);
			environment.addPlatform(ResourceManager.floorL6, (int) (19776*MainGame.xScalingFactor), (int) (776*MainGame.yScalingFactor), 1, 1, 1, 304);
			environment.addPlatform(ResourceManager.floorL6, (int) (19808*MainGame.xScalingFactor), (int) (744*MainGame.yScalingFactor), 2, 1, 1, 305);
			environment.addPlatform(ResourceManager.floorL6, (int) (19872*MainGame.xScalingFactor), (int) (712*MainGame.yScalingFactor), 1, 1, 1, 306);
			environment.addPlatform(ResourceManager.floorL6, (int) (19904*MainGame.xScalingFactor), (int) (680*MainGame.yScalingFactor), 1, 1, 1, 307);
			environment.addPlatform(ResourceManager.floorL6, (int) (19936*MainGame.xScalingFactor), (int) (648*MainGame.yScalingFactor), 1, 1, 1, 308);
			environment.addPlatform(ResourceManager.floorL6, (int) (19968*MainGame.xScalingFactor), (int) (616*MainGame.yScalingFactor), 2, 1, 1, 309);
			environment.addPlatform(ResourceManager.floorL6, (int) (20032*MainGame.xScalingFactor), (int) (584*MainGame.yScalingFactor), 1, 1, 1, 310);
			environment.addPlatform(ResourceManager.floorL6, (int) (20064*MainGame.xScalingFactor), (int) (552*MainGame.yScalingFactor), 2, 1, 1, 311);
			environment.addPlatform(ResourceManager.floorL6, (int) (20128*MainGame.xScalingFactor), (int) (520*MainGame.yScalingFactor), 1, 1, 1, 312);
			environment.addPlatform(ResourceManager.floorL6, (int) (20160*MainGame.xScalingFactor), (int) (488*MainGame.yScalingFactor), 1, 1, 1, 313);
			environment.addPlatform(ResourceManager.floorL6, (int) (20192*MainGame.xScalingFactor), (int) (456*MainGame.yScalingFactor), 1, 1, 1, 314);
			environment.addPlatform(ResourceManager.floorL6, (int) (20224*MainGame.xScalingFactor), (int) (424*MainGame.yScalingFactor), 1, 1, 1, 315);
			environment.addPlatform(ResourceManager.floorL6, (int) (20256*MainGame.xScalingFactor), (int) (392*MainGame.yScalingFactor), 1, 1, 1, 316);
			environment.addPlatform(ResourceManager.floorL6, (int) (20288*MainGame.xScalingFactor), (int) (360*MainGame.yScalingFactor), 2, 1, 1, 317);
			environment.addPlatform(ResourceManager.floorL6, (int) (20352*MainGame.xScalingFactor), (int) (328*MainGame.yScalingFactor), 45, 1, 1, 318);
			environment.addPlatform(ResourceManager.floorL6, (int) (21792*MainGame.xScalingFactor), (int) (360*MainGame.yScalingFactor), 1, 1, 1, 319);
			environment.addPlatform(ResourceManager.floorL6, (int) (21824*MainGame.xScalingFactor), (int) (392*MainGame.yScalingFactor), 1, 1, 1, 320);
			environment.addPlatform(ResourceManager.floorL6, (int) (21856*MainGame.xScalingFactor), (int) (424*MainGame.yScalingFactor), 1, 1, 1, 321);
			environment.addPlatform(ResourceManager.floorL6, (int) (21888*MainGame.xScalingFactor), (int) (456*MainGame.yScalingFactor), 1, 1, 1, 322);
			environment.addPlatform(ResourceManager.floorL6, (int) (21920*MainGame.xScalingFactor), (int) (488*MainGame.yScalingFactor), 1, 1, 1, 323);
			environment.addPlatform(ResourceManager.floorL6, (int) (21952*MainGame.xScalingFactor), (int) (520*MainGame.yScalingFactor), 2, 1, 1, 324);
			environment.addPlatform(ResourceManager.floorL6, (int) (22016*MainGame.xScalingFactor), (int) (552*MainGame.yScalingFactor), 1, 1, 1, 325);
			environment.addPlatform(ResourceManager.floorL6, (int) (22048*MainGame.xScalingFactor), (int) (584*MainGame.yScalingFactor), 2, 1, 1, 326);
			environment.addPlatform(ResourceManager.floorL6, (int) (22112*MainGame.xScalingFactor), (int) (616*MainGame.yScalingFactor), 1, 1, 1, 327);
			environment.addPlatform(ResourceManager.floorL6, (int) (22144*MainGame.xScalingFactor), (int) (648*MainGame.yScalingFactor), 1, 1, 1, 328);
			environment.addPlatform(ResourceManager.floorL6, (int) (22176*MainGame.xScalingFactor), (int) (680*MainGame.yScalingFactor), 1, 1, 1, 329);
			environment.addPlatform(ResourceManager.floorL6, (int) (22208*MainGame.xScalingFactor), (int) (712*MainGame.yScalingFactor), 1, 1, 1, 330);
			environment.addPlatform(ResourceManager.floorL6, (int) (22240*MainGame.xScalingFactor), (int) (744*MainGame.yScalingFactor), 1, 1, 1, 331);
			environment.addPlatform(ResourceManager.floorL6, (int) (22272*MainGame.xScalingFactor), (int) (776*MainGame.yScalingFactor), 2, 1, 1, 332);
			environment.addPlatform(ResourceManager.floorL6, (int) (22336*MainGame.xScalingFactor), (int) (808*MainGame.yScalingFactor), 2, 1, 1, 333);
			environment.addPlatform(ResourceManager.floorL6, (int) (22400*MainGame.xScalingFactor), (int) (840*MainGame.yScalingFactor), 1, 1, 1, 334);
			environment.addPlatform(ResourceManager.floorL6, (int) (22432*MainGame.xScalingFactor), (int) (872*MainGame.yScalingFactor), 1, 1, 1, 335);
			environment.addPlatform(ResourceManager.floorL6, (int) (22464*MainGame.xScalingFactor), (int) (904*MainGame.yScalingFactor), 1, 1, 1, 336);
			environment.addPlatform(ResourceManager.floorL6, (int) (22496*MainGame.xScalingFactor), (int) (936*MainGame.yScalingFactor), 1, 1, 1, 337);
			environment.addPlatform(ResourceManager.floorL6, (int) (22528*MainGame.xScalingFactor), (int) (968*MainGame.yScalingFactor), 1, 1, 1, 338);
			environment.addPlatform(ResourceManager.floorL6, (int) (22560*MainGame.xScalingFactor), (int) (1000*MainGame.yScalingFactor), 2, 1, 1, 339);
			environment.addPlatform(ResourceManager.floorL6, (int) (22624*MainGame.xScalingFactor), (int) (1032*MainGame.yScalingFactor), 1, 1, 1, 340);
			environment.addPlatform(ResourceManager.floorL6, (int) (22656*MainGame.xScalingFactor), (int) (1064*MainGame.yScalingFactor), 1, 1, 1, 341);
			environment.addPlatform(ResourceManager.floorL6, (int) (22688*MainGame.xScalingFactor), (int) (1096*MainGame.yScalingFactor), 1, 1, 1, 342);
			environment.addPlatform(ResourceManager.floorL6, (int) (22720*MainGame.xScalingFactor), (int) (1128*MainGame.yScalingFactor), 2, 1, 1, 343);
			environment.addPlatform(ResourceManager.floorL6, (int) (22784*MainGame.xScalingFactor), (int) (1160*MainGame.yScalingFactor), 2, 1, 1, 344);
			environment.addPlatform(ResourceManager.floorL6, (int) (22848*MainGame.xScalingFactor), (int) (1192*MainGame.yScalingFactor), 1, 1, 1, 345);
			environment.addPlatform(ResourceManager.floorL6, (int) (22880*MainGame.xScalingFactor), (int) (1224*MainGame.yScalingFactor), 1, 1, 1, 346);
			environment.addPlatform(ResourceManager.floorL6, (int) (22912*MainGame.xScalingFactor), (int) (1256*MainGame.yScalingFactor), 1, 1, 1, 347);
			environment.addPlatform(ResourceManager.floorL6, (int) (22944*MainGame.xScalingFactor), (int) (1288*MainGame.yScalingFactor), 2, 1, 1, 348);
			environment.addPlatform(ResourceManager.floorL6, (int) (23008*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 2, 1, 1, 349);
			environment.addPlatform(ResourceManager.floorL6, (int) (23072*MainGame.xScalingFactor), (int) (1352*MainGame.yScalingFactor), 1, 1, 1, 350);
			environment.addPlatform(ResourceManager.floorL6, (int) (23104*MainGame.xScalingFactor), (int) (1384*MainGame.yScalingFactor), 1, 1, 1, 351);
			environment.addPlatform(ResourceManager.floorL6, (int) (23136*MainGame.xScalingFactor), (int) (1416*MainGame.yScalingFactor), 1, 1, 1, 352);
			environment.addPlatform(ResourceManager.floorL6, (int) (23168*MainGame.xScalingFactor), (int) (1448*MainGame.yScalingFactor), 2, 1, 1, 353);
			environment.addPlatform(ResourceManager.floorL6, (int) (23232*MainGame.xScalingFactor), (int) (1480*MainGame.yScalingFactor), 1, 1, 1, 354);
			environment.addPlatform(ResourceManager.floorL6, (int) (23264*MainGame.xScalingFactor), (int) (1512*MainGame.yScalingFactor), 1, 1, 1, 355);
			environment.addPlatform(ResourceManager.floorL6, (int) (23296*MainGame.xScalingFactor), (int) (1544*MainGame.yScalingFactor), 50, 1, 1, 356);
			environment.addPlatform(ResourceManager.floorL6, (int) (24896*MainGame.xScalingFactor), (int) (1512*MainGame.yScalingFactor), 1, 1, 1, 357);
			environment.addPlatform(ResourceManager.floorL6, (int) (24928*MainGame.xScalingFactor), (int) (1480*MainGame.yScalingFactor), 1, 1, 1, 358);
			environment.addPlatform(ResourceManager.floorL6, (int) (24960*MainGame.xScalingFactor), (int) (1448*MainGame.yScalingFactor), 1, 1, 1, 359);
			environment.addPlatform(ResourceManager.floorL6, (int) (24992*MainGame.xScalingFactor), (int) (1416*MainGame.yScalingFactor), 1, 1, 1, 360);
			environment.addPlatform(ResourceManager.floorL6, (int) (25024*MainGame.xScalingFactor), (int) (1384*MainGame.yScalingFactor), 2, 1, 1, 361);
			environment.addPlatform(ResourceManager.floorL6, (int) (25088*MainGame.xScalingFactor), (int) (1352*MainGame.yScalingFactor), 1, 1, 1, 362);
			environment.addPlatform(ResourceManager.floorL6, (int) (25120*MainGame.xScalingFactor), (int) (1320*MainGame.yScalingFactor), 1, 1, 1, 363);
			environment.addPlatform(ResourceManager.floorL6, (int) (25152*MainGame.xScalingFactor), (int) (1288*MainGame.yScalingFactor), 1, 1, 1, 364);
			environment.addPlatform(ResourceManager.floorL6, (int) (25184*MainGame.xScalingFactor), (int) (1256*MainGame.yScalingFactor), 2, 1, 1, 365);
			environment.addPlatform(ResourceManager.floorL6, (int) (25248*MainGame.xScalingFactor), (int) (1224*MainGame.yScalingFactor), 1, 1, 1, 366);
			environment.addPlatform(ResourceManager.floorL6, (int) (25280*MainGame.xScalingFactor), (int) (1192*MainGame.yScalingFactor), 1, 1, 1, 367);
			environment.addPlatform(ResourceManager.floorL6, (int) (25312*MainGame.xScalingFactor), (int) (1160*MainGame.yScalingFactor), 1, 1, 1, 368);
			environment.addPlatform(ResourceManager.floorL6, (int) (25344*MainGame.xScalingFactor), (int) (1128*MainGame.yScalingFactor), 1, 1, 1, 369);
			environment.addPlatform(ResourceManager.floorL6, (int) (25376*MainGame.xScalingFactor), (int) (1096*MainGame.yScalingFactor), 2, 1, 1, 370);
			environment.addPlatform(ResourceManager.floorL6, (int) (25440*MainGame.xScalingFactor), (int) (1064*MainGame.yScalingFactor), 2, 1, 1, 371);
			environment.addPlatform(ResourceManager.floorL6, (int) (25504*MainGame.xScalingFactor), (int) (1032*MainGame.yScalingFactor), 1, 1, 1, 372);
			environment.addPlatform(ResourceManager.floorL6, (int) (25536*MainGame.xScalingFactor), (int) (1000*MainGame.yScalingFactor), 1, 1, 1, 373);
			environment.addPlatform(ResourceManager.floorL6, (int) (25568*MainGame.xScalingFactor), (int) (968*MainGame.yScalingFactor), 1, 1, 1, 374);
			environment.addPlatform(ResourceManager.floorL6, (int) (25600*MainGame.xScalingFactor), (int) (936*MainGame.yScalingFactor), 2, 1, 1, 375);
			environment.addPlatform(ResourceManager.floorL6, (int) (25664*MainGame.xScalingFactor), (int) (904*MainGame.yScalingFactor), 1, 1, 1, 376);
			environment.addPlatform(ResourceManager.floorL6, (int) (25696*MainGame.xScalingFactor), (int) (872*MainGame.yScalingFactor), 1, 1, 1, 377);
			environment.addPlatform(ResourceManager.floorL6, (int) (25728*MainGame.xScalingFactor), (int) (840*MainGame.yScalingFactor), 1, 1, 1, 378);
			environment.addPlatform(ResourceManager.floorL6, (int) (25760*MainGame.xScalingFactor), (int) (808*MainGame.yScalingFactor), 2, 1, 1, 379);
			environment.addPlatform(ResourceManager.floorL6, (int) (25824*MainGame.xScalingFactor), (int) (776*MainGame.yScalingFactor), 1, 1, 1, 380);
			environment.addPlatform(ResourceManager.floorL6, (int) (25856*MainGame.xScalingFactor), (int) (744*MainGame.yScalingFactor), 2, 1, 1, 381);
			environment.addPlatform(ResourceManager.floorL6, (int) (25920*MainGame.xScalingFactor), (int) (712*MainGame.yScalingFactor), 1, 1, 1, 382);
			environment.addPlatform(ResourceManager.floorL6, (int) (25952*MainGame.xScalingFactor), (int) (680*MainGame.yScalingFactor), 2, 1, 1, 383);
			environment.addPlatform(ResourceManager.floorL6, (int) (26016*MainGame.xScalingFactor), (int) (648*MainGame.yScalingFactor), 2, 1, 1, 384);
			environment.addPlatform(ResourceManager.floorL6, (int) (26080*MainGame.xScalingFactor), (int) (616*MainGame.yScalingFactor), 1, 1, 1, 385);
			environment.addPlatform(ResourceManager.floorL6, (int) (26112*MainGame.xScalingFactor), (int) (584*MainGame.yScalingFactor), 1, 1, 1, 386);
			environment.addPlatform(ResourceManager.floorL6, (int) (26144*MainGame.xScalingFactor), (int) (552*MainGame.yScalingFactor), 1, 1, 1, 387);
			environment.addPlatform(ResourceManager.floorL6, (int) (26176*MainGame.xScalingFactor), (int) (520*MainGame.yScalingFactor), 2, 1, 1, 388);
			environment.addPlatform(ResourceManager.floorL6, (int) (26240*MainGame.xScalingFactor), (int) (488*MainGame.yScalingFactor), 1, 1, 1, 389);
			environment.addPlatform(ResourceManager.floorL6, (int) (26272*MainGame.xScalingFactor), (int) (456*MainGame.yScalingFactor), 1, 1, 1, 390);
			environment.addPlatform(ResourceManager.floorL6, (int) (26304*MainGame.xScalingFactor), (int) (424*MainGame.yScalingFactor), 1, 1, 1, 391);
			environment.addPlatform(ResourceManager.floorL6, (int) (26336*MainGame.xScalingFactor), (int) (392*MainGame.yScalingFactor), 300, 1, 1, 392);
			environment.addGoal((int) (27000*MainGame.xScalingFactor), (int) (200*MainGame.yScalingFactor));
			break;
		case BOSS4:
			environment.removeAll();
			environment.addFloor(ResourceManager.floorL6, (int) (0*MainGame.xScalingFactor), 1000, 1, 0);
			bosses.spawnSJ0();
			for(int h=0; h<20; h++){
				environment.addHealth((int) (500*MainGame.xScalingFactor), (int) (900*MainGame.yScalingFactor), h);
			}
			break;
		case LEVEL5:
			environment.removeAll();
			environment.addPlatform(ResourceManager.floorSky, (int) (0*MainGame.xScalingFactor), (int) (49968*MainGame.yScalingFactor), 70, 10, 1, 0);
			environment.addPlatform(ResourceManager.floorSky, (int) (500*MainGame.xScalingFactor), (int) (49940*MainGame.yScalingFactor), 10, 2, 1, 1);
			environment.addPlatform(ResourceManager.floorSky, (int) (500*MainGame.xScalingFactor), (int) (49940*MainGame.yScalingFactor), 10, 2, 1, 2);
			environment.addPlatform(ResourceManager.floorSky, (int) (1000*MainGame.xScalingFactor), (int) (49440*MainGame.yScalingFactor), 10, 2, 1, 3);
			environment.addPlatform(ResourceManager.floorSky, (int) (1000*MainGame.xScalingFactor),(int) ( 49440*MainGame.yScalingFactor), 10, 2, 1, 4);
			environment.addPlatform(ResourceManager.floorSky, (int) (700*MainGame.xScalingFactor), (int) (48940*MainGame.yScalingFactor), 10, 2, 1, 5);
			environment.addPlatform(ResourceManager.floorSky, (int) (700*MainGame.xScalingFactor), (int) (48940*MainGame.yScalingFactor), 10, 2, 1, 6);
			environment.addPlatform(ResourceManager.floorSky, (int) (400*MainGame.xScalingFactor), (int) (48440*MainGame.yScalingFactor), 10, 2, 1, 7);
			environment.addPlatform(ResourceManager.floorSky, (int) (400*MainGame.xScalingFactor), (int) (48440*MainGame.yScalingFactor), 10, 2, 1, 8);
			environment.addPlatform(ResourceManager.floorSky, (int) (800*MainGame.xScalingFactor), (int) (47940*MainGame.yScalingFactor), 10, 2, 1, 9);
			environment.addPlatform(ResourceManager.floorSky, (int) (800*MainGame.xScalingFactor), (int) (47940*MainGame.yScalingFactor), 10, 2, 1, 10);
			environment.addPlatform(ResourceManager.floorSky, (int) (600*MainGame.xScalingFactor), (int) (47440*MainGame.yScalingFactor), 10, 2, 1, 11);
			environment.addPlatform(ResourceManager.floorSky, (int) (600*MainGame.xScalingFactor), (int) (47440*MainGame.yScalingFactor), 10, 2, 1, 12);
			environment.addPlatform(ResourceManager.floorSky, (int) (600*MainGame.xScalingFactor), (int) (47440*MainGame.yScalingFactor), 10, 2, 1, 11);
			environment.addPlatform(ResourceManager.floorSky, (int) (600*MainGame.xScalingFactor), (int) (47440*MainGame.yScalingFactor), 10, 2, 1, 12);
			environment.addPlatform(ResourceManager.floorSky, (int) (1000*MainGame.xScalingFactor), (int) (46840*MainGame.yScalingFactor), 10, 2, 1, 13);
			environment.addPlatform(ResourceManager.floorSky, (int) (1000*MainGame.xScalingFactor), (int) (46840*MainGame.yScalingFactor), 10, 2, 1, 14);
			environment.addPlatform(ResourceManager.floorSky, (int) (700*MainGame.xScalingFactor), (int) (46240*MainGame.yScalingFactor), 10, 2, 1, 15);
			environment.addPlatform(ResourceManager.floorSky, (int) (700*MainGame.xScalingFactor), (int) (46240*MainGame.yScalingFactor), 10, 2, 1, 16);
			environment.addPlatform(ResourceManager.floorSky, (int) (1100*MainGame.xScalingFactor), (int) (45640*MainGame.yScalingFactor), 10, 2, 1, 17);
			environment.addPlatform(ResourceManager.floorSky, (int) (1100*MainGame.xScalingFactor), (int) (45640*MainGame.yScalingFactor), 10, 2, 1, 18);
			environment.addPlatform(ResourceManager.floorSky, (int) (400*MainGame.xScalingFactor), (int) (45040*MainGame.yScalingFactor), 10, 2, 1, 19);
			environment.addPlatform(ResourceManager.floorSky, (int) (400*MainGame.xScalingFactor), (int) (45040*MainGame.yScalingFactor), 10, 2, 1, 20);
			environment.addPlatform(ResourceManager.floorSky, (int) (0*MainGame.xScalingFactor), (int) (44240*MainGame.yScalingFactor), 15, 3, 1, 21);
			environment.addPlatform(ResourceManager.floorSky, (int) (MainGame.xSize-480*MainGame.xScalingFactor), (int) (44240*MainGame.yScalingFactor), 15, 3, 1, 22);
			environment.addPlatform(ResourceManager.floorSky, (int) (600*MainGame.xScalingFactor), (int) (43640*MainGame.yScalingFactor), 10, 2, 1, 23);
			environment.addPlatform(ResourceManager.floorSky, (int) (600*MainGame.xScalingFactor), (int) (43640*MainGame.yScalingFactor), 10, 2, 1, 24);
			environment.addPlatform(ResourceManager.floorSky, (int) (1000*MainGame.xScalingFactor), (int) (43040*MainGame.yScalingFactor), 10, 2, 1, 25);
			environment.addPlatform(ResourceManager.floorSky, (int) (1000*MainGame.xScalingFactor), (int) (43040*MainGame.yScalingFactor), 10, 2, 1, 26);
			environment.addPlatform(ResourceManager.floorSky, (int) (400*MainGame.xScalingFactor), (int) (42440*MainGame.yScalingFactor), 10, 2, 1, 27);
			environment.addPlatform(ResourceManager.floorSky, (int) (400*MainGame.xScalingFactor), (int) (42440*MainGame.yScalingFactor), 10, 2, 1, 28);
			
			environment.addWrath((int) (500*MainGame.xScalingFactor), (int) (49600*MainGame.yScalingFactor));
			environment.addGoal((int) (540*MainGame.xScalingFactor), (int) (1000*MainGame.yScalingFactor));
			environment.BGy= 48920;
			
			break;
		case BOSS5:
			environment.removeAll();
			bosses.spawnOmega((int) (250*MainGame.xScalingFactor), (int) (50*MainGame.yScalingFactor), 80000);
			environment.addPlatform(ResourceManager.floorSky, (int) (0*MainGame.xScalingFactor), (int) (1080*MainGame.yScalingFactor), 500, 5, 1, 0);
			break;
	}
}

}
