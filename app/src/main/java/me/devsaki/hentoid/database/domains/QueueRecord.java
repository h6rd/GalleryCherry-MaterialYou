package me.devsaki.hentoid.database.domains;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class QueueRecord {

    @Id
    public long id;
    private ToOne<Content> content;
    private int rank;
    private boolean frozen = false;

    public QueueRecord() { // Required by ObjectBox when an alternate constructor exists
    }

    public QueueRecord(long id, int order) {
        content.setTargetId(id);
        rank = order;
    }

    public ToOne<Content> getContent() {
        return content;
    }

    public void setContent(ToOne<Content> content) {
        this.content = content;
    }

    public long getContentId() {
        return content.getTargetId();
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }
}
