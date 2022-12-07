(ns ogbe.fulcro.mui.customization.colors.blue
  #?(:cljs (:require
            ["@mui/material/colors/blue" :default js-blue]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn blue
  ([] #?(:cljs js-blue))
  ([shade] #?(:cljs (gobj/get js-blue shade))))
