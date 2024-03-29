package strategy.context;

import strategy.iface.ISocialMediaStrategy;
import strategy.impl.FacebookStrategy;
import strategy.impl.TwitterStrategy;

public class SocialMediaContext {
	ISocialMediaStrategy smStrategy;
	 
	  public void setSocialmediaStrategy(ISocialMediaStrategy
			  smStrategy) 
	  {
	    this.smStrategy = smStrategy;
	  }
	 
	  public void connect(String name) 
	  {
	    smStrategy.connectTo(name);
	  }
}
