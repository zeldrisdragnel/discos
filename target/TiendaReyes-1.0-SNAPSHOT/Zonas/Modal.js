/*! modernizr 3.6.0 (Custom Build) | MIT *
 * https://modernizr.com/download/?-audio-cssgrid_cssgridlegacy-flexbox-flexwrap-localstorage-sessionstorage-smil-textshadow-variablefonts-webgl-setclasses !*/
	!function (e, t, n) { function r(e, t) { return typeof e === t } function o() { var e, t, n, o, a, s, i; for (var l in S) if (S.hasOwnProperty(l)) { if (e = [], t = S[l], t.name && (e.push(t.name.toLowerCase()), t.options && t.options.aliases && t.options.aliases.length)) for (n = 0; n < t.options.aliases.length; n++)e.push(t.options.aliases[n].toLowerCase()); for (o = r(t.fn, "function") ? t.fn() : t.fn, a = 0; a < e.length; a++)s = e[a], i = s.split("."), 1 === i.length ? Modernizr[i[0]] = o : (!Modernizr[i[0]] || Modernizr[i[0]] instanceof Boolean || (Modernizr[i[0]] = new Boolean(Modernizr[i[0]])), Modernizr[i[0]][i[1]] = o), w.push((o ? "" : "no-") + i.join("-")) } } function a(e) { var t = C.className, n = Modernizr._config.classPrefix || ""; if (T && (t = t.baseVal), Modernizr._config.enableJSClass) { var r = new RegExp("(^|\\s)" + n + "no-js(\\s|$)"); t = t.replace(r, "$1" + n + "js$2") } Modernizr._config.enableClasses && (t += " " + n + e.join(" " + n), T ? C.className.baseVal = t : C.className = t) } function s() { return "function" != typeof t.createElement ? t.createElement(arguments[0]) : T ? t.createElementNS.call(t, "http://www.w3.org/2000/svg", arguments[0]) : t.createElement.apply(t, arguments) } function i(e, t) { return !!~("" + e).indexOf(t) } function l(e) { return e.replace(/([a-z])-([a-z])/g, function (e, t, n) { return t + n.toUpperCase() }).replace(/^-/, "") } function u(e) { return e.replace(/([A-Z])/g, function (e, t) { return "-" + t.toLowerCase() }).replace(/^ms-/, "-ms-") } function c(t, n, r) { var o; if ("getComputedStyle" in e) { o = getComputedStyle.call(e, t, n); var a = e.console; if (null !== o) r && (o = o.getPropertyValue(r)); else if (a) { var s = a.error ? "error" : "log"; a[s].call(a, "getComputedStyle returning null, its possible modernizr test results are inaccurate") } } else o = !n && t.currentStyle && t.currentStyle[r]; return o } function d(e, t) { return function () { return e.apply(t, arguments) } } function f(e, t, n) { var o; for (var a in e) if (e[a] in t) return n === !1 ? e[a] : (o = t[e[a]], r(o, "function") ? d(o, n || t) : o); return !1 } function p() { var e = t.body; return e || (e = s(T ? "svg" : "body"), e.fake = !0), e } function m(e, n, r, o) { var a, i, l, u, c = "modernizr", d = s("div"), f = p(); if (parseInt(r, 10)) for (; r--;)l = s("div"), l.id = o ? o[r] : c + (r + 1), d.appendChild(l); return a = s("style"), a.type = "text/css", a.id = "s" + c, (f.fake ? f : d).appendChild(a), f.appendChild(d), a.styleSheet ? a.styleSheet.cssText = e : a.appendChild(t.createTextNode(e)), d.id = c, f.fake && (f.style.background = "", f.style.overflow = "hidden", u = C.style.overflow, C.style.overflow = "hidden", C.appendChild(f)), i = n(d, e), f.fake ? (f.parentNode.removeChild(f), C.style.overflow = u, C.offsetHeight) : d.parentNode.removeChild(d), !!i } function g(t, r) { var o = t.length; if ("CSS" in e && "supports" in e.CSS) { for (; o--;)if (e.CSS.supports(u(t[o]), r)) return !0; return !1 } if ("CSSSupportsRule" in e) { for (var a = []; o--;)a.push("(" + u(t[o]) + ":" + r + ")"); return a = a.join(" or "), m("\@\supports (" + a + ") { #modernizr { position: absolute; } }", function (e) { return "absolute" == c(e, null, "position") }) } return n } function y(e, t, o, a) { function u() { d && (delete _.style, delete _.modElem) } if (a = r(a, "undefined") ? !1 : a, !r(o, "undefined")) { var c = g(e, o); if (!r(c, "undefined")) return c } for (var d, f, p, m, y, v = ["modernizr", "tspan", "samp"]; !_.style && v.length;)d = !0, _.modElem = s(v.shift()), _.style = _.modElem.style; for (p = e.length, f = 0; p > f; f++)if (m = e[f], y = _.style[m], i(m, "-") && (m = l(m)), _.style[m] !== n) { if (a || r(o, "undefined")) return u(), "pfx" == t ? m : !0; try { _.style[m] = o } catch (h) { } if (_.style[m] != y) return u(), "pfx" == t ? m : !0 } return u(), !1 } function v(e, t, n, o, a) { var s = e.charAt(0).toUpperCase() + e.slice(1), i = (e + " " + E.join(s + " ") + s).split(" "); return r(t, "string") || r(t, "undefined") ? y(i, t, o, a) : (i = (e + " " + N.join(s + " ") + s).split(" "), f(i, t, n)) } function h(e, t, r) { return v(e, n, n, t, r) } var w = [], S = [], x = { _version: "3.6.0", _config: { classPrefix: "", enableClasses: !0, enableJSClass: !0, usePrefixes: !0 }, _q: [], on: function (e, t) { var n = this; setTimeout(function () { t(n[e]) }, 0) }, addTest: function (e, t, n) { S.push({ name: e, fn: t, options: n }) }, addAsyncTest: function (e) { S.push({ name: null, fn: e }) } }, Modernizr = function () { }; Modernizr.prototype = x, Modernizr = new Modernizr, Modernizr.addTest("localstorage", function () { var e = "modernizr"; try { return localStorage.setItem(e, e), localStorage.removeItem(e), !0 } catch (t) { return !1 } }), Modernizr.addTest("sessionstorage", function () { var e = "modernizr"; try { return sessionStorage.setItem(e, e), sessionStorage.removeItem(e), !0 } catch (t) { return !1 } }); var C = t.documentElement, T = "svg" === C.nodeName.toLowerCase(); Modernizr.addTest("audio", function () { var e = s("audio"), t = !1; try { t = !!e.canPlayType, t && (t = new Boolean(t), t.ogg = e.canPlayType('audio/ogg; codecs="vorbis"').replace(/^no$/, ""), t.mp3 = e.canPlayType('audio/mpeg; codecs="mp3"').replace(/^no$/, ""), t.opus = e.canPlayType('audio/ogg; codecs="opus"') || e.canPlayType('audio/webm; codecs="opus"').replace(/^no$/, ""), t.wav = e.canPlayType('audio/wav; codecs="1"').replace(/^no$/, ""), t.m4a = (e.canPlayType("audio/x-m4a;") || e.canPlayType("audio/aac;")).replace(/^no$/, "")) } catch (n) { } return t }), Modernizr.addTest("webgl", function () { var t = s("canvas"), n = "probablySupportsContext" in t ? "probablySupportsContext" : "supportsContext"; return n in t ? t[n]("webgl") || t[n]("experimental-webgl") : "WebGLRenderingContext" in e }); var b = {}.toString; Modernizr.addTest("smil", function () { return !!t.createElementNS && /SVGAnimate/.test(b.call(t.createElementNS("http://www.w3.org/2000/svg", "animate"))) }); var P = { elem: s("modernizr") }; Modernizr._q.push(function () { delete P.elem }); var _ = { style: P.elem.style }; Modernizr._q.unshift(function () { delete _.style }); var z = "Moz O ms Webkit", E = x._config.usePrefixes ? z.split(" ") : []; x._cssomPrefixes = E; var N = x._config.usePrefixes ? z.toLowerCase().split(" ") : []; x._domPrefixes = N; var $ = x.testProp = function (e, t, r) { return y([e], n, t, r) }; Modernizr.addTest("textshadow", $("textShadow", "1px 1px")), x.testAllProps = v, x.testAllProps = h, Modernizr.addTest("cssgridlegacy", h("grid-columns", "10px", !0)), Modernizr.addTest("cssgrid", h("grid-template-rows", "none", !0)), Modernizr.addTest("flexbox", h("flexBasis", "1px", !0)), Modernizr.addTest("flexwrap", h("flexWrap", "wrap", !0)), Modernizr.addTest("variablefonts", h("fontVariationSettings")), o(), a(w), delete x.addTest, delete x.addAsyncTest; for (var j = 0; j < Modernizr._q.length; j++)Modernizr._q[j](); e.Modernizr = Modernizr }(window, document);
	/*
	Modal.js

	Lightweight modal for use on Browser Detection
*/
	window.onload = function () {
		outdatedBrowserDetection();
	};
	function outdatedBrowserDetection(filterIE11) {
		if (window.jQuery) {
			// if jQuery is loaded
			var BrowserDetectModal = {
				settings: {
					closeButton: true
				},
				showModal: function (data) {
					var modalData = data;
					var elemTarget = modalData.target;
					var closeButton = modalData.closeButton || BrowserDetectModal.settings.closeButton;

					var modalString = "<div id=\"updateYourBrowser\"><div id=\"updateYourBrowser\"><div class=\"modal2-content\"><div class=\"updateYourBrowserModal\"><div class=\"modal-header modal2-header\"><h2>Aviso de navegador:<\/h2><a href=\"javascript:;\" class=\"modal2-close-button-browser-detect\" aria-hidden=\"true\" title=\"close\">&#xd7;<\/a><\/div><div><p>Parece que tu navegador no soporta algunas de las características de nuestro sitio.</p><p>Si utilizas Safari, asegúrate de que 'el modo de navegación privada' está desactivado.<\/p><p>Por favor, actualiza o instala un navegador diferente.<\/p><ul><li><div id=\"lnk-chrome\"><\/div>Google Chrome<\/li><li><div id=\"lnk-firefox\"> <\/div>Mozilla Firefox<\/li><li><div id=\"lnk-safari\"><\/div>Safari<\/li><li><div id=\"lnk-ie\"><\/div>Microsoft Edge<\/li><\/ul><div class=\"close-button-wrapper\"><a href=\"javascript:;\" class=\"green button\">Cerrar<\/a><\/div><\/div><\/div><\/div><\/div>";

					$modalWrapper = $('#' + elemTarget);
					$scrimLayer = $(".modal2-bg");
					if ($scrimLayer.length < 1) {
						var scrim = document.createElement("div");
						scrim.className = "modal2-bg open";
						document.body.appendChild(scrim);
					} else {
						$scrimLayer[0].className = "modal2-bg open";
					}
					$('body').prepend(modalString);
					$('.modal.modal2').show();

					return false;
				},
				closeModal: function (data) {
					var modalData = data;
					var elemTarget = modalData.target;
					$modalWrapper = $('#' + elemTarget);
					$scrimLayer = $(".modal2-bg");

					if ($scrimLayer) {
						$scrimLayer.remove();
					}

					if ($modalWrapper) {
						$modalWrapper.hide().find('.modal2-content').removeClass('visible');
					}
					$('#updateYourBrowser').remove();
				}
			};

			featureDetection(filterIE11);

			//featureDetection



			$('body').on('click', '.modal2-bg, .modal2-close-button-browser-detect, .close-button-wrapper .button', function () {
				BrowserDetectModal.closeModal({ target: 'updateYourBrowser' });
			});

			$('body').on('click', '#update-your-browser-banner', function () {
				BrowserDetectModal.showModal({ target: 'updateYourBrowser' });
			});



		}
		else {
			// else jQuery did not load


			var alertMessage = 'It appears your browser does not support crucial features used in our site. Please use a different browser.';


			alert(alertMessage);
		}
	}//outdatedBrowser

	function featureDetection(detectIE11) {
        //detect base support at the site level
		//checking for audio support eliminates IE8,
		//checking for text-shadow support eliminates IE9,
		//checking for webgl eliminates IE10 and Safari 7
		//this should be expanded to include common failure points in older browsers based on actual features used.

		//no feature to detect for safari 8, so must look at user agent
		var isSafari8 = navigator.userAgent.match(/8.0.\d Safari/);
		var isMobileSafari8 = navigator.userAgent.match('Mobile/12');
		var displayMessage = false;

		//if you are in PhantomJS don't do browser detection this is to accomodate Smartling
		if (!/PhantomJS/.test(window.navigator.userAgent)) {
			if (detectIE11 && !Modernizr.cssgrid) {
				displayMessage = true;
			}
			else if ((Modernizr.cssgrid) && Modernizr.webgl && Modernizr.variablefonts) {
				//Do nothing
				displayMessage = false;
			} else if (!Modernizr.audio || !Modernizr.textshadow || !Modernizr.webgl || !Modernizr.flexbox || !Modernizr.variablefonts || !Modernizr.flexwrap || !Modernizr.localstorage || !Modernizr.sessionstorage || isSafari8 || isMobileSafari8 || !Modernizr.cssgrid || !Modernizr.cssgridlegacy || !Modernizr.smil) {
				displayMessage = true;
			}
			if (displayMessage) {
				if (!$('#update-your-browser-banner').length) {
					$('body').prepend('<div id="update-your-browser-banner">NOTA: Parece que tu navegador no soporta algunas de las características utilizadas en nuestro sitio. </div>');
					$('#update-your-browser-banner').slideDown('slow');
				}
			}
		}
	}

</script>

	<script>
		if ($('.store-login-page')[0]) {
			$('#homePageUrl').attr('href', "https://store.cdbaby.com");
		}
	</script>
</body>
</html>

