(ns ogbe.fulcro.mui.icons.euro-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EuroRounded" :default EuroRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-euro-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EuroRounded)))