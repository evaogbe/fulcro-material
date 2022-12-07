(ns ogbe.fulcro.mui.icons.light
  #?(:cljs (:require
            ["@mui/icons-material/Light" :default Light]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-light
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Light)))