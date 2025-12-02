package net.mokus.tmmore;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.mokus.tmmore.datagen.ModBlockTagProvider;
import net.mokus.tmmore.datagen.ModItemTagProvider;
import net.mokus.tmmore.datagen.ModLanguageProvider;
import net.mokus.tmmore.datagen.ModModelProvider;

public class TMMoreDataGenerator implements DataGeneratorEntrypoint {



	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLanguageProvider::new);
	}

}
