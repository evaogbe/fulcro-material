(ns ogbe.fulcro.mui.icons.sports-football
  #?(:cljs (:require
            ["@mui/icons-material/SportsFootball" :default SportsFootball]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sports-football
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SportsFootball)))