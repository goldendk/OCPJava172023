module chapter19.module1.main {
    exports module1package1;
    requires transitive chapter19.module2.main;

    provides module1package1.SomeServiceInModule1 with module1package1.SomeServiceInModule1;

}