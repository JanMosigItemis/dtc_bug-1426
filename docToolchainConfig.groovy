inputPath = 'src';
outputPath = './build'

inputFiles = [
    //[file: 'pass.adoc', formats: ['html']],
    [file: 'fail.adoc', formats: ['html']],
]

imageDirs = [
    'images/.',
]

confluence.with {
    input = [
            //[file: "build/html5/pass.html", ancestorId: "1176870525"],
            [file: "build/html5/fail.html", ancestorId: "1176870525"],
    ]
    api = "${System.getenv()['DTC_CONFLUENCE_URL']}"
    spaceKey = 'VTFE'
    subpagesForSections = 1
    pagePrefix = ''
    pageSuffix = ''
    credentials = "${System.getenv()['DTC_CONFLUENCE_USER']}:${System.getenv()['DTC_CONFLUENCE_PASSWORD']}".bytes.encodeBase64().toString()
    jSessionId = ''
}
