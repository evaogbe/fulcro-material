(ns ogbe.fulcro.mui.customization.colors.orange
  #?(:cljs (:require
            ["@mui/material/colors/orange" :default js-orange]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn orange
  ([] #?(:cljs js-orange))
  ([shade] #?(:cljs (gobj/get js-orange shade))))
