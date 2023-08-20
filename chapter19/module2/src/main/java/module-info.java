module chapter19.module2.main {
    exports module2package1;
    provides module2package1.Service2InModule2 with module2package1.Service2InModule2;
}