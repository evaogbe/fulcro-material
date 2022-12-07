(ns ogbe.fulcro.mui.customization.colors.brown
  #?(:cljs (:require
            ["@mui/material/colors/brown" :default js-brown]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn brown
  ([] #?(:cljs js-brown))
  ([shade] #?(:cljs (gobj/get js-brown shade))))
