package info.TheMFN.PotionPermisions;

public enum Perms {
	
	SWIFT1("pp.swift1"),//1
	SWIFT2("pp.swift2"), //2
	STRENGTH1("pp.strength1"), //3
	STRENGTH2("pp.strength2"), //4
	JUMP1("pp.jump1"),//5
	JUMP2("pp.jump2"),//6
	SLOW1("pp.slowness1"),//7
	SLOW2("pp.slowness2"), //8
	HASTE1("pp.haste1"), //9
	HASTE2("pp.haste2"), //10
	WEAK1("pp.weak1"),//11
	WEAK2("pp.weak2"),//12
	POISON1("pp.poison1"), //13
	POISON2("pp.poison2"), //14
	REGEN1("pp.regeneration1"), //24
	REGEN2("pp.regeneration2"), //25
	SATURATE1("pp.foodregeneration1"), //26
	SATURATE2("pp.foodregeneration2"), //27
	//
	NVIS("pp.nightvision"), //15
	FRES("pp.fireresistance"), //16
	INVIS("pp.invisibility"),//17
	BLIND("pp.blindness"),//18
	CONFUSE("pp.confusion"),//19
	HUNGERINCREASE("pp.increasehunger"), //20
	SLOWDIG("pp.slowdigging"),//21
	WATERB("pp.waterbreathing"),//22
	WITHER("pp.wither"), //23
	//
	ASS("pp.aspower"), //Assassin powerup
	DEBUG("pp.debug"), //debug
	//
	oneH("pp.2extrahearts"),//28
	twoH("pp.4extrahearts"),//29
	threeH("pp.6extrahearts"),//30
	fourH("pp.8extrahearts"),//31
	fiveH("pp.10extrahearts"),//32
	sixH("pp.12extrahearts"),//33
	sevenH("pp.14extrahearts"),//34
	eightH("pp.16extrahearts"),//35
	nineH("pp.18extrahearts"),//36
	tenH("pp.20extrahearts");//37
	
	
	private String perm;
	
	Perms(String perm){
		this.setPerm(perm);
		
	}

	public String getPerm() {
		return perm;
	}

	public void setPerm(String perm) {
		this.perm = perm;
	}
	
}
