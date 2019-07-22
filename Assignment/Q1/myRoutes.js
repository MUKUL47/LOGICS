let mockData = require("./mockData.json"),
    fs = require('fs');

module.exports.default = (req, res) => {
    res.render("home.ejs", {
        mockData: mockData
    });
};

module.exports.getCommunity = (req, res) => {
    let community = req.params.c;
    res.render("community.ejs", {
        name: mockData.communities[community],
        comm: community
    })
}

module.exports.getUser = (req, res) => {
    let community = req.params.comms,
        m = req.params.member;
    res.render("getUser.ejs", {
        details: mockData.communities[community].members[m],
        community: mockData.communities[community].name,
        c: community
    })
}

module.exports.updateStatus = (req, res) => {
    let community = req.params.comms,
        m = req.params.member,
        oldMock = mockData;
    console.log(oldMock)
    oldMock.communities[community].members[m].status = req.body.status;
    fs.writeFile("mockData.json", JSON.stringify(oldMock), (err) => {
        res.render("community.ejs", {
            name: mockData.communities[community],
            comm: community
        })
    })


}