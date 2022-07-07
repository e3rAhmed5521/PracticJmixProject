package com.company.sessionplaner.screen.speaker;

import io.jmix.ui.screen.*;
import com.company.sessionplaner.entity.Speaker;

@UiController("Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
public class SpeakerBrowse extends StandardLookup<Speaker> {
}