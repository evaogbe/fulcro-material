(ns ogbe.fulcro.mui.icons.sports-golf
  #?(:cljs (:require
            ["@mui/icons-material/SportsGolf" :default SportsGolf]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sports-golf
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SportsGolf)))