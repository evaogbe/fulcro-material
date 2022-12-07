(ns ogbe.fulcro.mui.icons.foundation
  #?(:cljs (:require
            ["@mui/icons-material/Foundation" :default Foundation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-foundation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Foundation)))