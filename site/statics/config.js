$(window).load(function(){
    initStyles();
});

$(window).resize(function(){
    initStyles();
});

function initStyles() {
    // 判断页面顶端
    if ( $(window).scrollTop() >= 10 )
    {
        $('.navbarHeader').addClass('fixed');
    }
    else{
        $('.navbarHeader').removeClass('fixed');
    }

    // 卡片滑动
    if( $(window).outerWidth() < 1024 ) {
        if( $(window).outerWidth() > 750 ){
            slideDivMobile('#card', 1.8);
            setHeight('#card');
        }
        else{
            slideDivMobile('#card', 1.3);
            setHeight('#card');
        }
    }
    else {
        slideDivDesktop('#card', 4);
        setHeight('#card');
    }
    // 卡片滑动
    if( $(window).outerWidth() < 1024 ) {
        if( $(window).outerWidth() > 750 ){
            slideDivMobile('#cardTran', 1.8);
            setHeight('#cardTran');
        }
        else{
            slideDivMobile('#cardTran', 1.3);
            setHeight('#cardTran');
        }
    }
    else {
        slideDivDesktop('#cardTran', 4);
        setHeight('#cardTran');
    }



    $(".PageBg").css("min-height", ($(window).height()-100)+"px");

}

$(function (){

    // 固定顶端菜单栏
    $(window).scroll(function () {
        if ( $(window).scrollTop() >= 10 )
        {
            $('.navbarHeader').addClass('fixed');
        }
        else{
            $('.navbarHeader').removeClass('fixed');
        }
    });

    // 关闭弹窗
    $(".Shade").click(function(){
        closePopup('#menuPop');
    });

});

// PC端 滑动切换
function slideDivDesktop(obj, n){
    var divSwiper = new Swiper(obj,{
        slidesPerView: n,
        virtualTranslate: true,
        roundLengths: true
    });
}

// 手机端 滑动切换
function slideDivMobile(obj, n){
    var divSwiper = new Swiper(obj,{
        slidesPerView: n,
        spaceBetween: 20,
        centeredSlides: true,
        pagination: {
            el: '.swiper-pagination',
        },
        observer: true,
        observeParents: true,
        roundLengths: true,
        autoplay: false
    });
}

// 设置高度
function setHeight(card){
    var CardHeight = 0;
    $(".cardWrap .cardDesc").each(function(){
        CardHeight = $(this).outerHeight() > CardHeight ? $(this).outerHeight() : CardHeight;
    });
    $(".cardWrap .cardDesc").css({ height: CardHeight });
}

// 打开弹窗
function showPopup(obj){
    $('.Shade').show();
    $(obj).removeClass("conceal");
    $(obj).addClass("show");
    $('body').css( "overflow-y", "hidden");
}

// 关闭弹窗
function closePopup(obj){
    $(obj).removeClass("show");
    $(obj).addClass("conceal");
    $('.Shade').hide();
    $('body').css( "overflow-y", "auto");
}
