(ns ogbe.fulcro.mui.customization.colors.green
  #?(:cljs (:require
            ["@mui/material/colors/green" :default js-green]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn green
  ([] #?(:cljs js-green))
  ([shade] #?(:cljs (gobj/get js-green shade))))
