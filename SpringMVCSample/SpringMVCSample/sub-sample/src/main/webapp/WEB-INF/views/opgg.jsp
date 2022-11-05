<%--
  Created by IntelliJ IDEA.
  User: Yaly
  Date: 2022-10-25
  Time: 오후 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="opgg_main.css" type="text/css">
    <link rel="stylesheet" href="opgg_font.css" type="text/css">
    <title>op.gg</title>
</head>
<body>

<header class="css-header-back">
    <div class="css-header-top">
        <a href="/opgg">
            <img src="https://opgg-gnb.akamaized.net/static/images/banners/tft_ad_banner_kr_01.png?image=q_auto,f_webp,w_1940&v=1666684602578"
                 width="970" height="90"/>
        </a>
    </div>
    <div class="css-header-middle">
        <h1>
            <a href="/opgg">
                <img src="https://s-lol-web.op.gg/images/icon/opgglogo.svg?v=1666684602785" width="65" height="16"/>
            </a>
        </h1>
        <nav>
            <ul>
                <li>
                    <a>
                        <img src="https://opgg-gnb.akamaized.net/static/images/icons/img-navi-lol-white.svg?image=q_auto,f_webp,w_48&v=1666684602785"
                             width="24" height="24">
                        <span>리그오브레전드</span>
                    </a>
                </li>
                <li>
                    <a>
                        <img src="https://opgg-gnb.akamaized.net/static/images/icons/01-icon-00-logo-icon-opggsquare.svg?image=q_auto,f_webp,w_48&v=1666684602785"
                             width="24" height="24">
                        <span>데스크톱</span>
                    </a>
                </li>
                <li>
                    <a>
                        <img src="https://opgg-gnb.akamaized.net/static/images/icons/img-navi-valorant-white.svg?image=q_auto,f_webp,w_48&v=1666684602785"
                             width="24" height="24">
                        <span>발로란트</span>
                    </a>
                </li>
                <li>
                    <a>
                        <img src="https://opgg-gnb.akamaized.net/static/images/icons/img-navi-pubg-gray.svg?image=q_auto,f_webp,w_48&v=1666684602785"
                             width="24" height="24">
                        <span>배틀그라운드</span>
                    </a>
                </li>
                <li>
                    <a>
                        <img src="https://opgg-gnb.akamaized.net/static/images/icons/img-navi-overwatch-gray.svg?image=q_auto,f_webp,w_48&v=1666684602785"
                             width="24" height="24">
                        <span>오버워치</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>
    <div class="css-header-bottom">
        <nav class="route-nav">
            <ul class="route-list">
               <li class="route-item">
                    <a class="hypertextref" href="/opgg">
                        홈
                    </a>
               </li>
                <li class="route-item">
                    <a class="hypertextref" href="/opgg">
                        챔피언 분석
                    </a>
                </li>
                <li class="route-item">
                    <a class="hypertextref" href="/opgg">
                        게임 모드
                    </a>
                </li>
                <li class="route-item">
                    <a class="hypertextref" href="/opgg">
                        통계
                    </a>
                </li>
                <li class="route-item">
                    <a class="hypertextref" href="/opgg">
                        랭킹
                    </a>
                </li>
                <li class="route-item">
                    <a class="hypertextref" href="/opgg">
                        프로관전
                    </a>
                </li>
                <li class="route-item">
                    <a class="hypertextref" href="/opgg">
                        멀티서치
                    </a>
                </li>
                <li class="route-item">
                    <a class="hypertextref" href="/opgg">
                        커뮤니티
                    </a>
                </li>
            </ul>
        </nav>
    </div>
</header>

<div>
    <div class="css-banner">
        <a href="/opgg">
            이용 약관, 개인정보 처리방침 개정 안내 (11/1)
        </a>
    </div>
</div>

<div class="css-body">
    <div class="css-body-main-image">
        <img src="https://opgg-static.akamaized.net/logo/20221024143822.5f982558178b4dbf96c34ae9b2706d92.png?image=q_auto,f_webp,w_auto&v=1666684602785"/>
    </div>
    <div class="search-container">
        <div>
            <form class="css-body-form">
                <small class="label">Region</small>
                <div class="css-body-form-text">
                    <label class="hidden" for="kr">kr</label>
                    <select id="kr">
                        <option value="kr">KR</option>
                        <option value="jp">JP</option>
                        <option value="eu">EU</option>
                    </select>
                </div>
                <div>

                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
