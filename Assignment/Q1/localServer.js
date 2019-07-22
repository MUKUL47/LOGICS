const express = require('express')
router = express(),
    routes = require("./myRoutes"),
    router.use(require('body-parser').urlencoded({
        extended: true
    }));

router.use(express.static("views"));
router.use(express.static(__dirname + '/public'));
router.get("/", routes.default)
router.get("/getCommunity/:c", routes.getCommunity)
router.get("/:comms/member/:member", routes.getUser)
router.post("/:comms/getCommunity/:member", routes.updateStatus)
router.listen(1000)