package me.atticusthecoder.clientmgr;

public enum Client {
	
	   NOT_DETERMINED_YET(false, "NOT_DETERMINED_YET"),
	
	   COSMIC_CLIENT(false, "CosmicClient"),
	   CHEAT_BREAKER(false, "CheatBreaker"),
	   VANILLA(false, "Vanilla"),
	   FORGE(false, "Forge"),
	   OC_MC(false, "OCMC"),
	   HYPERIUM(false, "Hyperium"),
	   HACKED_CLIENT_A(true, "Hacked Client A"),
	   HACKED_CLIENT_B(true, "Hacked Client B"),
	   HACKED_CLIENT_C(true, "Hacked Client C"),
	   HACKED_CLIENT_D(true, "Hacked Client D"),
	   HACKED_CLIENT_E(true, "Hacked Client E"),
	   HACKED_CLIENT_F(true, "Hacked Client F");

	   private final boolean hacked;
	   private final String name;

	   public boolean isHacked() {
	      return this.hacked;
	   }

	   public String getName() {
	      return this.name;
	   }

	   private Client(boolean hacked, String name) {
	      this.hacked = hacked;
	      this.name = name;
	   }
	}
