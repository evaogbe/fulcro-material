(ns ogbe.fulcro.mui.icons.instagram
  #?(:cljs (:require
            ["@mui/icons-material/Instagram" :default Instagram]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-instagram
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Instagram)))