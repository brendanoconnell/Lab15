// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5, picture6, picture7, picture8;
	boolean isLastPage;

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"Me.jpg");
		picture2 = getImage(getDocumentBase(),"NewJersey.jpg");
		picture3 = getImage(getDocumentBase(),"VTHS.jpg");
		picture4 = getImage(getDocumentBase(),"Band.jpg");
		picture5 = getImage(getDocumentBase(),"Robotics.jpg");
		picture6 = getImage(getDocumentBase(),"Robotics2.jpg");
		picture7 = getImage(getDocumentBase(), "Pokemon.png");
		picture8 = getImage(getDocumentBase(),"Zed.jpg");
		
		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		
		
		switch (numClicks)
		{

			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
			case 4 : page5(g); break;
			case 5 : page6(g); break;
			case 6 : page7(g); break;
			case 7 : numClicks = -1; break;
		}
		}
	

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	
	
	public void fillerpage(Graphics g)
	{
		
	}
	
	public void page1(Graphics g)
	{
		// Title Page
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"TITLE PAGE",218,100);
		Expo.setColor(g,Expo.red);
		Expo.fillStar(g,510,370,175,8);
		Expo.setColor(g,Expo.green);
		Expo.drawThickStar(g,510,370,225,8,25);
		Expo.setColor(g,Expo.blue);
		Expo.drawThickStar(g,510,370,275,8,25);
		g.drawImage(picture1,425,285,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is Brendan O'Connell.",30,300);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		//Where I was born
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 2",200,100);
		Expo.setColor(g,Expo.yellow);
		Expo.fillRectangle(g,100,250,900,500);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,200,300,this);
		g.drawImage(picture4,500,280,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in New Jersey on January 14, 2000.",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page3(Graphics g)
	{
		//School
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 3",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture5,150,225,this);
		g.drawImage(picture2,500,193,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I am currently a sophmore at Vernon Township High School",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	
	public void page4(Graphics g)
	{
		//Band/Music
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 4",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g, "I am on the VTHS drumline", 250, 300);
	}
	
	public void page5(Graphics g)
	{
		//Robotics
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 5",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g, "I help program for the high school robotics team", 450, 350);
	}

	public void page6(Graphics g)
	{
		//Video Games
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 6",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g, "Some of my favorite video games include Pokemon and League of Legends.", 350, 500);
	}
	
	public void page7(Graphics g)
	{
		//End
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 7",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		isLastPage = true;
		Expo.drawString(g,"Thank you for ",750,550);
	}





}

