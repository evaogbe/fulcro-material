(ns ogbe.fulcro.mui.customization.colors.red
  #?(:cljs (:require
            ["@mui/material/colors/red" :default js-red]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn red
  ([] #?(:cljs js-red))
  ([shade] #?(:cljs (gobj/get js-red shade))))
