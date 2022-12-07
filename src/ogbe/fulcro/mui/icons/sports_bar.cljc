(ns ogbe.fulcro.mui.icons.sports-bar
  #?(:cljs (:require
            ["@mui/icons-material/SportsBar" :default SportsBar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sports-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SportsBar)))