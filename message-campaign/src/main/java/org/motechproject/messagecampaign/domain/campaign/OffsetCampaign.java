package org.motechproject.messagecampaign.domain.campaign;

import org.joda.time.Period;
import org.motechproject.messagecampaign.domain.message.CampaignMessage;
import org.motechproject.messagecampaign.domain.message.CampaignMessageRecord;

import java.util.List;

public class OffsetCampaign extends Campaign {

    public OffsetCampaign() {

    }

    public OffsetCampaign(String name, List<CampaignMessage> messages) {
        this(name, messages, null);
    }

    public OffsetCampaign(String name, List<CampaignMessage> messages, Period maxDuration) {
        super(name, messages, maxDuration);
    }

    @Override
    public CampaignMessage getCampaignMessage(CampaignMessageRecord messageRecord) {
        return new CampaignMessage(messageRecord);
    }

    public Period getTimeOffset(CampaignMessage cm) {
        throw new RuntimeException("TODO: Not implemented");
    }
}
