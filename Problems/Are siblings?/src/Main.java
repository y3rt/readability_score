
    public boolean areSiblings(File f1, File f2) {
        String p1 = f1.getParent();
        String p2 = f2.getParent();
        return p1.equals(p2);
    }

