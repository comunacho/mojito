alter table translation_kit_not_found_text_unit_ids drop foreign key FK_aw1j6y6fkkgf1tsgqw45o95am;

alter table translation_kit_not_found_text_unit_ids
	add constraint FK__TRANSLATION_KIT_NOT_FOUND_TEXT_UNIT_IDS__TRANSLATION_KIT__ID
		foreign key (translation_kit_id) references translation_kit (id);