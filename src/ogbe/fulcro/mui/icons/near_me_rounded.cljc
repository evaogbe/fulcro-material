(ns ogbe.fulcro.mui.icons.near-me-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NearMeRounded" :default NearMeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-near-me-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NearMeRounded)))