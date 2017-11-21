package com.box.l10n.mojito.rest.asset;

import com.box.l10n.mojito.entity.PollableTask;
import com.box.l10n.mojito.okapi.ImportTranslationsFromLocalizedAssetStep;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jaurambault
 */
public class ImportLocalizedAssetBody {

    /**
     * bcp47 tag of the locale content
     */
    String bcp47Tag;

    /**
     * content to be imported
     */
    String content;

    ImportTranslationsFromLocalizedAssetStep.StatusForSourceEqTarget sourceEqualTargetProcessing;

    FilterConfigIdOverride filterConfigIdOverride;

    PollableTask pollableTask;

    public ImportLocalizedAssetBody() {
    }

    public ImportLocalizedAssetBody(String bcp47Tag, String content) {
        this.bcp47Tag = bcp47Tag;
        this.content = content;
    }

    @JsonProperty
    public PollableTask getPollableTask() {
        return pollableTask;
    }

    /**
     * @JsonIgnore because this pollableTask is read only data generated by the
     * server side, it is not aimed to by external process via WS
     *
     * @param pollableTask
     */
    @JsonIgnore
    public void setPollableTask(PollableTask pollableTask) {
        this.pollableTask = pollableTask;
    }

    public String getBcp47Tag() {
        return bcp47Tag;
    }

    public void setBcp47Tag(String bcp47Tag) {
        this.bcp47Tag = bcp47Tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ImportTranslationsFromLocalizedAssetStep.StatusForSourceEqTarget getSourceEqualTargetProcessing() {
        return sourceEqualTargetProcessing;
    }

    public void setSourceEqualTargetProcessing(ImportTranslationsFromLocalizedAssetStep.StatusForSourceEqTarget sourceEqualTargetProcessing) {
        this.sourceEqualTargetProcessing = sourceEqualTargetProcessing;
    }

    public FilterConfigIdOverride getFilterConfigIdOverride() {
        return filterConfigIdOverride;
    }

    public void setFilterConfigIdOverride(FilterConfigIdOverride filterConfigIdOverride) {
        this.filterConfigIdOverride = filterConfigIdOverride;
    }

}