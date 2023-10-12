import java.util.LinkedList;

public class HashTable {
    private class Entry{
        private int key;
        private String value;

        private Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
        var index = Hash(key);

        //Check if the undex has been used and creates a new linked list if not
        if(entries[index] == null)
            entries[index] = new LinkedList<>();
        
        //Checks the linked list for duplicate keys. If so replace value at the key
        for(var entry : entries[index]){
            if(entry.key == key){
                entry.value = value;
                return;
            }
        }
        //Add entry to the end of the linked list if any of the above arent true
        entries[index].addLast(new Entry(key, value));        
    }

    public String get(int key){
        var index = Hash(key);

        if(entries[index] == null){
            return "Key does not exist";
        }

        for(var entry : entries[index]){
            if(entry.key == key)
            return entry.value;
            
        }
        
        return "Key not found";
    }

    public void remove(int key){
        int index = Hash(key);
        var bucket = entries[index];
        //Exit loop if index is null to prevent a crash
        if(entries[index] == null)
        return;

        //Calulate the index of the entry we want to remove 
        for(var entry: entries[index]){
            if(entry.key == key)
            bucket.remove(entry);
        }
        


    }

    private int Hash(int key){
        return key % entries.length;
    }
}
