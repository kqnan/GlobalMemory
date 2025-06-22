package szuc.kqn;


import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class GlobalMemory {
    public static ConcurrentHashMap<Objects,Objects> map=new ConcurrentHashMap<>();
    public static CopyOnWriteArrayList<Objects> list=new CopyOnWriteArrayList<>();
}