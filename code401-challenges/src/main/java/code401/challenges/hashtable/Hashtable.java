package code401.challenges.hashtable;

public class Hashtable<T> {
    int SIZE;
    private  Node<T>[] hashList;
    public Hashtable(int size){
        this.SIZE = size;
        hashList = new Node[size];
    }

    private int hash(String key){
        int asciiSum = 0;
        for(int i = 0; i < key.length(); i ++){
            asciiSum += (int) key.charAt(i);
        }
        asciiSum = asciiSum * 599;
        int newIndex = asciiSum % SIZE;
        return newIndex;
    }


    public void add(String key, T value){
        int index = hash(key);
        System.out.println(key +" "+ index);
        if(hashList[index] == null){
            hashList[index] = new Node<>(key, value);
        }else{
            Node<T> temp = hashList[index];
            hashList[index] = new Node<>(key, value);
            hashList[index].next = temp;
        }
    }


    public T get(String key){
        int index = hash(key);
        Node<T> temp = hashList[index];
        while(temp != null){
            if(temp.getKey().equals(key))
            {
                return temp.getValue();
            }else
            {
                temp = temp.getNext();
            }
        }

        return null;
    }

    public boolean contains(String key){
        int index = hash(key);
        Node<T> temp = hashList[index];
        while(temp != null){
            if(temp.getKey().equals(key))
            {
                return true;
            }else
            {
                temp = temp.getNext();
            }
        }
        return false;
    }


}
