(ns ogbe.fulcro.mui.customization.colors.purple
  #?(:cljs (:require
            ["@mui/material/colors/purple" :default js-purple]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn purple
  ([] #?(:cljs js-purple))
  ([shade] #?(:cljs (gobj/get js-purple shade))))
