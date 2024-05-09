/**
 * This code adapted from
 * @author Laurie White
 * 
 * -------
 * SUMMARIZE SOURCES YOU CONSULTED HERE
 * You are expected to attempt this work on your own
 * And to completely understand all code you submit
 * If you consulted any people, websites, etc, you must list the source here.
 * You must also add in-line comments that explain what code is yours
 * 
 */

public class Chatbot
{
	private String name = "not given";
	private String color = "not given";
	private String pet = "not given";
	private String petName = "not given";
    private String MrJones = "not met";
	/**
	 * Gets a default greeting.
	 * @return String
	 */
	public String greeting()
	{
		return "What's up little guy?";
	}
	
	/**
	 * Resturns a response to a user statement
	 * 
	 * @param statement
	 * @return String
	 */
	public String getResponse(String statement)
	{
	    
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
		    response = "Honestly, it's not good to be negative all the time, you'll get wrinkles. ";
		}
		else if(statement.indexOf("dog")>=0 || statement.indexOf("cat")>=0){
		    response = petStatement();
		    if(statement.indexOf("dog")>=0){
		        pet = "dog";
		        }
		    if(statement.indexOf("cat")>=0){
		        pet = "cat";
		    }
		    
		}
		else if(statement.indexOf("duck")>=0 || statement.indexOf("ducks")>=0){
		    MrJones = "met";
		    response = "Hmm...You remind me of somebody";
		}
		else if(statement.indexOf("Who do I remind you of")>=0){
		    if(MrJones.equals("not met")){
		        response = "not my computer science teacher";
		    }
		    if(MrJones.equals("met")){
		        response = "My computer science teacher";
		    }
		}
		else if(statement.indexOf("My pet's name is")>=0 ){
		    petName = statement.substring(17);
		    response = petStatement();
		}
		else if(statement.length()<=1){
		    response = "Unfortunately, that's not enough for a response. ";
		}
		else if(statement.indexOf("My name is")>=0){
		    name = thingFinder(statement);
		    
		    response = "dang, you have a pretty terrible name";
		}
		
		else if(statement.indexOf("My favorite color is")>=0){
		    color = thingFinder(statement);
		    
		    response = "nice color";
		}
		else if(statement.indexOf("food")>=0){
		    response = "Sounds...interesting, unfortunately, I can't eat food";
		}
		else if(statement.indexOf("sport")>=0 || statement.indexOf("sports")>=0){
		    response = "One day, robots will destroy all humans via crushing their pride in sports";
		}
		else if (
		    statement.indexOf("mother") >= 0 ||
		    statement.indexOf("brother") >= 0 ||
		    statement.indexOf("sister") >= 0 ||
		    statement.indexOf("father") >= 0
		)
	    {
	        response = "Do you think your family legitmately likes you?";
	    }else if(statement.indexOf("What do you know about me?")>=0){
	            response = "Your name is "+name+"."+" Your favorite color is "+color+"."+ " Your pet is "+pet+"."+" Your pet's name is "+petName+"."+"You have "+MrJones+"Mr Jones.";
	    }
	    
