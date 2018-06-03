package miningcalc;

public class Setup {
	//main ore attributes
	private String oreName = "";
	private String advancedOreName = "";
	private String superiorOreName = "";
	private double volume = 0.0;
	private boolean requiresDCM = false;
	
	//main module attributes
	private String modName = "";
	private double modRange = 0.0;
	private int techLevel = 0;
	private double modCPU = 0.0;
	private double modPower = 0.0;
	private boolean requiresMiningV = false;
	private double yield = 0.0;

	//advanced module attributes
	private boolean usesT1Crystal = false;
	private boolean usesT2Crystal = false;
	
	
	public void Veldspar() {
		oreName = "Veldspar";
		advancedOreName="Concentrated "+ oreName;
		superiorOreName="Dense" + oreName;
		volume = 0.1;
		requiresDCM = false;
	}
	public void Scordite() {
		oreName = "Scordite";
		advancedOreName="Condensed "+ oreName;
		superiorOreName="Massive "+ oreName;
		volume = 0.15;
		requiresDCM = false;
	}
	public void Pyroxeres() {
		oreName = "Pyroxeres";
		advancedOreName="Solid "+ oreName;
		superiorOreName="Vicious "+ oreName;
		volume = 0.3;
		requiresDCM = false;
	}
	public void Plagioclase() {
		oreName = "Plagioclase";
		advancedOreName="Azure "+ oreName;
		superiorOreName="Rich "+ oreName;
		volume = 0.3;
		requiresDCM = false;
	}
	public void Kernite() {
		oreName = "Kernite";
		advancedOreName="Luminous "+ oreName;
		superiorOreName="Fiery "+ oreName;
		volume = 1.2;
		requiresDCM = false;
	}
	public void Omber() {
		oreName = "Omber";
		advancedOreName="Silvery "+ oreName;
		superiorOreName="Golden "+ oreName;
		volume = 0.6;
		requiresDCM = false;
	}
	public void Jaspet() {
		oreName = "Jaspet";
		advancedOreName="Pure "+ oreName;
		superiorOreName="Pristine "+ oreName;
		volume = 2;
		requiresDCM = false;
	}
	public void Hemorphite() {
		oreName = "Hemorphite";
		advancedOreName="Vivid "+ oreName;
		superiorOreName="Radiant "+ oreName;
		volume = 3;
		requiresDCM = false;
	}
	public void Hedbergite() {
		oreName = "Hedbergite";
		advancedOreName="Vitric "+ oreName;
		superiorOreName="Glazed "+ oreName;
		volume = 3;
		requiresDCM = false;
	}
	public void Spodumain() {
		oreName = "Spodumain";
		advancedOreName="Bright "+ oreName;
		superiorOreName="Gleaming "+ oreName;
		volume = 16;
		requiresDCM = false;
	}
	public void DarkOchre() {
		oreName = "Dark Ochre";
		advancedOreName="Onyx Ochre";
		superiorOreName="Obsidian Ochre";
		volume = 8;
		requiresDCM = false;
	}
	public void Crokite() {
		oreName = "Crokite";
		advancedOreName="Sharp "+ oreName;
		superiorOreName="Crystalline "+ oreName;
		volume = 16;
		requiresDCM = false;
	}
	public void Gneiss() {
		oreName = "Gneiss";
		advancedOreName="Iridescent "+ oreName;
		superiorOreName="Prismatic "+ oreName;
		volume = 5;
		requiresDCM = false;
	}
	public void Arkonor() {
		oreName = "Arkonor";
		advancedOreName="Crimson "+ oreName;
		superiorOreName="Prime "+ oreName;
		volume = 16;
		requiresDCM = false;
	}
	public void Bistot() {
		oreName = "Bistot";
		advancedOreName="Triclinc "+ oreName;
		superiorOreName="Monoclinic "+ oreName;
		volume = 16;
		requiresDCM = false;
	}
	public void Mercoxit() {
		oreName = "Mercoxit";
		advancedOreName="Magma "+ oreName;
		superiorOreName="Vitreous "+ oreName;
		volume = 40;
		requiresDCM = true;
	}
	public void miner1() {
		modName = "Miner I";
		modRange = 10.0;
		techLevel = 1;
		modCPU = 60;
		modPower = 2;
		requiresMiningV = false;
		yield = 0.0;
	}
	public void epsLaser() {
		modName = "EP-S Guasian Scoped Mining Laser";
		modRange = 16.0;
		techLevel = 1;
		modCPU = 65;
		modPower = 3;
		requiresMiningV = false;
		yield = 0.0;
	}
	public void particleBore() {
		modName = "Particle Bore Compact Mining Laser";
		modRange = 11.0;
		techLevel = 1;
		modCPU = 55;
		modPower = 2;
		requiresMiningV = false;
		yield = 0.0;
	}
	public void miner2() {
		modName = "Miner II";
		modRange = 12.0;
		techLevel = 2;
		modCPU = 80;
		modPower = 4;
		requiresMiningV = true;
		yield = 0.0;
	}
	public void deepCore1() {
		modName = "Deep Core Mining Laser I";
		modRange = 5.0;
		techLevel = 1;
		modCPU = 150;
		modPower = 2;
		requiresMiningV = true;
		yield = 0.0;
	}
	public void deepCore2() {
		modName = "Modulated Deep Core Miner II";
		modRange = 1.0;
		techLevel = 2;
		modCPU = 80;
		modPower = 3;
		requiresMiningV = true;
		yield = 0.0;
	}
	public void iceMiner1 () {
		modName = "";
		modRange = 0;
		techLevel = 0;
		modCPU = 0;
		modPower = 0;
		requiresMiningV = false;
		yield = 0.0;
	}
	public void iceMiner2() {
		modName = "";
		modRange = 0;
		techLevel = 0;
		modCPU = 0;
		modPower = 0;
		requiresMiningV = false;
		yield = 0.0;
	}
	public void stripMiner1() {
		modName = "";
		modRange = 0;
		techLevel = 0;
		modCPU = 0;
		modPower = 0;
		requiresMiningV = false;
		yield = 0.0;
	}
	public void stripMiner2() {
		modName = "";
		modRange = 0;
		techLevel = 0;
		modCPU = 0;
		modPower = 0;
		requiresMiningV = false;
		yield = 0.0;
	}
	public void deepStripMiner2() {
		modName = "";
		modRange = 0;
		techLevel = 0;
		modCPU = 0;
		modPower = 0;
		requiresMiningV = false;
		yield = 0.0;
	}
}
