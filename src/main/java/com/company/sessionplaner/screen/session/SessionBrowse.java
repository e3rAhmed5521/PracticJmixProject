package com.company.sessionplaner.screen.session;

import io.jmix.ui.component.Calendar;
import io.jmix.ui.component.EditorScreenFacet;
import io.jmix.ui.screen.*;
import com.company.sessionplaner.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@UiController("Session_.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
public class SessionBrowse extends StandardLookup<Session> {
    @Autowired
    private EditorScreenFacet sessionEditDialog;

    @Subscribe
    public void onInit(InitEvent event) {
        
    }


    @Subscribe("sessionsCalendar")
    public void onSessionsCalendarCalendarEventClick(Calendar.CalendarEventClickEvent<LocalDateTime> event) {
        sessionEditDialog.setEntityProvider(() -> (Session)event.getEntity());
        sessionEditDialog.show();
    }
}