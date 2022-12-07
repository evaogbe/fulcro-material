(ns ogbe.fulcro.mui.icons.wine-bar
  #?(:cljs (:require
            ["@mui/icons-material/WineBar" :default WineBar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wine-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WineBar)))