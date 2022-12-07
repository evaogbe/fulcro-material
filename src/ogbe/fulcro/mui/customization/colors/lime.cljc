(ns ogbe.fulcro.mui.customization.colors.lime
  #?(:cljs (:require
            ["@mui/material/colors/lime" :default js-lime]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn lime
  ([] #?(:cljs js-lime))
  ([shade] #?(:cljs (gobj/get js-lime shade))))
