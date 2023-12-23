package org.javaturk.dp.ch05.adapter.electricity.problem2;

import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishPowerProvider;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishPowerSource;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerProvider;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerSource;

public class Test {

	public static void main(String[] args) {
		TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();

		// Can't have a reference of type Appliance anymore
		TurkishHomeApplianceCompatibleWithUSPowerSource turkishMixer = new TurkishHomeApplianceCompatibleWithUSPowerSource("Mixer");
		turkishMixer.setPowerSource(turkishPowerSource);
		turkishMixer.start();
		turkishMixer.stop();

		System.out.println();
		
		USPowerSource usPowerSource = new USPowerProvider();

		turkishMixer.setUSPowerSource(usPowerSource);
		turkishMixer.start();
		turkishMixer.stop();
	}
}
