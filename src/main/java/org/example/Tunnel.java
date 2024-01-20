package org.example;

public class Tunnel {
    class Inside {
        float length;
        Object inTunnel;
        Inside(float length){
            this.length = length;
        }
    }
    public Tunnel(float length){
        inside = new Inside(length);
    }
    Tunnel.Inside inside;
    public Entrance entrance1 = new Entrance(){
        @Override
        public void Enter(Object obj) throws TunnelException {
            if (inside.inTunnel != null && inside.inTunnel.equals(obj)){
                throw new TunnelException(obj.toString() + " уже внутри");
            }
            else{
                inside.inTunnel = obj;
                System.out.println(obj.toString() + " вошёл через первый проход");
            }
        }
        @Override
        public void Exit(Object obj) throws TunnelException {
            if (inside.inTunnel != null){
                inside.inTunnel = null;
                System.out.println(obj.toString() + " вышел через первый проход");
            }
            else{
                throw new TunnelException(obj.toString() + " не в туннеле");
            }

        }
        @Override
        public String toString() {
            return "Проход 1";
        }
    };
    public Entrance entrance2 = new Entrance(){
        @Override
        public void Enter(Object obj) throws TunnelException {
            if (inside.inTunnel != null && inside.inTunnel.equals(obj)){
                throw new TunnelException(obj.toString() + " уже внутри");
            }
            else{
                inside.inTunnel = obj;
                System.out.println(obj.toString() + " вошёл через второй проход");
            }
        }
        @Override
        public void Exit(Object obj) throws TunnelException {
            if (inside.inTunnel != null){
                inside.inTunnel = null;
                System.out.println(obj.toString() + " вышел через второй проход");
            }
            else{
                throw new TunnelException(obj.toString() + " не в туннеле");
            }

        }
        @Override
        public String toString() {
            return "Проход 2";
        }
    };
    public long getIronMoleculesAmount(){
        class MoleculeCounter{
            double density;
            double extra;
            public long count(){
                return Math.round(Math.random() * density + extra);
            }
            public MoleculeCounter(long density, long extra){
                this.density = density;
                this.extra = extra;
            }
        }
        MoleculeCounter counter = new MoleculeCounter(30000,1456);
        return counter.count();
    }
    public Object getObjectInTunnel(){
        return inside.inTunnel;
    }
    public float getTunnelLength(){
        return inside.length;
    }
    public static class TunnelCalculator{
        public static Tunnel getLongerTunnel(Tunnel t1, Tunnel t2){
            if (t1.getTunnelLength() >= t2.getTunnelLength()){
                return t1;
            }
            else{
                return t2;
            }
        }
    }
    @Override
    public String toString() {
        return "Туннель длиной " + getTunnelLength();
    }
}
