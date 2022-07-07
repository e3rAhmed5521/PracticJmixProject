package com.company.sessionplaner.screen.speaker;

import io.jmix.ui.screen.*;
import com.company.sessionplaner.entity.Speaker;

@UiController("Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
public class SpeakerEdit extends StandardEditor<Speaker> {
}