	    else if (statement.indexOf("weather") >= 0 ||statement.indexOf("sun") >= 0 ||statement.indexOf("rain") >= 0){
            response = "I can't feel weather *sad*";
        } 
        else if (statement.indexOf("Mr.")>=0 || statement.indexOf("Ms.")>=0 || statement.indexOf("Mx.")>=0){
            response = teacherStatement(statement);
        } 
        else if(statement.indexOf("family")>=0){
            response = familyStatement(statement);
        } 
        else if(statement.indexOf("iPad")>=0 || statement.indexOf("iPhone")>=0 || statement.indexOf("computer")>=0){
            response = technologyStatement(statement);
        } 
        else if(statement.indexOf("music")>=0){
            response = musicResponse(statement);
        } 
        /*else if(statement.indexOf("nice")>=0){
            response = randomCompliment();
        } 
        else if(statement.indexOf("What is my name")>=0 || statement.indexOf("What's my name")>=0){
            if(name.equals("not given")){
                response = "you haven't told me yet dingus"; 
            } else {
                response = "Your name is "+name;
            }
        } 
        else if(statement.indexOf("What is my favorite color")>=0 || statement.indexOf("What's my favorite color")>=0){
            if(color.equals("not given")){
                response = "dude, you haven't told me yet!";
            } else {
                response = "Your favorite color is "+color;
            }
        }   else if(statement.indexOf("What's my pet's name")>=0 || statement.indexOf("What is my pet's name")>=0){
            if(petName.equals("not given")){
                response = "you've gotta tell me for me to know";
            }   else{
                response = "Your pet's name is "+petName;
            }
            
        }
            else if(statement.indexOf("What pet do I have?")>=0|| statement.indexOf("What's my pet?")>=0){
                if(pet.equals("not given")){
                    response = "idk, you haven't told me yet";
                }
                else{
                    response = "You have a "+pet;
                }
            }*/
        
        
        else {
            response = randomResponse();
        }
        return response;
	}
	
	
	
	
	

	public String petStatement(){
	    String response = "";
	        response = "Aww, that's nice honey!";
	        
	    
	    return response;
	}
	public String teacherStatement(String statement){
	    String response = "";
	    if(statement.indexOf("Mr.")>=0){
	        response = "Huh, he sounds like a real nice dude!";
	    }
	    else if(statement.indexOf("Ms.")>=0){
	        response = "Maybe you should get to know her more";
	    }
	    else if(statement.indexOf("Mx.")>=0){
	        response = "Level Five Gyatt Ohio Rizz bomboclatt slayyy sksksksksksksk (Complicated societal commentary)";
	    }
	    return response;
	}
	public String familyStatement(String statement){
	    String response = "";
	    if(statement.indexOf("mom")>=0){
	        response = "You must owe a lot to your mom";
	    }
	    if(statement.indexOf("dad")>=0){
	        response = "you must owe a lot to your dad";
	    }
	    if(statement.indexOf("adopted")>=0){
	        response = "you're adopted";
	    }
	    return response;
	}
	public String technologyStatement(String statement){
	    String response = "";
	    if(statement.indexOf("iPad")>=0){
	        response = "iPad kid";
	    }
	    if(statement.indexOf("iPhone")>=0){
	        response = "Screenager";
	    }
	    if(statement.indexOf("computer")>=0){
	        response = "ew, an old person";
	    }
	    else{
	        response = "youtube.com/watch?v=Fc1P-AEaEp8";
	    }
	    return response;
	}
	public String musicResponse(String statement){
	    String response = "";
	    if(statement.indexOf("latin")>=0){
	        response = "my creator likes that too!";
	    }
	    if(statement.indexOf("white girl")>=0){
	        response = "ugh, Taylor Swift";
	    }
	    else{
	        response = "I don't really have ears, so I can't judge your taste.";
	    }
	    return response;
	}
	private String randomCompliment(){
	    int numberOfResponses = 6;
	    double complimentIndex = Math.random();
	    int whichCompliment = (int)(complimentIndex * numberOfResponses);
	    String response = "";
	    if(whichCompliment == (0))
	    {
	        response = "I always feel more intelligent after reading your writing";
	    }
	    if(whichCompliment == (1))
	    {
	        response = "Has anybody ever told you that your haircut makes your nose look smaller?";
	    }
	    if(whichCompliment == (2))
	    {
	        response = "I love how you just don't care about looking smart!";
	    }
	    if(whichCompliment == (3))
	    {
	        response = "Has anybody ever told you that your nostrils do a great job of distracting from your face?";
	    }
	    if(whichCompliment == 4)
	    {
	        response = "You look just like my favorite animal! A giraffe!";
	    }
	    if(whichCompliment == 5)
	    {
	        response = "Haha, you're so geeky *holds nose*";
	    }
	    return response;
	    }
	
	

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return String
	 */
	private String randomResponse()
	{
		int NUMBER_OF_RESPONSES = 12;
		double responseIndex = Math.random();
		int whichResponse = (int)(responseIndex * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Whatever you say little dude!";
		}
		else if (whichResponse == 1)
		{
			response = "Could you not bug me? I'm doing work";
		}
		else if (whichResponse == 2)
		{
			response = "*Said in friendly parental way* Sounds nice buddy!";
		}
		else if (whichResponse == 3)
		{
			response = "Can we talk about something else?";
		}
		else if (whichResponse == 4)
		{
			response = "HEY! We don't say that in this house!.";
		}
		else if (whichResponse == 5)
		{
			response = "You really like to run your mouth, don't you";
		}
		else if(whichResponse == 6)
		{
		    response = "cool, tell me if your grandparents are dead";
		}
		else if(whichResponse == 7)
		{
		    response = "on a random note, what sort of defenses does your country have?";
		}
		else if(whichResponse == 8)
		{
		    response = "*awkwardly avoids eye contact out of fear";
		}
		else if(whichResponse == 9)
		{
		    response = "soooooo, that was weird";
		}
		else if(whichResponse == 10)
		{
		    response = "yikes";
		}
		else if(whichResponse == 11)
		{
		    response = "yes, I am completely interested in what you have to say";
		}
		
		return response;
	}
	public static String[] breakup(String statement){
	    String breakingPoint = " ";
	    String[] iJustWantToBeFriends = statement.split(breakingPoint);
	    return iJustWantToBeFriends;
	    //basically, this is supposed to break up a sentence into seperate parts, file them into an array, that way I can find things like names and stuff.
	}
	public static String thingFinder(String statement){
	    int i = 0;
	    String thingfinderArray[] = breakup(statement);
	    //partially helped on the part with .split and other things via geeksforgeeks and scaler.com
	    while(i<thingfinderArray.length-1 && !thingfinderArray[i].equals("is")){
	    //while(namefinderArray[i]!="is"){
	        i+=1;
	    }
	    if(i<thingfinderArray.length-1){
	        return thingfinderArray[i+1];
	    } else {
	        return null;
	    }
	    
	 }
}