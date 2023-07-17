package com.gt.gt5_cw3_pixabay

data class PixaModel(
val hits: ArrayList<ImageModel>
)

data class ImageModel (
val largeImageURL:String
)

//{
//    "total": 807,
//    "totalHits": 500,
//    "hits": [
//        {
//            "id": 1236875,
//            "pageURL": "https://pixabay.com/photos/animal-panda-mammal-species-fauna-1236875/",
//            "type": "photo",
//            "tags": "animal, panda, mammal",
//            "previewURL": "https://cdn.pixabay.com/photo/2016/03/04/22/54/animal-1236875_150.jpg",
//            "previewWidth": 150,
//            "previewHeight": 99,
//            "webformatURL": "https://pixabay.com/get/g0661e396381d033b5d6e36cedcd622621803843d4f11a3ac0f44074eed1cf060f5a5647b57861bcea84fdd2f88d95f71f496e013b6fe0b980072dc61a10c52d5_640.jpg",
//            "webformatWidth": 640,
//            "webformatHeight": 426,
//            "largeImageURL": "https://pixabay.com/get/gb4993817574697df7ed87b69ec31597deb0537bcf0d9d0f8ba0854e5f5352d12b530b49b3eea06b78878e7891298c608fddeeedfdc0968e2970e18a71de97fb0_1280.jpg",
//            "imageWidth": 3456,
//            "imageHeight": 2304,
//            "imageSize": 1684392,
//            "views": 196938,
//            "downloads": 118262,
//            "collections": 397,
//            "likes": 474,
//            "comments": 74,
//            "user_id": 2163857,
//            "user": "Cimberley",
//            "userImageURL": "https://cdn.pixabay.com/user/2016/03/04/23-10-07-96_250x250.jpg"
//        },
//        {
//            "id": 659186,
//            "pageURL": "https://pixabay.com/illustrations/panda-panda-cub-toon-furry-659186/",
//            "type": "illustration",
//            "tags": "panda, panda cub, toon",
//            "previewURL": "https://cdn.pixabay.com/photo/2015/03/04/18/02/panda-659186_150.png",
//            "previewWidth": 150,
//            "previewHeight": 112,
//            "webformatURL": "https://pixabay.com/get/ge0e10e284fb0fb5546ca36da1403f2506cb29aba655a895fad1cef815bc112df1feabd386b985913c620c0bc44ecd05c_640.png",
//            "webformatWidth": 640,
//            "webformatHeight": 480,
//            "largeImageURL": "https://pixabay.com/get/gcdb4591ada6698a9d33d194c6b7e155f48c261e91d0ff2008c5a85dc9609b878cce46dd329b483dc0f758332825d1944ac710ae5549e5844e0efc1475f51c6bf_1280.png",
//            "imageWidth": 3200,
//            "imageHeight": 2400,
//            "imageSize": 5518069,
//            "views": 242365,
//            "downloads": 182981,
//            "collections": 316,
//            "likes": 299,
//            "comments": 71,
//            "user_id": 62896,
//            "user": "sipa",
//            "userImageURL": "https://cdn.pixabay.com/user/2013/10/05/22-44-04-671_250x250.jpg"
//        },
//        {
//            "id": 4366264,
//            "pageURL": "https://pixabay.com/photos/red-panda-lesser-panda-wildlife-4366264/",
//            "type": "photo",
//            "tags": "red panda, lesser panda, wildlife",
//            "previewURL": "https://cdn.pixabay.com/photo/2019/07/27/09/05/red-panda-4366264_150.jpg",
//            "previewWidth": 150,
//            "previewHeight": 99,
//            "webformatURL": "https://pixabay.com/get/g90a069c0aab7e740d7bd8e93dde0298deb54d7ef81c173fb3b8ece7b75da4d550cf3fca668440b406069182c5310dd1eb56472716258e4b87ddc66a8258c40a1_640.jpg",
//            "webformatWidth": 640,
//            "webformatHeight": 426,
//            "largeImageURL": "https://pixabay.com/get/g24b218fbf525f07e17c2745c1b337188a00ba7df8ffe42c1ef0c50860818ead98f5ab24d85b49aaafd83e2394a4fab25606103877edc7c71361cb80c78cf7276_1280.jpg",
//            "imageWidth": 3478,
//            "imageHeight": 2319,
//            "imageSize": 2371163,
//            "views": 48378,
//            "downloads": 34396,
//            "collections": 183,
//            "likes": 251,
//            "comments": 145,
//            "user_id": 5526837,
//            "user": "pen_ash",
//            "userImageURL": "https://cdn.pixabay.com/user/2023/03/31/01-22-48-937_250x250.jpg"
//        }
//    ]
//}



