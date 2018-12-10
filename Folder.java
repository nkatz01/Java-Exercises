import java.util.ArrayList;
import java.util.List;

/**
 * A Folder is a file system entry that can store an unbounded number of
 * entries.
 *
 * @author Roman Kontchakov
 * @author Carsten Fuhs
 * @author TODO
 */
public class Folder extends AbstractEntry {
    /** List of entries in this Folder, must not be null or contain null. */ 
    private final List<Entry> entries = new ArrayList<>();

    /**
     * Constructs a new entry for a file with parent as parent folder and
     * name as name.
     *
     * @param parent the parent folder of this entry; must not be null
     * @param name the name of this entry; must not be null
     */
    public Folder(Folder parent, String name) {
        super(parent, name);
    }

    /**
     * Constructor for the root folder that has no name and no parent.
     *
     * @param fileSystem the file system for the root folder; must not be null 
     */
    Folder(FileSystem fileSystem) {
        super(fileSystem, "");
    }

    /**
     * Adds an entry to this folder.
     *
     * @param ne to be added to this folder; must not be null, must have
     *  a folder equal to this folder as its parent folder, no entry of
     *  this folder may have the same name as ne
     *
     * @throws IllegalArgumentException if ne is null, if ne does not have
     *  a folder equal to this folder as its parent folder, or if some entry
     *  of this folder has the same name as ne
     */
    public void addEntry(Entry ne) {
        // TODO
    }

    /**
     * Returns whether this folder has entry as an entry.
     *
     * @param entry to be checked for being an entry of this folder
     * @return whether this folder has entry as an entry
     */
    public boolean hasEntry(Entry entry) {
        return entries.contains(entry);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        // relies on entries != null
        return super.hashCode() + prime*entries.hashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Folder))
            return false;
        Folder other = (Folder) obj;
        return entries.equals(other.entries); // relies on entries != null
    }
}
