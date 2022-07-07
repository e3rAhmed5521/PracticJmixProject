package com.company.sessionplaner.screen.session;

import io.jmix.ui.screen.*;
import com.company.sessionplaner.entity.Session;

@UiController("Session_.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
public class SessionEdit extends StandardEditor<Session> {
}