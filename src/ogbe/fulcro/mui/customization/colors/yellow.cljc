(ns ogbe.fulcro.mui.customization.colors.yellow
  #?(:cljs (:require
            ["@mui/material/colors/yellow" :default js-yellow]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn yellow
  ([] #?(:cljs js-yellow))
  ([shade] #?(:cljs (gobj/get js-yellow shade))))
