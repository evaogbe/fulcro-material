(ns ogbe.fulcro.mui.icons.near-me
  #?(:cljs (:require
            ["@mui/icons-material/NearMe" :default NearMe]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-near-me
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NearMe)))