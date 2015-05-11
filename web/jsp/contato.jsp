<%-- 
    Document   : contact
    Created on : 08/05/2015, 17:34:24
    Author     : stryker
--%>

<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contato</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <!-- Custom Theme files -->
        <!---- start-smoth-scrolling---->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!---- start-smoth-scrolling---->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

        <!----webfonts--->
        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css'>
        <!---//webfonts--->
        <!----start-top-nav-script---->
        <script>
            $(function () {
                var pull = $('#pull');
                menu = $('nav ul');
                menuHeight = menu.height();
                $(pull).on('click', function (e) {
                    e.preventDefault();
                    menu.slideToggle();
                });
                $(window).resize(function () {
                    var w = $(window).width();
                    if (w > 320 && menu.is(':hidden')) {
                        menu.removeAttr('style');
                    }
                });
            });
        </script>
        <!----//End-top-nav-script---->
    </head>
    <body>
        <!----container---->
        <div class="container">
            <!----top-header---->
            <div class="top-header">
                <div class="logo">
                    <a href="index.jsp"><img src="images/logo.png" title="barndlogo" /></a>
                </div>
                <div class="top-header-info">
                    <div class="top-contact-info">
                        <ul class="unstyled-list list-inline">
                            <li><span class="phone"> </span>(89) 3422-2582</li>
                            <li><span class="mail"> </span><a href="#">help@trendd.com</a></li>
                            <div class="clearfix"> </div>
                        </ul>
                    </div>
                    <div class="cart-details">
                        <div class="add-to-cart">
                            <ul class="unstyled-list list-inline">
                                <li><span class="cart"> </span>
                                    <ul class="cart-sub">
                                        <li><p>0 Produtos</p></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="login-rigister">
                            <ul class="unstyled-list list-inline">
                                <li><a class="login" href="EcommerceAction.login.mtw">Administração</a></li>
                                <li><a class="rigister" href="#">CADASTRE-SE <span> </span></a></li>
                                <div class="clearfix"> </div>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
            <!----//top-header---->
            <!---top-header-nav---->
            <div class="top-header-nav"> 
                <!----start-top-nav---->
                <nav class="top-nav main-menu">
                    <ul class="top-nav">
                        <li><a href="EcommerceAction.produtos.mtw">PRODUTOS </a><span> </span></li>
                        <li><a href="products.html">CAMPANHAS</a><span> </span></li>
                        <li><a href="products.html">SERVIÇOS</a><span> </span></li>
                        <li><a href="products.html">MARCAS</a><span> </span></li>
                        <li><a href="products.html">SOBRE NÓS</a></li>
                        <div class="clearfix"> </div>
                    </ul>
                    <a href="#" id="pull"><img src="images/nav-icon.png" title="menu" /></a>
                </nav>
                <!----End-top-nav---->
                <!---top-header-search-box--->
                <div class="top-header-search-box">
                    <form>
                        <input type="text" placeholder="Search" required maxlength="22">
                        <input type="submit" value=" " >
                    </form>
                </div>
                <!---top-header-search-box--->
                <div class="clearfix"> </div>
            </div>
        </div>
        <!--//top-header-nav---->
        <!----contact---->
        <div class="contact-info">
            <div class="map">
                <iframe src="https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed"></iframe><br><small><a href="https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265" style="color:#666;text-align:left;font-size:12px"></a></small>
            </div>
            <div class="container">
                <div class="contact-grids">
                    <div class="col_1_of_bottom span_1_of_first1">
                        <h5>Endereço</h5>
                        <ul class="list3">
                            <li>
                                <img src="images/home.png" alt="">
                                <div class="extra-wrap">
                                    <p>Lorem ipsum  consectetu,<br>dolor sit amet,.</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="col_1_of_bottom span_1_of_first1">
                        <h5>Telefones</h5>
                        <ul class="list3">
                            <li>
                                <img src="images/phone.png" alt="">
                                <div class="extra-wrap">
                                    <p><span>Telefone:</span>(89) 3422-2582</p>
                                </div>
                                <img src="images/fax.png" alt="">
                                <div class="extra-wrap">
                                    <p><span>FAX:</span>(89) 3422-2582</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="col_1_of_bottom span_1_of_first1">
                        <h5>Email</h5>
                        <ul class="list3">
                            <li>
                                <img src="images/email.png" alt="">
                                <div class="extra-wrap">
                                    <p><span class="mail"><a href="mailto:yoursite.com">info(at)brndlogo.com</a></span></p>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <form>
                    <div class="contact-form">
                        <div class="contact-to">
                            <input type="text" class="text" value="Nome" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Nome';
                                    }">
                            <input type="text" class="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Email';
                                    }">
                            <input type="text" class="text" value="Assunto" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Assunto';
                                    }">
                        </div>
                        <div class="text2">
                            <textarea value="Mensagem:" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Mensagem';
                                    }">Menssagem..</textarea>
                        </div>
                        <span><input type="submit" class="" value="Enviar"></span>
                        <div class="clearfix"></div>
                    </div>
                </form>
            </div>
        </div>
        <!---//contact---->
        <!----footer--->
        <div class="footer">
            <div class="container">
                <div class="col-md-3 footer-logo">
                    <a href="index.html"><img src="images/flogo.png" title="brand-logo" /></a>
                </div>
                <div class="col-md-7 footer-links">
                    <ul class="unstyled-list list-inline">
                        <li><a href="#"> Faq</a> <span> </span></li>
                        <li><a href="#"> Termos e Condições</a> <span> </span></li>
                        <li><a href="#"> Pagamentos Seguros </a> <span> </span></li>
                        <li><a href="#"> Expedição</a> <span> </span></li>
                        <li><a href="EcommerceAction.contato.mtw"> Contato</a> </li>
                        <div class="clearfix"> </div>
                    </ul>
                </div>
                <div class="col-md-2 footer-social">
                    <ul class="unstyled-list list-inline">
                        <li><a class="pin" href="#"><span> </span></a></li>
                        <li><a class="twitter" href="#"><span> </span></a></li>
                        <li><a class="facebook" href="#"><span> </span></a></li>
                        <div class="clearfix"> </div>
                    </ul>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <div class="clearfix"> </div>
        <!---//footer--->
        <!---copy-right--->
        <div class="copy-right">
            <div class="container">
                <p>Copyright © 2015</p>
                <script type="text/javascript">
                    $(document).ready(function () {
                        /*
                         var defaults = {
                         containerID: 'toTop', // fading element id
                         containerHoverID: 'toTopHover', // fading element hover id
                         scrollSpeed: 1200,
                         easingType: 'linear' 
                         };
                         */

                        $().UItoTop({easingType: 'easeOutQuart'});

                    });
                </script>
                <a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
            </div>
        </div>
        <!--//copy-right--->
    </div>
    <!----container---->
</body>
</html>
