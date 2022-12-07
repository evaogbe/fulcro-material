(ns ogbe.fulcro.mui.customization.colors.teal
  #?(:cljs (:require
            ["@mui/material/colors/teal" :default js-teal]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn teal
  ([] #?(:cljs js-teal))
  ([shade] #?(:cljs (gobj/get js-teal shade))))
