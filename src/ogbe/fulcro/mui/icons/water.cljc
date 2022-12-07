(ns ogbe.fulcro.mui.icons.water
  #?(:cljs (:require
            ["@mui/icons-material/Water" :default Water]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-water
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Water)))