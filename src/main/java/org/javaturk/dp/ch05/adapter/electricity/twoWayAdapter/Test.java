package org.javaturk.dp.ch05.adapter.electricity.twoWayAdapter;

import org.javaturk.dp.ch05.adapter.electricity.domain.tr.Appliance;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishHomeAppliance;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishPowerProvider;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishPowerSource;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USHomeApplicance;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerProvider;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerSource;

public class Test {

	public static void main(String[] args) {
		// In US with Turkish home appliance
		USPowerSource usPowerSource = new USPowerProvider();
		TwoWayUSTurkishPowerAdapter twoWayUSTurkishPowerAdapter1 = new TwoWayUSTurkishPowerAdapter(usPowerSource);
		
		System.out.println();
		
		Appliance turkishMixer = new TurkishHomeAppliance("Mixer");
		turkishMixer.setPowerSource(twoWayUSTurkishPowerAdapter1);
		turkishMixer.start();
		turkishMixer.stop();
		
		System.out.println();
		
		// In Turkey with US home appliance
		TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();
		TwoWayUSTurkishPowerAdapter twoWayUSTurkishPowerAdapter2 = new TwoWayUSTurkishPowerAdapter(turkishPowerSource);
		
		System.out.println();
		
		USHomeApplicance usBroom = new USHomeApplicance("Broom");
		usBroom.setPowerSource(twoWayUSTurkishPowerAdapter2);
		usBroom.start();
		usBroom.stop();
	}
}
